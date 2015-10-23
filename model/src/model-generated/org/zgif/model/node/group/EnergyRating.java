package org.zgif.model.node.group;

import java.lang.Double;
import org.joda.time.LocalDate;
import org.zgif.model.datatype.enumeration.EnergyEfficiencyCategory;
import org.zgif.model.datatype.enumeration.EnergyRatingCategory;
import org.zgif.model.datatype.enumeration.EnergyRatingType;
import org.zgif.model.datatype.enumeration.IssuanceReason;
import org.zgif.model.node.group.AbstractGroupNode;

public class EnergyRating extends AbstractGroupNode {

protected LocalDate date;
  public LocalDate getDate() {
    return this.date;
  }
  public void setDate(LocalDate date) {
    this.date = date;
  }
protected IssuanceReason reason;
  public IssuanceReason getReason() {
    return this.reason;
  }
  public void setReason(IssuanceReason reason) {
    this.reason = reason;
  }
protected EnergyRatingType ratingType;
  public EnergyRatingType getRatingType() {
    return this.ratingType;
  }
  public void setRatingType(EnergyRatingType ratingType) {
    this.ratingType = ratingType;
  }
protected EnergyRatingCategory ratingCategory;
  public EnergyRatingCategory getRatingCategory() {
    return this.ratingCategory;
  }
  public void setRatingCategory(EnergyRatingCategory ratingCategory) {
    this.ratingCategory = ratingCategory;
  }
protected EnergyEfficiencyCategory energyEfficiencyClass;
  public EnergyEfficiencyCategory getEnergyEfficiencyClass() {
    return this.energyEfficiencyClass;
  }
  public void setEnergyEfficiencyClass(EnergyEfficiencyCategory energyEfficiencyClass) {
    this.energyEfficiencyClass = energyEfficiencyClass;
  }
protected Double energyConsumption;
  public Double getEnergyConsumption() {
    return this.energyConsumption;
  }
  public void setEnergyConsumption(Double energyConsumption) {
    this.energyConsumption = energyConsumption;
  }
protected Double co2Emission;
  public Double getCo2Emission() {
    return this.co2Emission;
  }
  public void setCo2Emission(Double co2Emission) {
    this.co2Emission = co2Emission;
  }
protected Double primaryEnergyDemand;
  public Double getPrimaryEnergyDemand() {
    return this.primaryEnergyDemand;
  }
  public void setPrimaryEnergyDemand(Double primaryEnergyDemand) {
    this.primaryEnergyDemand = primaryEnergyDemand;
  }
}