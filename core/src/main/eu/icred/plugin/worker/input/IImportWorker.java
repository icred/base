package eu.icred.plugin.worker.input;

import eu.icred.model.node.Container;
import eu.icred.plugin.PluginComponent;
import eu.icred.plugin.worker.IWorker;

/**
 * interface for an import plugin
 * 
 * @author phoudek
 * 
 */
public interface IImportWorker extends IWorker {

	public void load(ImportWorkerConfiguration config);

	public ImportWorkerConfiguration getRequiredConfigurationArguments();

	public PluginComponent<ImportWorkerConfiguration> getConfigGui();

    /**
     * returns the imported container object instance type depends of the subset
     * definition in the meta data
     * 
     * @return container object
     */
    public Container getContainer();
}
