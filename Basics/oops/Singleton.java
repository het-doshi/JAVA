/*
 
 Singleton -> only once instance of class is created

  Fact: 
  -> A class having a private constructor does NOT stop you from declaring a reference variable of its 
     type in another class.
  -> eg like     
     privateClass                                        anotherclass 
    {                                                    {   
       privateclass refrence -> class variable              privateclass refrence -> Valid
    }                                                    }

 Note: but this private class has it's constructor private another class cannot able to create OBJ

 step 1 -> make the constructor private so it can be called via that class only 
 step 2 ->  Declare one class variable as private 
 step 3 -> create one static which will check if there is object created it will and return that, 
           if object is created already return that only  

 Singleton means -> One object + Controlled access to that single instance.

 */

public class Singleton 
{
    // step 1
    private Singleton()
    {

    }

    // step 2 
    private static Singleton instance; 
    // this ensures Controlled access to that single instance
    // Singleton.instance = null;   some other class cannot controll or modify the instance of singleton

    // step 3 -> creating a static method which will check & return instance 
    public static Singleton getInstance()
    {
        if(instance == null) 
        {
            instance = new Singleton();
        }

        return instance;
    } 
}