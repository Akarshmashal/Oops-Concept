package logicalprograms;

import java.util.Scanner;

//any value of i is completly divide the given num form A and B
//lcm = a*b/hcf
public class hcfanalcm
{
	public static void main(String[] args) 
	{
		int i;
		int hcf=0;
		Scanner sc=new Scanner(System.in);
		int a = 0;
		int b = 0;
		System.out.println("Enter the values for a");
		a=sc.nextInt();
		System.out.println("Enter the values for b");
		b=sc.nextInt();
		for(i=1;i<=a;i++)
		{
			if(a % i==0 && b % i==0)
			{
				hcf=i;
			}
		}
		int lcm=0;
		lcm=(a*b)/hcf;//formula for LCM
		System.out.println("Hcf of given number is: "+hcf);
		System.out.println("Lcm of given number is: "+lcm);
	}
}
