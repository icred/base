package eu.icred.model.node.entity;

import eu.icred.model.annotation.Attribute;
import eu.icred.model.annotation.Node;
import eu.icred.model.node.entity.AbstractEntityNode;
import java.lang.String;

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