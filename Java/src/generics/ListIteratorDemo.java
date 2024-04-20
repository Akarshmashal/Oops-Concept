package generics;

//ListIterator applied for only List collection

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("A");
		a1.add("B");
		a1.add("C");
		a1.add("D");
		a1.add("E");
		a1.add("F");
		System.out.println(a1);
		System.out.println("----------------------");
		ListIterator lit=a1.listIterator();
		System.out.println("Element in forward direction");
		while(lit.hasNext())//()
		{
			System.out.println(lit.nextIndex()+"--->"+lit.next());//()
		}
		System.out.println();
		System.out.println("Element in backward direction");
		while(lit.hasPrevious())
		{
			System.out.println(lit.previousIndex()+"--->"+lit.previous());
		}
	}
}
