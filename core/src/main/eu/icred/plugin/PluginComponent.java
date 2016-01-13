package eu.icred.plugin;

import javax.swing.JComponent;

import eu.icred.plugin.worker.WorkerConfiguration;

/**
 * @author phoudek
 * 
 */
public abstract class PluginComponent<PluginConfig extends WorkerConfiguration> extends JComponent {
	private static final long serialVersionUID = -6514283473620433014L;

	abstract public PluginConfig getConfiguration();
}
