package com.java;

public class MethodOverloding 
{
	public void method(int x, int y)
	{
		System.out.println("Integer and Integer");
	}
	public void method(double x,double y)
	{
		System.out.println("Flot and Flot");	
	}
	public void method(int x,double y)
	{
		System.out.println("Integer and Flot");	
	}
	public void method(double x,int y)
	{
		System.out.println("Flot And Integer");	
	}
	public static void main(String[] args)
	{
		MethodOverloding m1=new MethodOverloding();
		m1.method(1,1);
		m1.method(12.0, 13.0);
		m1.method(12, 53.0);
		m1.method(89.0, 54);
		m1.method(1,1);
	}

}
