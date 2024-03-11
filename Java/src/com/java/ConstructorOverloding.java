package com.java;
public class ConstructorOverloding
{
	public ConstructorOverloding()
	{
		System.out.println("zero org Constructor");
	}
	public ConstructorOverloding(int a)
	{
		System.out.println("One parameter (int) Constructor");
	}
	public ConstructorOverloding(double b)
	{
		System.out.println("One parameter (double) Constructor");
	}
	public  ConstructorOverloding(int a, double b)
	{
		System.out.println("int="+a +" "+ "double="+b);
	}
	public static void main(String[] args) 
	{
		ConstructorOverloding c=new ConstructorOverloding();
		new ConstructorOverloding();
		new ConstructorOverloding(12);
		new ConstructorOverloding(12.0);
		new ConstructorOverloding(12,13.0);
	}

}

