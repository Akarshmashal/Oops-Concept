package arraylist;
import java.util.ArrayList;
import java.util.Scanner;

//public class EmployeeApp 
//{
//	public static void main(String[] args) 
//	{
//		Scanner sc=new  Scanner(System.in);
//		ArrayList<Employee> al=new ArrayList<>();
//		
//		for(int i=0;i<3;i++)
//		{
//			  System.out.println("Enter the EMpolyee Details");
//			System.out.println("Enter the Employee Id");
//			int eid = sc.nextInt();
//			sc.nextLine();
//			
//			System.out.println("Enter the Employee Name");
//			String ename=sc.nextLine();
//			
//			System.out.println("Enter the Employee Department");
//			String department=sc.nextLine();.
//			
//			System.out.println("Enter the  Department Id");
//			int did=sc.nextInt();
//			
//			System.out.println("Enter the  Department Name");
//			String dname=sc.nextLine();
//			sc.nextLine();
//			
//			System.out.println("Enter the Designation");
//			String designation=sc.nextLine();
//			
//			Employee emp=new Employee(eid, ename, department);
//			Department dep=new Department(did, dname, designation);
//			
//			for(Employee emp1 :al)
//			{
//				System.out.println(emp1);
//			}
//		}
//	}
//}

public class EmployeeApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> al = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			System.out.println("Enter the Employee Details");
			System.out.println("Enter the Employee Id");
			int eid = sc.nextInt();
			sc.nextLine();

			System.out.println("Enter the Employee Name");
			String ename = sc.nextLine();

			System.out.println("Enter the Employee Department");
			String department = sc.nextLine();

			System.out.println("Enter the Department Id");
			int did = sc.nextInt();
			sc.nextLine();

			System.out.println("Enter the Department Name");
			String dname = sc.nextLine();

			System.out.println("Enter the Designation");
			String designation = sc.nextLine();

			Employee emp = new Employee(eid, ename, department);
			Department dep = new Department(did, dname, designation);

			al.add(emp);

			for (Employee emp1 : al) {
				System.out.println(emp1);
			}
		}
	}
}