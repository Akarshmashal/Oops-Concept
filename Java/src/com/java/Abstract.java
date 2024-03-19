package com.java;

//Abstract class
//You cannot create obj you have to override in concrete class to access
abstract class Bank 
{
	abstract int getrateofinterest1();

}
//Concrete class
class Citi extends Bank
{
	int getrateofinterest1()
	{
		System.out.println("Bank");
		return 8;
	}
}
//Concrete class
class Hsbc extends Bank
{
	int getrateofinterest1() 
	{
		return 10;
	}
}
class main
{
	public static void main(String [] args)
	{
		Bank b = new Citi();//type of casting
		b.getrateofinterest1();
		System.out.println(b.getrateofinterest1());
		
		Bank b1=new Hsbc();
		b1.getrateofinterest1();
		System.out.println(b1.getrateofinterest1());
		
	}
}
