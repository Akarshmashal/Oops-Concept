package logicalprograms;

import java.util.Scanner;

public class reversethenumber 
{
	public static void main(String[] args)
	{
		int n;
		int r;
		int b=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		n=sc.nextInt();
		while(n!=0)
		{
			r=n % 10;//Extract the last digit
			b=b*10;//for multiplication
			b=b+r;//add to reminder
			n=n/10;//Remove the last digit from the original number
		}
		System.out.println("Reverse Number is: "+b);
	}
}
