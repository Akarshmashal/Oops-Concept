package com.java;

public class Login 
{
	String email;
	String password;
	long phno;
	public Login(String email, String password) 
	{
		
		this.email = email;
		this.password =password;
	}
	public Login(long phno,String password ) 
	{
		
		this.phno=phno;
		this.password = password;
	}
	public void displaydetails1()
	{
		System.out.println("email:"+email);
		System.out.println("password:"+password);
		
	}
	public void displaydetails2()
	{
		System.out.println("phno:"+phno);
		System.out.println("password:"+password);
		
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Login Using Emial");
		Login l1=new Login("akarsh123@gmail.com", "akarsh123");
		l1.displaydetails1();
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("Login Using phone number");
		Login l2=new Login(9742671446l, "akarsh123");
		l2.displaydetails2();
	}
}
