package logicalprograms;

import java.util.Scanner;

public class armstrongnumber 
{
	public static void main(String[] args)
	{
		int num;//for storage 
		int sum;
		int n;
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		num=sc.nextInt();
		sum = 0;
		i=num;//This line stores the original value of num in the variable i for later comparison.
		while(num!=0)
		{
			n=num%10;
			num=num/10;
			sum=sum+(n*n*n);
			
		}
		if(sum==i)
		{
			System.out.println(i +" Is Arm strong number");
		}
		else
		{
			System.out.println(i +" Is Not Arm strong number");

		}
	}
}
