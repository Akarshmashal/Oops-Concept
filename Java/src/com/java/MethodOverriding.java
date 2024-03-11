package com.java;

//developing the multiple method in same calss with differs in no of arguments datatype of argument order of arguments
public class MethodOverriding
{
	public void printnumbers(int a)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
	}
}
class Second extends MethodOverriding
{

	@Override
	public void printnumbers(int a) 
	{
		for(int i=10;i>=1;i--)
		{
			System.out.print(i+" ");
		}
		super.printnumbers(a);//it is used in sub class to access the super class properties
	}

}
class last
{
	public static void main(String[] args) {
		Second s1=new Second();
		s1.printnumbers(8);
	}
}