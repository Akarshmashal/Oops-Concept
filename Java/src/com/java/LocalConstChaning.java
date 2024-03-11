package com.java;

public class LocalConstChaning 
{
	public LocalConstChaning()
	{
		System.out.println("zero org Constructor");
	}
	public LocalConstChaning(int a)
	{
		this();
		System.out.println("One parameter (int) Constructor");
	}
	public LocalConstChaning(double b)
	{
		this(1);
		System.out.println("One parameter (double) Constructor");
	}
	public  LocalConstChaning(int a, double b)
	{
		this(12.0);
		System.out.println("int="+a +" "+ "double="+b);
	}
	public static void main(String[] args) {
		new LocalConstChaning(12, 52.0);
	}
}
