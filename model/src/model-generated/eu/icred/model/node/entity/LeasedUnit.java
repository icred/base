package eu.icred.model.node.entity;

import eu.icred.model.annotation.Attribute;
import eu.icred.model.annotation.ChildList;
import eu.icred.model.annotation.Node;
import eu.icred.model.node.entity.AbstractEntityNode;
import java.lang.String;
import java.util.Map;

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