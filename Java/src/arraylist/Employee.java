package arraylist;

public class Employee 
{
	int eid;
	String ename;
	String department;
	
	public Employee(int eid, String ename, String department) 
	{
		
		this.eid = eid;
		this.ename = ename;
		this.department = department;
	}

	@Override
	public String toString() 
	{
		return "Employee [Eid=" + eid + ", Ename=" + ename + ", department=" + department + "]";
	}
	
	
	
}
