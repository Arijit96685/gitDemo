package com.acc.lkm.JavaDay1;

public class Simple{
int a=100;//instance variable
static String org="Accenture";
void set(int x)
{
	System.out.println(x);
}
void display()
{
	//System.out.println(a);
}
static
{
	System.out.println(org);
}
{
	a=500;
	System.out.println(a);
}
 public static void main(String[] args)

 {
	 Simple simple=new Simple();
	 System.out.println(simple);
	 simple.set(300);
	 System.out.println(simple.a);
	 
	 
 }

}
