package eu.icred.plugin.worker.output;

import eu.icred.model.node.Container;
import eu.icred.plugin.PluginComponent;
import eu.icred.plugin.worker.IWorker;

/**
 * interface for an import plugin
 * 
 * @author phoudek
 * 
 */
public interface IExportWorker extends IWorker {
    public ExportWorkerConfiguration getRequiredConfigurationArguments();    
    
    public void load(ExportWorkerConfiguration config, Container container);

    public PluginComponent<ExportWorkerConfiguration> getConfigGui();
}
