package com.acc.lkm.day2java;

public class Driver
{
String drivr_name;
Car car;
public String getDrivr_name() {
	return drivr_name;
}
public void setDrivr_name(String drivr_name) {
	this.drivr_name = drivr_name;
}
public Car getCar() {
	return car;
}
public void setCar(Car car) {
	this.car = car;
}
public Driver(String drivr_name, Car car) {
	super();
	this.drivr_name = drivr_name;
	this.car = car;
}
public static void main(String[] args) {
	Car car=new Car("Audi",new java.util.Date(System.currentTimeMillis()));
	Driver driver=new Driver("Arijit", car);
	System.out.println("Driver Name: "+driver.getDrivr_name()+"\n"+"CAr name: "+car.getCar_name()+"\n"+"Purchase Date: "+car.getPurchase_date());
}
}
