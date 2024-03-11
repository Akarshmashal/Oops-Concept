package com.java;

public class Goldenjavarule 
{
	public void count()
	{
		System.out.println("Hello");
	}
	
}
class MainGolden extends Goldenjavarule
{
	public void count()
	{
		System.out.println("Hiiiii");
	}
	public static void main(String[] args) 
	{
		Goldenjavarule ref=new MainGolden();
		ref.count();
	}
}
//using upcasted ref variable if you call overidden method then you always get implememtation of subclass
//if overriden done ref goes to super class takes only defination and exicutes subclass