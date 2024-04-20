package generics;

import java.util.ArrayList;
//classes Employee and Generics
//Before generics
//Example for Heterogenious Collection
public class Generics 	
{
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("AAA");
		a1.add(20); 
		a1.add(new Employee());
		a1.add(new Integer(10));
		a1.add(new StringBuffer("CCC"));
		System.out.println(a1);
	}
}
