package org.example.Basics;

import java.util.Scanner;

public class pattern {

    public void hashPattern()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no");
        int n = sc.nextInt();

        for(int row = n; row>=1; row--)
        {
            for(int col=0; col<row; col++)
            {

                if((col + row)%2==0)
                {
                    System.out.print("#__");
                }
                else
                {
                    System.out.print("__*");
                }
            }
            System.out.println();
        }
    }

    public  void  hashpattern2()
    {
        int n = 5;
        int i,j = n -1;

        for (i = n; i>=1; i--) {

            for(j = n-i;j<=1;j++)
            {
                System.out.print("--");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        pattern p = new pattern();
       // p.hashPattern();
        p.hashpattern2();
    }
}
