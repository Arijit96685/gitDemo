package com.inheritancedemo;

public class Participant extends Trainer
{
	public Participant() {
		super();
		System.out.println("learning java inheritance");
	}
void learning(String stream1,String stream2)
{
	System.out.println(stream1+" "+stream2);
}
public static void main(String[] args) {
	Participant parti=new Participant();
	parti.learning("java", "python");
	parti.training("java");
}
}
