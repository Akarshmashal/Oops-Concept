package generics;

//Enumeration only applied to Vector,Stack,Hashtable

import java.util.*;
//import java.util.Enumeration;
//import java.util.Vector;


public class EnumerationDemo 
{
	public static void main(String[] args) 
	{
		//ArrayList<String> a1=new ArrayList<>();
		Vector a1=new Vector();
		a1.add("A");
		a1.add("B");
		a1.add("C");
		a1.add("D");
		a1.add("E");
		System.out.println(a1);
		System.out.println();
		Enumeration e=a1.elements();
		while(e.hasMoreElements())//()
		{
			System.out.println(e.nextElement());//()
		}
	
	}
}
