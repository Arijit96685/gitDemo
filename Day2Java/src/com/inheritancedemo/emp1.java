package com.inheritancedemo;

public interface emp1 extends ProjectLead

{
default void id(int empid)
{
	System.out.println(empid);
}
static String org(String name)
{
	return name;
}
public void project(int project_id);
}
