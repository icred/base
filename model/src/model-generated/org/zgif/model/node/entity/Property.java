package org.zgif.model.node.entity;

import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Currency;
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
import org.zgif.model.datatype.enumeration.AssetCategory;
import org.zgif.model.datatype.enumeration.BuildingType;
import org.zgif.model.datatype.enumeration.HeatingType;
import org.zgif.model.datatype.enumeration.InteriorQuality;
import org.zgif.model.datatype.enumeration.LocationType;
import org.zgif.model.datatype.enumeration.MonumentsType;
import org.zgif.model.datatype.enumeration.ObjectCondition;
import org.zgif.model.datatype.enumeration.OptRate;
import org.zgif.model.datatype.enumeration.OwnershipType;
import org.zgif.model.datatype.enumeration.PortfolioType;
import org.zgif.model.datatype.enumeration.RestorationStatus;
import org.zgif.model.datatype.enumeration.RetailLocationType;
import org.zgif.model.datatype.enumeration.RiskSegment;
import org.zgif.model.node.entity.AbstractEntityNode;
import org.zgif.model.node.group.Address;

@Node
public class Property extends AbstractEntityNode {

    @DataField
    protected Amount administrationCosts;

    public Amount getAdministrationCosts() {
        return this.administrationCosts;
    }

    public void setAdministrationCosts(Amount administrationCosts) {
        this.administrationCosts = administrationCosts;
    }

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
    protected AssetCategory assetCategory;

    public AssetCategory getAssetCategory() {
        return this.assetCategory;
    }

    public void setAssetCategory(AssetCategory assetCategory) {
        this.assetCategory = assetCategory;
    }

    @DataField
    protected String assetManager;

    public String getAssetManager() {
        return this.assetManager;
    }

    public void setAssetManager(String assetManager) {
        this.assetManager = assetManager;
    }

    @DataField
    protected Amount assetValue;

    public Amount getAssetValue() {
        return this.assetValue;
    }

