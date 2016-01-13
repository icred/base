package eu.icred.ui.gui;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

import eu.icred.plugin.IPlugin;
import eu.icred.plugin.PluginComponent;
import eu.icred.plugin.worker.IWorker;
import eu.icred.plugin.worker.WorkerConfiguration;
import eu.icred.plugin.worker.input.IImportWorker;
import eu.icred.plugin.worker.output.IExportWorker;

/**
 * @author phoudek
 * 
 */
public class PluginPanel extends JPanel implements ItemListener {
    private static final long serialVersionUID = -5605908822660592177L;

    enum PluginType {
        IMPORT, EXPORT;

        @Override
        public String toString() {
            return (this == PluginType.IMPORT) ? "Import" : "Export";
        }
    }

    public void removeAllPlugins() {
        comboBox.removeAllItems();
    }

    public void addPlugin(IPlugin plugin) {
        comboBox.addItem(plugin);
    }

    private PluginType type;
    private JComboBox<IPlugin> comboBox;
    JPanel pluginGuiContainer; 
    IWorker plugin;
    PluginComponent<WorkerConfiguration> pluginGui;
    
    public PluginPanel(final PluginType type) {
        this.type = type;
        this.setLayout(new GridBagLayout());

        comboBox = new JComboBox<IPlugin>();
        comboBox.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (value instanceof IPlugin) {
                    IPlugin plugin = (IPlugin) value;
                    setText(plugin.getPluginName());
                }
                return this;
            }
        });

        pluginGuiContainer = new JPanel();
        this.add(pluginGuiContainer, new GridBagConstraints(0, 1, 2, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(4, 4, 4, 4), 0, 0));
        this.add(new JPanel(), new GridBagConstraints(0, 2, 2, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(4, 4, 4, 4), 0, 0));
        
        comboBox.addItemListener(this);

        this.add(new JLabel(type + "-Plugin:"), new GridBagConstraints(0, 0, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(4, 4,
                4, 4), 0, 0));
        this.add(comboBox, new GridBagConstraints(1, 0, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(4, 4, 4, 4), 0, 0));
    }
    

    @Override
    public void itemStateChanged(ItemEvent e) {
        IPlugin pluginWrapper = (IPlugin) e.getItem();

        plugin = ((type == PluginType.IMPORT) ? pluginWrapper.getImportPlugin() : pluginWrapper.getExportPlugin()); 
        pluginGui = (PluginComponent<WorkerConfiguration>) ((type == PluginType.IMPORT) ? ((IImportWorker)plugin).getConfigGui() : ((IExportWorker)plugin).getConfigGui());
        
        if(pluginGui == null) {
            WorkerConfiguration config;
            config = (WorkerConfiguration) ((type == PluginType.IMPORT) ? pluginWrapper.getImportPlugin().getRequiredConfigurationArguments() : pluginWrapper.getExportPlugin().getRequiredConfigurationArguments());
            if(config == null) {
                config = new WorkerConfiguration();
            }
            pluginGui = new DefaultPluginGui<WorkerConfiguration>(config);
        }
        
        pluginGuiContainer.removeAll();
        pluginGuiContainer.add(pluginGui);
        pluginGuiContainer.validate();
        this.validate();
    }

    public IWorker getPlugin() {
        return plugin;
    }

    public WorkerConfiguration getPluginConfiguration() {
        return pluginGui.getConfiguration();
    }
}
