// refer singleton.java 
public class OOPS3
{
    public static void main(String [] args)
    {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        // as only once instance exist both obj should point to same 
        System.out.println(obj1 == obj2);
        // hence true it's proved only one object is exist
    }
}