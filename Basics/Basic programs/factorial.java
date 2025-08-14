import java.util.Scanner;

public class factorial {

    public  void fact()
    {
        System.out.println("enter no");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1;

        for(int i = 1; i<=n; i++)
        {
            sum = sum * i;
        }

        System.out.println("factorial of "+n+" is "+sum);
    }

    public static void main(String[] args)
    {
        factorial f = new factorial();
        f.fact();
    }
}
