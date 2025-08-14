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

    Concept of Static Class
    -> outer class cannot be static
    -> only inner class can be static

    

*/