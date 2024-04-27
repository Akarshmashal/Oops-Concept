package map;

import java.util.HashSet;
import java.util.Set;

public class Emp 
{
	String name;
	int empno;

	public Emp(String name, int empno) 
	{
		super();
		this.name = name;
		this.empno = empno;
	}

	@Override
	public String toString() 
	{
		return "Emp [name=" + name + ", empno=" + empno + "]";
	}

	@Override
	public boolean equals(Object obj) 
	{
		Emp e=(Emp) obj;//Downcasting
		{
			if(this.empno==e.empno && this.name.equals(e.name))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}

	@Override
	public int hashCode() 
	{
		int val=this.empno+this.name.hashCode();

		return val;
	}
}



	
		

