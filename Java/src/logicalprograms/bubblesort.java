package logicalprograms;

import java.util.Scanner;

public class bubblesort 
{
	 public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);
	        int n;
	        System.out.println("Enter the size");
	        n = sc.nextInt();
	        int[] a = new int[n];
	        int i;
	        System.out.println("Enter the elements");
	        for (i = 0; i < a.length; i++) 
	        {
	            a[i] = sc.nextInt();
	        }
	        int j;
	        for (j = 0; j < a.length - 1; j++) 
	        {
	            for (i = 0; i < a.length - 1; i++) 
	            {
	                if (a[i] > a[i + 1]) 
	                {
	                    
	                	a[i]=a[i]+a[i+1];
						a[i+1]=a[i]-a[i+1];
						a[i]=a[i]-a[i+1];
	                }
	            }
	           
	            for (i = 0; i < a.length; i++) 
	            {
	                System.out.print(a[i] + " ");
	            }
	            System.out.println();
	        }
	    }
	}

