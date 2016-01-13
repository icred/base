package eu.icred.plugin.worker.input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;

import eu.icred.plugin.worker.WorkerConfiguration;

/**
 * @author phoudek
 * 
 */
public class ImportWorkerConfiguration extends WorkerConfiguration {

    private SortedMap<String, InputStream> streams = new TreeMap<String, InputStream>();

    /**
     * @author phoudek
     * @param streams
     *            the streams to set
     */
    public void setStreams(SortedMap<String, InputStream> streams) {
        this.changedAll = true;
        this.streams = streams;
    }

    /**
     * @author phoudek
     * @return the streams
     */
    public SortedMap<String, InputStream> getStreams() {
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
                this.streams.put(key.substring(9), new FileInputStream(value.toString()));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } else if (key.startsWith("int-")) {
            this.getIntegers().put(key.substring(4), Integer.parseInt(value.toString()));
        } else if (key.startsWith("str-")) {
            this.getStrings().put(key.substring(4), value.toString());
        } else {
            super.load(key, value);
        }
    }

    /**
     * converted {@link Properties} object to {@link ImportWorkerConfiguration}
     * object
     * 
     * @param props
     *            properties
     * @return import plugin configuration
     */
    public static ImportWorkerConfiguration getConfigFromProperties(Properties props) {
        ImportWorkerConfiguration config = new ImportWorkerConfiguration();

        for (Entry<Object, Object> entry : props.entrySet()) {
            config.load(entry.getKey().toString(), entry.getValue());
        }

        return config;
    }
}
