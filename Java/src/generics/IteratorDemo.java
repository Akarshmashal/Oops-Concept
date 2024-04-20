package generics;


//Iterator applyed to collection(List,Set)

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo 
{
	public static void main(String[] args) 
	{
		//Iterator is used to access array list elements in forward direction
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("A");
		a1.add("B");
		a1.add("C");
		a1.add("D");
		a1.add("E");
		System.out.println(a1);
		Iterator<String> it=a1.iterator();
		while(it.hasNext())//(Boolean)It will check next char present or not
		{
			String element=it.next();//next() will read the next char and moves to next character
			System.out.println(element);
			if(element.equals("C"))
			{
				it.remove();//it will delete the char
			}
		}
		System.out.println(a1);
	}
}
