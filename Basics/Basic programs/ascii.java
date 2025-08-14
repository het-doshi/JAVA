package org.example.Basics;

public class ascii {

    public static void main(String[] args) {
      // ascii values a -> 97 A -> 65

        int alpha = 64;

        for(int i = 0; i<5; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                int character = alpha += 1;
                char ch = (char) character;
                System.out.print(ch+" ");
            }

            alpha = 64;

            System.out.println();
        }
    }
}
