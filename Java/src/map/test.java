package map;

import java.util.HashSet;
import java.util.Set;

public class test 
{
	public static void main(String[] args)
	{
		Emp e1=new Emp("Dinga", 420);
		Emp e2=new Emp("Dinga", 421);
		Emp e3=new Emp("Dingi", 420);
		Emp e4=new Emp("Dinga", 420);
		
		
		Set<Emp> s=new HashSet<>();
		s.add(e1);
		s.add(e2);
		s.add(e3);
		s.add(e4);
		
		System.out.println(s);
	}
}

