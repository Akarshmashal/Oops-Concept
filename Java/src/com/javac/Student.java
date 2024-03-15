package com.javac;

public class Student 
{
	String name;
	String pid;
	double mockrating;
	public Student(String name, String pid, double mockrating) 
	{
		this(name,pid);
		this.pid = pid;
	}
	public Student(String name, String pid) 
	{
		this(name);
		this.pid = pid;
	}
	public Student(String name) 
	{
		this.name = name;
	}
	public static void main(String[] args) 
	{
		Student s1=new Student("Akarsh");	
	}
}
