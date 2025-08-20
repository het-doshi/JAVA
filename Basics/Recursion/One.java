public class One {

    public static void message1()
    {
        message2();
        System.out.println("inside message1");
    }

    public static void message2()
    {
        message3();
        System.out.println("inside message2");  
    }

    public static void message3()
    {
        message4();
        System.out.println("inside message3");
    }

    public static void message4()
    {
        message5();
        System.out.println("inside message4");
    }

    public static void message5()
    {
        System.out.println("inside message5");
    }

    public static void main(String[] args)
    {
        message1();
    }
}