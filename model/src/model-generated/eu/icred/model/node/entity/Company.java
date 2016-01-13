package eu.icred.model.node.entity;

import eu.icred.model.annotation.ChildList;
import eu.icred.model.annotation.DataField;
import eu.icred.model.annotation.Node;
import eu.icred.model.node.entity.AbstractEntityNode;
import java.lang.String;
import java.util.Currency;
import java.util.Map;

@Node
public class Company extends AbstractEntityNode {

@DataField
protected Currency currency;
  public Currency getCurrency() {
    return this.currency;
  }
  public void setCurrency(Currency currency) {
    this.currency = currency;
  }
@DataField
protected String note;
  public String getNote() {
    return this.note;
  }
  public void setNote(String note) {
    this.note = note;
  }
@ChildList
protected Map<String, Property> properties;
  public Map<String, Property> getProperties() {
    return this.properties;
  }
  public void setProperties(Map<String, Property> properties) {
    this.properties = properties;
  }
@ChildList
protected Map<String, Record> records;
  public Map<String, Record> getRecords() {
    return this.records;
  }
  public void setRecords(Map<String, Record> records) {
    this.records = records;
  }
@ChildList
protected Map<String, Account> accounts;
  public Map<String, Account> getAccounts() {
    return this.accounts;
  }
  public void setAccounts(Map<String, Account> accounts) {
    this.accounts = accounts;
  }
}