package com.javac;

public class Vegitable 
{
	String name;
	String color;
	double qty;
	void wash()
	{
		System.out.println("Washing");
	}
	void chop()
	{
		System.out.println("Chopping");
	}
}
class Carrot extends Vegitable
{
	String type;
	void prepareHalwa()
	{
		System.out.println("prepare Halwa");
	}
}
class Chilly extends Vegitable
{
	String Size;
	void prepareBajji()
	{
		System.out.println("prepared Bajji");
	}
}
class TestVeg
{
	public static void main(String[] args) 
	{
		Vegitable v=new Vegitable();
		v.name="mix-veg";
		v.color="Red";
		//v.type;
		System.out.println("Vegitable Class");
		System.out.println(v.name);
		System.out.println(v.color);
		Carrot c=new Carrot();
		System.out.println("Carrot Class");
		c.name="ooty Carrot";
		c.qty=2.5;
		c.type="Sweet Carrot";
		System.out.println(c.name);
		System.out.println(c.qty);
		System.out.println(c.type);
		System.out.println(c);
	}
}
