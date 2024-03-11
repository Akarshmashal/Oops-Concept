package com.java;
// just like method overlodaing binding method declaration to method defination by compiler at compile time based on argument is called mo
public class CompileTimePolymorphism 
{
	    public static void main(String[] args) {
	        System.out.println(add(2, 3)); // Output: 5
	        System.out.println(add(2, 3, 4)); // Output: 1
	    }

	    public static int add(int a, int b) {
	        return a + b;
	    }

	    public static int add(int a, int b, int c) {
	        return a + b - c;
	    }
	}
