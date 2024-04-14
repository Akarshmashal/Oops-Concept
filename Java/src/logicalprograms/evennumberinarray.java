package logicalprograms;

import java.util.Scanner;

public class evennumberinarray 
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		n=sc.nextInt();
		int [] a=new int[n];
		int i;
		System.out.println("Enter the Element");
		for(i=0;i<a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("Even Numbers Are "+a[i]);
			}
		}
		
	}
}
