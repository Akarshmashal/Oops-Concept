package logicalprograms;

import java.util.Scanner;

public class sumofnnaturalnumbers 
{
	public static void main(String[] args) 
	{
		int n;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Numbers");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
		
			System.out.println(sum=sum+i);
			
		}
	}
}
