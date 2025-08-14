import  java.util.Scanner;
public class ArrayBasic {

    public void numbers ()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter array size");
        int n  = sc.nextInt();

        int [] number = new int[n];

        System.out.println("enter array elements");
        // taking input to array
        for(int i=0; i<n; i++)
        {
            number[i] = sc.nextInt();
        }

        // printing the array elements
        System.out.println("printing array elements");
        for(int i : number)
        {
            System.out.println(i);
        }
    }

    public void words ()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter array size");
        int n  = sc.nextInt();

        String [] words = new String[n];

        System.out.println("enter array elements");
        // taking input to array
        for(int i=0; i<n; i++)
        {
            words[i] = sc.next();
        }

        // printing the array elements
        System.out.println("printing array elements");
        for(String i : words)
        {
            System.out.println(i);
        }
    }

    public void reverse(int [] num)
    {
        int len = num.length;

        for (int i = 0; i < len / 2; i++) {
            int t = num[i];
            num[i] = num[len - 1 - i];
            num[len - 1 - i] = t;
        }

        System.out.println("printing reverse array elements");
        for(int i : num)
        {
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        ArrayBasic a = new ArrayBasic();
        a.numbers(); // call integer array for i/o
        a.words(); // call string array for i/o

        int [] num = {1,2,3,4,5,6};
        a.reverse(num);
    }
}
