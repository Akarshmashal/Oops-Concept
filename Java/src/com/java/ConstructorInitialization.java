package com.java;

public class ConstructorInitialization
{
	String name;
	int id;
	double sal;

	public ConstructorInitialization(String name, int id, double sal)
	{
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
	public void showempdetails()
	{
		System.out.println(name);   
		System.out.println(id);   
		System.out.println(sal);   
	}
	
	
	public static void main(String [] args)
	{
		ConstructorInitialization e1=new ConstructorInitialization("akarsh", 500, 360000);
		e1.showempdetails();
		
		System.out.println("==================");

		ConstructorInitialization e2=new ConstructorInitialization("Ankit", 600, 360000);
		e2.showempdetails();

	}
}
