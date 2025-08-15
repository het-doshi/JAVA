/* 
 
  Static 
   -> inside a static method you cannot access non-static methods or variables
   -> stattic methods can only static data 
   -> static methods are not dependent on objects 
   -> cannot access non-static stuff without refrencing thier intances in static context 

   -> which is not static can belong to an object
   -> inside a non-static method you can access static methods and variables

   Initialization of static variables 
   ->  intialize static variables under static block
   -> static int a;
      static {
          a = 10;
      }

    -> static block runs only once when the class is loaded
    -> after initialization of static variables can be modified in static context

    -> static variables and methods are resolved during compile because they not dependent on Object

    Concept of Static Class
    -> outer class cannot be static
    -> only inner class can be static

    An outside (top-level) class cannot be static because: static means “belongs to an outer thing, 
    not an instance”.

    A top-level class has no outer class to belong to. So static has no meaning there — 
    it’s only valid for members of another class.


*/

public class OOPS2
{

  public static void main(String[] args)
  {
      StringBuilder sb = new StringBuilder("Alex ");
      sb.append("Doe");
      System.out.println(sb.indexOf("o"));
      
  }

}