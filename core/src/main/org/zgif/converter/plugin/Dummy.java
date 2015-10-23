package org.zgif.converter.plugin;

import java.util.Arrays;
import java.util.List;

import org.joda.time.LocalDateTime;
import org.zgif.converter.plugin.input.IImportPlugin;
import org.zgif.converter.plugin.input.ImportPluginConfiguration;
import org.zgif.converter.plugin.output.ExportPluginConfiguration;
import org.zgif.converter.plugin.output.IExportPlugin;
import org.zgif.model.datatype.enumeration.Subset;
import org.zgif.model.node.Container;
import org.zgif.model.node.Meta;

public class Dummy implements IPluginWrapper {

	@Override
	public boolean isModelVersionSupported(String version) {
		return true;
	}

	@Override
	public String getPluginId() {
		return "icred.dummy";
	}

	@Override
	public String getPluginVersion() {
		return "1.0";
	}

	@Override
	public String getPluginName() {
		return "Dummy-Plugin";
	}

    @Override
    public IImportPlugin getImportPlugin() {
        return new IImportPlugin() {
            
            @Override
            public void unload() {
            }
            
            @Override
            public void load(PluginConfiguration config) {
            }
            
            @Override
            public List<Subset> getSupportedSubsets() {
                return Arrays.asList(Subset.values());
            }
            
            @Override
            public void load(ImportPluginConfiguration config) {
            }
            
            @Override
            public ImportPluginConfiguration getRequiredConfigurationArguments() {
                return new ImportPluginConfiguration();
            }
            
            @Override
            public Container getContainer() {
                Container container = new Container();
                
                Meta meta = new Meta();
                meta.setProcess(Subset.NONE);
                meta.setDescription("dummy object");
                meta.setCreator("IRCED");
                meta.setCreated(LocalDateTime.now());
                container.setMeta(meta);
                
                return container;
            }
            
            @Override
            public PluginComponent<ImportPluginConfiguration> getConfigGui() {
                return null;
            }
        };
    }

    @Override
    public IExportPlugin getExportPlugin() {
        return new IExportPlugin() {
            
            @Override
            public void unload() {
            }
            
            @Override
            public void load(PluginConfiguration config) {
            }
            
            @Override
            public List<Subset> getSupportedSubsets() {
                return Arrays.asList(Subset.values());
            }
            
            @Override
            public void load(ExportPluginConfiguration config, Container container) {
            }
            
            @Override
            public ExportPluginConfiguration getRequiredConfigurationArguments() {
                return new ExportPluginConfiguration();
            }
            
            @Override
            public PluginComponent<ExportPluginConfiguration> getConfigGui() {
                return null;
            }
        };
    }

}
