package org.zgif.model.node.entity;

import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Currency;
import org.joda.time.LocalDate;
import org.joda.time.Period;
import org.zgif.model.annotation.DataField;
import org.zgif.model.annotation.Node;
import org.zgif.model.datatype.Amount;
import org.zgif.model.datatype.Area;
import org.zgif.model.datatype.enumeration.ConditionType;
import org.zgif.model.datatype.enumeration.ContractOption;
import org.zgif.model.datatype.enumeration.Country;
import org.zgif.model.datatype.enumeration.DepositIncreaseType;
import org.zgif.model.datatype.enumeration.DepositType;
import org.zgif.model.datatype.enumeration.IndexAdjustmentDirection;
import org.zgif.model.datatype.enumeration.IndexRow;
import org.zgif.model.datatype.enumeration.IndexationMethod;
import org.zgif.model.datatype.enumeration.InteriorQuality;
import org.zgif.model.datatype.enumeration.NumberType;
import org.zgif.model.datatype.enumeration.OccupancyState;
import org.zgif.model.datatype.enumeration.OptRate;
import org.zgif.model.datatype.enumeration.RentIncreaseType;
import org.zgif.model.datatype.enumeration.UseType;
import org.zgif.model.node.entity.AbstractEntityNode;

@Node
public class Term extends AbstractEntityNode {

@DataField
protected Double baseIndex;
  public Double getBaseIndex() {
    return this.baseIndex;
  }
  public void setBaseIndex(Double baseIndex) {
    this.baseIndex = baseIndex;
  }
@DataField
protected LocalDate beginningRentConsession;
  public LocalDate getBeginningRentConsession() {
    return this.beginningRentConsession;
  }
  public void setBeginningRentConsession(LocalDate beginningRentConsession) {
    this.beginningRentConsession = beginningRentConsession;
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
protected Amount conditionAmount;
  public Amount getConditionAmount() {
    return this.conditionAmount;
  }
  public void setConditionAmount(Amount conditionAmount) {
    this.conditionAmount = conditionAmount;
  }
@DataField
protected ConditionType conditionType;
  public ConditionType getConditionType() {
    return this.conditionType;
  }
  public void setConditionType(ConditionType conditionType) {
    this.conditionType = conditionType;
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
protected ContractOption contractOption;
  public ContractOption getContractOption() {
    return this.contractOption;
  }
  public void setContractOption(ContractOption contractOption) {
    this.contractOption = contractOption;
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
protected Amount deltaGraduatedRent;
  public Amount getDeltaGraduatedRent() {
    return this.deltaGraduatedRent;
  }
  public void setDeltaGraduatedRent(Amount deltaGraduatedRent) {
    this.deltaGraduatedRent = deltaGraduatedRent;
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
protected LocalDate endRentConcession;
  public LocalDate getEndRentConcession() {
    return this.endRentConcession;
  }
  public void setEndRentConcession(LocalDate endRentConcession) {
    this.endRentConcession = endRentConcession;
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
protected LocalDate graduateRentBegin;
  public LocalDate getGraduateRentBegin() {
    return this.graduateRentBegin;
  }
  public void setGraduateRentBegin(LocalDate graduateRentBegin) {
    this.graduateRentBegin = graduateRentBegin;
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
protected Boolean heatingCostsInServiceCharge;
  public Boolean getHeatingCostsInServiceCharge() {
    return this.heatingCostsInServiceCharge;
  }
  public void setHeatingCostsInServiceCharge(Boolean heatingCostsInServiceCharge) {
    this.heatingCostsInServiceCharge = heatingCostsInServiceCharge;
  }
@DataField
protected Amount incomeLoss;
  public Amount getIncomeLoss() {
    return this.incomeLoss;
  }
  public void setIncomeLoss(Amount incomeLoss) {
    this.incomeLoss = incomeLoss;
  }
@DataField
protected LocalDate indexAdjustmentBegin;
  public LocalDate getIndexAdjustmentBegin() {
    return this.indexAdjustmentBegin;
  }
  public void setIndexAdjustmentBegin(LocalDate indexAdjustmentBegin) {
    this.indexAdjustmentBegin = indexAdjustmentBegin;
  }
@DataField
protected IndexAdjustmentDirection indexAdjustmentDirection;
  public IndexAdjustmentDirection getIndexAdjustmentDirection() {
    return this.indexAdjustmentDirection;
  }
  public void setIndexAdjustmentDirection(IndexAdjustmentDirection indexAdjustmentDirection) {
    this.indexAdjustmentDirection = indexAdjustmentDirection;
  }
@DataField
protected NumberType indexAdjustmentValueType;
  public NumberType getIndexAdjustmentValueType() {
    return this.indexAdjustmentValueType;
  }
  public void setIndexAdjustmentValueType(NumberType indexAdjustmentValueType) {
    this.indexAdjustmentValueType = indexAdjustmentValueType;
  }
@DataField
protected LocalDate indexBaseYear;
  public LocalDate getIndexBaseYear() {
    return this.indexBaseYear;
  }
  public void setIndexBaseYear(LocalDate indexBaseYear) {
    this.indexBaseYear = indexBaseYear;
  }
@DataField
protected Country indexCountry;
  public Country getIndexCountry() {
    return this.indexCountry;
  }
  public void setIndexCountry(Country indexCountry) {
    this.indexCountry = indexCountry;
  }
@DataField
protected Double indexMinimumAdjustmentInPercent;
  public Double getIndexMinimumAdjustmentInPercent() {
    return this.indexMinimumAdjustmentInPercent;
  }
  public void setIndexMinimumAdjustmentInPercent(Double indexMinimumAdjustmentInPercent) {
    this.indexMinimumAdjustmentInPercent = indexMinimumAdjustmentInPercent;
  }
@DataField
protected Double indexMinimumAdjustmentInPoints;
  public Double getIndexMinimumAdjustmentInPoints() {
    return this.indexMinimumAdjustmentInPoints;
  }
  public void setIndexMinimumAdjustmentInPoints(Double indexMinimumAdjustmentInPoints) {
    this.indexMinimumAdjustmentInPoints = indexMinimumAdjustmentInPoints;
  }
@DataField
protected IndexationMethod indexModificationMethod;
  public IndexationMethod getIndexModificationMethod() {
    return this.indexModificationMethod;
  }
  public void setIndexModificationMethod(IndexationMethod indexModificationMethod) {
    this.indexModificationMethod = indexModificationMethod;
  }
@DataField
protected Double indexPassthrough;
  public Double getIndexPassthrough() {
    return this.indexPassthrough;
  }
  public void setIndexPassthrough(Double indexPassthrough) {
    this.indexPassthrough = indexPassthrough;
  }
@DataField
protected IndexRow indexRow;
  public IndexRow getIndexRow() {
    return this.indexRow;
  }
  public void setIndexRow(IndexRow indexRow) {
    this.indexRow = indexRow;
  }
@DataField
protected InteriorQuality interiorQuality;
  public InteriorQuality getInteriorQuality() {
    return this.interiorQuality;
  }
  public void setInteriorQuality(InteriorQuality interiorQuality) {
    this.interiorQuality = interiorQuality;
  }
@DataField
protected LocalDate lastRentAdjustmentDate;
  public LocalDate getLastRentAdjustmentDate() {
    return this.lastRentAdjustmentDate;
  }
  public void setLastRentAdjustmentDate(LocalDate lastRentAdjustmentDate) {
    this.lastRentAdjustmentDate = lastRentAdjustmentDate;
  }
@DataField
protected Area leasedArea;
  public Area getLeasedArea() {
    return this.leasedArea;
  }
  public void setLeasedArea(Area leasedArea) {
    this.leasedArea = leasedArea;
  }
@DataField
protected OccupancyState occupancyState;
  public OccupancyState getOccupancyState() {
    return this.occupancyState;
  }
  public void setOccupancyState(OccupancyState occupancyState) {
    this.occupancyState = occupancyState;
  }
@DataField
protected OptRate optRate;
  public OptRate getOptRate() {
    return this.optRate;
  }
  public void setOptRate(OptRate optRate) {
    this.optRate = optRate;
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
protected LocalDate rentAdjustmentDate;
  public LocalDate getRentAdjustmentDate() {
    return this.rentAdjustmentDate;
  }
  public void setRentAdjustmentDate(LocalDate rentAdjustmentDate) {
    this.rentAdjustmentDate = rentAdjustmentDate;
  }
@DataField
protected Period rentAdjustmentDelay;
  public Period getRentAdjustmentDelay() {
    return this.rentAdjustmentDelay;
  }
  public void setRentAdjustmentDelay(Period rentAdjustmentDelay) {
    this.rentAdjustmentDelay = rentAdjustmentDelay;
  }
@DataField
protected Period rentAdjustmentFrequence;
  public Period getRentAdjustmentFrequence() {
    return this.rentAdjustmentFrequence;
  }
  public void setRentAdjustmentFrequence(Period rentAdjustmentFrequence) {
    this.rentAdjustmentFrequence = rentAdjustmentFrequence;
  }
@DataField
protected Amount rentConcession;
  public Amount getRentConcession() {
    return this.rentConcession;
  }
  public void setRentConcession(Amount rentConcession) {
    this.rentConcession = rentConcession;
  }
@DataField
protected Double rentIncreasePercentage;
  public Double getRentIncreasePercentage() {
    return this.rentIncreasePercentage;
  }
  public void setRentIncreasePercentage(Double rentIncreasePercentage) {
    this.rentIncreasePercentage = rentIncreasePercentage;
  }
@DataField
protected RentIncreaseType rentIncreaseType;
  public RentIncreaseType getRentIncreaseType() {
    return this.rentIncreaseType;
  }
  public void setRentIncreaseType(RentIncreaseType rentIncreaseType) {
    this.rentIncreaseType = rentIncreaseType;
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
@DataField
protected UseType useType;
  public UseType getUseType() {
    return this.useType;
  }
  public void setUseType(UseType useType) {
    this.useType = useType;
  }
@DataField
protected Period vacancyDuration;
  public Period getVacancyDuration() {
    return this.vacancyDuration;
  }
  public void setVacancyDuration(Period vacancyDuration) {
    this.vacancyDuration = vacancyDuration;
  }
}