# Java-Practice-Code
    
    Object: 
  1. An object has three characteristic: 
    * State
    * Behavior
    * Identity

  2. Object defination:
      * An object is real-word entity.
      * An object is a runtime entity.
      * The object is an entity which has state and behavior.
      * The object is an instance of a class.

  Class:
      A class is a group of object.
  1. A class in java can contain:
      * Fields
      * Methods
      * Constructors
      * Blocks
      * Nested class and interface

  2. 3 ways to initialize object
    * by reference variable
    * by method
    * by constructor
    
  3. What are the different ways to create an object in java ?
       * By new keyword
       * By newInsteance() method
       * By clone() method
       * By deserialization
       * By factory method etc..

  4. Anonymous object
      Anonymous simply means nameless. An object which has no reference is known as an anonymous object.
          eg. new Calculation().
          
  Constructor: 
  1. Constructor is called when an instance of the class is created. It is a special type of method which is used to initialize the object.
        Every time an object is created using the new() keyword,  at least one constructor is called. It calls a default constructor if there is no constructor         available in the class. In sych case, Java complier provides a default constructor by default.
   2. There are two rules defined for the constructor.
        * Constructor name must be same as its class name.
        * A Constructor must have no explicit return type.
        * A java contructor cannot be abstract, static, final and syschronized
   3. Constructor are two types of constructors in java.
        * Default constructor (no-arg constructor)
        * Parameterized constructor

    4. What is the purpose of a default constructor ?
        ans: The default constructor is used to provide the default values to the object like 0, null, etc.. depending on the type.
    
    5. Whey use the parameterized constructor ?
        ans: The parameterized cosntructor is used to provide different values to distinct objects. However,you can provide the same values also.
    6. Copy Constructor: 
        ans: However, we can copy the values from one object to another like copy constructor in c++.
        # There are many ways to copy one object to another object in java. They are: 
            * By constructor
            * By assigning the values of one object into another
            * By clone() method of object class
            
     7. Does constructor return any value ?
        ans: yes, it is current class instance(you cannot use return type yet it returns a value).
     8. Can constructor perform other tasks instead of initialization ?
        ans: yes, like object creation, starting a thread, calling a method etc. you can perform any operation in the constructor as you perform in the method.
     9. What is the purpose of constructor class ?
        ans: Java provides a constructor class which can be used to get the internal information of a constructor in the class. It is found in the                          java.lang.reglect package.
