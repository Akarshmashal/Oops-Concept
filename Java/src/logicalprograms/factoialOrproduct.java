package logicalprograms;

import java.util.Scanner;

public class factoialOrproduct 
{
	public static void main(String[] args)
	{
		int n;
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+n+" is: " + fact);
	}
}
