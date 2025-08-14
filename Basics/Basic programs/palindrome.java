package org.example.Basics;
import java.util.Scanner;

public class palindrome {

    public void numberPalindrome()
    {
        System.out.println("enter no to ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int orignal = n;
        int r, sum = 0;

        while (n>0)
        {
            r = n%10;
            sum = (sum*10)+r;
            n = n/10;
        }

        if(sum == orignal)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }
    }

    public void stringPalindrome()
    {
        System.out.println("enter string to check");
        Scanner sc = new Scanner(System.in);
        String orignal = sc.nextLine();
        int len = orignal.length();
        String reverse = "";

        for(int i = len - 1; i>=0; i--)
        {
            reverse = reverse + orignal.charAt(i);
        }

        boolean check = orignal.equals(reverse);

        if(check)
        {
            System.out.println("string is palindrome");
        }
        else
        {
            System.out.println("string is not palindrome");
        }
    }

    public static void main(String[] args) {
        palindrome p = new palindrome();
        p.numberPalindrome();
        p.stringPalindrome();
    }
}
