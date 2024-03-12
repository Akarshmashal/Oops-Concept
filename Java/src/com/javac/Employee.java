package com.javac;

import java.util.Scanner;

class Employee 
{
    String ename;
    int empno;
    public Employee(String ename, int empno) 
    {
        this.ename = ename;
        this.empno = empno;
       
    }
        public static void main(String[] args)
    {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Emp Details");
            System.out.println("Enter the name");
           String ename= sc.next();
            System.out.println("Enter Empnpo");
            int empno=sc.nextInt();
            Employee e1=new Employee(ename , empno);  
            System.out.println(e1.ename+" "+e1.empno);   
           
}
}
}