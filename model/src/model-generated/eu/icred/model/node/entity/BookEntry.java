package eu.icred.model.node.entity;

import eu.icred.model.annotation.ChildList;
import eu.icred.model.annotation.DataField;
import eu.icred.model.annotation.Node;
import eu.icred.model.datatype.Amount;
import eu.icred.model.datatype.enumeration.AccountingStandard;
import eu.icred.model.datatype.enumeration.TransactionType;
import eu.icred.model.node.entity.AbstractEntityNode;
import java.lang.Double;
import java.lang.String;
import java.util.Currency;
import java.util.Map;

@Node
public class BookEntry extends AbstractEntityNode {

@DataField
protected AccountingStandard accountingStandard;
  public AccountingStandard getAccountingStandard() {
    return this.accountingStandard;
  }
  public void setAccountingStandard(AccountingStandard accountingStandard) {
    this.accountingStandard = accountingStandard;
  }
@DataField
protected Currency currency;
  public Currency getCurrency() {
    return this.currency;
  }
  public void setCurrency(Currency currency) {
    this.currency = currency;
  }
@DataField
protected Amount grossValue;
  public Amount getGrossValue() {
    return this.grossValue;
  }
  public void setGrossValue(Amount grossValue) {
    this.grossValue = grossValue;
  }
@DataField
protected Amount netValue;
  public Amount getNetValue() {
    return this.netValue;
  }
  public void setNetValue(Amount netValue) {
    this.netValue = netValue;
  }
@DataField
protected String text;
  public String getText() {
    return this.text;
  }
  public void setText(String text) {
    this.text = text;
  }
@DataField
protected TransactionType transactionType;
  public TransactionType getTransactionType() {
    return this.transactionType;
  }
  public void setTransactionType(TransactionType transactionType) {
    this.transactionType = transactionType;
  }
@DataField
protected Double vat;
  public Double getVat() {
    return this.vat;
  }
  public void setVat(Double vat) {
    this.vat = vat;
  }
@DataField
protected Amount vatValue;
  public Amount getVatValue() {
    return this.vatValue;
  }
  public void setVatValue(Amount vatValue) {
    this.vatValue = vatValue;
  }
@ChildList
protected Map<String, HashRecord> hashRecords;
  public Map<String, HashRecord> getHashRecords() {
    return this.hashRecords;
  }
  public void setHashRecords(Map<String, HashRecord> hashRecords) {
    this.hashRecords = hashRecords;
  }
}