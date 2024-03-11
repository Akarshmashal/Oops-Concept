package com.java;

public class Watsapp 
{
	public void sendmeg()
	{
		System.out.println("Sending message");
	}
}
class Watsapp1 extends Watsapp
{
	public void audiocall()
	{
		System.out.println("Calling with audio");
	}		
}
class Watsapp2 extends Watsapp1
{
	public void videocall()
	{
		System.out.println("Calling with video");
	}


	public static void main(String[] args) 
	{
		Watsapp2 w=new Watsapp2();
		w.videocall();
		w.audiocall();
		w.sendmeg();

	}
}


