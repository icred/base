package org.zgif.converter.plugin;

import org.zgif.converter.plugin.input.IImportPlugin;
import org.zgif.converter.plugin.output.IExportPlugin;

/**
 * @author phoudek
 * 
 */
public interface IPluginWrapper {
	public boolean isModelVersionSupported(String version);
	
	public String getPluginId();
	
	public String getPluginVersion();
	
	public String getPluginName();
	
	public IImportPlugin getImportPlugin();
	
	public IExportPlugin getExportPlugin();
}
