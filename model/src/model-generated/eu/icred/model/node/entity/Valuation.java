package eu.icred.model.node.entity;

import eu.icred.model.annotation.DataField;
import eu.icred.model.annotation.GroupNode;
import eu.icred.model.annotation.Node;
import eu.icred.model.datatype.Amount;
import eu.icred.model.datatype.Area;
import eu.icred.model.datatype.enumeration.ConstructionPhase;
import eu.icred.model.datatype.enumeration.InteriorQuality;
import eu.icred.model.datatype.enumeration.ObjectCondition;
import eu.icred.model.datatype.enumeration.OwnershipType;
import eu.icred.model.datatype.enumeration.RetailLocationType;
import eu.icred.model.datatype.enumeration.UseType;
import eu.icred.model.datatype.enumeration.ValuationMethod;
import eu.icred.model.datatype.enumeration.ValuationType1;
import eu.icred.model.datatype.enumeration.ValuationType2;
import eu.icred.model.node.entity.AbstractEntityNode;
import eu.icred.model.node.group.Address;
import eu.icred.model.node.group.EnergyRating;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Currency;
import org.joda.time.LocalDate;
import org.joda.time.Period;

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
protected Double capitalizationRate;
  public Double getCapitalizationRate() {
    return this.capitalizationRate;
  }
  public void setCapitalizationRate(Double capitalizationRate) {
    this.capitalizationRate = capitalizationRate;
  }
