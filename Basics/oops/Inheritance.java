/* 
 inheritence --->  Inheritance in OOP allows a child class to reuse methods and fields of a parent class,  
 which reduces redundancy For example, a User class can define shared methods like login(), logout(), 
 and resetPassword(). Subclasses like Customer and Admin can extend User to inherit these functionalities 
 while adding their own specific behaviors

 parrent class -> cannot acesss the properties of child class

 super keyword: -> it will exactly point to parrent (only pointed one level up)

 1. Calling the constructor of parrent class
 -> Super(var..) -> means calling the constructor of parrent class 
 -> use to intialize variables or properties of parrent class
 Note: If you don’t explicitly call super(...), the compiler automatically inserts super() only if the 
       parent has a no-argument constructor.
       If the parent only has parameterized constructors, you must explicitly call one of them.

 2. Calling porperties or method of super class 
 -> super.property 
 -> super.method()
 child class cannot able to access private the member of parrent class 

 Reference type → Decides what you can access (checked at compile time).
 Object type → Decides what actually runs (decided at runtime for overridden methods).

 Each classes are inheritated from OBJECT Class

 Types of Inheritance
 1 Single inheritance (single level inheritance)
 2 Multilevel inheritance inheritance A extends B extennds C
 
 3 Multiple inheritance : when one class extends two or more classes like A Extends B and C both
   -> suppose B and C contain some same property like Num = 10 in B and num = 20 in C
   -> now when child class access it like A.num which one to pick that's the confusion
   -> the Reason java does not supports multiple inhertance

 4 Hirerchical inheritance: when one class is inherited by many classes (work like Single level)
 -> A is inherited by B and C ; like -> B extends A, C extends A

 5 Hybrid inheritance: combination of multiple & single inheritance -> not Supported like Multiple

*/

// refer to OOPS4.java
public class Inheritance
{
   Inheritance()
   {
     System.out.println("parrent class default constructor called");
   }
}