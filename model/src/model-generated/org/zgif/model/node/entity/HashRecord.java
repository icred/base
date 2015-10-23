package org.zgif.model.node.entity;

import java.lang.String;
import org.zgif.model.annotation.Attribute;
import org.zgif.model.annotation.Node;
import org.zgif.model.node.entity.AbstractEntityNode;

@Node
public class HashRecord extends AbstractEntityNode {

@Attribute
protected String hash;
  public String getHash() {
    return this.hash;
  }
  public void setHash(String hash) {
    this.hash = hash;
  }
}