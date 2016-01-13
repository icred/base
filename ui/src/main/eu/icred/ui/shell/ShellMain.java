package eu.icred.ui.shell;

import java.io.File;
import java.nio.file.Files;
import java.util.Properties;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

import eu.icred.Paths;
import eu.icred.model.node.Container;
import eu.icred.plugin.PluginLoader;
import eu.icred.plugin.worker.input.IImportWorker;
import eu.icred.plugin.worker.input.ImportWorkerConfiguration;
import eu.icred.plugin.worker.output.ExportWorkerConfiguration;
import eu.icred.plugin.worker.output.IExportWorker;
import eu.icred.ui.gui.GuiMain;

/**
 * @author phoudek
 * 
 */
public class ShellMain {

    private static Logger rootLogger = Logger.getRootLogger();

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        rootLogger.removeAllAppenders();
        
        PatternLayout layout = new PatternLayout("%d{ISO8601} %-5p [%t] %c: %m%n");
        ConsoleAppender consoleAppender = new ConsoleAppender(layout);
        rootLogger.addAppender(consoleAppender);
        
        Properties props = Paths.getProperties();
        Level logLevel = Level.WARN;
        if(props != null) {
            logLevel = Level.toLevel(props.getProperty("logLevel", "WARN"));
        }
        rootLogger.setLevel(logLevel);
        
        if (args.length == 0) {
            GuiMain.main(args);
        } else {
            Options options = new Options();

            Option guiOption = Option.builder("g").longOpt("gui").desc("start the GUI").build();
            Option pluginOption = Option.builder("p").longOpt("plugin").required().argName("plugin=classpath").numberOfArgs(2).valueSeparator()
                    .desc("set classpath for plugins (import and export)").build();
            Option importOption = Option.builder("i").longOpt("import").numberOfArgs(2).valueSeparator().desc("config for import plugin").build();
            Option exportOption = Option.builder("e").longOpt("export").numberOfArgs(2).valueSeparator().desc("config for export plugin").build();

            options.addOption(guiOption);
            options.addOption(pluginOption);
            options.addOption(importOption);
            options.addOption(exportOption);

            CommandLineParser parser = new DefaultParser();
            CommandLine cmd = parser.parse(options, args);

            Properties pluginProps = cmd.getOptionProperties("plugin");

            String importPluginName = pluginProps.getProperty("import");
            IImportWorker importPlugin = PluginLoader.getImportPlugin(importPluginName);
            if (importPlugin == null) {
                throw new Error("could not load import plugin of '" + importPluginName + "'");
            }

            String exportPluginName = pluginProps.getProperty("export");
            IExportWorker exportPlugin = PluginLoader.getExportPlugin(exportPluginName);
            if (exportPlugin == null) {
                throw new Error("could not load export plugin of '" + exportPluginName + "'");
            }

            if (importPlugin != null && exportPlugin != null) {
                Properties importProps = cmd.getOptionProperties("import");
                ImportWorkerConfiguration importConfig = ImportWorkerConfiguration.getConfigFromProperties(importProps);
                importPlugin.load(importConfig);
                Container container = importPlugin.getContainer();
                importPlugin.unload();

                Properties exportProps = cmd.getOptionProperties("export");
                ExportWorkerConfiguration exportConfig = ExportWorkerConfiguration.getConfigFromProperties(exportProps);
                exportPlugin.load(exportConfig, container);
                exportPlugin.unload();
            }
        }
    }
}
