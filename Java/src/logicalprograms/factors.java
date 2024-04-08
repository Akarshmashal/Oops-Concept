package logicalprograms;

import java.util.Scanner;
//Factors program
public class factors
{
	public static void main(String[] args) 
	{
		int i;
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			if(n % i==0)
			{
				System.out.println(i+" ");
			}
		}
	}
}
