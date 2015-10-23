package org.zgif.model.node.entity;

import java.lang.String;
import org.joda.time.LocalDate;
import org.joda.time.Period;
import org.zgif.model.annotation.DataField;
import org.zgif.model.annotation.Node;
import org.zgif.model.datatype.Amount;
import org.zgif.model.datatype.enumeration.AccountingStandard;
import org.zgif.model.datatype.enumeration.BillStatus;
import org.zgif.model.datatype.enumeration.RecordCategory;
import org.zgif.model.node.entity.AbstractEntityNode;

@Node
public class Record extends AbstractEntityNode {

@DataField
protected AccountingStandard accountingStandard;
  public AccountingStandard getAccountingStandard() {
    return this.accountingStandard;
  }
  public void setAccountingStandard(AccountingStandard accountingStandard) {
    this.accountingStandard = accountingStandard;
  }
@DataField
protected RecordCategory category;
  public RecordCategory getCategory() {
    return this.category;
  }
  public void setCategory(RecordCategory category) {
    this.category = category;
  }
@DataField
protected LocalDate date;
  public LocalDate getDate() {
    return this.date;
  }
  public void setDate(LocalDate date) {
    this.date = date;
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
protected Period paymentPeriod;
  public Period getPaymentPeriod() {
    return this.paymentPeriod;
  }
  public void setPaymentPeriod(Period paymentPeriod) {
    this.paymentPeriod = paymentPeriod;
  }
@DataField
protected BillStatus status;
  public BillStatus getStatus() {
    return this.status;
  }
  public void setStatus(BillStatus status) {
    this.status = status;
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
protected Amount vat;
  public Amount getVat() {
    return this.vat;
  }
  public void setVat(Amount vat) {
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
}