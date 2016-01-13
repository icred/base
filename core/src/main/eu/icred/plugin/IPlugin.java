package eu.icred.plugin;

import eu.icred.plugin.worker.input.IImportWorker;
import eu.icred.plugin.worker.output.IExportWorker;

/**
 * @author phoudek
 * 
 */
public interface IPlugin {
	public boolean isModelVersionSupported(String version);
	
	public String getPluginId();
	
	public String getPluginVersion();
	
	public String getPluginName();
	
	public IImportWorker getImportPlugin();
	
	public IExportWorker getExportPlugin();
}
