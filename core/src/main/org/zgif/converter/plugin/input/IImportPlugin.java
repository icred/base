package org.zgif.converter.plugin.input;

import org.zgif.converter.plugin.IPlugin;
import org.zgif.converter.plugin.PluginComponent;
import org.zgif.model.node.Container;

/**
 * interface for an import plugin
 * 
 * @author phoudek
 * 
 */
public interface IImportPlugin extends IPlugin {

	public void load(ImportPluginConfiguration config);

	public ImportPluginConfiguration getRequiredConfigurationArguments();

	public PluginComponent<ImportPluginConfiguration> getConfigGui();

    /**
     * returns the imported container object instance type depends of the subset
     * definition in the meta data
     * 
     * @return container object
     */
    public Container getContainer();
}
