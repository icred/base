package org.zgif.model.node.entity;

import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Currency;
import org.zgif.model.annotation.DataField;
import org.zgif.model.annotation.GroupNode;
import org.zgif.model.annotation.Node;
import org.zgif.model.datatype.Amount;
import org.zgif.model.datatype.enumeration.AccountingType;
import org.zgif.model.datatype.enumeration.ProjectCostCategory;
import org.zgif.model.datatype.enumeration.ProjectType;
import org.zgif.model.datatype.enumeration.ServiceType;
import org.zgif.model.node.entity.AbstractEntityNode;
import org.zgif.model.node.group.Address;

@Node
public class Project extends AbstractEntityNode {

@DataField
protected AccountingType accountingType;
  public AccountingType getAccountingType() {
    return this.accountingType;
  }
  public void setAccountingType(AccountingType accountingType) {
    this.accountingType = accountingType;
  }
@DataField
protected Amount budget;
  public Amount getBudget() {
    return this.budget;
  }
  public void setBudget(Amount budget) {
    this.budget = budget;
  }
@DataField
protected Double capitalization;
  public Double getCapitalization() {
    return this.capitalization;
  }
  public void setCapitalization(Double capitalization) {
    this.capitalization = capitalization;
  }
@DataField
protected Amount contractAmount;
  public Amount getContractAmount() {
    return this.contractAmount;
  }
  public void setContractAmount(Amount contractAmount) {
    this.contractAmount = contractAmount;
  }
@DataField
protected ProjectCostCategory costGroup;
  public ProjectCostCategory getCostGroup() {
    return this.costGroup;
  }
  public void setCostGroup(ProjectCostCategory costGroup) {
    this.costGroup = costGroup;
  }
@DataField
protected Double costTransfer;
  public Double getCostTransfer() {
    return this.costTransfer;
  }
  public void setCostTransfer(Double costTransfer) {
    this.costTransfer = costTransfer;
  }
@DataField
protected String craft;
  public String getCraft() {
    return this.craft;
  }
  public void setCraft(String craft) {
    this.craft = craft;
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
protected Currency currency;
  public Currency getCurrency() {
    return this.currency;
  }
  public void setCurrency(Currency currency) {
    this.currency = currency;
  }
@DataField
protected String description;
  public String getDescription() {
    return this.description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
@DataField
protected Amount invoiceAmount;
  public Amount getInvoiceAmount() {
    return this.invoiceAmount;
  }
  public void setInvoiceAmount(Amount invoiceAmount) {
    this.invoiceAmount = invoiceAmount;
  }
@DataField
protected Integer numberOfInvoices;
  public Integer getNumberOfInvoices() {
    return this.numberOfInvoices;
  }
  public void setNumberOfInvoices(Integer numberOfInvoices) {
    this.numberOfInvoices = numberOfInvoices;
  }
@DataField
protected ProjectType projectType;
  public ProjectType getProjectType() {
    return this.projectType;
  }
  public void setProjectType(ProjectType projectType) {
    this.projectType = projectType;
  }
@DataField
protected String serviceContractId;
  public String getServiceContractId() {
    return this.serviceContractId;
  }
  public void setServiceContractId(String serviceContractId) {
    this.serviceContractId = serviceContractId;
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
@GroupNode
protected Address address;
  public Address getAddress() {
    return this.address;
  }
  public void setAddress(Address address) {
    this.address = address;
  }
}