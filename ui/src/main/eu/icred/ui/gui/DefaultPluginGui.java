package eu.icred.ui.gui;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;
import javax.swing.text.PlainDocument;

import org.apache.log4j.Logger;

import eu.icred.plugin.PluginComponent;
import eu.icred.plugin.worker.WorkerConfiguration;
import eu.icred.plugin.worker.input.ImportWorkerConfiguration;
import eu.icred.plugin.worker.output.ExportWorkerConfiguration;
import eu.icred.ui.gui.PluginPanel.PluginType;

/**
 * @author phoudek
 * 
 */
public class DefaultPluginGui<PluginConfig extends WorkerConfiguration> extends PluginComponent<PluginConfig> {
    private static final long serialVersionUID = -6392530010065554006L;
    private static Logger logger = Logger.getLogger(DefaultPluginGui.class);

    File mainFilePath = null;

    class StringPanel extends JPanel {
        private static final long serialVersionUID = -1351568612948949395L;

        JLabel lbl = new JLabel();
        JTextField tf = new JTextField();

        public String getString() {
            return tf.getText();
        }

        public StringPanel(String text) {
            this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));

            lbl.setText(text);
            lbl.setPreferredSize(new Dimension(130, 24));

            tf.setPreferredSize(new Dimension(160, 24));

