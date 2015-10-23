package org.zgif.model.node.entity;

import java.lang.String;
import java.util.Map;
import org.zgif.model.annotation.Attribute;
import org.zgif.model.annotation.ChildList;
import org.zgif.model.annotation.Node;
import org.zgif.model.node.entity.AbstractEntityNode;

@Node
public class LeasedUnit extends AbstractEntityNode {

@ChildList
protected Map<String, Term> terms;
  public Map<String, Term> getTerms() {
    return this.terms;
  }
  public void setTerms(Map<String, Term> terms) {
    this.terms = terms;
  }
@Attribute
protected String hash;
  public String getHash() {
    return this.hash;
  }
  public void setHash(String hash) {
    this.hash = hash;
  }
}