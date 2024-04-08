package logicalprograms;

import java.util.Scanner;

public class palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n;
		n=sc.nextInt();
		int s=n;
		int r;
		int b=0;
		while(n!=0)
		{
			r=n % 10;//Extract the last digit
			b=b*10;//for multiplication
			b=b+r;//add to reminder
			n=n/10;//Remove the last digit from the original number
		}
		if(s==b)
		{
			System.out.println(s +" Number is Palindrome");
		}
		else 
		{
			System.out.println(s +" Number is Not Palindrome");
		}
	}
}
