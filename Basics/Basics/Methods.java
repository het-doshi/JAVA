/*
 
 Functions in java are Known as Methods 

 Basic Syntax
 access modifier return type funcName () 
 {
     Func Body 
     return statement; -> as function hits this return statement that means execution of function is over 
 }

 Note: 
 Pass-by-value → copy of value is given to method.
 Pass-by-reference → actual variable is given (changes affect caller).
 Java → always pass-by-value; 
 for primitive, copy of that value is passed
 for objects, value is the reference of that object

 Scopes in JAVA
 Function Scope -> you can access and modify the values only under the function scope
 Block scope -> you can access the value outside & modify orignal value But you cannot reassign the value
                if declare the value in block scope you cannot access it outside 
                but you can intialize it outside the block


 String in java
 Once a String object is created, its value in memory cannot be changed.
 Any “change” you make to a String actually creates a new String object — the old one stays untouched.

 Shadowing:
  When a variable in a lower scope has the same name as a variable in a higher scope, 
  the lower scope variable overrides (shadows) the higher scope variable within that scope.

  Note: Scope begins when the variable is initialized, so you cannot access it between
        declaration and initialization.

 variable length arguments -> use it when we dont know how many no of arguments will be passed
 syntax datatype ...var name -> internally this passed arguemnts will treated like array
 Note: variable length agruments always last in the list of arguments 
 Note: it cannot be passed as empty in overloading, it will Ambiguity error 

 Function Overlaoding happens at compile time
 it happens when there are two or more function with the same name but different parameter lists.
 the cases for overloading  
 -> the no of arguments 
 -> data type of arguments
 -> postion of arguments

 */

 import java.util.Arrays;

public class Methods {

    static void func(int ...n)
    {
        System.out.println(Arrays.toString(n));
    }

    public static void main(String [] args)
    {
        func(1,2,3,4,5,6,7,8);
    }
}