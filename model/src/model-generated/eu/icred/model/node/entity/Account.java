package eu.icred.model.node.entity;

import eu.icred.model.annotation.ChildList;
import eu.icred.model.annotation.DataField;
import eu.icred.model.annotation.Node;
import eu.icred.model.datatype.Amount;
import eu.icred.model.datatype.enumeration.AccountingStandard;
import eu.icred.model.node.entity.AbstractEntityNode;
import java.lang.String;
import java.util.Map;

@Node
public class Account extends AbstractEntityNode {

@DataField
protected AccountingStandard accountingStandard;
  public AccountingStandard getAccountingStandard() {
    return this.accountingStandard;
  }
  public void setAccountingStandard(AccountingStandard accountingStandard) {
    this.accountingStandard = accountingStandard;
  }
@DataField
protected String balancePosition;
  public String getBalancePosition() {
    return this.balancePosition;
  }
  public void setBalancePosition(String balancePosition) {
    this.balancePosition = balancePosition;
  }
@DataField
protected Amount value;
  public Amount getValue() {
    return this.value;
  }
  public void setValue(Amount value) {
    this.value = value;
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
protected Map<String, BookEntry> bookEntries;
  public Map<String, BookEntry> getBookEntries() {
    return this.bookEntries;
  }
  public void setBookEntries(Map<String, BookEntry> bookEntries) {
    this.bookEntries = bookEntries;
  }
}