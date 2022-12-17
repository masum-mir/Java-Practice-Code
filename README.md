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

        Static keyword: 
     1. The static keyword in java is used for memory management mainly. We can apply static keyword with variables, methods, blocks and nested classes. 
        * Static varibles
            # The static variable can be used to refer to the common property of all object.\
            # The static variable gets memory only once in the class area at the time of class loading.
        * Static methods
            # A static method belongs to the class rather than the object of a class.
            # A Static method can be invoked without the need for creating an instance of a class.
            # A static method can access static data member and can change the value of it.
     2. Restrictions for the static method
        * The static method can not use static data member or call non-static method directly.
        * this and super cannot be used in static context.
           
     3. Why is the Java main method static?
        ans: It is because the object is not required to call a static method. If it were a non-static method, JVM creates an object first then call main() method that                 will lead the problem if extra memory allocation.
     4. Can we execute a program without main() method?
        ans: No, one of the ways was the static block, but it was possible till JDK 1.6 Sience JDK 1.7 it is not possible to execute a Java class without the main                  method.
    
        This keyword: 
     1. 6 usage of java this keyword:
        * this keyword refers to the current object inside a method or constructor.
                class A{
                    void print(){
                        System.out.println(this);
                    }
                    public static void main(String... args){
                        A a = new A();
                        System.out.println(a);
                        a.print();
                    }
                 }
                 
          * whenever the name of instance and local variable both are same then our runtime environment JVM gets confused that which one is local variable and which                are is instance variable, to avoid this problem we should use this keyword.
                class A{
                    String name;
                    void print(String name){
                        this.name = name;
                        }
                    }
           * It is also used when we want to call the default constructor of its own class.
                   class A{
                        A() {
                            System.out.println("Hello, World");
                            }
                        A(int a){
                            this();
                            System.out.println(a);
                        }
                    }
                    
            * It also called parametrized constructor of its own class.
                    class A{
                        A() {
                            this(10);
                        }
                        A(int a) {
                            System.out.println(a);
                        }
                        public static void main(String... args) {
                            A a = new A();
                        }
             * this can be used to invoke current class method (implicity)
                    class A{
                        void m() {
                            System.out.println("hello, world");
                        }
                        void n() {
                            System.out.println("Hello");
                            this.m();
                         }
                    }
                
              * this can be used to pass as an argument in the method.   -> it is mainly used in the event handling.
                    class A {
                        void m(A obj) {
                            System.out.println("Method is invoked");
                        }
                        void p(){
                            m(this);
                        }
                     }
                            
                * this can be used to pass as argument in the constructor call.   -> it is useful if we have to use one object in multiple classes.
                    class A {
                        B ref;
                        A(B ref) {
                            this.ref = ref;
                        }
                        void display() {
                            System.out.println(ref.data);
                        }
                     }
                     
                     Class B { 
                        int data = 20;
                        B() {
                            A a1 = new A(this);
                            a1.display();
                        }
                      }
                      
                 * this keyword can be used to return current class instance.   -> return this keyword as an statement from the method.
                        syntax: 
                                return_type method_name() {
                                        return this;
                                }
                                
                         class A {
                            A getA() {
                                return this;
                            }
                            void display() {
                                System.out.println("Hello, world");
                            }
                          }
                          public static void main(String[]args) {
                            new A().getA().display();
                          }
                    
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
    
    
    
    
    
    
