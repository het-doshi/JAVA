import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter no 1");
        int x = sc.nextInt();
        System.out.println("enter no 2");
        int y = sc.nextInt();
        int gcd = 0;

        int max = Math.max(x,y);

        for(int i = 1; i<=max; i++)
        {
            if(x%i == 0 && y%i ==0)
            {
                gcd = i;
            }
        }

        System.out.println("gcd is "+gcd);

    }
}