            this.add(lbl);
            this.add(tf);
        }
    }

    class IntegerPanel extends JPanel {
        private static final long serialVersionUID = -1351568612948949395L;

        JLabel lbl = new JLabel();
        JTextField tf = new JTextField();

        public Integer getInteger() {
            return Integer.parseInt(tf.getText());
        }

        public IntegerPanel(String text) {
            this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));

            lbl.setText(text);
            lbl.setPreferredSize(new Dimension(130, 24));

            tf.setPreferredSize(new Dimension(160, 24));
            ((PlainDocument) tf.getDocument()).setDocumentFilter(new DocumentFilter() {
                private boolean test(String text) {
                    try {
                        Integer.parseInt(text);
                        return true;
                    } catch (NumberFormatException e) {
                        return false;
                    }
                }

                @Override
                public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {

                    Document doc = fb.getDocument();
                    StringBuilder sb = new StringBuilder();
                    sb.append(doc.getText(0, doc.getLength()));
                    sb.insert(offset, string);

                    if (test(sb.toString())) {
                        super.insertString(fb, offset, string, attr);
                    } else {
                        // warn the user and don't allow the insert
                    }
                }

                public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {

                    Document doc = fb.getDocument();
                    StringBuilder sb = new StringBuilder();
                    sb.append(doc.getText(0, doc.getLength()));
                    sb.replace(offset, offset + length, text);

                    if (test(sb.toString())) {
                        super.replace(fb, offset, length, text, attrs);
                    } else {
                        // warn the user and don't allow the insert
                    }

                }

                @Override
                public void remove(FilterBypass fb, int offset, int length) throws BadLocationException {
                    Document doc = fb.getDocument();
                    StringBuilder sb = new StringBuilder();
                    sb.append(doc.getText(0, doc.getLength()));
                    sb.delete(offset, offset + length);

                    if (test(sb.toString())) {
                        super.remove(fb, offset, length);
                    } else {
                        // warn the user and don't allow the insert
                    }

                }

            });

            this.add(lbl);
            this.add(tf);
        }
    }

    class FilePanel extends JPanel {
        private static final long serialVersionUID = 7596894558290889532L;

        JLabel lbl = new JLabel();
        JTextField tf = new JTextField();
        JButton btn = new JButton("...");

        File file = null;
        PluginType type = null;

        public void openFileDialog() {
            JFileChooser fc = new JFileChooser((file == null) ? ((mainFilePath == null) ? USER_DIR : mainFilePath) : file.getParentFile());
            fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
            fc.setDialogTitle("Choose a file:");

            int result = (this.type == PluginType.IMPORT) ? fc.showOpenDialog(this) : fc.showSaveDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                file = fc.getSelectedFile();
                mainFilePath = file.getParentFile();
                try {
                    tf.setText(file.getCanonicalPath());
                } catch (IOException e) {
                    file = null;
                }
            }
        }

        public File getFile() {
            return this.file;
        }

        public FilePanel(String text, PluginType type) {
            this.type = type;
            this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));

            lbl.setText(text);
            lbl.setPreferredSize(new Dimension(130, 24));

            tf.setEditable(false);
            tf.setPreferredSize(new Dimension(160, 24));

            btn.setPreferredSize(new Dimension(40, 24));

            MouseListener x = new MouseListener() {
                public void mouseReleased(MouseEvent e) {
                }

                public void mousePressed(MouseEvent e) {
                }

                public void mouseExited(MouseEvent e) {
                }

                public void mouseEntered(MouseEvent e) {
                }

                public void mouseClicked(MouseEvent e) {
                    openFileDialog();
                }
            };
            tf.addMouseListener(x);
            btn.addMouseListener(x);

            this.add(lbl);
            this.add(tf);
            this.add(btn);
        }
    }

    PluginConfig configuration;

    static final File USER_DIR = new File(System.getProperty("user.home"));

    SortedMap<String, FilePanel> filePanels = new TreeMap<String, FilePanel>();
    SortedMap<String, StringPanel> stringPanels = new TreeMap<String, StringPanel>();
    SortedMap<String, IntegerPanel> integerPanels = new TreeMap<String, IntegerPanel>();

    /**
     * @author phoudek
     */
    public DefaultPluginGui(PluginConfig configuration) {
        this.configuration = configuration;
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

        Set<String> requiredInputStreams = null;
        if (configuration instanceof ImportWorkerConfiguration) {
            requiredInputStreams = ((ImportWorkerConfiguration) configuration).getStreams().keySet();
        }

        if (requiredInputStreams != null) {
            for (String requiredInputStream : requiredInputStreams) {
                FilePanel fp = new FilePanel("File '" + requiredInputStream + "':", PluginType.IMPORT);
                this.add(fp);
                filePanels.put("import-" + requiredInputStream, fp);
            }
        }

        Set<String> requiredOutputStreams = null;
        if (configuration instanceof ExportWorkerConfiguration) {
            requiredOutputStreams = ((ExportWorkerConfiguration) configuration).getStreams().keySet();
        }

        if (requiredOutputStreams != null) {
            for (String requiredOutputStream : requiredOutputStreams) {
                FilePanel fp = new FilePanel("File '" + requiredOutputStream + "':", PluginType.EXPORT);
                this.add(fp);
                filePanels.put("export-" + requiredOutputStream, fp);
            }
        }

        for (String stringKey : configuration.getStrings().keySet()) {
            StringPanel sp = new StringPanel("Text '" + stringKey + "':");
            this.add(sp);
            stringPanels.put(stringKey, sp);
        }

        for (String integerKey : configuration.getIntegers().keySet()) {
            IntegerPanel ip = new IntegerPanel("Text '" + integerKey + "':");
            this.add(ip);
            integerPanels.put(integerKey, ip);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see eu.icred.plugin.PluginComponent#getConfiguration()
     */
    @Override
    public PluginConfig getConfiguration() {
        if (configuration instanceof ExportWorkerConfiguration) {
            ExportWorkerConfiguration exportConfig = (ExportWorkerConfiguration) configuration;
            SortedMap<String, OutputStream> streams = exportConfig.getStreams();
            for (Map.Entry<String, OutputStream> stream : streams.entrySet()) {
                String streamKey = stream.getKey();
                File file = filePanels.get("export-" + streamKey).getFile();
                try {
                    streams.put(streamKey, new FileOutputStream(file));
                } catch (Exception e) {
                    logger.error("open " + streamKey + " stream failed", e);
                }
            }
        }

        if (configuration instanceof ImportWorkerConfiguration) {
            ImportWorkerConfiguration importConfig = (ImportWorkerConfiguration) configuration;
            SortedMap<String, InputStream> streams = importConfig.getStreams();
            for (Map.Entry<String, InputStream> stream : streams.entrySet()) {
                String streamKey = stream.getKey();
                File file = filePanels.get("import-" + streamKey).getFile();
                try {
                    streams.put(streamKey, new FileInputStream(file));
                } catch (Exception e) {
                    logger.error("open " + streamKey + " stream failed", e);
                }
            }
        }

        for (String stringKey : configuration.getStrings().keySet()) {
            String stringValue = stringPanels.get(stringKey).getString();
            configuration.getStrings().put(stringKey, stringValue);
        }

        for (String integerKey : configuration.getIntegers().keySet()) {
            Integer integerValue = integerPanels.get(integerKey).getInteger();
            configuration.getIntegers().put(integerKey, integerValue);
        }

        return configuration;
    }
}
