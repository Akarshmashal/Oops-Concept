package generics;

import java.util.ArrayList;

//After Generics we are begining only providing infromation to jvm 
//in this we are not performing any type safety and External Type casting
//Directly we accessing with the help of inbulit methods
public class Generics3 
{
	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<>();
		a1.add("A");
		a1.add("B");
		a1.add("C");
		a1.add("D");
		a1.add("E");
		
		//  a1.add(new Integer(10));
		//a1.add(10);we cannot add integer vales in string generics
		System.out.println(a1);
		
		System.out.println(a1.get(2));
	}
}
