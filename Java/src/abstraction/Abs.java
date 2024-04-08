package abstraction;

import java.util.Scanner;

public class Abs
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Light");
		String light=sc.next();
		Switch sw=LightFactory.getlight(light);
		if(sw!=null)
		{
			sw.sOn();
			sw.sOff();
		}
	}
}
