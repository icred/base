package eu.icred.plugin.worker;

import java.util.List;

import eu.icred.model.datatype.enumeration.Subset;
import eu.icred.plugin.worker.output.ExportWorkerConfiguration;

/**
 * @author phoudek
 * 
 */
public interface IWorker {
	/**
	 * returns the supported subsets of this plugin
	 * 
	 * @return list of supported subsets
	 */
	public List<Subset> getSupportedSubsets();

	/**
	 * called on startup of the plugin
	 * 
	 * @param config
	 *            configuration for the plugin
	 */
	public void load(WorkerConfiguration config);

	/**
	 * called after the plugin was used
	 */
	public void unload();

    /**
     * returns the required configuration arguments. maps of the returned
     * {@link WorkerConfiguration} must have keys without values
     * 
     * @return emptry config of required configuration
     */
    public WorkerConfiguration getRequiredConfigurationArguments();
}
