package org.zgif.model.node.entity;

import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import org.joda.time.LocalDate;
import org.zgif.model.annotation.Attribute;
import org.zgif.model.annotation.DataField;
import org.zgif.model.annotation.GroupNode;
import org.zgif.model.annotation.Node;
import org.zgif.model.datatype.Amount;
import org.zgif.model.datatype.Area;
import org.zgif.model.datatype.enumeration.ApartmentType;
import org.zgif.model.datatype.enumeration.AreaMeasurement;
import org.zgif.model.datatype.enumeration.AreaType;
import org.zgif.model.datatype.enumeration.InteriorQuality;
import org.zgif.model.datatype.enumeration.ObjectCondition;
import org.zgif.model.datatype.enumeration.ParkingSpaceType;
import org.zgif.model.datatype.enumeration.RestorationStatus;
import org.zgif.model.datatype.enumeration.UseType;
import org.zgif.model.datatype.enumeration.VacancyReason;
import org.zgif.model.node.entity.AbstractEntityNode;
import org.zgif.model.node.group.Address;

@Node
public class Unit extends AbstractEntityNode {

@DataField
protected ApartmentType apartmentType;
  public ApartmentType getApartmentType() {
    return this.apartmentType;
  }
  public void setApartmentType(ApartmentType apartmentType) {
    this.apartmentType = apartmentType;
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
protected Boolean autoLift;
  public Boolean getAutoLift() {
    return this.autoLift;
  }
  public void setAutoLift(Boolean autoLift) {
    this.autoLift = autoLift;
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
protected Boolean barrierfree;
  public Boolean getBarrierfree() {
    return this.barrierfree;
  }
  public void setBarrierfree(Boolean barrierfree) {
    this.barrierfree = barrierfree;
  }
@DataField
protected Boolean certificateOfEligibility;
  public Boolean getCertificateOfEligibility() {
    return this.certificateOfEligibility;
  }
  public void setCertificateOfEligibility(Boolean certificateOfEligibility) {
    this.certificateOfEligibility = certificateOfEligibility;
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
protected Amount courtage;
  public Amount getCourtage() {
    return this.courtage;
  }
  public void setCourtage(Amount courtage) {
    this.courtage = courtage;
  }
@DataField
protected LocalDate endPriceMaintenance;
  public LocalDate getEndPriceMaintenance() {
    return this.endPriceMaintenance;
  }
  public void setEndPriceMaintenance(LocalDate endPriceMaintenance) {
    this.endPriceMaintenance = endPriceMaintenance;
  }
@DataField
protected Boolean garden;
  public Boolean getGarden() {
    return this.garden;
  }
  public void setGarden(Boolean garden) {
    this.garden = garden;
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
protected Double hallHeight;
  public Double getHallHeight() {
    return this.hallHeight;
  }
  public void setHallHeight(Double hallHeight) {
    this.hallHeight = hallHeight;
  }
@DataField
protected Boolean hasBuiltinKitchen;
  public Boolean getHasBuiltinKitchen() {
    return this.hasBuiltinKitchen;
  }
  public void setHasBuiltinKitchen(Boolean hasBuiltinKitchen) {
    this.hasBuiltinKitchen = hasBuiltinKitchen;
  }
@DataField
protected Boolean hasFurniture;
  public Boolean getHasFurniture() {
    return this.hasFurniture;
  }
  public void setHasFurniture(Boolean hasFurniture) {
    this.hasFurniture = hasFurniture;
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
protected Boolean isLodgerFlat;
  public Boolean getIsLodgerFlat() {
    return this.isLodgerFlat;
  }
  public void setIsLodgerFlat(Boolean isLodgerFlat) {
    this.isLodgerFlat = isLodgerFlat;
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
protected Area lettableArea;
  public Area getLettableArea() {
    return this.lettableArea;
  }
  public void setLettableArea(Area lettableArea) {
    this.lettableArea = lettableArea;
  }
@DataField
protected Double lettableUnits;
  public Double getLettableUnits() {
    return this.lettableUnits;
  }
  public void setLettableUnits(Double lettableUnits) {
    this.lettableUnits = lettableUnits;
  }
@DataField
protected Amount localReferenceRent;
  public Amount getLocalReferenceRent() {
    return this.localReferenceRent;
  }
  public void setLocalReferenceRent(Amount localReferenceRent) {
    this.localReferenceRent = localReferenceRent;
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
protected Integer minimumDivisible;
  public Integer getMinimumDivisible() {
    return this.minimumDivisible;
  }
  public void setMinimumDivisible(Integer minimumDivisible) {
    this.minimumDivisible = minimumDivisible;
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
protected Boolean nonSmoker;
  public Boolean getNonSmoker() {
    return this.nonSmoker;
  }
  public void setNonSmoker(Boolean nonSmoker) {
    this.nonSmoker = nonSmoker;
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
protected ParkingSpaceType parkingSpaceType;
  public ParkingSpaceType getParkingSpaceType() {
    return this.parkingSpaceType;
  }
  public void setParkingSpaceType(ParkingSpaceType parkingSpaceType) {
    this.parkingSpaceType = parkingSpaceType;
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
protected Boolean summerResidencePractical;
  public Boolean getSummerResidencePractical() {
    return this.summerResidencePractical;
  }
  public void setSummerResidencePractical(Boolean summerResidencePractical) {
    this.summerResidencePractical = summerResidencePractical;
  }
@DataField
protected String titleOfExposee;
  public String getTitleOfExposee() {
    return this.titleOfExposee;
  }
  public void setTitleOfExposee(String titleOfExposee) {
    this.titleOfExposee = titleOfExposee;
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
protected String useTypeCustomer;
  public String getUseTypeCustomer() {
    return this.useTypeCustomer;
  }
  public void setUseTypeCustomer(String useTypeCustomer) {
    this.useTypeCustomer = useTypeCustomer;
  }
@DataField
protected VacancyReason vacancyReason;
  public VacancyReason getVacancyReason() {
    return this.vacancyReason;
  }
  public void setVacancyReason(VacancyReason vacancyReason) {
    this.vacancyReason = vacancyReason;
  }
@GroupNode
protected Address address;
  public Address getAddress() {
    return this.address;
  }
  public void setAddress(Address address) {
    this.address = address;
  }
@Attribute
protected String hash;
  public String getHash() {
    return this.hash;
  }
  public void setHash(String hash) {
    this.hash = hash;
  }
}