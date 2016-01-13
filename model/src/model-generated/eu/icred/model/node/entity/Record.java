package eu.icred.model.node.entity;

import eu.icred.model.annotation.DataField;
import eu.icred.model.annotation.Node;
import eu.icred.model.datatype.Amount;
import eu.icred.model.datatype.enumeration.AccountingStandard;
import eu.icred.model.datatype.enumeration.BillStatus;
import eu.icred.model.datatype.enumeration.RecordCategory;
import eu.icred.model.node.entity.AbstractEntityNode;
import java.lang.Double;
import java.lang.String;
import org.joda.time.LocalDate;
import org.joda.time.Period;

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
}