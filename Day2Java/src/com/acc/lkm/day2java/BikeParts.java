package com.acc.lkm.day2java;

public class BikeParts 
{
	String EngineName;
String EngineNumber;
Bike bike;
public String getEngineName() {
	return EngineName;
}
public void setEngineName(String engineName) {
	EngineName = engineName;
}
public String getEngineNumber() {
	return EngineNumber;
}
public void setEngineNumber(String engineNumber) {
	EngineNumber = engineNumber;
}
public Bike getBike() {
	return bike;
}
public void setBike(Bike bike) {
	this.bike = bike;
}
public BikeParts(String engineName, String engineNumber, Bike bike) {
	super();
	EngineName = engineName;
	EngineNumber = engineNumber;
	this.bike = bike;
}
public static void main(String[] args) 
{
	Bike bike=new Bike("Honda shine", new java.util.Date(System.currentTimeMillis()));
	BikeParts bp=new BikeParts("HONDA", "12345", bike);
	System.out.println("Bike name: ");
}


}
