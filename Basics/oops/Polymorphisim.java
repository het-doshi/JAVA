/* 
  polymophism (Greek word)
  polymophism -> poly means Many + morphisim means ways to represent -> Many ways to represent

  -> occurs during inheritance 

  types of polymorphisims
  1 compile time / static polymorphisim -> occurs at compile time 
  -> achived via method overloading (early binding)

  2 runtime / Dynamic polymorphisim -> occurs at runtime 
  -> achived via method overriding (late binding)

  Reference type → Determines what methods/variables are visible at compile time.
  Object type → Determines which overridden method actually executes at runtime.
  Dynamic Method Dispatch → The mechanism Java uses to decide at runtime which version of an 
                            overridden method to call.

 summary: Dynamic Method Dispatch lets Java determine at runtime which overridden method to execute based 
          on the actual object type, while reference type controls what’s accessible at compile time.

 Note: you cannot override the method that is final (early binding)
    -> it provides internal optimization as the compiler knows which one to resolve
    -> as it not allow ovierrding only one to resolved 
  
 Reason static methods does not supports overriding
 -> Static methods belong to the class, not the object.
 -> They are resolved at compile time using the reference type, not at runtime.
 -> Overriding requires runtime polymorphism, where the actual object type decides which method to run.

 Note: 
  -> overriding depends on objects & static not depends on objects 
  -> hence static not supports overriding but support inheritance 
  -> hence static methods in main will run from all inherited class objects


*/