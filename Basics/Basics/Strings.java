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

  formated string can be use diffrent specifiers like %s, %d, etc.
  we can use with like System.out.printf("Hello %placeholde", "value for placeholder");

  Concating in strings:
   case 1: adding Char + char -> this case will converted in asssci value and sum of both will be returned
    -> 'a' + 'b' -> 195 = 'c'

    case 2: adding char + int -> this will convert char into assci value and add the int, sum of both will be returned
    -> 'a' + 3 => 100 

    case 3: adding "string" + "string" -> do simple concatination
    -> "ab" + "cd" => "abcd"

    case 4: adding "string" + "int" -> when int concat with string that int will converted through it's 
    wrapper class Integer that will toString() -> it will return string so it will like "string" + "int"
    -> a + 1 -> int to Integer -> toString(1) -> "1" hence => "a" + "1" -> a1

    general scenario -> string + any obj -> tostring() will be call on that object -> concat & return 
    the result

    hence if string + any obj => result will be string

    to use of + operator 
    + -> only the operator in java is overloaded for purpose of concating with string 
    1 it will only works for primitives
    2 to use it for concat there should be one string with any type of obj
    -> arr + arr -> not correct
    -> arr + " " + arr -> correct
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
