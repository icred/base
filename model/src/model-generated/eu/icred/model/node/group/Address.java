package eu.icred.model.node.group;

import eu.icred.model.annotation.DataField;
import eu.icred.model.datatype.enumeration.Country;
import eu.icred.model.node.group.AbstractGroupNode;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;

public class Address extends AbstractGroupNode {

@DataField
protected String label;
  public String getLabel() {
    return this.label;
  }
  public void setLabel(String label) {
    this.label = label;
  }
@DataField
protected String floorLocation;
  public String getFloorLocation() {
    return this.floorLocation;
  }
  public void setFloorLocation(String floorLocation) {
    this.floorLocation = floorLocation;
  }
@DataField
protected String floor;
  public String getFloor() {
    return this.floor;
  }
  public void setFloor(String floor) {
    this.floor = floor;
  }
@DataField
protected String housenumber;
  public String getHousenumber() {
    return this.housenumber;
  }
  public void setHousenumber(String housenumber) {
    this.housenumber = housenumber;
  }
@DataField
protected String street;
  public String getStreet() {
    return this.street;
  }
  public void setStreet(String street) {
    this.street = street;
  }
@DataField
protected String district;
  public String getDistrict() {
    return this.district;
  }
  public void setDistrict(String district) {
    this.district = district;
  }
@DataField
protected String zip;
  public String getZip() {
    return this.zip;
  }
  public void setZip(String zip) {
    this.zip = zip;
  }
@DataField
protected String city;
  public String getCity() {
    return this.city;
  }
  public void setCity(String city) {
    this.city = city;
  }
@DataField
protected String region;
  public String getRegion() {
    return this.region;
  }
  public void setRegion(String region) {
    this.region = region;
  }
@DataField
protected Country country;
  public Country getCountry() {
    return this.country;
  }
  public void setCountry(Country country) {
    this.country = country;
  }
@DataField
protected Double latitude;
  public Double getLatitude() {
    return this.latitude;
  }
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }
@DataField
protected Double longitude;
  public Double getLongitude() {
    return this.longitude;
  }
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }
@DataField
protected Boolean isPublic;
  public Boolean getIsPublic() {
    return this.isPublic;
  }
  public void setIsPublic(Boolean isPublic) {
    this.isPublic = isPublic;
  }
}