package eu.icred.model.node;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ExtensionMap {

    protected Map<String, String> values;
    protected Map<String, List<String>> subLists;
    protected Map<String, ExtensionMap> subMaps;

    protected Map<String, String> getValues() {
        if (values == null) {
            values = new HashMap<String, String>();
        }
        return values;
    }

    protected Map<String, List<String>> getSubLists() {
        if (subLists == null) {
            subLists = new HashMap<String, List<String>>();
        }
        return subLists;
    }

    protected Map<String, ExtensionMap> getSubMaps() {
        if (subMaps == null) {
            subMaps = new HashMap<String, ExtensionMap>();
        }
        return subMaps;
    }

    public Set<String> getValuesKeySet() {
        if(values == null) {
            return null;
        }
        return values.keySet();
    }

    public Set<String> getSubListsKeySet() {
        if(subLists == null) {
            return null;
        }
        return subLists.keySet();
    }

    public Set<String> getSubMapsKeySet() {
        if(subMaps == null) {
            return null;
        }
        return subMaps.keySet();
    }

    public String getValue(String key) {
        return getValues().get(key);
    }

    public void setValue(String key, String value) {
        getValues().put(key, value);
    }

    public ExtensionMap getSubMap(String key) {
        return getSubMaps().get(key);
    }

    public void setSubMap(String key, ExtensionMap map) {
        getSubMaps().put(key, map);
    }

    public List<String> getSubList(String key) {
        return getSubLists().get(key);
    }

    public void setSubList(String key, List<String> list) {
        getSubLists().put(key, list);
    }
}
