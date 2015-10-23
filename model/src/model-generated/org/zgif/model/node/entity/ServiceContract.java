package org.zgif.model.node.entity;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import org.joda.time.LocalDate;
import org.joda.time.Period;
import org.zgif.model.annotation.DataField;
import org.zgif.model.annotation.Node;
import org.zgif.model.datatype.Amount;
import org.zgif.model.datatype.enumeration.ContractOption;
import org.zgif.model.datatype.enumeration.LegitTerminationDeadline;
import org.zgif.model.datatype.enumeration.ServiceType;
import org.zgif.model.node.entity.AbstractEntityNode;

@Node
public class ServiceContract extends AbstractEntityNode {

@DataField
protected LocalDate contractCompletionDate;
  public LocalDate getContractCompletionDate() {
    return this.contractCompletionDate;
  }
  public void setContractCompletionDate(LocalDate contractCompletionDate) {
    this.contractCompletionDate = contractCompletionDate;
  }
@DataField
protected Period contractExtensionDuration;
  public Period getContractExtensionDuration() {
    return this.contractExtensionDuration;
  }
  public void setContractExtensionDuration(Period contractExtensionDuration) {
    this.contractExtensionDuration = contractExtensionDuration;
  }
@DataField
protected ContractOption contractOption;
  public ContractOption getContractOption() {
    return this.contractOption;
  }
  public void setContractOption(ContractOption contractOption) {
    this.contractOption = contractOption;
  }
@DataField
protected String creditor;
  public String getCreditor() {
    return this.creditor;
  }
  public void setCreditor(String creditor) {
    this.creditor = creditor;
  }
@DataField
protected LocalDate firstPaymentDate;
  public LocalDate getFirstPaymentDate() {
    return this.firstPaymentDate;
  }
  public void setFirstPaymentDate(LocalDate firstPaymentDate) {
    this.firstPaymentDate = firstPaymentDate;
  }
@DataField
protected Amount netAmountPerPayment;
  public Amount getNetAmountPerPayment() {
    return this.netAmountPerPayment;
  }
  public void setNetAmountPerPayment(Amount netAmountPerPayment) {
    this.netAmountPerPayment = netAmountPerPayment;
  }
@DataField
protected Period paymentPattern;
  public Period getPaymentPattern() {
    return this.paymentPattern;
  }
  public void setPaymentPattern(Period paymentPattern) {
    this.paymentPattern = paymentPattern;
  }
@DataField
protected Integer paymentsPerYear;
  public Integer getPaymentsPerYear() {
    return this.paymentsPerYear;
  }
  public void setPaymentsPerYear(Integer paymentsPerYear) {
    this.paymentsPerYear = paymentsPerYear;
  }
@DataField
protected ServiceType serviceType;
  public ServiceType getServiceType() {
    return this.serviceType;
  }
  public void setServiceType(ServiceType serviceType) {
    this.serviceType = serviceType;
  }
@DataField
protected String specifications;
  public String getSpecifications() {
    return this.specifications;
  }
  public void setSpecifications(String specifications) {
    this.specifications = specifications;
  }
@DataField
protected Boolean terminated;
  public Boolean getTerminated() {
    return this.terminated;
  }
  public void setTerminated(Boolean terminated) {
    this.terminated = terminated;
  }
@DataField
protected LegitTerminationDeadline terminationLegitDeadline;
  public LegitTerminationDeadline getTerminationLegitDeadline() {
    return this.terminationLegitDeadline;
  }
  public void setTerminationLegitDeadline(LegitTerminationDeadline terminationLegitDeadline) {
    this.terminationLegitDeadline = terminationLegitDeadline;
  }
}