package sorting;

import java.util.*;

public class Customer implements Comparable<Customer> 
{
	String name;
	String city;
	int pincode;

	public Customer(String name, String city, int pincode) 
	{
		this.name = name;
		this.city = city;
		this.pincode = pincode;
	}
	@Override
	public String toString() 
	{
		return "Customer name=" + name + ", Customer city=" + city + ", Customer pincode=" + pincode ;
	}
	@Override
	public int compareTo(Customer c) 
	{
		return Integer.compare(this.pincode, c.pincode);
		//Integer i=this.pincode
		//return i.compareTo(c.pincode);
		//We can use for loop with invoking and passing value logic
	}
}
