/*
 Introduction to OOPS in JAVA!
 
 Class -> it is a group of properties and method like a template -> logical construct
 it creates a datatype which can be used to create objeccts 

 
 Object -> an object is a Instance of class -> virtual reality ocupying space in memory
 when you declare object of class it create instance of the class
 Instance -> An instance is just the technical name for “a specific object created from a class.”

 Class → the definition (blueprint)
 Object → the actual thing you created in memory
 Instance → that object, in the sense of this particular copy of the class

 Class = Blueprint
 Object = Thing you built from the blueprint
 Instance = The fact that the object is a copy of that blueprint

 Class → creates → Object → is an → Instance of class

 essesntial properties of object:

 1. state of object -> What it is: The data or values stored in the object’s properties (attributes/fields).
                       Analogy: The current condition or description of the object.

 2. idendity of object -> The unique reference that distinguishes this object from all other objects, 
                          even if their state is the same.
                          Analogy: Like a serial number or memory address.

 3. Behaviour of object -> The actions an object can perform, defined by its methods, using the object’s own state.
                           Analogy: The things it can do or operations it can perform.

 
 Refrence varialbe -> A reference variable is a variable that stores the memory address (or reference) of 
 an object, not the actual object itself.

 intance variable -> A variable that resides inside the object and holds the object’s state (data).

 How to access properties of object
 The . operator is used to access an object’s instance variables and methods through its reference variable

 How new object is created 
 Before initialization, the reference variable of an object has the default value null

 Syntax for creating object -> ClassName referenceVariable = new ConstructorOfClass();

 Work of the new Keyword:
 1. Dynamically allocates memory at runtime in the heap for the object.
 2. Calls the constructor to initialize the object.
 3. Returns the reference (memory address) of the object.
 4. Stores that reference in the reference variable.

 This Keyword:
 this is a reference variable in Java that refers to the current object — the object whose method or 
 constructor is being executed.

 this (without parentheses)
 Refers to the current object — the object whose method or constructor is currently running.
 You can use it to access instance variables, call instance methods, 
 or pass the current object as an argument.

 this(...) (with parentheses)
 Used inside a constructor to call another constructor of the same class.
 Must be the first statement in the constructor.

 final Keyword in Java

 Initialization Requirement
 A final variable must be assigned a value exactly once.
 The value can be assigned at the time of declaration, inside a constructor (for instance variables), or in an initializer block.

 For Primitive Data Types
 Once a value is assigned, it cannot be changed.
 The variable acts like a constant.

 For Non-Primitive (Object) References
 The reference cannot be changed to point to another object.
 However, the contents or state of the referenced object can still be modified, unless the object is immutable.

 Wrapper class:
 a wrapper class is a class that lets you use a primitive data type (like int, char, boolean) as an object.
 Wrapper class → A class that wraps a primitive type into an object so that functions (methods) can be used on it. 
 It provides various methods to convert, compare, and manipulate primitive values.
*/

public class OOPS1
{
    String name;
    int age;

    OOPS1 (String name, int age) {
       this.name = name;
       this.age = age;
    }

   public static void main(String [] args){
      OOPS1 o1 = new OOPS1("alex", 21);
      
      System.out.println(o1.name);
      System.out.println(o1.age);
   }
}