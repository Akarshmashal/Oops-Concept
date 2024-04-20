package generics;

import java.util.ArrayList;

public class Generics2 
{
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("A");
		a1.add("B");
		a1.add("C");
		a1.add("D");
		a1.add(10);
		a1.add(20);
		System.out.println(a1);
		//String str=a1.get(2);//To over come this error we have to do explicitly perfrom downcasting
		String str=(String) a1.get(2);
		int a=(int) a1.get(4);
		System.out.println(str);
		System.out.println(a);
	}
}
