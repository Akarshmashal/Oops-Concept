package logicalprograms;

import java.util.Scanner;

public class primenumber 
{
	public static void main(String[] args) 
	{
		int i;
		int n;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values");	
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(n +" Prime Number");
		}
		else
		{
			System.out.println(n +" Not Prime Number");
		}
	}
}
