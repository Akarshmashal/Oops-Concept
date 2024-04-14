package logicalprograms;

import java.util.Scanner;

public class FibonacciSeries 
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for n");
        n = sc.nextInt();
        int[] a = new int[n];
        int i;
        a[0] = 0;
        a[1] = 1;
        for (i = 2; i < a.length; i++) 
        {
            a[i] = a[i - 1] + a[i - 2]; 
        }
        for ( i= 1; i< a.length; i++) 
        { 
            System.out.println( a[i]);
        }
    }
}
