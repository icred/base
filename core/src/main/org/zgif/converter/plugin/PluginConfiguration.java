package org.zgif.converter.plugin;

import java.util.Map.Entry;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author phoudek
 * 
 */
public class PluginConfiguration {

	private SortedMap<String, Boolean> booleans = new TreeMap<String, Boolean>();
	private SortedMap<String, Double> doubles = new TreeMap<String, Double>();
	private SortedMap<String, Integer> integers = new TreeMap<String, Integer>();
	private SortedMap<String, Object> objects = new TreeMap<String, Object>();
	private SortedMap<String, String> strings = new TreeMap<String, String>();
	protected SortedMap<String, Object> all = new TreeMap<String, Object>();

	protected boolean changedAll = false;

	/**
	 * @author phoudek
	 * @param strings
	 *            the strings to set
	 */
	public void setStrings(SortedMap<String, String> strings) {
		this.changedAll = true;
		this.strings = strings;
	}

	/**
	 * @author phoudek
	 * @param integers
	 *            the integers to set
	 */
	public void setIntegers(SortedMap<String, Integer> integers) {
		this.changedAll = true;
		this.integers = integers;
	}

	/**
	 * @author phoudek
	 * @param doubles
	 *            the doubles to set
	 */
	public void setDoubles(SortedMap<String, Double> doubles) {
		this.changedAll = true;
		this.doubles = doubles;
	}

	/**
	 * @author phoudek
	 * @param booleans
	 *            the booleans to set
	 */
	public void setBooleans(SortedMap<String, Boolean> booleans) {
		this.changedAll = true;
		this.booleans = booleans;
	}

	/**
	 * @author phoudek
	 * @param objects
	 *            the objects to set
	 */
	public void setObjects(SortedMap<String, Object> objects) {
		this.changedAll = true;
		this.objects = objects;
	}

	/**
	 * @author phoudek
	 * @return the objects
	 */
	public SortedMap<String, Object> getObjects() {
		return objects;
	}

	/**
	 * @author phoudek
	 * @return the strings
	 */
	public SortedMap<String, String> getStrings() {
		return strings;
	}

	/**
	 * @author phoudek
	 * @return the integers
	 */
	public SortedMap<String, Integer> getIntegers() {
		return integers;
	}

	/**
	 * @author phoudek
	 * @return the doubles
	 */
	public SortedMap<String, Double> getDoubles() {
		return doubles;
	}

	/**
	 * @author phoudek
	 * @return the booleans
	 */
	public SortedMap<String, Boolean> getBooleans() {
		return booleans;
	}

	/**
	 * @author phoudek
	 * @return the all
	 */
	public SortedMap<String, Object> getAll() {
		if (changedAll) {
			all.clear();

			all.putAll(this.booleans);
			all.putAll(this.doubles);
			all.putAll(this.integers);
			all.putAll(this.objects);
			all.putAll(this.strings);
		}
		return all;
	}

	protected void load(String key, Object value) {
		if (key.startsWith("boolean-")) {
			if (value instanceof Boolean) {
				this.booleans.put(key.substring(8), (Boolean) value);
			} else {
				this.booleans.put(key.substring(8), Boolean.parseBoolean(value.toString()));
			}
		} else if (key.startsWith("double-")) {
			if (value instanceof Double) {
				this.doubles.put(key.substring(8), (Double) value);
			} else {
				this.doubles.put(key.substring(8), Double.parseDouble(value.toString()));
			}
		} else if (key.startsWith("integer-")) {
			if (value instanceof Integer) {
				this.integers.put(key.substring(8), (Integer) value);
			} else {
				this.integers.put(key.substring(8), Integer.parseInt(value.toString()));
			}
		} else if (key.startsWith("string-")) {
			this.strings.put(key.substring(8), value.toString());
		} else {
			this.objects.put(key, value);
		}
	}

	/**
	 * converted {@link Properties} object to {@link PluginConfiguration} object
	 * 
	 * @param props
	 *            properties
	 * @return plugin configuration
	 */
	public static PluginConfiguration getConfigFromProperties(Properties props) {
		PluginConfiguration config = new PluginConfiguration();
		for (Entry<Object, Object> entry : props.entrySet()) {
			String key = entry.getKey().toString();

			config.load(key, entry.getValue());
		}

		return config;
	}
}
