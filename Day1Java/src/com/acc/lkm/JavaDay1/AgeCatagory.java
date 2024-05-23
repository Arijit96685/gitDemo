package com.acc.lkm.JavaDay1;

import java.util.Scanner;

public class AgeCatagory
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int age=sc.nextInt();
	switch(age)
	{
	case 1:
	{
		if(age<13)
		{
			System.out.println("child");
		}
		break;
	}
	case 2:
	{
		if(age>=13 && age<20)
		{
			System.out.println("Teenager");
		}
		break;
	}
	case 3:
	{
		if(age>=20 && age<65)
		{
			System.out.println("Adult");
		}
		break;
	}
	case 4:
	{
		if(age>=65)
		{
			System.out.println("Senior");
		}
		break;
	}
	default:
		System.out.println("Person is dead");
	}
}
}
