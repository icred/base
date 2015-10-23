package org.zgif.model.node.entity;

import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import org.joda.time.LocalDate;
import org.zgif.model.annotation.ChildList;
import org.zgif.model.annotation.DataField;
import org.zgif.model.annotation.GroupNode;
import org.zgif.model.annotation.Node;
import org.zgif.model.datatype.Amount;
import org.zgif.model.datatype.Area;
import org.zgif.model.datatype.enumeration.AreaMeasurement;
import org.zgif.model.datatype.enumeration.AreaType;
import org.zgif.model.datatype.enumeration.AssetAccountType;
import org.zgif.model.datatype.enumeration.BuildingType;
import org.zgif.model.datatype.enumeration.EnergySource;
import org.zgif.model.datatype.enumeration.InteriorQuality;
import org.zgif.model.datatype.enumeration.MonumentsType;
import org.zgif.model.datatype.enumeration.ObjectCondition;
import org.zgif.model.datatype.enumeration.RestorationStatus;
import org.zgif.model.datatype.enumeration.RiskSegment;
import org.zgif.model.node.entity.AbstractEntityNode;
import org.zgif.model.node.group.Address;
import org.zgif.model.node.group.EnergyRating;

@Node
public class Building extends AbstractEntityNode {

@DataField
protected Boolean airconditioning;
  public Boolean getAirconditioning() {
    return this.airconditioning;
  }
  public void setAirconditioning(Boolean airconditioning) {
    this.airconditioning = airconditioning;
  }
@DataField
protected LocalDate archValidFrom;
  public LocalDate getArchValidFrom() {
    return this.archValidFrom;
  }
  public void setArchValidFrom(LocalDate archValidFrom) {
    this.archValidFrom = archValidFrom;
  }
@DataField
protected LocalDate archValidTo;
  public LocalDate getArchValidTo() {
    return this.archValidTo;
  }
  public void setArchValidTo(LocalDate archValidTo) {
    this.archValidTo = archValidTo;
  }
@DataField
protected AreaMeasurement areaMeasurement;
  public AreaMeasurement getAreaMeasurement() {
    return this.areaMeasurement;
  }
  public void setAreaMeasurement(AreaMeasurement areaMeasurement) {
    this.areaMeasurement = areaMeasurement;
  }
@DataField
protected AreaType areaType;
  public AreaType getAreaType() {
    return this.areaType;
  }
  public void setAreaType(AreaType areaType) {
    this.areaType = areaType;
  }
@DataField
protected AssetAccountType assetAccountType;
  public AssetAccountType getAssetAccountType() {
    return this.assetAccountType;
  }
  public void setAssetAccountType(AssetAccountType assetAccountType) {
    this.assetAccountType = assetAccountType;
  }
@DataField
protected Boolean balcony;
  public Boolean getBalcony() {
    return this.balcony;
  }
  public void setBalcony(Boolean balcony) {
    this.balcony = balcony;
  }
@DataField
protected Boolean barrierFree;
  public Boolean getBarrierFree() {
    return this.barrierFree;
  }
  public void setBarrierFree(Boolean barrierFree) {
    this.barrierFree = barrierFree;
  }
@DataField
protected ObjectCondition condition;
  public ObjectCondition getCondition() {
    return this.condition;
  }
  public void setCondition(ObjectCondition condition) {
    this.condition = condition;
  }
@DataField
protected LocalDate constructionDate;
  public LocalDate getConstructionDate() {
    return this.constructionDate;
  }
  public void setConstructionDate(LocalDate constructionDate) {
    this.constructionDate = constructionDate;
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
protected Double cubature;
  public Double getCubature() {
    return this.cubature;
  }
  public void setCubature(Double cubature) {
    this.cubature = cubature;
  }
@DataField
protected LocalDate economicConstructionDate;
  public LocalDate getEconomicConstructionDate() {
    return this.economicConstructionDate;
  }
  public void setEconomicConstructionDate(LocalDate economicConstructionDate) {
    this.economicConstructionDate = economicConstructionDate;
  }
@DataField
protected Boolean elevator;
  public Boolean getElevator() {
    return this.elevator;
  }
  public void setElevator(Boolean elevator) {
    this.elevator = elevator;
  }
@DataField
protected EnergySource energySource;
  public EnergySource getEnergySource() {
    return this.energySource;
  }
  public void setEnergySource(EnergySource energySource) {
    this.energySource = energySource;
  }
@DataField
protected Double floorload;
  public Double getFloorload() {
    return this.floorload;
  }
  public void setFloorload(Double floorload) {
    this.floorload = floorload;
  }
@DataField
protected Boolean guestToilet;
  public Boolean getGuestToilet() {
    return this.guestToilet;
  }
  public void setGuestToilet(Boolean guestToilet) {
    this.guestToilet = guestToilet;
  }
@DataField
protected Boolean highVoltage;
  public Boolean getHighVoltage() {
    return this.highVoltage;
  }
  public void setHighVoltage(Boolean highVoltage) {
    this.highVoltage = highVoltage;
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
protected Boolean lanCables;
  public Boolean getLanCables() {
    return this.lanCables;
  }
  public void setLanCables(Boolean lanCables) {
    this.lanCables = lanCables;
  }
@DataField
protected LocalDate lastRefurbishmentDate;
  public LocalDate getLastRefurbishmentDate() {
    return this.lastRefurbishmentDate;
  }
  public void setLastRefurbishmentDate(LocalDate lastRefurbishmentDate) {
    this.lastRefurbishmentDate = lastRefurbishmentDate;
  }
@DataField
protected RestorationStatus modernisationStatus;
  public RestorationStatus getModernisationStatus() {
    return this.modernisationStatus;
  }
  public void setModernisationStatus(RestorationStatus modernisationStatus) {
    this.modernisationStatus = modernisationStatus;
  }
@DataField
protected MonumentsType monumentProtectionCategory;
  public MonumentsType getMonumentProtectionCategory() {
    return this.monumentProtectionCategory;
  }
  public void setMonumentProtectionCategory(MonumentsType monumentProtectionCategory) {
    this.monumentProtectionCategory = monumentProtectionCategory;
  }
@DataField
protected Integer numberOfBathrooms;
  public Integer getNumberOfBathrooms() {
    return this.numberOfBathrooms;
  }
  public void setNumberOfBathrooms(Integer numberOfBathrooms) {
    this.numberOfBathrooms = numberOfBathrooms;
  }
@DataField
protected Integer numberOfBedrooms;
  public Integer getNumberOfBedrooms() {
    return this.numberOfBedrooms;
  }
  public void setNumberOfBedrooms(Integer numberOfBedrooms) {
    this.numberOfBedrooms = numberOfBedrooms;
  }
@DataField
protected Integer numberOfCanteen;
  public Integer getNumberOfCanteen() {
    return this.numberOfCanteen;
  }
  public void setNumberOfCanteen(Integer numberOfCanteen) {
    this.numberOfCanteen = numberOfCanteen;
  }
@DataField
protected Integer numberOfFloors;
  public Integer getNumberOfFloors() {
    return this.numberOfFloors;
  }
  public void setNumberOfFloors(Integer numberOfFloors) {
    this.numberOfFloors = numberOfFloors;
  }
@DataField
protected Integer numberOfParkingSpaces;
  public Integer getNumberOfParkingSpaces() {
    return this.numberOfParkingSpaces;
  }
  public void setNumberOfParkingSpaces(Integer numberOfParkingSpaces) {
    this.numberOfParkingSpaces = numberOfParkingSpaces;
  }
@DataField
protected Integer numberOfRooms;
  public Integer getNumberOfRooms() {
    return this.numberOfRooms;
  }
  public void setNumberOfRooms(Integer numberOfRooms) {
    this.numberOfRooms = numberOfRooms;
  }
@DataField
protected Boolean ownerOccupation;
  public Boolean getOwnerOccupation() {
    return this.ownerOccupation;
  }
  public void setOwnerOccupation(Boolean ownerOccupation) {
    this.ownerOccupation = ownerOccupation;
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
protected String propertyManager;
  public String getPropertyManager() {
    return this.propertyManager;
  }
  public void setPropertyManager(String propertyManager) {
    this.propertyManager = propertyManager;
  }
@DataField
protected LocalDate purchaseDate;
  public LocalDate getPurchaseDate() {
    return this.purchaseDate;
  }
  public void setPurchaseDate(LocalDate purchaseDate) {
    this.purchaseDate = purchaseDate;
  }
@DataField
protected Boolean ramp;
  public Boolean getRamp() {
    return this.ramp;
  }
  public void setRamp(Boolean ramp) {
    this.ramp = ramp;
  }
@DataField
protected Boolean rented;
  public Boolean getRented() {
    return this.rented;
  }
  public void setRented(Boolean rented) {
    this.rented = rented;
  }
@DataField
protected RiskSegment riskStyle;
  public RiskSegment getRiskStyle() {
    return this.riskStyle;
  }
  public void setRiskStyle(RiskSegment riskStyle) {
    this.riskStyle = riskStyle;
  }
@DataField
protected Amount saleGrossPrice;
  public Amount getSaleGrossPrice() {
    return this.saleGrossPrice;
  }
  public void setSaleGrossPrice(Amount saleGrossPrice) {
    this.saleGrossPrice = saleGrossPrice;
  }
@DataField
protected Area usableArea;
  public Area getUsableArea() {
    return this.usableArea;
  }
  public void setUsableArea(Area usableArea) {
    this.usableArea = usableArea;
  }
@DataField
protected BuildingType useTypePrimary;
  public BuildingType getUseTypePrimary() {
    return this.useTypePrimary;
  }
  public void setUseTypePrimary(BuildingType useTypePrimary) {
    this.useTypePrimary = useTypePrimary;
  }
@DataField
protected BuildingType useTypeSecondary;
  public BuildingType getUseTypeSecondary() {
    return this.useTypeSecondary;
  }
  public void setUseTypeSecondary(BuildingType useTypeSecondary) {
    this.useTypeSecondary = useTypeSecondary;
  }
@GroupNode
protected Address address;
  public Address getAddress() {
    return this.address;
  }
  public void setAddress(Address address) {
    this.address = address;
  }
@GroupNode
protected EnergyRating lastEnergyRating;
  public EnergyRating getLastEnergyRating() {
    return this.lastEnergyRating;
  }
  public void setLastEnergyRating(EnergyRating lastEnergyRating) {
    this.lastEnergyRating = lastEnergyRating;
  }
@ChildList
protected Map<String, Unit> units;
  public Map<String, Unit> getUnits() {
    return this.units;
  }
  public void setUnits(Map<String, Unit> units) {
    this.units = units;
  }
}