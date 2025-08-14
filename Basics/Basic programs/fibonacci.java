package org.example.Basics;

import java.util.Scanner;

public class fibonacci {

    public void fib()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] ans = new int[n];

            if(n>0)
            {
               ans[0] = 0;
            }

            if (n>1)
            {
                ans[1] = 1;
            }

            for(int i = 2; i<n; i++)
            {
                ans[i] = ans[i-1] + ans[i-2];
            }

            for(int j : ans)
            {
                System.out.println(j);
            }
    }
    public static void main (String [] args)
    {
        fibonacci fb = new fibonacci();
        fb.fib();
    }
}
