package com.javac;
//Method overiding
public class Vehical 
{
	void start()
	{
		System.out.println("Vehical Start");
	}
	void move()
	{
		System.out.println("Vehical Moveig");
	}
}
class Bike extends Vehical
{
	@Override
	void start() 
	{
		System.out.println("Bike Start");
	}
		
}
class Car extends Vehical
{

	@Override
	void start() 
	{
		System.out.println("Car Starts");
	}
	public static void main(String[] args)
	{
		Car c=new Car();
		c.start();
		
	}
}

