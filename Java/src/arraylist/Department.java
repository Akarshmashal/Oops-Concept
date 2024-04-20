package arraylist;

public class Department 
{
	int did;
	String dname;
	String designation;
	
	public Department(int did, String dname, String designation) 
	{
		
		this.did = did;
		this.dname = dname;
		this.designation = designation;
	}

	@Override
	public String toString() 
	{
		return "Department [Deptid=" + did + ", Dname=" + dname + ", Designation=" + designation + "]";
	}
	
	
}
