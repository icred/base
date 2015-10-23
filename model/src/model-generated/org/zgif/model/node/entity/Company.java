package org.zgif.model.node.entity;

import java.lang.String;
import java.util.Currency;
import java.util.Map;
import org.zgif.model.annotation.ChildList;
import org.zgif.model.annotation.DataField;
import org.zgif.model.annotation.Node;
import org.zgif.model.node.entity.AbstractEntityNode;

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