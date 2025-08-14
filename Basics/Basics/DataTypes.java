public class DataTypes{

    /*
     Identifier: the name of anything like package, class, variable etc

     Primitive data types: the most basic data types in a programming language, which 
     cannot be broken down into simpler data types.

     Primitive are not treated at object in java as they are stored in stack not in heap

     Note : java is pass by value, not by refrence

    */

    
    public static void main(String[] args)
    {
        System.out.println("hello");

      /*
         Auto type casting when below conintions met
         1. given datatype should be compatible
         2. when destination datatype is greater than source data type in terms of memory
            eg: int -> float, decimal -> float
         Type casting -> conversion bigger datatype into shorter data type -> explicit conversion
      */

        // type casting
        float b = 10.28f;
        int a = (int) (b);
        System.out.println("float -> int: "+b);
    }
}