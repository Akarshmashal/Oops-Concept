package logicalprograms;

import java.util.Scanner;

public class BinarySearch
{
    public static void main(String[] args) 
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        n = sc.nextInt();
        int[] a = new int[n];
        int i;
        System.out.println("Enter the Element ");
        for (i = 0; i < a.length; i++)
        { // Fixed loop condition
            a[i] = sc.nextInt();
        }
        int x;
        System.out.println("Enter the Search Element");
        x = sc.nextInt();
        int r = a.length - 1;
        int l = 0;
        int mid = 0;
        while (l <= r) {
            mid = (l + r) / 2;
            if (x == a[mid]) 
            {
                System.out.println("Element found");
                return;
            }
            if (x > a[mid])
            {
                l = mid + 1;
            } 
            else 
            {
                r = mid - 1;
            }
        }
        System.out.println("Element Not found");
    }
}

