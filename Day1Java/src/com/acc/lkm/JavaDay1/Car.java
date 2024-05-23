package com.acc.lkm.JavaDay1;

import java.util.Scanner;

public class Car 
{
 String model;
 String color;
 int year;
 String carName;
public String Details(String model, String color, int year, String carName) 
{
	this.model = model;
	this.color = color;
	this.year = year;
	this.carName = carName;
	return this.carName+this.color+this.model+this.year;
}
 
}

