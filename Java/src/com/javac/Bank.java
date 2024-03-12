package com.javac;

public class Bank 
{
    String name;
    long accno;
    double bal;
    public Bank(String name, long accno, double bal) 
    {
        this.name = name;
        this.accno = accno;
        this.bal = bal;
    }
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
	public static void main(String[] args) 
	{
		Bank b1=new Bank("Akarsh",45787845487l,25000.20);
        b1.deposit(50000);
        b1.withdraw(5000);      
	}
}
  
      

