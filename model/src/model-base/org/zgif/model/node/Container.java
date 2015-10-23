package org.zgif.model.node;

import java.util.HashMap;
import java.util.Map;

import org.zgif.model.annotation.ChildList;
import org.zgif.model.annotation.Node;

@Node
public class Container extends AbstractNode {
    @ChildList
    protected Map<String, Period> periods;
    protected Meta                meta;
    protected Data                maindata;

    public Container() {
    }

    public Meta getMeta() {
        return getMeta(true);
    }

    public Meta getMeta(boolean lazy) {
        if (lazy && meta == null)
            meta = new Meta();

        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public Map<String, Period> getPeriods() {
        return getPeriods(true);
    }

    public Map<String, Period> getPeriods(boolean lazy) {
        if (lazy && periods == null)
            periods = new HashMap<String, Period>();

        return periods;
    }

    public void setPeriods(Map<String, Period> periods) {
        this.periods = periods;
    }

    public Data getMaindata() {
        return getMaindata(true);
    }

    public Data getMaindata(boolean lazy) {
        if (lazy && maindata == null)
            maindata = new Data();

        return maindata;
    }

    public void setMaindata(Data maindata) {
        this.maindata = maindata;
    }

}
