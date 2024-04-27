package sorting;

import java.util.*;

public class Sort 
{
	public static void main(String[] args) 
	{
		List<Customer> lt = new ArrayList<Customer>();

		Customer c1 = new Customer("Akarsh", "vijayapur", 123);
		Customer c2 = new Customer("Nitin", "Gulbarga", 245);
		Customer c3 = new Customer("pratham", "Gangapur", 865);
		Customer c4 = new Customer("shakti", "Bengalore", 222);
		
		lt.add(c1);
		lt.add(c2);
		lt.add(c3);
		lt.add(c4);

		// Sorting the list by pincode
		Collections.sort(lt);

		System.out.println(lt);
	}
}
