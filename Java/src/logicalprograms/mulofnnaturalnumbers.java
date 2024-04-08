package logicalprograms;

import java.util.Scanner;

public class mulofnnaturalnumbers 
{
	public static void main(String[] args) 
	{
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Numbers");
		int y;
		y=sc.nextInt();
		int ans=1;
		for(i=1;i<=y;i++)
		{
			ans=ans * i;
		}
		System.out.println("Multiplication of the given Number is: "+ ans);
	}
	
}
