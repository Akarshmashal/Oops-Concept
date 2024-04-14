package logicalprograms;

import java.util.Iterator;
import java.util.Scanner;

public class ReverseArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the Size of Array");
        n = sc.nextInt();
        int[] a = new int[n];
        int i;
        System.out.println("Enter the Array Elements");
        for (i = 0; i < a.length; i++) 
        { 
            a[i] = sc.nextInt();
        }
        int j;
        int temp;
        for (i = 0, j = a.length - 1; i < j; i++, j--) 
        {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        System.out.println("Reversed Array:");
        for (i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
