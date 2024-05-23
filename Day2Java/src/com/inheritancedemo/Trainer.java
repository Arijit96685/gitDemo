package com.inheritancedemo;

public class Trainer extends Organisation
{
	public Trainer()
	{
		super(500);
		System.out.println("Training on java");
	}
public void training(String stream)
{
	System.out.println(stream);
}
}
