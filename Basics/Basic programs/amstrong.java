import java.util.Scanner;

public class amstrong {

    public void checkAmstrong()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no to check");
        int n = sc.nextInt();
        int orignal = n;
        int sum = 0;

        while(n>0)
        {
            int r = n%10;
            sum = (r*r*r)+sum;
            n = n/10;
        }

        System.out.println(sum);

        if(orignal == sum)
        {
            System.out.println("no is amstrong");
        }
        else
        {
            System.out.println("no is not amstrong");
        }
    }
    public static void main(String[] args)
    {
          amstrong a = new amstrong();
          a.checkAmstrong();
    }
}
