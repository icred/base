package eu.icred.plugin;

import java.util.Arrays;
import java.util.List;

import org.joda.time.LocalDateTime;

import eu.icred.model.datatype.enumeration.Subset;
import eu.icred.model.node.Container;
import eu.icred.model.node.Meta;
import eu.icred.plugin.worker.WorkerConfiguration;
import eu.icred.plugin.worker.input.IImportWorker;
import eu.icred.plugin.worker.input.ImportWorkerConfiguration;
import eu.icred.plugin.worker.output.ExportWorkerConfiguration;
import eu.icred.plugin.worker.output.IExportWorker;

public final class PluginDummy implements IPlugin {

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
    public IImportWorker getImportPlugin() {
        return new IImportWorker() {
            
            @Override
            public void unload() {
            }
            
            @Override
            public void load(WorkerConfiguration config) {
            }
            
            @Override
            public List<Subset> getSupportedSubsets() {
                return Arrays.asList(Subset.values());
            }
            
            @Override
            public void load(ImportWorkerConfiguration config) {
            }
            
            @Override
            public ImportWorkerConfiguration getRequiredConfigurationArguments() {
                return new ImportWorkerConfiguration();
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
            public PluginComponent<ImportWorkerConfiguration> getConfigGui() {
                return null;
            }
        };
    }

    @Override
    public IExportWorker getExportPlugin() {
        return new IExportWorker() {
            
            @Override
            public void unload() {
            }
            
            @Override
            public void load(WorkerConfiguration config) {
            }
            
            @Override
            public List<Subset> getSupportedSubsets() {
                return Arrays.asList(Subset.values());
            }
            
            @Override
            public void load(ExportWorkerConfiguration config, Container container) {
            }
            
            @Override
            public ExportWorkerConfiguration getRequiredConfigurationArguments() {
                return new ExportWorkerConfiguration();
            }
            
            @Override
            public PluginComponent<ExportWorkerConfiguration> getConfigGui() {
                return null;
            }
        };
    }

}