    public void setAssetValue(Amount assetValue) {
        this.assetValue = assetValue;
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
    protected Amount capitalIncome;

    public Amount getCapitalIncome() {
        return this.capitalIncome;
    }

    public void setCapitalIncome(Amount capitalIncome) {
        this.capitalIncome = capitalIncome;
    }

    @DataField
    protected Boolean cellar;

    public Boolean getCellar() {
        return this.cellar;
    }

    public void setCellar(Boolean cellar) {
        this.cellar = cellar;
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
    protected Currency currency;

    public Currency getCurrency() {
        return this.currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    @DataField
    protected Double distanceToAirport;

    public Double getDistanceToAirport() {
        return this.distanceToAirport;
    }

    public void setDistanceToAirport(Double distanceToAirport) {
        this.distanceToAirport = distanceToAirport;
    }

    @DataField
    protected Double distanceToHighway;

    public Double getDistanceToHighway() {
        return this.distanceToHighway;
    }

    public void setDistanceToHighway(Double distanceToHighway) {
        this.distanceToHighway = distanceToHighway;
    }

    @DataField
    protected Double distanceToPublicTransport;

    public Double getDistanceToPublicTransport() {
        return this.distanceToPublicTransport;
    }

    public void setDistanceToPublicTransport(Double distanceToPublicTransport) {
        this.distanceToPublicTransport = distanceToPublicTransport;
    }

    @DataField
    protected Double distanceToRailStation;

    public Double getDistanceToRailStation() {
        return this.distanceToRailStation;
    }

    public void setDistanceToRailStation(Double distanceToRailStation) {
        this.distanceToRailStation = distanceToRailStation;
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
    protected String facilityManager;

    public String getFacilityManager() {
        return this.facilityManager;
    }

    public void setFacilityManager(String facilityManager) {
        this.facilityManager = facilityManager;
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
    protected Amount groundRent;

    public Amount getGroundRent() {
        return this.groundRent;
    }

    public void setGroundRent(Amount groundRent) {
        this.groundRent = groundRent;
    }

    @DataField
    protected HeatingType heatingType;

    public HeatingType getHeatingType() {
        return this.heatingType;
    }

    public void setHeatingType(HeatingType heatingType) {
        this.heatingType = heatingType;
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
    protected String ipdObjectId;

    public String getIpdObjectId() {
        return this.ipdObjectId;
    }

    public void setIpdObjectId(String ipdObjectId) {
        this.ipdObjectId = ipdObjectId;
    }

    @DataField
    protected String ipdPortfolioId;

    public String getIpdPortfolioId() {
        return this.ipdPortfolioId;
    }

    public void setIpdPortfolioId(String ipdPortfolioId) {
        this.ipdPortfolioId = ipdPortfolioId;
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
    protected Area leasedArea;

    public Area getLeasedArea() {
        return this.leasedArea;
    }

    public void setLeasedArea(Area leasedArea) {
        this.leasedArea = leasedArea;
    }

    @DataField
    protected LocationType locationClassificationType;

    public LocationType getLocationClassificationType() {
        return this.locationClassificationType;
    }

    public void setLocationClassificationType(LocationType locationClassificationType) {
        this.locationClassificationType = locationClassificationType;
    }

    @DataField
    protected Amount maintenanceCosts;

    public Amount getMaintenanceCosts() {
        return this.maintenanceCosts;
    }

    public void setMaintenanceCosts(Amount maintenanceCosts) {
        this.maintenanceCosts = maintenanceCosts;
    }

    @DataField
    protected Amount marketRentalValue;

    public Amount getMarketRentalValue() {
        return this.marketRentalValue;
    }

    public void setMarketRentalValue(Amount marketRentalValue) {
        this.marketRentalValue = marketRentalValue;
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
    protected Amount netIncome;

    public Amount getNetIncome() {
        return this.netIncome;
    }

    public void setNetIncome(Amount netIncome) {
        this.netIncome = netIncome;
    }

    @DataField
    protected String note;

    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note;
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
    protected Amount operatingCosts;

    public Amount getOperatingCosts() {
        return this.operatingCosts;
    }

    public void setOperatingCosts(Amount operatingCosts) {
        this.operatingCosts = operatingCosts;
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
    protected OptRate optRate;

    public OptRate getOptRate() {
        return this.optRate;
    }

    public void setOptRate(OptRate optRate) {
        this.optRate = optRate;
    }

    @DataField
    protected Amount otherCosts;

    public Amount getOtherCosts() {
        return this.otherCosts;
    }

    public void setOtherCosts(Amount otherCosts) {
        this.otherCosts = otherCosts;
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
    protected OwnershipType ownershipType;

    public OwnershipType getOwnershipType() {
        return this.ownershipType;
    }

    public void setOwnershipType(OwnershipType ownershipType) {
        this.ownershipType = ownershipType;
    }

    @DataField
    protected Amount partialPurchase;

    public Amount getPartialPurchase() {
        return this.partialPurchase;
    }

    public void setPartialPurchase(Amount partialPurchase) {
        this.partialPurchase = partialPurchase;
    }

    @DataField
    protected Amount partialSales;

    public Amount getPartialSales() {
        return this.partialSales;
    }

    public void setPartialSales(Amount partialSales) {
        this.partialSales = partialSales;
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
    protected String portfolioName;

    public String getPortfolioName() {
        return this.portfolioName;
    }

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    @DataField
    protected String portfolioPartName;

    public String getPortfolioPartName() {
        return this.portfolioPartName;
    }

    public void setPortfolioPartName(String portfolioPartName) {
        this.portfolioPartName = portfolioPartName;
    }

    @DataField
    protected PortfolioType protfolioType;

    public PortfolioType getProtfolioType() {
        return this.protfolioType;
    }

    public void setProtfolioType(PortfolioType protfolioType) {
        this.protfolioType = protfolioType;
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
    protected Amount purchaseAdditionalCosts;

    public Amount getPurchaseAdditionalCosts() {
        return this.purchaseAdditionalCosts;
    }

    public void setPurchaseAdditionalCosts(Amount purchaseAdditionalCosts) {
        this.purchaseAdditionalCosts = purchaseAdditionalCosts;
    }

    @DataField
    protected Amount purchaseBrokerage;

    public Amount getPurchaseBrokerage() {
        return this.purchaseBrokerage;
    }

    public void setPurchaseBrokerage(Amount purchaseBrokerage) {
        this.purchaseBrokerage = purchaseBrokerage;
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
    protected Amount purchaseLegalFees;

    public Amount getPurchaseLegalFees() {
        return this.purchaseLegalFees;
    }

    public void setPurchaseLegalFees(Amount purchaseLegalFees) {
        this.purchaseLegalFees = purchaseLegalFees;
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
    protected Amount purchaseTransferTax;

    public Amount getPurchaseTransferTax() {
        return this.purchaseTransferTax;
    }

    public void setPurchaseTransferTax(Amount purchaseTransferTax) {
        this.purchaseTransferTax = purchaseTransferTax;
    }

    @DataField
    protected Amount rentalIncomeAdditional;

    public Amount getRentalIncomeAdditional() {
        return this.rentalIncomeAdditional;
    }

    public void setRentalIncomeAdditional(Amount rentalIncomeAdditional) {
        this.rentalIncomeAdditional = rentalIncomeAdditional;
    }

    @DataField
    protected Amount rentalIncomeMain;

    public Amount getRentalIncomeMain() {
        return this.rentalIncomeMain;
    }

    public void setRentalIncomeMain(Amount rentalIncomeMain) {
        this.rentalIncomeMain = rentalIncomeMain;
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
    protected RetailLocationType retailLocation;

    public RetailLocationType getRetailLocation() {
        return this.retailLocation;
    }

    public void setRetailLocation(RetailLocationType retailLocation) {
        this.retailLocation = retailLocation;
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
    protected Amount saleAdditionalCosts;

    public Amount getSaleAdditionalCosts() {
        return this.saleAdditionalCosts;
    }

    public void setSaleAdditionalCosts(Amount saleAdditionalCosts) {
        this.saleAdditionalCosts = saleAdditionalCosts;
    }

    @DataField
    protected Amount saleBrokerage;

    public Amount getSaleBrokerage() {
        return this.saleBrokerage;
    }

    public void setSaleBrokerage(Amount saleBrokerage) {
        this.saleBrokerage = saleBrokerage;
    }

    @DataField
    protected LocalDate saleDate;

    public LocalDate getSaleDate() {
        return this.saleDate;
    }

    public void setSaleDate(LocalDate saleDate) {
        this.saleDate = saleDate;
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
    protected Amount saleTransferTax;

    public Amount getSaleTransferTax() {
        return this.saleTransferTax;
    }

    public void setSaleTransferTax(Amount saleTransferTax) {
        this.saleTransferTax = saleTransferTax;
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
    protected Amount totalApportionableCosts;

    public Amount getTotalApportionableCosts() {
        return this.totalApportionableCosts;
    }

    public void setTotalApportionableCosts(Amount totalApportionableCosts) {
        this.totalApportionableCosts = totalApportionableCosts;
    }

    @DataField
    protected Amount totalGrossCosts;

    public Amount getTotalGrossCosts() {
        return this.totalGrossCosts;
    }

    public void setTotalGrossCosts(Amount totalGrossCosts) {
        this.totalGrossCosts = totalGrossCosts;
    }

    @DataField
    protected Amount totalNetCosts;

    public Amount getTotalNetCosts() {
        return this.totalNetCosts;
    }

    public void setTotalNetCosts(Amount totalNetCosts) {
        this.totalNetCosts = totalNetCosts;
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

    @DataField
    protected Amount vacancyOperatingCosts;

    public Amount getVacancyOperatingCosts() {
        return this.vacancyOperatingCosts;
    }

    public void setVacancyOperatingCosts(Amount vacancyOperatingCosts) {
        this.vacancyOperatingCosts = vacancyOperatingCosts;
    }

    @DataField
    protected Amount valueIncreasingReconstructCosts;

    public Amount getValueIncreasingReconstructCosts() {
        return this.valueIncreasingReconstructCosts;
    }

    public void setValueIncreasingReconstructCosts(Amount valueIncreasingReconstructCosts) {
        this.valueIncreasingReconstructCosts = valueIncreasingReconstructCosts;
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
    protected Map<String, Project> projects;

    public Map<String, Project> getProjects() {
        return this.projects;
    }

    public void setProjects(Map<String, Project> projects) {
        this.projects = projects;
    }

    @ChildList
    protected Map<String, Land> lands;

    public Map<String, Land> getLands() {
        return this.lands;
    }

    public void setLands(Map<String, Land> lands) {
        this.lands = lands;
    }

    @ChildList
    protected Map<String, Building> buildings;

    public Map<String, Building> getBuildings() {
        return this.buildings;
    }

    public void setBuildings(Map<String, Building> buildings) {
        this.buildings = buildings;
    }

    @ChildList
    protected Map<String, Lease> leases;

    public Map<String, Lease> getLeases() {
        return this.leases;
    }

    public void setLeases(Map<String, Lease> leases) {
        this.leases = leases;
    }

    @ChildList
    protected Map<String, ServiceContract> serviceContracts;

    public Map<String, ServiceContract> getServiceContracts() {
        return this.serviceContracts;
    }

    public void setServiceContracts(Map<String, ServiceContract> serviceContracts) {
        this.serviceContracts = serviceContracts;
    }

    @ChildList
    protected Map<String, Valuation> valuations;

    public Map<String, Valuation> getValuations() {
        return this.valuations;
    }

    public void setValuations(Map<String, Valuation> valuations) {
        this.valuations = valuations;
    }

    @ChildList
    protected Map<String, Record> records;

    public Map<String, Record> getRecords() {
        return this.records;
    }

    public void setRecords(Map<String, Record> records) {
        this.records = records;
    }

    @ChildList
    protected Map<String, Account> accounts;

    public Map<String, Account> getAccounts() {
        return this.accounts;
    }

    public void setAccounts(Map<String, Account> accounts) {
        this.accounts = accounts;
    }
}