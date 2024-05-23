package com.acc.lkm.day2java;

import java.util.Random;

class Orderdetails{
	static int ids;
	static {
		Random rand = new Random();
		ids = rand.nextInt(1000);
	}
	static class Display{
		public static String orders(String order_name) {
			return Integer.toString(ids) + " "+order_name;
		}
	}
}
public class Manageorder {
	public static void main(String[] args) {
		System.out.println(Orderdetails.Display.orders("Mustang"));
	}
}
