package org.zgif.model.node;

import org.zgif.model.annotation.Node;

@Node
public abstract class AbstractNode {
    private ExtensionMap extensionMap = new ExtensionMap();
    
    public AbstractNode() {
    }

    public ExtensionMap getExtensionMap() {
        return extensionMap;
    }
    public void setExtensionMap(ExtensionMap extensionMap) {
        this.extensionMap = extensionMap;
    }
}
