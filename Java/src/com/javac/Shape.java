package com.javac;

import java.util.Scanner;

public interface Shape 
{
	double area();
	double perimeter();
}

class Square implements Shape
{
	double side;

	public Square(double side)
	{

		this.side = side;
	}

	@Override
	public double area() 
	{
		double a=side*side;
		return a;

	}

	@Override
	public double perimeter() 
	{
		double p=4*side;
		return p;

	}	
}

class Rectangle implements Shape
{
	double length;
	double width;

	public Rectangle(double length, double width) 
	{
		this.length = length;
		this.width = width;
	}

	@Override
	public double area() 
	{
		double a=length*width;
		return a;
	}

	@Override
	public double perimeter()
	{
		double p=2*(length+width);
		return p;

	}

}

class Testint
{
	public static void main(String[] args)
	{
		Shape s=new Square(10);
		System.out.println("----Square-----");
		System.out.println("Area of square:"+s.area());
		System.out.println("Perimeter of Sqaure:"+s.perimeter());
		
		Shape s1=new Rectangle(4, 6);
		System.out.println("----Rectangle-----");
		System.out.println("Area of Rectangle:"+s1.area());
		System.out.println("Perimeter of Rectangle:"+s1.perimeter());
}
}
