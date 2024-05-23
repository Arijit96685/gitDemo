package com.acc.lkm.day2java;

import java.util.Date;

public class Bike 
{
String BikeName;
Date DateOfPurchase;
public String getBikeName() {
	return BikeName;
}
public void setBikeName(String bikeName) {
	BikeName = bikeName;
}
public Date getDateOfPurchase() {
	return DateOfPurchase;
}
public void setDateOfPurchase(Date dateOfPurchase) {
	DateOfPurchase = dateOfPurchase;
}
public Bike(String bikeName, Date dateOfPurchase) {
	super();
	BikeName = bikeName;
	DateOfPurchase = dateOfPurchase;
}

}
