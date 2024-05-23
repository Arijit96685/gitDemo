package com.acc.lkm.JavaDay1;

import java.util.Scanner;

public class ArrayDemo 
{
public static void main(String[] args) 
{
	int len,p,element;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter array size:");
	len=sc.nextInt();
	int arr[]=new int[len+1];
    System.out.println("Entr "+len+" Elements:");
    for(int i=0;i<len;i++)
    {
    	arr[i]=sc.nextInt();
    }
    System.out.println("Enter the element want to insert: ");
    element=sc.nextInt();
    arr[len]=element;
    System.out.println("After inserting last element:");
    for(int i=0;i<len;i++)
    {
    	System.out.println(arr[i]+" ");
    }
	System.out.println(arr[len]);
}
}
