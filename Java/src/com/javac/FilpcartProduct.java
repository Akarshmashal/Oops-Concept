package com.javac;

import java.util.Scanner;

public class FilpcartProduct 
{
	String pname;
	double price;
	int qty;

	void addTocart()
	{
		System.out.println(pname + " product added to cart");
	}
	void makePayment()
	{
		System.out.println(price*qty +" payemnt has been done");
	}
}
class ShoeProduct extends FilpcartProduct
{

}
class ClothProduct extends FilpcartProduct
{

}
class Filpcartapp
{
	public static void main(String[] args) 
	{
		ShoeProduct p1=new ShoeProduct();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the shoe Name");
		p1.pname=sc.next();
		System.out.println("Enter Prize");
		p1.price=sc.nextDouble();
		System.out.println("Enter the qty");
		p1.qty=sc.nextInt();
		p1.addTocart();
		p1.makePayment();
	}
}