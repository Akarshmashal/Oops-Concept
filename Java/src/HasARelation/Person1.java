package HasARelation;

public class Person1
{
	String name;
	designation d;
	
	public Person1(String name) 
	{
		this.name = name;
	}
	public void selected(designation d)
	{
		System.out.println(this.name+"selected for Google ");
		d.dInfo();
	}
}
