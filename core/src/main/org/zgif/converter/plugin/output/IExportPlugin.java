package org.zgif.converter.plugin.output;

import org.zgif.converter.plugin.IPlugin;
import org.zgif.converter.plugin.PluginComponent;
import org.zgif.model.node.Container;

/**
 * interface for an import plugin
 * 
 * @author phoudek
 * 
 */
public interface IExportPlugin extends IPlugin {
    public ExportPluginConfiguration getRequiredConfigurationArguments();    
    
    public void load(ExportPluginConfiguration config, Container container);

    public PluginComponent<ExportPluginConfiguration> getConfigGui();
}
