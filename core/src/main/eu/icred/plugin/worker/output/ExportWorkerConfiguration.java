package eu.icred.plugin.worker.output;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;

import eu.icred.plugin.worker.WorkerConfiguration;

/**
 * @author phoudek
 * 
 */
public class ExportWorkerConfiguration extends WorkerConfiguration {

	private SortedMap<String, OutputStream> streams = new TreeMap<String, OutputStream>();

	/**
	 * @author phoudek
	 * @param streams
	 *            the streams to set
	 */
	public void setStreams(SortedMap<String, OutputStream> streams) {
		this.changedAll = true;
		this.streams = streams;
	}

	/**
	 * @author phoudek
	 * @return the streams
	 */
	public SortedMap<String, OutputStream> getStreams() {
		return streams;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see eu.icred.plugin.PluginConfiguration#getAll()
	 */
	@Override
	public SortedMap<String, Object> getAll() {
	    SortedMap<String, Object> all = super.getAll();

		all.putAll(this.streams);

		return all;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see eu.icred.plugin.PluginConfiguration#load(java.lang.String,
	 * java.lang.Object)
	 */
	@Override
	protected void load(String key, Object value) {
		if (key.startsWith("filepath-")) {
			try {
				this.streams.put(key.substring(9), new FileOutputStream(value.toString()));
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			super.load(key, value);
		}
	}

	/**
	 * converted {@link Properties} object to {@link ExportWorkerConfiguration}
	 * object
	 * 
	 * @param props
	 *            properties
	 * @return export plugin configuration
	 */
	public static ExportWorkerConfiguration getConfigFromProperties(Properties props) {
		ExportWorkerConfiguration config = new ExportWorkerConfiguration();

		for (Entry<Object, Object> entry : props.entrySet()) {
			config.load(entry.getKey().toString(), entry.getValue());
		}

		return config;
	}
}
