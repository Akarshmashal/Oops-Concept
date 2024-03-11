package com.java;
//Hierarchical Inheritance
public class Account
{
	String name;
	long accno;
	double bal;

	public void deposit(double amt)
	{
		bal=bal+amt;
		System.out.println("deposited amount is "+amt);
	}
	public void withdraw(double amt)
	{
		if(bal>=amt)
		{
			System.out.println("Withdraw amount is "+ amt);
		}
		else
		{
			System.out.println("Insuficiant amount");
		}	
	}
}
class saving extends Account
{
	double roi;
	public void calculateroi(double amt)
	{
		bal=bal*roi;
		System.out.println("");
	}
}
class Current extends Account
{
	double min_bal;
	public void showminbal()
	{
	System.out.println("Minimum Balance is "+min_bal);	
	}
}
class acc
{
	public static void main(String[] args) 
	{
		Current c=new Current();
		c.showminbal();
		c.deposit(200000);
		c.withdraw(5000);
		saving s=new saving();
		s.deposit(300000);
		c.showminbal();
	
	}
}
