package logicalprograms;

import java.util.Scanner;

public class linearsearch 
{
	public static void main(String[] args) 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		n=sc.nextInt();
		int [] a=new int[n];
		int i;
		System.out.println("Enter the Array Element");
		for(i=0;i<a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		int x;
		System.out.println("Enter the search element ");
		x=sc.nextInt();
		int count=0;
		for(i=0;i<a.length-1;i++)
		{
			if(a[i]==x)
			{
				count++;
			}
		}
		System.out.println("Total Occurence "+count);
	}
}
