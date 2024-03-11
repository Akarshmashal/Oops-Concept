package com.java;

public interface Run 
{
	public void test();
}
interface Run1 
{
	public void count();
}
class Display
{
	public void display()
	{
		System.out.println("Displaying");
	}
}
class Two extends Display implements Run,Run1 
{

	@Override
	public void count() 
	{
		System.out.println("Counting");		
	}

	@Override
	public void test() 
	{
		System.out.println("Testing");
	}
	public static void main(String[] args) 
	{
		Two t1=new Two();
		t1.count();
		t1.test();
		t1.display();
	}
}

