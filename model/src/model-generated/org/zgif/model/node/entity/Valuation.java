package org.zgif.model.node.entity;

import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Currency;
import org.joda.time.LocalDate;
import org.zgif.model.annotation.DataField;
import org.zgif.model.annotation.GroupNode;
import org.zgif.model.annotation.Node;
import org.zgif.model.datatype.Amount;
import org.zgif.model.datatype.Area;
import org.zgif.model.datatype.enumeration.ValuationMethod;
import org.zgif.model.node.entity.AbstractEntityNode;
import org.zgif.model.node.group.EnergyRating;

@Node
public class Valuation extends AbstractEntityNode {

@DataField
protected Boolean buildingInDevelopmentState;
  public Boolean getBuildingInDevelopmentState() {
    return this.buildingInDevelopmentState;
  }
  public void setBuildingInDevelopmentState(Boolean buildingInDevelopmentState) {
    this.buildingInDevelopmentState = buildingInDevelopmentState;
  }
@DataField
protected Amount contractRentDebit;
  public Amount getContractRentDebit() {
    return this.contractRentDebit;
  }
  public void setContractRentDebit(Amount contractRentDebit) {
    this.contractRentDebit = contractRentDebit;
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
protected Double discountRate;
  public Double getDiscountRate() {
    return this.discountRate;
  }
  public void setDiscountRate(Double discountRate) {
    this.discountRate = discountRate;
  }
@DataField
protected Area effectiveArea;
  public Area getEffectiveArea() {
    return this.effectiveArea;
  }
  public void setEffectiveArea(Area effectiveArea) {
    this.effectiveArea = effectiveArea;
  }
@DataField
protected Area effectiveAreaIndustry;
  public Area getEffectiveAreaIndustry() {
    return this.effectiveAreaIndustry;
  }
  public void setEffectiveAreaIndustry(Area effectiveAreaIndustry) {
    this.effectiveAreaIndustry = effectiveAreaIndustry;
  }
@DataField
protected Area effectiveAreaOffice;
  public Area getEffectiveAreaOffice() {
    return this.effectiveAreaOffice;
  }
  public void setEffectiveAreaOffice(Area effectiveAreaOffice) {
    this.effectiveAreaOffice = effectiveAreaOffice;
  }
@DataField
protected Area effectiveAreaOther;
  public Area getEffectiveAreaOther() {
    return this.effectiveAreaOther;
  }
  public void setEffectiveAreaOther(Area effectiveAreaOther) {
    this.effectiveAreaOther = effectiveAreaOther;
  }
@DataField
protected Area effectiveAreaResidential;
  public Area getEffectiveAreaResidential() {
    return this.effectiveAreaResidential;
  }
  public void setEffectiveAreaResidential(Area effectiveAreaResidential) {
    this.effectiveAreaResidential = effectiveAreaResidential;
  }
@DataField
protected Area effectiveAreaTrade;
  public Area getEffectiveAreaTrade() {
    return this.effectiveAreaTrade;
  }
  public void setEffectiveAreaTrade(Area effectiveAreaTrade) {
    this.effectiveAreaTrade = effectiveAreaTrade;
  }
@DataField
protected String expertName;
  public String getExpertName() {
    return this.expertName;
  }
  public void setExpertName(String expertName) {
    this.expertName = expertName;
  }
@DataField
protected Amount fairValue;
  public Amount getFairValue() {
    return this.fairValue;
  }
  public void setFairValue(Amount fairValue) {
    this.fairValue = fairValue;
  }
@DataField
protected Amount grossFairValue;
  public Amount getGrossFairValue() {
    return this.grossFairValue;
  }
  public void setGrossFairValue(Amount grossFairValue) {
    this.grossFairValue = grossFairValue;
  }
@DataField
protected Boolean internalValuation;
  public Boolean getInternalValuation() {
    return this.internalValuation;
  }
  public void setInternalValuation(Boolean internalValuation) {
    this.internalValuation = internalValuation;
  }
@DataField
protected Amount lostSustainablyGrossYield;
  public Amount getLostSustainablyGrossYield() {
    return this.lostSustainablyGrossYield;
  }
  public void setLostSustainablyGrossYield(Amount lostSustainablyGrossYield) {
    this.lostSustainablyGrossYield = lostSustainablyGrossYield;
  }
@DataField
protected Amount lostSustainablyGrossYieldIndustry;
  public Amount getLostSustainablyGrossYieldIndustry() {
    return this.lostSustainablyGrossYieldIndustry;
  }
  public void setLostSustainablyGrossYieldIndustry(Amount lostSustainablyGrossYieldIndustry) {
    this.lostSustainablyGrossYieldIndustry = lostSustainablyGrossYieldIndustry;
  }
@DataField
protected Amount lostSustainablyGrossYieldOffice;
  public Amount getLostSustainablyGrossYieldOffice() {
    return this.lostSustainablyGrossYieldOffice;
  }
  public void setLostSustainablyGrossYieldOffice(Amount lostSustainablyGrossYieldOffice) {
    this.lostSustainablyGrossYieldOffice = lostSustainablyGrossYieldOffice;
  }
@DataField
protected Amount lostSustainablyGrossYieldOther;
  public Amount getLostSustainablyGrossYieldOther() {
    return this.lostSustainablyGrossYieldOther;
  }
  public void setLostSustainablyGrossYieldOther(Amount lostSustainablyGrossYieldOther) {
    this.lostSustainablyGrossYieldOther = lostSustainablyGrossYieldOther;
  }
@DataField
protected Amount lostSustainablyGrossYieldResidential;
  public Amount getLostSustainablyGrossYieldResidential() {
    return this.lostSustainablyGrossYieldResidential;
  }
  public void setLostSustainablyGrossYieldResidential(Amount lostSustainablyGrossYieldResidential) {
    this.lostSustainablyGrossYieldResidential = lostSustainablyGrossYieldResidential;
  }
@DataField
protected Amount lostSustainablyGrossYieldTrade;
  public Amount getLostSustainablyGrossYieldTrade() {
    return this.lostSustainablyGrossYieldTrade;
  }
  public void setLostSustainablyGrossYieldTrade(Amount lostSustainablyGrossYieldTrade) {
    this.lostSustainablyGrossYieldTrade = lostSustainablyGrossYieldTrade;
  }
@DataField
protected ValuationMethod method;
  public ValuationMethod getMethod() {
    return this.method;
  }
  public void setMethod(ValuationMethod method) {
    this.method = method;
  }
@DataField
protected Double ownershipShare;
  public Double getOwnershipShare() {
    return this.ownershipShare;
  }
  public void setOwnershipShare(Double ownershipShare) {
    this.ownershipShare = ownershipShare;
  }
@DataField
protected Amount sustainablyGrossYield;
  public Amount getSustainablyGrossYield() {
    return this.sustainablyGrossYield;
  }
  public void setSustainablyGrossYield(Amount sustainablyGrossYield) {
    this.sustainablyGrossYield = sustainablyGrossYield;
  }
@DataField
protected Amount sustainablyGrossYieldIndustry;
  public Amount getSustainablyGrossYieldIndustry() {
    return this.sustainablyGrossYieldIndustry;
  }
  public void setSustainablyGrossYieldIndustry(Amount sustainablyGrossYieldIndustry) {
    this.sustainablyGrossYieldIndustry = sustainablyGrossYieldIndustry;
  }
@DataField
protected Amount sustainablyGrossYieldOffice;
  public Amount getSustainablyGrossYieldOffice() {
    return this.sustainablyGrossYieldOffice;
  }
  public void setSustainablyGrossYieldOffice(Amount sustainablyGrossYieldOffice) {
    this.sustainablyGrossYieldOffice = sustainablyGrossYieldOffice;
  }
@DataField
protected Amount sustainablyGrossYieldOther;
  public Amount getSustainablyGrossYieldOther() {
    return this.sustainablyGrossYieldOther;
  }
  public void setSustainablyGrossYieldOther(Amount sustainablyGrossYieldOther) {
    this.sustainablyGrossYieldOther = sustainablyGrossYieldOther;
  }
@DataField
protected Amount sustainablyGrossYieldResidential;
  public Amount getSustainablyGrossYieldResidential() {
    return this.sustainablyGrossYieldResidential;
  }
  public void setSustainablyGrossYieldResidential(Amount sustainablyGrossYieldResidential) {
    this.sustainablyGrossYieldResidential = sustainablyGrossYieldResidential;
  }
@DataField
protected Amount sustainablyGrossYieldTrade;
  public Amount getSustainablyGrossYieldTrade() {
    return this.sustainablyGrossYieldTrade;
  }
  public void setSustainablyGrossYieldTrade(Amount sustainablyGrossYieldTrade) {
    this.sustainablyGrossYieldTrade = sustainablyGrossYieldTrade;
  }
@DataField
protected Area vacantEffectiveAreaIndustry;
  public Area getVacantEffectiveAreaIndustry() {
    return this.vacantEffectiveAreaIndustry;
  }
  public void setVacantEffectiveAreaIndustry(Area vacantEffectiveAreaIndustry) {
    this.vacantEffectiveAreaIndustry = vacantEffectiveAreaIndustry;
  }
@DataField
protected Area vacantEffectiveAreaOffice;
  public Area getVacantEffectiveAreaOffice() {
    return this.vacantEffectiveAreaOffice;
  }
  public void setVacantEffectiveAreaOffice(Area vacantEffectiveAreaOffice) {
    this.vacantEffectiveAreaOffice = vacantEffectiveAreaOffice;
  }
@DataField
protected Area vacantEffectiveAreaOther;
  public Area getVacantEffectiveAreaOther() {
    return this.vacantEffectiveAreaOther;
  }
  public void setVacantEffectiveAreaOther(Area vacantEffectiveAreaOther) {
    this.vacantEffectiveAreaOther = vacantEffectiveAreaOther;
  }
@DataField
protected Area vacantEffectiveAreaResidential;
  public Area getVacantEffectiveAreaResidential() {
    return this.vacantEffectiveAreaResidential;
  }
  public void setVacantEffectiveAreaResidential(Area vacantEffectiveAreaResidential) {
    this.vacantEffectiveAreaResidential = vacantEffectiveAreaResidential;
  }
@DataField
protected Area vacantEffectiveAreaTrade;
  public Area getVacantEffectiveAreaTrade() {
    return this.vacantEffectiveAreaTrade;
  }
  public void setVacantEffectiveAreaTrade(Area vacantEffectiveAreaTrade) {
    this.vacantEffectiveAreaTrade = vacantEffectiveAreaTrade;
  }
@DataField
protected LocalDate valuationDate;
  public LocalDate getValuationDate() {
    return this.valuationDate;
  }
  public void setValuationDate(LocalDate valuationDate) {
    this.valuationDate = valuationDate;
  }
@GroupNode
protected EnergyRating energyRating;
  public EnergyRating getEnergyRating() {
    return this.energyRating;
  }
  public void setEnergyRating(EnergyRating energyRating) {
    this.energyRating = energyRating;
  }
}