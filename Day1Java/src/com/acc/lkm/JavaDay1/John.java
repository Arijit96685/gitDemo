package com.acc.lkm.JavaDay1;

public class John
{
String name,role;
String phoneNumber1,phoneNumber2;

  public void contactDetails(String name,String role,String phoneNumber1)
  {
	  System.out.println("Personal Details of John is: "+name+" "+role+" "+phoneNumber1);
  }
  public void contactDetails(String name,String role,String phoneNumber1,String phoneNumber2)
  {
	  System.out.println("Company details of John:"+name+" "+role+" "+phoneNumber1+" "+phoneNumber2);
  }
  public static void main(String[] args) 
  {
	John j=new John();
	j.contactDetails("John","Operation Lead","968581844");
	j.contactDetails("John","Operation Lead","9668581844","7205591321");
}
  }

