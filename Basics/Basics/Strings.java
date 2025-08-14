/*
  DataType: String -> Strings are objects of the class String

  These Strings are stored in the String pool in heap memory.

  String pool -> a special memory area inside the heap.

  Use case of String pool:
    -> identical(Same) string values are stored only once
    -> if 2 different variables have the same literal value, they point to the same object
    -> helps optimize memory usage

  Comparison of strings:
    1. ==         -> checks if reference variables are pointing to the same object
    2. .equals()  -> checks if the values of both strings are the same
*/

public class Strings {
    public static void main(String[] args) {

        String s1 = "alex";
        String s2 = "alex";
        boolean check = s1 == s2;
        System.out.println("Inside String pool using == : " + check);
        // true -> both refer to the same object in the String pool

        // Explicitly creating new String objects (even if values are the same)
        // These are stored in normal heap memory, not the String pool
        String s3 = new String("alex1");
        String s4 = new String("alex1");

        boolean check1 = s3 == s4;
        System.out.println("Inside heap memory using == : " + check1);
        // false -> different objects in heap

        boolean check2 = s3.equals(s4);
        System.out.println("Inside heap memory using .equals() : " + check2);
        // true -> values are the same
    }
}
