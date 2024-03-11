package com.java;

public class Parent 
{
	public void M1() {
        System.out.println("Parent Class Method");
    }
}

class Child1 extends Parent {
    public void M2() {
        System.out.println("Child1 Class Method");
    }
}

class Child2 extends Parent {
    public void M3() {
        System.out.println("Child2 Class Method");
    }
}

class HybridInheritance {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        c1.M1();
        c1.M2();

        Child2 c2 = new Child2();
        c2.M1();
        c2.M3();
    }
}
