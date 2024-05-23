package com.acc.lkm.day2java;

import java.util.Date;

public class Payment_Modes 
{
	public String Process_Payment(Date payment,String mode1,String mode2)
	{
		return mode1+"\n "+mode2;
	}
	public String Process_Payment(Date payment,String mode1,String mode2,String mode3)
	{
		String dt=payment.toString();
		return mode1+"\n"+mode2+"\n"+mode3+"\n"+dt;
	}
 public static void main(String[] args) 
 {
	Payment_Modes pm=new Payment_Modes();
	Payment_Modes pm2=new Payment_Modes();
	System.out.println(pm.Process_Payment(new Date(),"credit ", "debit","paytm"));
	System.out.println(pm.Process_Payment(new java.util.Date(System.currentTimeMillis()),"Cerdit Card","Debit card"));
}
 
}
