package com.acc.lkm.JavaDay1;

public class ArraySizeDemo 
{
public static void main(String[] args) 
{
	changeArraySize();
}

private static void changeArraySize() {
	int [] arraysize=new int[5];
	
	System.out.println("before changing size:"+arraysize.length);
	arraysize=java.util.Arrays.copyOf(arraysize,arraysize.length*2);
	System.out.println("After changing size:"+arraysize.length);
	
}
}
