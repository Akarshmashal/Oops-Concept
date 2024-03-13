package com.javac;

import java.util.Scanner;

public class Bank 
{
	String name;
	long accno;
	double bal;
	private double amt;
	private Object deposit;

	public Bank(String name, long accno, double bal) 
	{
		this.name = name;
		this.accno = accno;
		this.bal = bal;
	}
	void deposit(double amt)
	{
		if(amt>0)
		{
			bal=bal+amt;
			System.out.println("deposited amount is "+amt);
		}
		else 
		{
			System.out.println("Enter the valid Amt ");
		}
	}
	void withdraw(double amt)
	{
		if(amt<=bal&&amt>0)
		{
			bal=bal-amt;
			System.out.println("Withdraw amount is "+ amt);
		}
		else
		{
			System.out.println("Insuficiant amount");
		}
	}
	void checkbal()
	{
		System.out.println("Your Acconut Balance is:"+bal);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Banking App");
		Bank b1=new Bank("Akarsh",45787845487l,0);
		while (true) 
		{
			
		
		int choice;
		System.out.println("Enter the choice");
		System.out.println(" 1.Check Bal \n 2.Withdraw \n 3.Deposit \n 4.Exit");
		choice=sc.nextInt();
	    switch(choice)
	    {
	    case 1:
	    	b1.checkbal();
	    	break;

	    case 2:
	    	System.out.println("Enter the Amt To Deposit");
	    	double amt2=sc.nextDouble();	
	    	b1.deposit(amt2);
	    	b1.checkbal();
	    	break;
	    	

	    case 3:
	    	System.out.println("Enter the Amt To Withdraw");
	    	double amt1=sc.nextDouble();	
			b1.withdraw(amt1);
	    	break;
	    	
	    case 4:
	    	System.out.println("Thank You");
	    	System.exit(0);   
	    	break;
	    }
	    }
		
	}
}



