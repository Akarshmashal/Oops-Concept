package com.javac;

public class Employee2 
{
	private static int EmployeeId = 1;
	private int employeeId;
	private String name;
	private int age;
	private double salary;

	public Employee2(String name) 
	{
		this.employeeId = EmployeeId++;
		this.name = name;
//		this.age = age;
//		this.salary = salary;
	}

	public int getEmployeeId()
	{
		return employeeId++;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		if (age <= 0 && age >= 120) 
		{
			System.out.println("Age must be between 0 and 120.");
		}
		else
		{
			this.age = age;

		}
	}

	public double getSalary() 
	{
		return salary;
	}

	public void setSalary(double salary)
	{
		if (salary >= 0)
		{
			this.salary = salary;
		}
		else
		{
			
			System.out.println("Salary must be non-negative.");

		}
	}

	public void displayInfo() {
		System.out.println("Employee ID: " + employeeId);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		//System.out.println("Salary: " + salary);
	}


	public static void main(String [] args)
	{
		Employee2 e2=new Employee2("Akarsh");
		e2.setAge(25);
		e2.setSalary(-500);
		e2.displayInfo();
		Employee2 e3=new Employee2("Akarsh");
		e3.setAge(25);
		e3.setSalary(-500);
		e3.displayInfo();
		Employee2 e4=new Employee2("Akarsh");
		e4.setAge(25);
		e4.setSalary(-500);
		e4.displayInfo();
//		Employee2 e3=new Employee2("Akarsh", 24, 50000.0);
//		e3.displayInfo();
//		Employee2 e4=new Employee2("Akarsh", 23, 500000.0);
//		e4.displayInfo();
//		Employee2 e5=new Employee2("Akarsh", 22, 450000.0);
//		e5.displayInfo();
	}

}

/*which means that it is a class-level variable rather than an instance-level variable. 
 This means that there is only one copy of the EmployeeId variable that is shared among all instances of the Employee2 class.
The reason why EmployeeId is declared as static is to ensure that each new employee instance is assigned a unique employee id. 
If EmployeeId were not declared as static, then each instance would have its own copy of the variable, 
and the employee id would not be unique across all instances.*/

