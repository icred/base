package eu.icred.model.node.group;

import eu.icred.model.annotation.DataField;
import eu.icred.model.datatype.enumeration.EnergyEfficiencyCategory;
import eu.icred.model.datatype.enumeration.EnergyRatingCategory;
import eu.icred.model.datatype.enumeration.EnergyRatingType;
import eu.icred.model.datatype.enumeration.IssuanceReason;
import eu.icred.model.node.group.AbstractGroupNode;
import java.lang.Double;
import org.joda.time.LocalDate;

public class EnergyRating extends AbstractGroupNode {

@DataField
protected LocalDate date;
  public LocalDate getDate() {
    return this.date;
  }
  public void setDate(LocalDate date) {
    this.date = date;
  }
@DataField
protected IssuanceReason reason;
  public IssuanceReason getReason() {
    return this.reason;
  }
  public void setReason(IssuanceReason reason) {
    this.reason = reason;
  }
@DataField
protected EnergyRatingType ratingType;
  public EnergyRatingType getRatingType() {
    return this.ratingType;
  }
  public void setRatingType(EnergyRatingType ratingType) {
    this.ratingType = ratingType;
  }
@DataField
protected EnergyRatingCategory ratingCategory;
  public EnergyRatingCategory getRatingCategory() {
    return this.ratingCategory;
  }
  public void setRatingCategory(EnergyRatingCategory ratingCategory) {
    this.ratingCategory = ratingCategory;
  }
@DataField
protected EnergyEfficiencyCategory energyEfficiencyClass;
  public EnergyEfficiencyCategory getEnergyEfficiencyClass() {
    return this.energyEfficiencyClass;
  }
  public void setEnergyEfficiencyClass(EnergyEfficiencyCategory energyEfficiencyClass) {
    this.energyEfficiencyClass = energyEfficiencyClass;
  }
@DataField
protected Double energyConsumption;
  public Double getEnergyConsumption() {
    return this.energyConsumption;
  }
  public void setEnergyConsumption(Double energyConsumption) {
    this.energyConsumption = energyConsumption;
  }
@DataField
protected Double co2Emission;
  public Double getCo2Emission() {
    return this.co2Emission;
  }
  public void setCo2Emission(Double co2Emission) {
    this.co2Emission = co2Emission;
  }
@DataField
protected Double primaryEnergyDemand;
  public Double getPrimaryEnergyDemand() {
    return this.primaryEnergyDemand;
  }
  public void setPrimaryEnergyDemand(Double primaryEnergyDemand) {
    this.primaryEnergyDemand = primaryEnergyDemand;
  }
}