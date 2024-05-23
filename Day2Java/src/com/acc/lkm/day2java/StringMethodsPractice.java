package com.acc.lkm.day2java;

public class StringMethodsPractice 
{
public static void main(String[] args) {
	String s="java";
	String str=new String("JavaIsAwoesome");
	System.out.println("indedx of v: "+s.indexOf("v"));
	System.out.println("Last index of  String s: "+str.lastIndexOf('A'));
	System.out.println("to Upper Case: "+str.toUpperCase());
	System.out.println("replace: "+s.replace('j', 's'));
	System.out.println("Substring: "+s.substring(0,2));
	System.out.println("equalIgnoreCase: "+str.equalsIgnoreCase(str));
	System.out.println("EndWith: "+s.endsWith("a"));
	System.out.println("isEmpty: "+s.isEmpty());
}
}
