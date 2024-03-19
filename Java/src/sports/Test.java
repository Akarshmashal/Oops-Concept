package sports;

import java.util.Scanner;

public class Test 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Player Name");
		String name=sc.nextLine();
		System.out.println("Enter the Player Age");
		int age=sc.nextInt();
		System.out.println("Enter the Player Height");
		double height=sc.nextDouble();
		System.out.println("Enter the Player Country");
		String Country=sc.next();
		System.out.println("Enter the Player Wicket");
		int Wicket=sc.nextInt();
		System.out.println("Enter the Player Runs");
		int runs=sc.nextInt();
		Cricket c1=new Cricket(name, age, height, Country, Wicket, runs);
		c1.displayInfo();
	}
}
