package com.javac;

public class Emp 
{
	String name;
	int Empno;
	public Emp() 
	{
		name="Akarsh";
		Empno=123;
	}
	public static void main(String[] args) 
	{
		Emp e1=new Emp();
		System.out.println(e1.name+" "+e1.Empno);
		
		Emp e2=new Emp();
		System.out.println(e2.name+" "+e2.Empno);
	}
}