@DataField
protected LocalDate changeDateForRemainingEconomicLife;
  public LocalDate getChangeDateForRemainingEconomicLife() {
    return this.changeDateForRemainingEconomicLife;
  }
  public void setChangeDateForRemainingEconomicLife(LocalDate changeDateForRemainingEconomicLife) {
    this.changeDateForRemainingEconomicLife = changeDateForRemainingEconomicLife;
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
protected ConstructionPhase constructionPhase;
  public ConstructionPhase getConstructionPhase() {
    return this.constructionPhase;
  }
  public void setConstructionPhase(ConstructionPhase constructionPhase) {
    this.constructionPhase = constructionPhase;
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
protected Amount costApproach;
  public Amount getCostApproach() {
    return this.costApproach;
  }
  public void setCostApproach(Amount costApproach) {
    this.costApproach = costApproach;
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
protected Amount deductionConstructionWorks;
  public Amount getDeductionConstructionWorks() {
    return this.deductionConstructionWorks;
  }
  public void setDeductionConstructionWorks(Amount deductionConstructionWorks) {
    this.deductionConstructionWorks = deductionConstructionWorks;
  }
@DataField
protected Amount deductionForVacancy;
  public Amount getDeductionForVacancy() {
    return this.deductionForVacancy;
  }
  public void setDeductionForVacancy(Amount deductionForVacancy) {
    this.deductionForVacancy = deductionForVacancy;
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
protected Amount discountsPremiums;
  public Amount getDiscountsPremiums() {
    return this.discountsPremiums;
  }
  public void setDiscountsPremiums(Amount discountsPremiums) {
    this.discountsPremiums = discountsPremiums;
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
@GroupNode
protected EnergyRating energyRating;
  public EnergyRating getEnergyRating() {
    return this.energyRating;
  }
  public void setEnergyRating(EnergyRating energyRating) {
    this.energyRating = energyRating;
  }
@DataField
protected LocalDate exchangeRateDate;
  public LocalDate getExchangeRateDate() {
    return this.exchangeRateDate;
  }
  public void setExchangeRateDate(LocalDate exchangeRateDate) {
    this.exchangeRateDate = exchangeRateDate;
  }
@DataField
protected Double exchangeRateToEUR;
  public Double getExchangeRateToEUR() {
    return this.exchangeRateToEUR;
  }
  public void setExchangeRateToEUR(Double exchangeRateToEUR) {
    this.exchangeRateToEUR = exchangeRateToEUR;
  }
@DataField
protected String expertId;
  public String getExpertId() {
    return this.expertId;
  }
  public void setExpertId(String expertId) {
    this.expertId = expertId;
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
protected String floorDescription;
  public String getFloorDescription() {
    return this.floorDescription;
  }
  public void setFloorDescription(String floorDescription) {
    this.floorDescription = floorDescription;
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
protected Amount grossFairValue;
  public Amount getGrossFairValue() {
    return this.grossFairValue;
  }
  public void setGrossFairValue(Amount grossFairValue) {
    this.grossFairValue = grossFairValue;
  }
@DataField
protected Area grossFloorSpaceBelowGround;
  public Area getGrossFloorSpaceBelowGround() {
    return this.grossFloorSpaceBelowGround;
  }
  public void setGrossFloorSpaceBelowGround(Area grossFloorSpaceBelowGround) {
    this.grossFloorSpaceBelowGround = grossFloorSpaceBelowGround;
  }
@DataField
protected Area grossFloorSpaceOverground;
  public Area getGrossFloorSpaceOverground() {
    return this.grossFloorSpaceOverground;
  }
  public void setGrossFloorSpaceOverground(Area grossFloorSpaceOverground) {
    this.grossFloorSpaceOverground = grossFloorSpaceOverground;
  }
@DataField
protected Boolean groundLease;
  public Boolean getGroundLease() {
    return this.groundLease;
  }
  public void setGroundLease(Boolean groundLease) {
    this.groundLease = groundLease;
  }
@DataField
protected String groundLeaseRemarks;
  public String getGroundLeaseRemarks() {
    return this.groundLeaseRemarks;
  }
  public void setGroundLeaseRemarks(String groundLeaseRemarks) {
    this.groundLeaseRemarks = groundLeaseRemarks;
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
protected Double grz;
  public Double getGrz() {
    return this.grz;
  }
  public void setGrz(Double grz) {
    this.grz = grz;
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
protected Boolean internalValuation;
  public Boolean getInternalValuation() {
    return this.internalValuation;
  }
  public void setInternalValuation(Boolean internalValuation) {
    this.internalValuation = internalValuation;
  }
@DataField
protected Amount landValue;
  public Amount getLandValue() {
    return this.landValue;
  }
  public void setLandValue(Amount landValue) {
    this.landValue = landValue;
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
protected Boolean maintenanceBacklog;
  public Boolean getMaintenanceBacklog() {
    return this.maintenanceBacklog;
  }
  public void setMaintenanceBacklog(Boolean maintenanceBacklog) {
    this.maintenanceBacklog = maintenanceBacklog;
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
protected Amount maintenanceExpenses;
  public Amount getMaintenanceExpenses() {
    return this.maintenanceExpenses;
  }
  public void setMaintenanceExpenses(Amount maintenanceExpenses) {
    this.maintenanceExpenses = maintenanceExpenses;
  }
@DataField
protected Amount managementCosts;
  public Amount getManagementCosts() {
    return this.managementCosts;
  }
  public void setManagementCosts(Amount managementCosts) {
    this.managementCosts = managementCosts;
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
protected Period normalTotalEconomicLife;
  public Period getNormalTotalEconomicLife() {
    return this.normalTotalEconomicLife;
  }
  public void setNormalTotalEconomicLife(Period normalTotalEconomicLife) {
    this.normalTotalEconomicLife = normalTotalEconomicLife;
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
protected Double numberOfFloors;
  public Double getNumberOfFloors() {
    return this.numberOfFloors;
  }
  public void setNumberOfFloors(Double numberOfFloors) {
    this.numberOfFloors = numberOfFloors;
  }
@DataField
protected Amount otherOperatingExpenses;
  public Amount getOtherOperatingExpenses() {
    return this.otherOperatingExpenses;
  }
  public void setOtherOperatingExpenses(Amount otherOperatingExpenses) {
    this.otherOperatingExpenses = otherOperatingExpenses;
  }
@DataField
protected Amount othersDiscountsPremiums;
  public Amount getOthersDiscountsPremiums() {
    return this.othersDiscountsPremiums;
  }
  public void setOthersDiscountsPremiums(Amount othersDiscountsPremiums) {
    this.othersDiscountsPremiums = othersDiscountsPremiums;
  }
@DataField
protected String owner;
  public String getOwner() {
    return this.owner;
  }
  public void setOwner(String owner) {
    this.owner = owner;
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
protected Area plotArea;
  public Area getPlotArea() {
    return this.plotArea;
  }
  public void setPlotArea(Area plotArea) {
    this.plotArea = plotArea;
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
protected Amount purchaseNetPrice;
  public Amount getPurchaseNetPrice() {
    return this.purchaseNetPrice;
  }
  public void setPurchaseNetPrice(Amount purchaseNetPrice) {
    this.purchaseNetPrice = purchaseNetPrice;
  }
@DataField
protected Period remainingEconomicLife;
  public Period getRemainingEconomicLife() {
    return this.remainingEconomicLife;
  }
  public void setRemainingEconomicLife(Period remainingEconomicLife) {
    this.remainingEconomicLife = remainingEconomicLife;
  }
@DataField
protected Period remainingLifeOfGroundLease;
  public Period getRemainingLifeOfGroundLease() {
    return this.remainingLifeOfGroundLease;
  }
  public void setRemainingLifeOfGroundLease(Period remainingLifeOfGroundLease) {
    this.remainingLifeOfGroundLease = remainingLifeOfGroundLease;
  }
@DataField
protected Amount rentAllowance;
  public Amount getRentAllowance() {
    return this.rentAllowance;
  }
  public void setRentAllowance(Amount rentAllowance) {
    this.rentAllowance = rentAllowance;
  }
@DataField
protected Amount rentalSituationArchiveContractualAnnualRent;
  public Amount getRentalSituationArchiveContractualAnnualRent() {
    return this.rentalSituationArchiveContractualAnnualRent;
  }
  public void setRentalSituationArchiveContractualAnnualRent(Amount rentalSituationArchiveContractualAnnualRent) {
    this.rentalSituationArchiveContractualAnnualRent = rentalSituationArchiveContractualAnnualRent;
  }
@DataField
protected Amount rentalSituationArchiveEstimatedAnnualRentForLetArea;
  public Amount getRentalSituationArchiveEstimatedAnnualRentForLetArea() {
    return this.rentalSituationArchiveEstimatedAnnualRentForLetArea;
  }
  public void setRentalSituationArchiveEstimatedAnnualRentForLetArea(Amount rentalSituationArchiveEstimatedAnnualRentForLetArea) {
    this.rentalSituationArchiveEstimatedAnnualRentForLetArea = rentalSituationArchiveEstimatedAnnualRentForLetArea;
  }
@DataField
protected Amount rentalSituationArchiveEstimatedAnnualRentForVacantArea;
  public Amount getRentalSituationArchiveEstimatedAnnualRentForVacantArea() {
    return this.rentalSituationArchiveEstimatedAnnualRentForVacantArea;
  }
  public void setRentalSituationArchiveEstimatedAnnualRentForVacantArea(Amount rentalSituationArchiveEstimatedAnnualRentForVacantArea) {
    this.rentalSituationArchiveEstimatedAnnualRentForVacantArea = rentalSituationArchiveEstimatedAnnualRentForVacantArea;
  }
@DataField
protected Area rentalSituationArchiveLetArea;
  public Area getRentalSituationArchiveLetArea() {
    return this.rentalSituationArchiveLetArea;
  }
  public void setRentalSituationArchiveLetArea(Area rentalSituationArchiveLetArea) {
    this.rentalSituationArchiveLetArea = rentalSituationArchiveLetArea;
  }
@DataField
protected Area rentalSituationArchiveVacantArea;
  public Area getRentalSituationArchiveVacantArea() {
    return this.rentalSituationArchiveVacantArea;
  }
  public void setRentalSituationArchiveVacantArea(Area rentalSituationArchiveVacantArea) {
    this.rentalSituationArchiveVacantArea = rentalSituationArchiveVacantArea;
  }
@DataField
protected Amount rentalSituationGastroContractualAnnualRent;
  public Amount getRentalSituationGastroContractualAnnualRent() {
    return this.rentalSituationGastroContractualAnnualRent;
  }
  public void setRentalSituationGastroContractualAnnualRent(Amount rentalSituationGastroContractualAnnualRent) {
    this.rentalSituationGastroContractualAnnualRent = rentalSituationGastroContractualAnnualRent;
  }
@DataField
protected Amount rentalSituationGastroEstimatedAnnualRentForLetArea;
  public Amount getRentalSituationGastroEstimatedAnnualRentForLetArea() {
    return this.rentalSituationGastroEstimatedAnnualRentForLetArea;
  }
  public void setRentalSituationGastroEstimatedAnnualRentForLetArea(Amount rentalSituationGastroEstimatedAnnualRentForLetArea) {
    this.rentalSituationGastroEstimatedAnnualRentForLetArea = rentalSituationGastroEstimatedAnnualRentForLetArea;
  }
@DataField
protected Amount rentalSituationGastroEstimatedAnnualRentForVacantArea;
  public Amount getRentalSituationGastroEstimatedAnnualRentForVacantArea() {
    return this.rentalSituationGastroEstimatedAnnualRentForVacantArea;
  }
  public void setRentalSituationGastroEstimatedAnnualRentForVacantArea(Amount rentalSituationGastroEstimatedAnnualRentForVacantArea) {
    this.rentalSituationGastroEstimatedAnnualRentForVacantArea = rentalSituationGastroEstimatedAnnualRentForVacantArea;
  }
@DataField
protected Area rentalSituationGastroLetArea;
  public Area getRentalSituationGastroLetArea() {
    return this.rentalSituationGastroLetArea;
  }
  public void setRentalSituationGastroLetArea(Area rentalSituationGastroLetArea) {
    this.rentalSituationGastroLetArea = rentalSituationGastroLetArea;
  }
@DataField
protected Area rentalSituationGastroVacantArea;
  public Area getRentalSituationGastroVacantArea() {
    return this.rentalSituationGastroVacantArea;
  }
  public void setRentalSituationGastroVacantArea(Area rentalSituationGastroVacantArea) {
    this.rentalSituationGastroVacantArea = rentalSituationGastroVacantArea;
  }
@DataField
protected Amount rentalSituationHotelContractualAnnualRent;
  public Amount getRentalSituationHotelContractualAnnualRent() {
    return this.rentalSituationHotelContractualAnnualRent;
  }
  public void setRentalSituationHotelContractualAnnualRent(Amount rentalSituationHotelContractualAnnualRent) {
    this.rentalSituationHotelContractualAnnualRent = rentalSituationHotelContractualAnnualRent;
  }
@DataField
protected Amount rentalSituationHotelEstimatedAnnualRentForLetArea;
  public Amount getRentalSituationHotelEstimatedAnnualRentForLetArea() {
    return this.rentalSituationHotelEstimatedAnnualRentForLetArea;
  }
  public void setRentalSituationHotelEstimatedAnnualRentForLetArea(Amount rentalSituationHotelEstimatedAnnualRentForLetArea) {
    this.rentalSituationHotelEstimatedAnnualRentForLetArea = rentalSituationHotelEstimatedAnnualRentForLetArea;
  }
@DataField
protected Amount rentalSituationHotelEstimatedAnnualRentForVacantArea;
  public Amount getRentalSituationHotelEstimatedAnnualRentForVacantArea() {
    return this.rentalSituationHotelEstimatedAnnualRentForVacantArea;
  }
  public void setRentalSituationHotelEstimatedAnnualRentForVacantArea(Amount rentalSituationHotelEstimatedAnnualRentForVacantArea) {
    this.rentalSituationHotelEstimatedAnnualRentForVacantArea = rentalSituationHotelEstimatedAnnualRentForVacantArea;
  }
@DataField
protected Area rentalSituationHotelLetArea;
  public Area getRentalSituationHotelLetArea() {
    return this.rentalSituationHotelLetArea;
  }
  public void setRentalSituationHotelLetArea(Area rentalSituationHotelLetArea) {
    this.rentalSituationHotelLetArea = rentalSituationHotelLetArea;
  }
@DataField
protected Area rentalSituationHotelVacantArea;
  public Area getRentalSituationHotelVacantArea() {
    return this.rentalSituationHotelVacantArea;
  }
  public void setRentalSituationHotelVacantArea(Area rentalSituationHotelVacantArea) {
    this.rentalSituationHotelVacantArea = rentalSituationHotelVacantArea;
  }
@DataField
protected Amount rentalSituationIndoorparkingContractualAnnualRent;
  public Amount getRentalSituationIndoorparkingContractualAnnualRent() {
    return this.rentalSituationIndoorparkingContractualAnnualRent;
  }
  public void setRentalSituationIndoorparkingContractualAnnualRent(Amount rentalSituationIndoorparkingContractualAnnualRent) {
    this.rentalSituationIndoorparkingContractualAnnualRent = rentalSituationIndoorparkingContractualAnnualRent;
  }
@DataField
protected Amount rentalSituationIndoorparkingEstimatedAnnualRentForLetNumbers;
  public Amount getRentalSituationIndoorparkingEstimatedAnnualRentForLetNumbers() {
    return this.rentalSituationIndoorparkingEstimatedAnnualRentForLetNumbers;
  }
  public void setRentalSituationIndoorparkingEstimatedAnnualRentForLetNumbers(Amount rentalSituationIndoorparkingEstimatedAnnualRentForLetNumbers) {
    this.rentalSituationIndoorparkingEstimatedAnnualRentForLetNumbers = rentalSituationIndoorparkingEstimatedAnnualRentForLetNumbers;
  }
@DataField
protected Amount rentalSituationIndoorparkingEstimatedAnnualRentForVacantNumbers;
  public Amount getRentalSituationIndoorparkingEstimatedAnnualRentForVacantNumbers() {
    return this.rentalSituationIndoorparkingEstimatedAnnualRentForVacantNumbers;
  }
  public void setRentalSituationIndoorparkingEstimatedAnnualRentForVacantNumbers(Amount rentalSituationIndoorparkingEstimatedAnnualRentForVacantNumbers) {
    this.rentalSituationIndoorparkingEstimatedAnnualRentForVacantNumbers = rentalSituationIndoorparkingEstimatedAnnualRentForVacantNumbers;
  }
@DataField
protected Integer rentalSituationIndoorparkingLetNumbers;
  public Integer getRentalSituationIndoorparkingLetNumbers() {
    return this.rentalSituationIndoorparkingLetNumbers;
  }
  public void setRentalSituationIndoorparkingLetNumbers(Integer rentalSituationIndoorparkingLetNumbers) {
    this.rentalSituationIndoorparkingLetNumbers = rentalSituationIndoorparkingLetNumbers;
  }
@DataField
protected Integer rentalSituationIndoorparkingVacantNumbers;
  public Integer getRentalSituationIndoorparkingVacantNumbers() {
    return this.rentalSituationIndoorparkingVacantNumbers;
  }
  public void setRentalSituationIndoorparkingVacantNumbers(Integer rentalSituationIndoorparkingVacantNumbers) {
    this.rentalSituationIndoorparkingVacantNumbers = rentalSituationIndoorparkingVacantNumbers;
  }
@DataField
protected Amount rentalSituationLeisureContractualAnnualRent;
  public Amount getRentalSituationLeisureContractualAnnualRent() {
    return this.rentalSituationLeisureContractualAnnualRent;
  }
  public void setRentalSituationLeisureContractualAnnualRent(Amount rentalSituationLeisureContractualAnnualRent) {
    this.rentalSituationLeisureContractualAnnualRent = rentalSituationLeisureContractualAnnualRent;
  }
@DataField
protected Amount rentalSituationLeisureEstimatedAnnualRentForLetArea;
  public Amount getRentalSituationLeisureEstimatedAnnualRentForLetArea() {
    return this.rentalSituationLeisureEstimatedAnnualRentForLetArea;
  }
  public void setRentalSituationLeisureEstimatedAnnualRentForLetArea(Amount rentalSituationLeisureEstimatedAnnualRentForLetArea) {
    this.rentalSituationLeisureEstimatedAnnualRentForLetArea = rentalSituationLeisureEstimatedAnnualRentForLetArea;
  }
@DataField
protected Amount rentalSituationLeisureEstimatedAnnualRentForVacantArea;
  public Amount getRentalSituationLeisureEstimatedAnnualRentForVacantArea() {
    return this.rentalSituationLeisureEstimatedAnnualRentForVacantArea;
  }
  public void setRentalSituationLeisureEstimatedAnnualRentForVacantArea(Amount rentalSituationLeisureEstimatedAnnualRentForVacantArea) {
    this.rentalSituationLeisureEstimatedAnnualRentForVacantArea = rentalSituationLeisureEstimatedAnnualRentForVacantArea;
  }
@DataField
protected Area rentalSituationLeisureLetArea;
  public Area getRentalSituationLeisureLetArea() {
    return this.rentalSituationLeisureLetArea;
  }
  public void setRentalSituationLeisureLetArea(Area rentalSituationLeisureLetArea) {
    this.rentalSituationLeisureLetArea = rentalSituationLeisureLetArea;
  }
@DataField
protected Area rentalSituationLeisureVacantArea;
  public Area getRentalSituationLeisureVacantArea() {
    return this.rentalSituationLeisureVacantArea;
  }
  public void setRentalSituationLeisureVacantArea(Area rentalSituationLeisureVacantArea) {
    this.rentalSituationLeisureVacantArea = rentalSituationLeisureVacantArea;
  }
@DataField
protected Amount rentalSituationMiscArea1ContractualAnnualRent;
  public Amount getRentalSituationMiscArea1ContractualAnnualRent() {
    return this.rentalSituationMiscArea1ContractualAnnualRent;
  }
  public void setRentalSituationMiscArea1ContractualAnnualRent(Amount rentalSituationMiscArea1ContractualAnnualRent) {
    this.rentalSituationMiscArea1ContractualAnnualRent = rentalSituationMiscArea1ContractualAnnualRent;
  }
@DataField
protected Amount rentalSituationMiscArea1EstimatedAnnualRentForLetArea;
  public Amount getRentalSituationMiscArea1EstimatedAnnualRentForLetArea() {
    return this.rentalSituationMiscArea1EstimatedAnnualRentForLetArea;
  }
  public void setRentalSituationMiscArea1EstimatedAnnualRentForLetArea(Amount rentalSituationMiscArea1EstimatedAnnualRentForLetArea) {
    this.rentalSituationMiscArea1EstimatedAnnualRentForLetArea = rentalSituationMiscArea1EstimatedAnnualRentForLetArea;
  }
@DataField
protected Amount rentalSituationMiscArea1EstimatedAnnualRentForVacantArea;
  public Amount getRentalSituationMiscArea1EstimatedAnnualRentForVacantArea() {
    return this.rentalSituationMiscArea1EstimatedAnnualRentForVacantArea;
  }
  public void setRentalSituationMiscArea1EstimatedAnnualRentForVacantArea(Amount rentalSituationMiscArea1EstimatedAnnualRentForVacantArea) {
    this.rentalSituationMiscArea1EstimatedAnnualRentForVacantArea = rentalSituationMiscArea1EstimatedAnnualRentForVacantArea;
  }
@DataField
protected Area rentalSituationMiscArea1LetArea;
  public Area getRentalSituationMiscArea1LetArea() {
    return this.rentalSituationMiscArea1LetArea;
  }
  public void setRentalSituationMiscArea1LetArea(Area rentalSituationMiscArea1LetArea) {
    this.rentalSituationMiscArea1LetArea = rentalSituationMiscArea1LetArea;
  }
@DataField
protected Area rentalSituationMiscArea1VacantArea;
  public Area getRentalSituationMiscArea1VacantArea() {
    return this.rentalSituationMiscArea1VacantArea;
  }
  public void setRentalSituationMiscArea1VacantArea(Area rentalSituationMiscArea1VacantArea) {
    this.rentalSituationMiscArea1VacantArea = rentalSituationMiscArea1VacantArea;
  }
@DataField
protected Amount rentalSituationMiscArea2ContractualAnnualRent;
  public Amount getRentalSituationMiscArea2ContractualAnnualRent() {
    return this.rentalSituationMiscArea2ContractualAnnualRent;
  }
  public void setRentalSituationMiscArea2ContractualAnnualRent(Amount rentalSituationMiscArea2ContractualAnnualRent) {
    this.rentalSituationMiscArea2ContractualAnnualRent = rentalSituationMiscArea2ContractualAnnualRent;
  }
@DataField
protected Amount rentalSituationMiscArea2EstimatedAnnualRentForLetArea;
  public Amount getRentalSituationMiscArea2EstimatedAnnualRentForLetArea() {
    return this.rentalSituationMiscArea2EstimatedAnnualRentForLetArea;
  }
  public void setRentalSituationMiscArea2EstimatedAnnualRentForLetArea(Amount rentalSituationMiscArea2EstimatedAnnualRentForLetArea) {
    this.rentalSituationMiscArea2EstimatedAnnualRentForLetArea = rentalSituationMiscArea2EstimatedAnnualRentForLetArea;
  }
@DataField
protected Amount rentalSituationMiscArea2EstimatedAnnualRentForVacantArea;
  public Amount getRentalSituationMiscArea2EstimatedAnnualRentForVacantArea() {
    return this.rentalSituationMiscArea2EstimatedAnnualRentForVacantArea;
  }
  public void setRentalSituationMiscArea2EstimatedAnnualRentForVacantArea(Amount rentalSituationMiscArea2EstimatedAnnualRentForVacantArea) {
    this.rentalSituationMiscArea2EstimatedAnnualRentForVacantArea = rentalSituationMiscArea2EstimatedAnnualRentForVacantArea;
  }
@DataField
protected Area rentalSituationMiscArea2LetArea;
  public Area getRentalSituationMiscArea2LetArea() {
    return this.rentalSituationMiscArea2LetArea;
  }
  public void setRentalSituationMiscArea2LetArea(Area rentalSituationMiscArea2LetArea) {
    this.rentalSituationMiscArea2LetArea = rentalSituationMiscArea2LetArea;
  }
@DataField
protected Area rentalSituationMiscArea2VacantArea;
  public Area getRentalSituationMiscArea2VacantArea() {
    return this.rentalSituationMiscArea2VacantArea;
  }
  public void setRentalSituationMiscArea2VacantArea(Area rentalSituationMiscArea2VacantArea) {
    this.rentalSituationMiscArea2VacantArea = rentalSituationMiscArea2VacantArea;
  }
@DataField
protected Amount rentalSituationMiscnumbers1ContractualAnnualRent;
  public Amount getRentalSituationMiscnumbers1ContractualAnnualRent() {
    return this.rentalSituationMiscnumbers1ContractualAnnualRent;
  }
  public void setRentalSituationMiscnumbers1ContractualAnnualRent(Amount rentalSituationMiscnumbers1ContractualAnnualRent) {
    this.rentalSituationMiscnumbers1ContractualAnnualRent = rentalSituationMiscnumbers1ContractualAnnualRent;
  }
@DataField
protected Amount rentalSituationMiscnumbers1EstimatedAnnualRentForLetNumbers;
  public Amount getRentalSituationMiscnumbers1EstimatedAnnualRentForLetNumbers() {
    return this.rentalSituationMiscnumbers1EstimatedAnnualRentForLetNumbers;
  }
  public void setRentalSituationMiscnumbers1EstimatedAnnualRentForLetNumbers(Amount rentalSituationMiscnumbers1EstimatedAnnualRentForLetNumbers) {
    this.rentalSituationMiscnumbers1EstimatedAnnualRentForLetNumbers = rentalSituationMiscnumbers1EstimatedAnnualRentForLetNumbers;
  }
@DataField
protected Amount rentalSituationMiscnumbers1EstimatedAnnualRentForVacantNumbers;
  public Amount getRentalSituationMiscnumbers1EstimatedAnnualRentForVacantNumbers() {
    return this.rentalSituationMiscnumbers1EstimatedAnnualRentForVacantNumbers;
  }
  public void setRentalSituationMiscnumbers1EstimatedAnnualRentForVacantNumbers(Amount rentalSituationMiscnumbers1EstimatedAnnualRentForVacantNumbers) {
    this.rentalSituationMiscnumbers1EstimatedAnnualRentForVacantNumbers = rentalSituationMiscnumbers1EstimatedAnnualRentForVacantNumbers;
  }
@DataField
protected Integer rentalSituationMiscnumbers1LetNumbers;
  public Integer getRentalSituationMiscnumbers1LetNumbers() {
    return this.rentalSituationMiscnumbers1LetNumbers;
  }
  public void setRentalSituationMiscnumbers1LetNumbers(Integer rentalSituationMiscnumbers1LetNumbers) {
    this.rentalSituationMiscnumbers1LetNumbers = rentalSituationMiscnumbers1LetNumbers;
  }
@DataField
protected Integer rentalSituationMiscnumbers1VacantNumbers;
  public Integer getRentalSituationMiscnumbers1VacantNumbers() {
    return this.rentalSituationMiscnumbers1VacantNumbers;
  }
  public void setRentalSituationMiscnumbers1VacantNumbers(Integer rentalSituationMiscnumbers1VacantNumbers) {
    this.rentalSituationMiscnumbers1VacantNumbers = rentalSituationMiscnumbers1VacantNumbers;
  }
@DataField
protected Amount rentalSituationMiscnumbers2ContractualAnnualRent;
  public Amount getRentalSituationMiscnumbers2ContractualAnnualRent() {
    return this.rentalSituationMiscnumbers2ContractualAnnualRent;
  }
  public void setRentalSituationMiscnumbers2ContractualAnnualRent(Amount rentalSituationMiscnumbers2ContractualAnnualRent) {
    this.rentalSituationMiscnumbers2ContractualAnnualRent = rentalSituationMiscnumbers2ContractualAnnualRent;
  }
@DataField
protected Amount rentalSituationMiscnumbers2EstimatedAnnualRentForLetNumbers;
  public Amount getRentalSituationMiscnumbers2EstimatedAnnualRentForLetNumbers() {
    return this.rentalSituationMiscnumbers2EstimatedAnnualRentForLetNumbers;
  }
  public void setRentalSituationMiscnumbers2EstimatedAnnualRentForLetNumbers(Amount rentalSituationMiscnumbers2EstimatedAnnualRentForLetNumbers) {
    this.rentalSituationMiscnumbers2EstimatedAnnualRentForLetNumbers = rentalSituationMiscnumbers2EstimatedAnnualRentForLetNumbers;
  }
@DataField
protected Amount rentalSituationMiscnumbers2EstimatedAnnualRentForVacantNumbers;
  public Amount getRentalSituationMiscnumbers2EstimatedAnnualRentForVacantNumbers() {
    return this.rentalSituationMiscnumbers2EstimatedAnnualRentForVacantNumbers;
  }
  public void setRentalSituationMiscnumbers2EstimatedAnnualRentForVacantNumbers(Amount rentalSituationMiscnumbers2EstimatedAnnualRentForVacantNumbers) {
    this.rentalSituationMiscnumbers2EstimatedAnnualRentForVacantNumbers = rentalSituationMiscnumbers2EstimatedAnnualRentForVacantNumbers;
  }
@DataField
protected Integer rentalSituationMiscnumbers2LetNumbers;
  public Integer getRentalSituationMiscnumbers2LetNumbers() {
    return this.rentalSituationMiscnumbers2LetNumbers;
  }
  public void setRentalSituationMiscnumbers2LetNumbers(Integer rentalSituationMiscnumbers2LetNumbers) {
    this.rentalSituationMiscnumbers2LetNumbers = rentalSituationMiscnumbers2LetNumbers;
  }
@DataField
protected Integer rentalSituationMiscnumbers2VacantNumbers;
  public Integer getRentalSituationMiscnumbers2VacantNumbers() {
    return this.rentalSituationMiscnumbers2VacantNumbers;
  }
  public void setRentalSituationMiscnumbers2VacantNumbers(Integer rentalSituationMiscnumbers2VacantNumbers) {
    this.rentalSituationMiscnumbers2VacantNumbers = rentalSituationMiscnumbers2VacantNumbers;
  }
@DataField
protected Amount rentalSituationOfficeContractualAnnualRent;
  public Amount getRentalSituationOfficeContractualAnnualRent() {
    return this.rentalSituationOfficeContractualAnnualRent;
  }
  public void setRentalSituationOfficeContractualAnnualRent(Amount rentalSituationOfficeContractualAnnualRent) {
    this.rentalSituationOfficeContractualAnnualRent = rentalSituationOfficeContractualAnnualRent;
  }
@DataField
protected Amount rentalSituationOfficeEstimatedAnnualRentForLetArea;
  public Amount getRentalSituationOfficeEstimatedAnnualRentForLetArea() {
    return this.rentalSituationOfficeEstimatedAnnualRentForLetArea;
  }
  public void setRentalSituationOfficeEstimatedAnnualRentForLetArea(Amount rentalSituationOfficeEstimatedAnnualRentForLetArea) {
    this.rentalSituationOfficeEstimatedAnnualRentForLetArea = rentalSituationOfficeEstimatedAnnualRentForLetArea;
  }
@DataField
protected Amount rentalSituationOfficeEstimatedAnnualRentForVacantArea;
  public Amount getRentalSituationOfficeEstimatedAnnualRentForVacantArea() {
    return this.rentalSituationOfficeEstimatedAnnualRentForVacantArea;
  }
  public void setRentalSituationOfficeEstimatedAnnualRentForVacantArea(Amount rentalSituationOfficeEstimatedAnnualRentForVacantArea) {
    this.rentalSituationOfficeEstimatedAnnualRentForVacantArea = rentalSituationOfficeEstimatedAnnualRentForVacantArea;
  }
@DataField
protected Area rentalSituationOfficeLetArea;
  public Area getRentalSituationOfficeLetArea() {
    return this.rentalSituationOfficeLetArea;
  }
  public void setRentalSituationOfficeLetArea(Area rentalSituationOfficeLetArea) {
    this.rentalSituationOfficeLetArea = rentalSituationOfficeLetArea;
  }
@DataField
protected Area rentalSituationOfficeVacantArea;
  public Area getRentalSituationOfficeVacantArea() {
    return this.rentalSituationOfficeVacantArea;
  }
  public void setRentalSituationOfficeVacantArea(Area rentalSituationOfficeVacantArea) {
    this.rentalSituationOfficeVacantArea = rentalSituationOfficeVacantArea;
  }
@DataField
protected Amount rentalSituationOutsideparkingContractualAnnualRent;
  public Amount getRentalSituationOutsideparkingContractualAnnualRent() {
    return this.rentalSituationOutsideparkingContractualAnnualRent;
  }
  public void setRentalSituationOutsideparkingContractualAnnualRent(Amount rentalSituationOutsideparkingContractualAnnualRent) {
    this.rentalSituationOutsideparkingContractualAnnualRent = rentalSituationOutsideparkingContractualAnnualRent;
  }
@DataField
protected Amount rentalSituationOutsideparkingEstimatedAnnualRentForLetNumbers;
  public Amount getRentalSituationOutsideparkingEstimatedAnnualRentForLetNumbers() {
    return this.rentalSituationOutsideparkingEstimatedAnnualRentForLetNumbers;
  }
  public void setRentalSituationOutsideparkingEstimatedAnnualRentForLetNumbers(Amount rentalSituationOutsideparkingEstimatedAnnualRentForLetNumbers) {
    this.rentalSituationOutsideparkingEstimatedAnnualRentForLetNumbers = rentalSituationOutsideparkingEstimatedAnnualRentForLetNumbers;
  }
@DataField
protected Amount rentalSituationOutsideparkingEstimatedAnnualRentForVacantNumbers;
  public Amount getRentalSituationOutsideparkingEstimatedAnnualRentForVacantNumbers() {
    return this.rentalSituationOutsideparkingEstimatedAnnualRentForVacantNumbers;
  }
  public void setRentalSituationOutsideparkingEstimatedAnnualRentForVacantNumbers(Amount rentalSituationOutsideparkingEstimatedAnnualRentForVacantNumbers) {
    this.rentalSituationOutsideparkingEstimatedAnnualRentForVacantNumbers = rentalSituationOutsideparkingEstimatedAnnualRentForVacantNumbers;
  }
@DataField
protected Integer rentalSituationOutsideparkingLetNumbers;
  public Integer getRentalSituationOutsideparkingLetNumbers() {
    return this.rentalSituationOutsideparkingLetNumbers;
  }
  public void setRentalSituationOutsideparkingLetNumbers(Integer rentalSituationOutsideparkingLetNumbers) {
    this.rentalSituationOutsideparkingLetNumbers = rentalSituationOutsideparkingLetNumbers;
  }
@DataField
protected Integer rentalSituationOutsideparkingVacantNumbers;
  public Integer getRentalSituationOutsideparkingVacantNumbers() {
    return this.rentalSituationOutsideparkingVacantNumbers;
  }
  public void setRentalSituationOutsideparkingVacantNumbers(Integer rentalSituationOutsideparkingVacantNumbers) {
    this.rentalSituationOutsideparkingVacantNumbers = rentalSituationOutsideparkingVacantNumbers;
  }
@DataField
protected Amount rentalSituationResidentialContractualAnnualRent;
  public Amount getRentalSituationResidentialContractualAnnualRent() {
    return this.rentalSituationResidentialContractualAnnualRent;
  }
  public void setRentalSituationResidentialContractualAnnualRent(Amount rentalSituationResidentialContractualAnnualRent) {
    this.rentalSituationResidentialContractualAnnualRent = rentalSituationResidentialContractualAnnualRent;
  }
@DataField
protected Amount rentalSituationResidentialEstimatedAnnualRentForLetArea;
  public Amount getRentalSituationResidentialEstimatedAnnualRentForLetArea() {
    return this.rentalSituationResidentialEstimatedAnnualRentForLetArea;
  }
  public void setRentalSituationResidentialEstimatedAnnualRentForLetArea(Amount rentalSituationResidentialEstimatedAnnualRentForLetArea) {
    this.rentalSituationResidentialEstimatedAnnualRentForLetArea = rentalSituationResidentialEstimatedAnnualRentForLetArea;
  }
@DataField
protected Amount rentalSituationResidentialEstimatedAnnualRentForVacantArea;
  public Amount getRentalSituationResidentialEstimatedAnnualRentForVacantArea() {
    return this.rentalSituationResidentialEstimatedAnnualRentForVacantArea;
  }
  public void setRentalSituationResidentialEstimatedAnnualRentForVacantArea(Amount rentalSituationResidentialEstimatedAnnualRentForVacantArea) {
    this.rentalSituationResidentialEstimatedAnnualRentForVacantArea = rentalSituationResidentialEstimatedAnnualRentForVacantArea;
  }
@DataField
protected Area rentalSituationResidentialLetArea;
  public Area getRentalSituationResidentialLetArea() {
    return this.rentalSituationResidentialLetArea;
  }
  public void setRentalSituationResidentialLetArea(Area rentalSituationResidentialLetArea) {
    this.rentalSituationResidentialLetArea = rentalSituationResidentialLetArea;
  }
@DataField
protected Area rentalSituationResidentialVacantArea;
  public Area getRentalSituationResidentialVacantArea() {
    return this.rentalSituationResidentialVacantArea;
  }
  public void setRentalSituationResidentialVacantArea(Area rentalSituationResidentialVacantArea) {
    this.rentalSituationResidentialVacantArea = rentalSituationResidentialVacantArea;
  }
@DataField
protected Amount rentalSituationRetailContractualAnnualRent;
  public Amount getRentalSituationRetailContractualAnnualRent() {
    return this.rentalSituationRetailContractualAnnualRent;
  }
  public void setRentalSituationRetailContractualAnnualRent(Amount rentalSituationRetailContractualAnnualRent) {
    this.rentalSituationRetailContractualAnnualRent = rentalSituationRetailContractualAnnualRent;
  }
@DataField
protected Amount rentalSituationRetailEstimatedAnnualRentForLetArea;
  public Amount getRentalSituationRetailEstimatedAnnualRentForLetArea() {
    return this.rentalSituationRetailEstimatedAnnualRentForLetArea;
  }
  public void setRentalSituationRetailEstimatedAnnualRentForLetArea(Amount rentalSituationRetailEstimatedAnnualRentForLetArea) {
    this.rentalSituationRetailEstimatedAnnualRentForLetArea = rentalSituationRetailEstimatedAnnualRentForLetArea;
  }
@DataField
protected Amount rentalSituationRetailEstimatedAnnualRentForVacantArea;
  public Amount getRentalSituationRetailEstimatedAnnualRentForVacantArea() {
    return this.rentalSituationRetailEstimatedAnnualRentForVacantArea;
  }
  public void setRentalSituationRetailEstimatedAnnualRentForVacantArea(Amount rentalSituationRetailEstimatedAnnualRentForVacantArea) {
    this.rentalSituationRetailEstimatedAnnualRentForVacantArea = rentalSituationRetailEstimatedAnnualRentForVacantArea;
  }
@DataField
protected Area rentalSituationRetailLetArea;
  public Area getRentalSituationRetailLetArea() {
    return this.rentalSituationRetailLetArea;
  }
  public void setRentalSituationRetailLetArea(Area rentalSituationRetailLetArea) {
    this.rentalSituationRetailLetArea = rentalSituationRetailLetArea;
  }
@DataField
protected Area rentalSituationRetailVacantArea;
  public Area getRentalSituationRetailVacantArea() {
    return this.rentalSituationRetailVacantArea;
  }
  public void setRentalSituationRetailVacantArea(Area rentalSituationRetailVacantArea) {
    this.rentalSituationRetailVacantArea = rentalSituationRetailVacantArea;
  }
@DataField
protected Amount rentalSituationStorageContractualAnnualRent;
  public Amount getRentalSituationStorageContractualAnnualRent() {
    return this.rentalSituationStorageContractualAnnualRent;
  }
  public void setRentalSituationStorageContractualAnnualRent(Amount rentalSituationStorageContractualAnnualRent) {
    this.rentalSituationStorageContractualAnnualRent = rentalSituationStorageContractualAnnualRent;
  }
@DataField
protected Amount rentalSituationStorageEstimatedAnnualRentForLetArea;
  public Amount getRentalSituationStorageEstimatedAnnualRentForLetArea() {
    return this.rentalSituationStorageEstimatedAnnualRentForLetArea;
  }
  public void setRentalSituationStorageEstimatedAnnualRentForLetArea(Amount rentalSituationStorageEstimatedAnnualRentForLetArea) {
    this.rentalSituationStorageEstimatedAnnualRentForLetArea = rentalSituationStorageEstimatedAnnualRentForLetArea;
  }
@DataField
protected Amount rentalSituationStorageEstimatedAnnualRentForVacantArea;
  public Amount getRentalSituationStorageEstimatedAnnualRentForVacantArea() {
    return this.rentalSituationStorageEstimatedAnnualRentForVacantArea;
  }
  public void setRentalSituationStorageEstimatedAnnualRentForVacantArea(Amount rentalSituationStorageEstimatedAnnualRentForVacantArea) {
    this.rentalSituationStorageEstimatedAnnualRentForVacantArea = rentalSituationStorageEstimatedAnnualRentForVacantArea;
  }
@DataField
protected Area rentalSituationStorageLetArea;
  public Area getRentalSituationStorageLetArea() {
    return this.rentalSituationStorageLetArea;
  }
  public void setRentalSituationStorageLetArea(Area rentalSituationStorageLetArea) {
    this.rentalSituationStorageLetArea = rentalSituationStorageLetArea;
  }
@DataField
protected Area rentalSituationStorageVacantArea;
  public Area getRentalSituationStorageVacantArea() {
    return this.rentalSituationStorageVacantArea;
  }
  public void setRentalSituationStorageVacantArea(Area rentalSituationStorageVacantArea) {
    this.rentalSituationStorageVacantArea = rentalSituationStorageVacantArea;
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
protected Amount runningCosts;
  public Amount getRunningCosts() {
    return this.runningCosts;
  }
  public void setRunningCosts(Amount runningCosts) {
    this.runningCosts = runningCosts;
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
protected Amount saleNetPrice;
  public Amount getSaleNetPrice() {
    return this.saleNetPrice;
  }
  public void setSaleNetPrice(Amount saleNetPrice) {
    this.saleNetPrice = saleNetPrice;
  }
@DataField
protected Boolean singleTenant;
  public Boolean getSingleTenant() {
    return this.singleTenant;
  }
  public void setSingleTenant(Boolean singleTenant) {
    this.singleTenant = singleTenant;
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
protected Area totalGrossFloorSpace;
  public Area getTotalGrossFloorSpace() {
    return this.totalGrossFloorSpace;
  }
  public void setTotalGrossFloorSpace(Area totalGrossFloorSpace) {
    this.totalGrossFloorSpace = totalGrossFloorSpace;
  }
@DataField
protected Area totalRentableArea;
  public Area getTotalRentableArea() {
    return this.totalRentableArea;
  }
  public void setTotalRentableArea(Area totalRentableArea) {
    this.totalRentableArea = totalRentableArea;
  }
@DataField
protected UseType useTypePrimary;
  public UseType getUseTypePrimary() {
    return this.useTypePrimary;
  }
  public void setUseTypePrimary(UseType useTypePrimary) {
    this.useTypePrimary = useTypePrimary;
  }
@DataField
protected Double useTypePrimaryShare;
  public Double getUseTypePrimaryShare() {
    return this.useTypePrimaryShare;
  }
  public void setUseTypePrimaryShare(Double useTypePrimaryShare) {
    this.useTypePrimaryShare = useTypePrimaryShare;
  }
@DataField
protected UseType useTypeSecondary;
  public UseType getUseTypeSecondary() {
    return this.useTypeSecondary;
  }
  public void setUseTypeSecondary(UseType useTypeSecondary) {
    this.useTypeSecondary = useTypeSecondary;
  }
@DataField
protected Double useTypeSecondaryShare;
  public Double getUseTypeSecondaryShare() {
    return this.useTypeSecondaryShare;
  }
  public void setUseTypeSecondaryShare(Double useTypeSecondaryShare) {
    this.useTypeSecondaryShare = useTypeSecondaryShare;
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
@DataField
protected ValuationType1 valuationType1;
  public ValuationType1 getValuationType1() {
    return this.valuationType1;
  }
  public void setValuationType1(ValuationType1 valuationType1) {
    this.valuationType1 = valuationType1;
  }
@DataField
protected ValuationType2 valuationType2;
  public ValuationType2 getValuationType2() {
    return this.valuationType2;
  }
  public void setValuationType2(ValuationType2 valuationType2) {
    this.valuationType2 = valuationType2;
  }
@DataField
protected Amount valueByIncomeApproach;
  public Amount getValueByIncomeApproach() {
    return this.valueByIncomeApproach;
  }
  public void setValueByIncomeApproach(Amount valueByIncomeApproach) {
    this.valueByIncomeApproach = valueByIncomeApproach;
  }
@DataField
protected Amount valueByIncomeApproachWithoutPremiumsDiscounts;
  public Amount getValueByIncomeApproachWithoutPremiumsDiscounts() {
    return this.valueByIncomeApproachWithoutPremiumsDiscounts;
  }
  public void setValueByIncomeApproachWithoutPremiumsDiscounts(Amount valueByIncomeApproachWithoutPremiumsDiscounts) {
    this.valueByIncomeApproachWithoutPremiumsDiscounts = valueByIncomeApproachWithoutPremiumsDiscounts;
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