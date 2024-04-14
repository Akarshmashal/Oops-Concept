package logicalprograms;

import java.util.Scanner;

public class ArrayPalindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements: ");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        int i, j;
        for (i = 0, j = a.length - 1; i < j; i++, j--) 
        {
            if (a[i] != a[j])
            {
                System.out.println("Not a Palindrome");
                return;
            }
        }
        System.out.println("Is a palindrome");
    }
}