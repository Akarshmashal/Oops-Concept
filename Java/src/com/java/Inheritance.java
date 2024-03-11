package com.java;

public class Inheritance
{
	public void test()
	{
		System.out.println("testing");
	}

	public void count()
	{
		System.out.println("counting");
	}
}
class Sample extends Inheritance
{
	public void display()
	{
		System.out.println("Displaying");
	}


	public static void main(String[] args)
	{
		Sample d = new Sample();
		d.display();
		d.test();
		d.count();
	}
}
