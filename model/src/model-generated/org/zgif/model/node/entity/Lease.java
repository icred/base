package org.zgif.model.node.entity;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Currency;
import java.util.Map;
import org.joda.time.LocalDate;
import org.joda.time.Period;
import org.zgif.model.annotation.ChildList;
import org.zgif.model.annotation.DataField;
import org.zgif.model.annotation.Node;
import org.zgif.model.datatype.Amount;
import org.zgif.model.datatype.enumeration.DepositIncreaseType;
import org.zgif.model.datatype.enumeration.DepositType;
import org.zgif.model.datatype.enumeration.DunningLevel;
import org.zgif.model.datatype.enumeration.LeaseContractType;
import org.zgif.model.datatype.enumeration.NumberType;
import org.zgif.model.datatype.enumeration.Sector;
import org.zgif.model.node.entity.AbstractEntityNode;

@Node
public class Lease extends AbstractEntityNode {

@DataField
protected LocalDate acceptedTerminationDate;
  public LocalDate getAcceptedTerminationDate() {
    return this.acceptedTerminationDate;
  }
  public void setAcceptedTerminationDate(LocalDate acceptedTerminationDate) {
    this.acceptedTerminationDate = acceptedTerminationDate;
  }
@DataField
protected Amount badDebt;
  public Amount getBadDebt() {
    return this.badDebt;
  }
  public void setBadDebt(Amount badDebt) {
    this.badDebt = badDebt;
  }
@DataField
protected LocalDate beginRentPayment;
  public LocalDate getBeginRentPayment() {
    return this.beginRentPayment;
  }
  public void setBeginRentPayment(LocalDate beginRentPayment) {
    this.beginRentPayment = beginRentPayment;
  }
@DataField
protected LocalDate breakOption;
  public LocalDate getBreakOption() {
    return this.breakOption;
  }
  public void setBreakOption(LocalDate breakOption) {
    this.breakOption = breakOption;
  }
@DataField
protected String collectiveObjectIdSender;
  public String getCollectiveObjectIdSender() {
    return this.collectiveObjectIdSender;
  }
  public void setCollectiveObjectIdSender(String collectiveObjectIdSender) {
    this.collectiveObjectIdSender = collectiveObjectIdSender;
  }
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
protected Amount courtage;
  public Amount getCourtage() {
    return this.courtage;
  }
  public void setCourtage(Amount courtage) {
    this.courtage = courtage;
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
protected String debitor;
  public String getDebitor() {
    return this.debitor;
  }
  public void setDebitor(String debitor) {
    this.debitor = debitor;
  }
@DataField
protected String debitorId;
  public String getDebitorId() {
    return this.debitorId;
  }
  public void setDebitorId(String debitorId) {
    this.debitorId = debitorId;
  }
@DataField
protected Boolean depositAgreed;
  public Boolean getDepositAgreed() {
    return this.depositAgreed;
  }
  public void setDepositAgreed(Boolean depositAgreed) {
    this.depositAgreed = depositAgreed;
  }
@DataField
protected Amount depositAmount;
  public Amount getDepositAmount() {
    return this.depositAmount;
  }
  public void setDepositAmount(Amount depositAmount) {
    this.depositAmount = depositAmount;
  }
@DataField
protected DepositIncreaseType depositIncreaseType;
  public DepositIncreaseType getDepositIncreaseType() {
    return this.depositIncreaseType;
  }
  public void setDepositIncreaseType(DepositIncreaseType depositIncreaseType) {
    this.depositIncreaseType = depositIncreaseType;
  }
@DataField
protected Boolean depositPayed;
  public Boolean getDepositPayed() {
    return this.depositPayed;
  }
  public void setDepositPayed(Boolean depositPayed) {
    this.depositPayed = depositPayed;
  }
@DataField
protected DepositType depositType;
  public DepositType getDepositType() {
    return this.depositType;
  }
  public void setDepositType(DepositType depositType) {
    this.depositType = depositType;
  }
@DataField
protected LocalDate dmiendOption;
  public LocalDate getDmiendOption() {
    return this.dmiendOption;
  }
  public void setDmiendOption(LocalDate dmiendOption) {
    this.dmiendOption = dmiendOption;
  }
@DataField
protected Boolean dunningIndicator;
  public Boolean getDunningIndicator() {
    return this.dunningIndicator;
  }
  public void setDunningIndicator(Boolean dunningIndicator) {
    this.dunningIndicator = dunningIndicator;
  }
@DataField
protected DunningLevel dunningLevel;
  public DunningLevel getDunningLevel() {
    return this.dunningLevel;
  }
  public void setDunningLevel(DunningLevel dunningLevel) {
    this.dunningLevel = dunningLevel;
  }
@DataField
protected LocalDate freeFrom;
  public LocalDate getFreeFrom() {
    return this.freeFrom;
  }
  public void setFreeFrom(LocalDate freeFrom) {
    this.freeFrom = freeFrom;
  }
@DataField
protected Amount heatingCosts;
  public Amount getHeatingCosts() {
    return this.heatingCosts;
  }
  public void setHeatingCosts(Amount heatingCosts) {
    this.heatingCosts = heatingCosts;
  }
@DataField
protected LocalDate leaseBeginDate;
  public LocalDate getLeaseBeginDate() {
    return this.leaseBeginDate;
  }
  public void setLeaseBeginDate(LocalDate leaseBeginDate) {
    this.leaseBeginDate = leaseBeginDate;
  }
@DataField
protected LeaseContractType leaseContractType;
  public LeaseContractType getLeaseContractType() {
    return this.leaseContractType;
  }
  public void setLeaseContractType(LeaseContractType leaseContractType) {
    this.leaseContractType = leaseContractType;
  }
@DataField
protected LocalDate leaseEndDate;
  public LocalDate getLeaseEndDate() {
    return this.leaseEndDate;
  }
  public void setLeaseEndDate(LocalDate leaseEndDate) {
    this.leaseEndDate = leaseEndDate;
  }
@DataField
protected Integer maxNumberOfPerson;
  public Integer getMaxNumberOfPerson() {
    return this.maxNumberOfPerson;
  }
  public void setMaxNumberOfPerson(Integer maxNumberOfPerson) {
    this.maxNumberOfPerson = maxNumberOfPerson;
  }
@DataField
protected Period maxRentalTime;
  public Period getMaxRentalTime() {
    return this.maxRentalTime;
  }
  public void setMaxRentalTime(Period maxRentalTime) {
    this.maxRentalTime = maxRentalTime;
  }
@DataField
protected Period minRentalTime;
  public Period getMinRentalTime() {
    return this.minRentalTime;
  }
  public void setMinRentalTime(Period minRentalTime) {
    this.minRentalTime = minRentalTime;
  }
@DataField
protected String nation;
  public String getNation() {
    return this.nation;
  }
  public void setNation(String nation) {
    this.nation = nation;
  }
@DataField
protected Amount openItems;
  public Amount getOpenItems() {
    return this.openItems;
  }
  public void setOpenItems(Amount openItems) {
    this.openItems = openItems;
  }
@DataField
protected Amount operatingCostPrepayment;
  public Amount getOperatingCostPrepayment() {
    return this.operatingCostPrepayment;
  }
  public void setOperatingCostPrepayment(Amount operatingCostPrepayment) {
    this.operatingCostPrepayment = operatingCostPrepayment;
  }
@DataField
protected Amount operatingCostsSettled;
  public Amount getOperatingCostsSettled() {
    return this.operatingCostsSettled;
  }
  public void setOperatingCostsSettled(Amount operatingCostsSettled) {
    this.operatingCostsSettled = operatingCostsSettled;
  }
@DataField
protected Boolean option;
  public Boolean getOption() {
    return this.option;
  }
  public void setOption(Boolean option) {
    this.option = option;
  }
@DataField
protected Amount parkingSpaceCosts;
  public Amount getParkingSpaceCosts() {
    return this.parkingSpaceCosts;
  }
  public void setParkingSpaceCosts(Amount parkingSpaceCosts) {
    this.parkingSpaceCosts = parkingSpaceCosts;
  }
@DataField
protected Amount payment;
  public Amount getPayment() {
    return this.payment;
  }
  public void setPayment(Amount payment) {
    this.payment = payment;
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
protected Period periodsTurnoverRents;
  public Period getPeriodsTurnoverRents() {
    return this.periodsTurnoverRents;
  }
  public void setPeriodsTurnoverRents(Period periodsTurnoverRents) {
    this.periodsTurnoverRents = periodsTurnoverRents;
  }
@DataField
protected Boolean petsAllowed;
  public Boolean getPetsAllowed() {
    return this.petsAllowed;
  }
  public void setPetsAllowed(Boolean petsAllowed) {
    this.petsAllowed = petsAllowed;
  }
@DataField
protected String propertyManager;
  public String getPropertyManager() {
    return this.propertyManager;
  }
  public void setPropertyManager(String propertyManager) {
    this.propertyManager = propertyManager;
  }
@DataField
protected Sector sector;
  public Sector getSector() {
    return this.sector;
  }
  public void setSector(Sector sector) {
    this.sector = sector;
  }
@DataField
protected Period tenancy;
  public Period getTenancy() {
    return this.tenancy;
  }
  public void setTenancy(Period tenancy) {
    this.tenancy = tenancy;
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
protected Period terminationDuration;
  public Period getTerminationDuration() {
    return this.terminationDuration;
  }
  public void setTerminationDuration(Period terminationDuration) {
    this.terminationDuration = terminationDuration;
  }
@DataField
protected LocalDate terminationReceiptDate;
  public LocalDate getTerminationReceiptDate() {
    return this.terminationReceiptDate;
  }
  public void setTerminationReceiptDate(LocalDate terminationReceiptDate) {
    this.terminationReceiptDate = terminationReceiptDate;
  }
@DataField
protected NumberType turnoverAdjType;
  public NumberType getTurnoverAdjType() {
    return this.turnoverAdjType;
  }
  public void setTurnoverAdjType(NumberType turnoverAdjType) {
    this.turnoverAdjType = turnoverAdjType;
  }
@DataField
protected Boolean turnoverCertificate;
  public Boolean getTurnoverCertificate() {
    return this.turnoverCertificate;
  }
  public void setTurnoverCertificate(Boolean turnoverCertificate) {
    this.turnoverCertificate = turnoverCertificate;
  }
@DataField
protected Amount turnoverMinimum;
  public Amount getTurnoverMinimum() {
    return this.turnoverMinimum;
  }
  public void setTurnoverMinimum(Amount turnoverMinimum) {
    this.turnoverMinimum = turnoverMinimum;
  }
@DataField
protected Amount turnoverRentCap;
  public Amount getTurnoverRentCap() {
    return this.turnoverRentCap;
  }
  public void setTurnoverRentCap(Amount turnoverRentCap) {
    this.turnoverRentCap = turnoverRentCap;
  }
@DataField
protected Period turnoverReportingInterval;
  public Period getTurnoverReportingInterval() {
    return this.turnoverReportingInterval;
  }
  public void setTurnoverReportingInterval(Period turnoverReportingInterval) {
    this.turnoverReportingInterval = turnoverReportingInterval;
  }
@DataField
protected String turnoverSortiment;
  public String getTurnoverSortiment() {
    return this.turnoverSortiment;
  }
  public void setTurnoverSortiment(String turnoverSortiment) {
    this.turnoverSortiment = turnoverSortiment;
  }
@ChildList
protected Map<String, LeasedUnit> leasedUnits;
  public Map<String, LeasedUnit> getLeasedUnits() {
    return this.leasedUnits;
  }
  public void setLeasedUnits(Map<String, LeasedUnit> leasedUnits) {
    this.leasedUnits = leasedUnits;
  }
@ChildList
protected Map<String, Term> terms;
  public Map<String, Term> getTerms() {
    return this.terms;
  }
  public void setTerms(Map<String, Term> terms) {
    this.terms = terms;
  }
}