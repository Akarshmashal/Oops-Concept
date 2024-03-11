package com.java;
//Run time polymorphism is just like method overriding Binding method declaration to method defination by the jvm bades on objects is called RTP
class Animal 
{
	public void move() 
	{
		System.out.println("Animals can move");
	}
}

class Dog extends Animal 
{
	public void move() 
	{
		System.out.println("Dogs can walk and run");
	}

	public static void main(String args[]) 
	{
		Animal a = new Animal(); // Animal reference and object
		Animal b = new Dog(); // Animal reference but Dog object

		a.move(); // runs the method in Animal class
		b.move(); // runs the method in Dog class
	}
}
