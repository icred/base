package org.zgif.converter.ui.gui;

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

import org.apache.log4j.Logger;
import org.zgif.converter.plugin.PluginComponent;
import org.zgif.converter.plugin.PluginConfiguration;
import org.zgif.converter.plugin.input.ImportPluginConfiguration;
import org.zgif.converter.plugin.output.ExportPluginConfiguration;
import org.zgif.converter.ui.gui.PluginPanel.PluginType;

/**
 * @author phoudek
 * 
 */
public class DefaultPluginGui<PluginConfig extends PluginConfiguration> extends PluginComponent<PluginConfig> {
    private static final long serialVersionUID = -6392530010065554006L;
    private static Logger logger = Logger.getLogger(DefaultPluginGui.class);

    File mainFilePath = null;

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

    /**
     * @author phoudek
     */
    public DefaultPluginGui(PluginConfig configuration) {
        this.configuration = configuration;
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

        Set<String> requiredInputStreams = null;
        if (configuration instanceof ImportPluginConfiguration) {
            requiredInputStreams = ((ImportPluginConfiguration) configuration).getStreams().keySet();
        }

        if (requiredInputStreams != null) {
            for (String requiredInputStream : requiredInputStreams) {
                FilePanel fp = new FilePanel("File '" + requiredInputStream + "':", PluginType.IMPORT);
                this.add(fp);
                filePanels.put("import-" + requiredInputStream, fp);
            }
        }

        Set<String> requiredOutputStreams = null;
        if (configuration instanceof ExportPluginConfiguration) {
            requiredOutputStreams = ((ExportPluginConfiguration) configuration).getStreams().keySet();
        }

        if (requiredOutputStreams != null) {
            for (String requiredOutputStream : requiredOutputStreams) {
                FilePanel fp = new FilePanel("File '" + requiredOutputStream + "':", PluginType.EXPORT);
                this.add(fp);
                filePanels.put("export-" + requiredOutputStream, fp);
            }
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.zgif.converter.plugin.PluginComponent#getConfiguration()
     */
    @Override
    public PluginConfig getConfiguration() {
        if (configuration instanceof ExportPluginConfiguration) {
            ExportPluginConfiguration exportConfig = (ExportPluginConfiguration) configuration;
            SortedMap<String, OutputStream> streams = exportConfig.getStreams();
            for (Map.Entry<String, OutputStream> stream : streams.entrySet()) {
                String streamKey = stream.getKey();
                File file = filePanels.get("export-" + streamKey).getFile();
                try {
                    streams.put(streamKey, new FileOutputStream(file));
                } catch (Exception e) {
                    logger.error("open "+streamKey+" stream failed", e);
                }
            }
        }
        

        if (configuration instanceof ImportPluginConfiguration) {
            ImportPluginConfiguration importConfig = (ImportPluginConfiguration) configuration;
            SortedMap<String, InputStream> streams = importConfig.getStreams();
            for (Map.Entry<String, InputStream> stream : streams.entrySet()) {
                String streamKey = stream.getKey();
                File file = filePanels.get("import-" + streamKey).getFile();
                try {
                    streams.put(streamKey, new FileInputStream(file));
                } catch (Exception e) {
                    logger.error("open "+streamKey+" stream failed", e);
                }
            }
        }
        
        return configuration;
    }
}
