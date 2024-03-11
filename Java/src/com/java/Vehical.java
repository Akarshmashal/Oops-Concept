package com.java;
//Abstract method 
abstract class MotorBike 
{
	public abstract void brake();
}

class MountainBike extends MotorBike 
{
	public void brake() 
	{
		System.out.println("MountainBike Brake");
	}
}

class SportsBike extends MotorBike 
{
	@Override
	public void brake() {
		System.out.println("SportsBike Brake");
	}
}

class Main 
{
	public static void main(String[] args) 
	{
		MotorBike m1 = new MountainBike();
		m1.brake();
		MotorBike s1 = new SportsBike();
		s1.brake();
	}
}