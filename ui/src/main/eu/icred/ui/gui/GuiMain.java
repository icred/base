package eu.icred.ui.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Properties;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JSplitPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

import eu.icred.Paths;
import eu.icred.model.datatype.enumeration.Country;
import eu.icred.model.datatype.enumeration.Subset;
import eu.icred.model.node.Container;
import eu.icred.plugin.IPlugin;
import eu.icred.plugin.PluginLoader;
import eu.icred.plugin.worker.input.IImportWorker;
import eu.icred.plugin.worker.input.ImportWorkerConfiguration;
import eu.icred.plugin.worker.output.ExportWorkerConfiguration;
import eu.icred.plugin.worker.output.IExportWorker;
import eu.icred.ui.gui.PluginPanel.PluginType;

/**
 * @author phoudek
 * 
 */
public class GuiMain {
    static final Integer FRAME_WIDTH = 800;
    static final Integer FRAME_HEIGHT = 600;

    private static Logger rootLogger = Logger.getRootLogger();
    private static Logger   logger       = Logger.getLogger(GuiMain.class);
    private File tmpLogFile;

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
        }

        new GuiMain().show();
    }

    public GuiMain() {
        PatternLayout csvLayout = new PatternLayout("%d{ISO8601};%-5p;%c{1};\"%m\"\r\n") {
            @Override
            public boolean ignoresThrowable() {
                return false;
            }
        };

        try {
            tmpLogFile = Files.createTempFile("icred", ".log").toFile();
            FileAppender fileAppender = new FileAppender(csvLayout, tmpLogFile.getCanonicalPath(), false);
            rootLogger.addAppender(fileAppender);
        } catch (IOException e) {
        }
    }

    JSplitPane pluginSplitPane;

    private void saveLogFile() {
        JFileChooser fc = new JFileChooser(new File(System.getProperty("user.home")));
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fc.setDialogTitle("Save the log file:");
        fc.setFileFilter(new javax.swing.filechooser.FileFilter() {

            @Override
            public String getDescription() {
                return ".csv";
            }

            @Override
            public boolean accept(File file) {
                String fileName = file.getName();
                return file != null && fileName != null && (fileName.toLowerCase().endsWith(".csv") || file.isDirectory());
            }
        });

        int result = fc.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File logFile = fc.getSelectedFile();
            if (!logFile.getName().endsWith(".csv")) {
                logFile = new File(logFile.getParentFile(), logFile.getName() + ".csv");
            }
            if (logFile.exists()) {
                logFile.delete();
            }
            // LogManager.shutdown();
            try {
                Files.copy(tmpLogFile.toPath(), logFile.toPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
            // LogManager.resetConfiguration();
        }
    }

    private void show() {

        JFrame mainFrame = new JFrame("ICRED");

        mainFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainFrame.setLayout(new BorderLayout());

        final PluginPanel importPanel = new PluginPanel(PluginType.IMPORT);
        final PluginPanel exportPanel = new PluginPanel(PluginType.EXPORT);

        MenuePanel menue = new MenuePanel();

        menue.addConvertPressedListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    IImportWorker importPlugin = (IImportWorker) importPanel.getPlugin();
                    ImportWorkerConfiguration importConfig = (ImportWorkerConfiguration) importPanel.getPluginConfiguration();
                    importPlugin.load(importConfig);
                    Container container = importPlugin.getContainer();
                    importPlugin.unload();

                    IExportWorker exportPlugin = (IExportWorker) exportPanel.getPlugin();
                    ExportWorkerConfiguration exportConfig = (ExportWorkerConfiguration) exportPanel.getPluginConfiguration();
                    exportPlugin.load(exportConfig, container);
                    exportPlugin.unload();
                } catch (Throwable t) {
                    rootLogger.fatal(t);
                } finally {
                    saveLogFile();
                }
            }
        });

        menue.addSubsetChangedListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                Subset subset = (Subset) e.getItem();

                logger.debug("selected subset: " + subset.toString());
                
                importPanel.removeAllPlugins();
                exportPanel.removeAllPlugins();
                for (IPlugin plugin : PluginLoader.getAvailablePlugins()) {
                    IImportWorker iPlugin = plugin.getImportPlugin();
                    logger.debug("test subset support for import-plugin '"+iPlugin+"'");
                    if (iPlugin != null && iPlugin.getSupportedSubsets().contains(subset)) {
                        importPanel.addPlugin(plugin);
                    }

                    IExportWorker ePlugin = plugin.getExportPlugin();
                    logger.debug("test subset support for export-plugin '"+ePlugin+"'");
                    if (ePlugin != null && ePlugin.getSupportedSubsets().contains(subset)) {
                        exportPanel.addPlugin(plugin);
                    }
                }
            }
        });

        mainFrame.add(menue, BorderLayout.NORTH);
        pluginSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, importPanel, exportPanel);
        // JSplitPane sp = new JSplitPane(JSplitPane.VERTICAL_SPLIT,
        // pluginSplitPane, new JLabel("..."));

        mainFrame.add(pluginSplitPane, BorderLayout.CENTER);

        mainFrame.setVisible(true);
        restoreDefaults();
    }

    private void restoreDefaults() {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                pluginSplitPane.setDividerLocation(pluginSplitPane.getSize().width / 2);
            }
        });
    }
}
