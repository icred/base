package org.zgif.converter.ui.gui;

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

import org.zgif.converter.plugin.IPlugin;
import org.zgif.converter.plugin.IPluginWrapper;
import org.zgif.converter.plugin.PluginComponent;
import org.zgif.converter.plugin.PluginConfiguration;
import org.zgif.converter.plugin.input.IImportPlugin;
import org.zgif.converter.plugin.output.IExportPlugin;

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

    public void addPlugin(IPluginWrapper plugin) {
        comboBox.addItem(plugin);
    }

    private PluginType type;
    private JComboBox<IPluginWrapper> comboBox;
    JPanel pluginGuiContainer; 
    IPlugin plugin;
    PluginComponent<PluginConfiguration> pluginGui;
    
    public PluginPanel(final PluginType type) {
        this.type = type;
        this.setLayout(new GridBagLayout());

        comboBox = new JComboBox<IPluginWrapper>();
        comboBox.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (value instanceof IPluginWrapper) {
                    IPluginWrapper plugin = (IPluginWrapper) value;
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
        IPluginWrapper pluginWrapper = (IPluginWrapper) e.getItem();

        plugin = ((type == PluginType.IMPORT) ? pluginWrapper.getImportPlugin() : pluginWrapper.getExportPlugin()); 
        pluginGui = (PluginComponent<PluginConfiguration>) ((type == PluginType.IMPORT) ? ((IImportPlugin)plugin).getConfigGui() : ((IExportPlugin)plugin).getConfigGui());
        
        if(pluginGui == null) {
            PluginConfiguration config;
            config = (PluginConfiguration) ((type == PluginType.IMPORT) ? pluginWrapper.getImportPlugin().getRequiredConfigurationArguments() : pluginWrapper.getExportPlugin().getRequiredConfigurationArguments());
            if(config == null) {
                config = new PluginConfiguration();
            }
            pluginGui = new DefaultPluginGui<PluginConfiguration>(config);
        }
        
        pluginGuiContainer.removeAll();
        pluginGuiContainer.add(pluginGui);
        pluginGuiContainer.validate();
        this.validate();
    }

    public IPlugin getPlugin() {
        return plugin;
    }

    public PluginConfiguration getPluginConfiguration() {
        return pluginGui.getConfiguration();
    }
}
