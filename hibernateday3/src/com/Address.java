package com;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Address {
@Id
private int addressID;
private String city;
private String country;
private int zip;

public Address(int addressID, String city, String country, int zip) {
	super();
	this.addressID = addressID;
	this.city = city;
	this.country = country;
	this.zip = zip;
}

public int getAddressID() {
	return addressID;
}
public void setAddressID(int addressID) {
	this.addressID = addressID;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public int getZip() {
	return zip;
}
public void setZip(int zip) {
	this.zip = zip;
}


}
