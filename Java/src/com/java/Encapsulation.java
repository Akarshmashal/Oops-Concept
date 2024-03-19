package com.java;

import com.javac.Employee1;

public class Encapsulation
{
	private String email;
	private String pw;
	
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public String getPw() 
	{
		return pw;
	}
	public void setPw(String pw) 
	{
		this.pw = pw;
	}
	public static void main(String[] args)
	{
		Encapsulation e=new Encapsulation();
		e.setEmail("mashalakarsh@gmail.com");
		System.out.println(e.getEmail());
		
		e.setPw("mashal");
		System.out.println(e.getPw());
	}
}
