package eu.icred.model.node.entity;

import eu.icred.model.annotation.ChildList;
import eu.icred.model.annotation.DataField;
import eu.icred.model.annotation.GroupNode;
import eu.icred.model.annotation.Node;
import eu.icred.model.datatype.Amount;
import eu.icred.model.datatype.Area;
import eu.icred.model.datatype.enumeration.AreaMeasurement;
import eu.icred.model.datatype.enumeration.AreaType;
import eu.icred.model.datatype.enumeration.AssetAccountType;
import eu.icred.model.datatype.enumeration.MonumentsType;
import eu.icred.model.datatype.enumeration.RiskSegment;
import eu.icred.model.node.entity.AbstractEntityNode;
import eu.icred.model.node.group.Address;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import org.joda.time.LocalDate;

@Node
public class Land extends AbstractEntityNode {

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
protected Boolean buildingPermission;
  public Boolean getBuildingPermission() {
    return this.buildingPermission;
  }
  public void setBuildingPermission(Boolean buildingPermission) {
    this.buildingPermission = buildingPermission;
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
protected Boolean demolition;
  public Boolean getDemolition() {
    return this.demolition;
  }
  public void setDemolition(Boolean demolition) {
    this.demolition = demolition;
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
protected Double gfz;
  public Double getGfz() {
    return this.gfz;
  }
  public void setGfz(Double gfz) {
    this.gfz = gfz;
  }
@DataField
protected Double grz;
  public Double getGrz() {
    return this.grz;
  }
  public void setGrz(Double grz) {
    this.grz = grz;
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
protected Integer numberOfParkingSpaces;
  public Integer getNumberOfParkingSpaces() {
    return this.numberOfParkingSpaces;
  }
  public void setNumberOfParkingSpaces(Integer numberOfParkingSpaces) {
    this.numberOfParkingSpaces = numberOfParkingSpaces;
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
protected Area plotArea;
  public Area getPlotArea() {
    return this.plotArea;
  }
  public void setPlotArea(Area plotArea) {
    this.plotArea = plotArea;
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
protected Amount purchaseGrossPrice;
  public Amount getPurchaseGrossPrice() {
    return this.purchaseGrossPrice;
  }
  public void setPurchaseGrossPrice(Amount purchaseGrossPrice) {
    this.purchaseGrossPrice = purchaseGrossPrice;
  }
@DataField
protected Amount purchaseNetPrice;
  public Amount getPurchaseNetPrice() {
    return this.purchaseNetPrice;
  }
  public void setPurchaseNetPrice(Amount purchaseNetPrice) {
    this.purchaseNetPrice = purchaseNetPrice;
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
protected Amount saleNetPrice;
  public Amount getSaleNetPrice() {
    return this.saleNetPrice;
  }
  public void setSaleNetPrice(Amount saleNetPrice) {
    this.saleNetPrice = saleNetPrice;
  }
@DataField
protected Boolean shortTermConstructible;
  public Boolean getShortTermConstructible() {
    return this.shortTermConstructible;
  }
  public void setShortTermConstructible(Boolean shortTermConstructible) {
    this.shortTermConstructible = shortTermConstructible;
  }
@DataField
protected String siteConstructibleType;
  public String getSiteConstructibleType() {
    return this.siteConstructibleType;
  }
  public void setSiteConstructibleType(String siteConstructibleType) {
    this.siteConstructibleType = siteConstructibleType;
  }
@DataField
protected String siteDevelopmentType;
  public String getSiteDevelopmentType() {
    return this.siteDevelopmentType;
  }
  public void setSiteDevelopmentType(String siteDevelopmentType) {
    this.siteDevelopmentType = siteDevelopmentType;
  }
@GroupNode
protected Address address;
  public Address getAddress() {
    return this.address;
  }
  public void setAddress(Address address) {
    this.address = address;
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