package Relation;

public class Dept 
{
	String name;

	public Dept(String name) 
	{
		this.name = name;
	}
	void opens()
	{
		System.out.println(this.name+"Dept opens at 8 clock");
	}
	
}
class Company
{
	String name;
	Dept d;
	public Company(String name, Dept d) 
	{
		this.name = name;
		this.d =new Dept("Softwar Development ");
	}
	void open()
	{
		System.out.println(this.name+"Comapny Open at 7 clock");
		d.opens();
	}
	
}
class test
{
	public static void main(String[] args) 
	{
		Company c=new Company("Oracle ", null);
		c.open();
	}
}
