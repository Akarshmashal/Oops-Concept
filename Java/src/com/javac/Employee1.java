package com.javac;

public class Employee1 
{
	String ename;
	long salary;
	String designation;
	public Employee1(String ename, long salary, String designation) 
	{
	
		this.ename = ename;
		this.salary = salary;
		this.designation = designation;
	}
	//Copy Constructor
	public Employee1(Employee1 e)
	{
		this.ename = e.ename;
		this.salary = e.salary;
		this.designation = e.designation;
	}
	public static void main(String[] args)
	{
		Employee1 e1=new Employee1("Akarsh",350000l,"Java Developer");
	
		Employee1 e2=new Employee1(e1);
		
		System.out.print(e2.ename+" "+e2.designation+" "+e2.salary);

	}
	
}
