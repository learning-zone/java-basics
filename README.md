## Core-Java Interview Questions

*Click <img src="https://github.com/learning-zone/java-interview-questions/blob/master/assets/star.png" width="18" height="18" align="absmiddle" title="Star" /> if you like the project. Pull Request are highly appreciated.*


### Table of Contents

* [JDBC Interview Questions](JDBC-questions.md)
* [Collections Interview Questions](collections-questions.md)
* [Java Programs](java-programs.md)
* [Java String Methods](java-string-methods.md)
* [JSP Interview Questions](jsp-questions.md)
* [Multithreading Interview Questions](multithreading-questions.md)
* [Servlets Interview Questions](servlets-questions.md)


#### Q. What is difference between Heap and Stack Memory in java?
**Java Heap Space**  

Java Heap space is used by java runtime to allocate memory to Objects and JRE classes. Whenever we create any object, it’s always created in the Heap space.

Garbage Collection runs on the heap memory to free the memory used by objects that doesn’t have any reference. Any object created in the heap space has global access and can be referenced from anywhere of the application.

**Java Stack Memory**  

Stack in java is a section of memory which contains methods, local variables and reference variables. Local variables are created in the stack.

Stack memory is always referenced in LIFO (Last-In-First-Out) order. Whenever a method is invoked, a new block is created in the stack memory for the method to hold local primitive values and reference to other objects in the method.

As soon as method ends, the block becomes unused and become available for next method. Stack memory size is very less compared to Heap memory.

**Difference**  


|Parameter	       |Stack Memory	               |Heap Space                       |
|------------------|-----------------------------|-----------------------------------|
|Application	   |Stack is used in parts, one at a time during execution of a thread|	The entire application uses Heap space during runtime|
|Size	           |Stack has size limits depending upon OS and is usually smaller then Heap|There is no size limit on Heap|
|Storage	       |Stores only primitive variables and references to objects that are created in Heap Space|All the newly created objects are stored here|
|Order	           |It is accessed using Last-in First-out (LIFO) memory allocation system|	This memory is accessed via complex memory management techniques that include Young Generation, Old or Tenured Generation, and Permanent Generation.|
|Life	           |Stack memory only exists as long as the current method is running|Heap space exists as long as the application runs|
|Efficiency	       |Comparatively much faster to allocate when compared to heap| Slower to allocate when compared to stack|
|Allocation/Deallocation| This Memory is automatically allocated and deallocated when a method is called and returned respectively|Heap space is allocated when new objects are created and deallocated by Gargabe Collector when they are no longer referenced |

#### Q. What are the important features of Java 8 release?
**1. Lambda Expression**  
Lambda expressions gives the ability to pass a functionality as a method argument. Lambda expression help us reduce the code clutter in using a single method class.  

Syntax:
```java
(x, y) -> x + y  //This function takes two parameters and return their sum.
```
Example:
```java
public class LambdaHelloWorld {
	interface HelloWorld {
		String hello(String name);
	}

	public static void main(String[] args) {	      
		 HelloWorld helloWorld = (String name) -> { return "Hello " + name; };
		 System.out.println(helloWorld.hello("Joe"));
	}
}
```
**2. Stream API**  
Java 8 java.util.stream package consists of classes, interfaces and an enum to allow functional-style operations on the elements. It performs lazy computation. So, it executes only when it requires.

In this example, items is collection of String values and we want to remove the entries that begin with some prefix text.
```java
List<String> items;
String prefix;
List<String> filteredList = items.stream().filter(e -> (!e.startsWith(prefix))).collect(Collectors.toList());
```
**3. Date and Time API**  

`Date` class has even become obsolete. The new classes intended to replace Date class are `LocalDate`, `LocalTime` and `LocalDateTime`.
```java
LocalDate localDate = LocalDate.now();
LocalTime localTime = LocalTime.of(12, 20);
LocalDateTime localDateTime = LocalDateTime.now(); 
OffsetDateTime offsetDateTime = OffsetDateTime.now();
ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
```

The `Instant` class represents an instant in time to an accuracy of nanoseconds. Operations on an Instant include comparison to another `Instant` and adding or subtracting a duration.
```java
Instant instant = Instant.now();
Instant instant1 = instant.plus(Duration.ofMillis(5000));
Instant instant2 = instant.minus(Duration.ofMillis(5000));
Instant instant3 = instant.minusSeconds(10);
```
**4. Default Methods**  
Java 8 allows to add non-abstract methods in interfaces. These methods must be declared default methods. Default methods were introduces in java 8 to enable the functionality of lambda expression.

Default methods enable to add new functionality to the interfaces of your libraries and ensure binary compatibility with code written for older versions of those interfaces.
```java
public interface Moveable {
    default void move(){
        System.out.println("I am moving");
    }
}
```
Moveable interface defines a method move() and provided a default implementation as well. If any class implements this interface then it need not to implement it’s own version of move() method. It can directly call instance.move().
```java
public class Animal implements Moveable{
    public static void main(String[] args){
        Animal tiger = new Animal();
        tiger.move();
    }
}
// Output: I am moving
```
**5. Type Annotations**  
In Java 8, Annotations can be applied wherever a type is used like in new instance creates, exception throws clause etc. This will help to enforce stronger type checks and using this feature we can come up with a type checking framework itself.

**6. Nashorn JavaScript Engine**  
Nashorn is a JavaScript engine. It is used to execute JavaScript code dynamically at JVM (Java Virtual Machine). Java provides a command-line tool **jjs** which is used to execute JavaScript code. We can execute JavaScript code by two ways:

1. Using jjs command-line tool, and
1. By embedding into Java source code.
```java
// hello.js
var hello = function(){  
    print("Hello Nashorn");  
};  
hello();  
```
To run the above code
```
cmd> jjs hello.js
```

#### Q. What is JVM and is it platform independent?
Java Virtual Machine (JVM) is a specification that provides runtime environment in which java bytecode(.class files) can be executed. The JVM is the platform. The JVM acts as a "virtual" machine or processor. Java's platform independence consists mostly of its Java Virtual Machine (JVM). JVM makes this possible because it is aware of the specific instruction lengths and other particularities of the platform (Operating System).

The JVM is not platform independent. Java Virtual Machine (JVM) provides the environment to execute the java file(. Class file). So at the end it's depends on kernel and kernel is differ from OS (Operating System) to OS. The JVM is used to both translate the bytecode into the machine language for a particular computer and actually execute the corresponding machine-language instructions as well.

#### Q. What is JIT compiler in Java?
The Just-In-Time (JIT) compiler is a component of the runtime environment that improves the performance of Java applications by compiling bytecodes to native machine code at run time.

Java programs consists of classes, which contain platform-neutral bytecodes that can be interpreted by a JVM on many different computer architectures. At run time, the JVM loads the class files, determines the semantics of each individual bytecode, and performs the appropriate computation. The additional processor and memory usage during interpretation means that a Java application performs more slowly than a native application. The JIT compiler helps improve the performance of Java programs by compiling bytecodes into native machine code at run time. The JIT compiler is enabled by default. When a method has been compiled, the JVM calls the compiled code of that method directly instead of interpreting it. 

#### Q. What is Classloader in Java? What are different types of classloaders?
The **Java ClassLoader** is a part of the Java Runtime Environment that dynamically loads Java classes into the Java Virtual Machine. Java code is compiled into class file by javac compiler and JVM executes Java program, by executing byte codes written in class file. ClassLoader is responsible for loading class files from file system, network or any other source. 

**Types of ClassLoader**   

**Bootstrap Class Loader**: It loads standard JDK class files from rt.jar and other core classes. It loads class files from jre/lib/rt.jar. For example, java.lang package class.

**Extensions Class Loader**: It loads classes from the JDK extensions directly usually `JAVA_HOME/lib/ext` directory or any other directory as java.ext.dirs. 

**System Class Loader**: It loads application specific classes from the CLASSPATH environment variable. It can be set while invoking program using -cp or classpath command line options. 

#### Q. Java Compiler is stored in JDK, JRE or JVM?
**JDK**: Java Development Kit is the core component of Java Environment and provides all the tools, executables and binaries required to compile, debug and execute a Java Program. 

**JVM**: JVM is responsible for converting Byte code to the machine specific code. JVM is also platform dependent and provides core java functions like memory management, garbage collection, security etc. JVM is customizable and we can use java options to customize it, for example allocating minimum and maximum memory to JVM. JVM is called virtual because it provides an interface that does not depend on the underlying operating system and machine hardware.

**JRE**: Java Runtime Environment provides a platform to execute java programs. JRE consists of JVM and java binaries and other classes to execute any program successfully.

![Java Compiler](https://github.com/learning-zone/java-interview-questions/blob/master/assets/jdk.jpg)

#### Q. What is the difference between factory and abstract factory pattern?
The Factory Method is usually categorised by a switch statement where each case returns a different class, using the same root interface so that the calling code never needs to make decisions about the implementation.

For example credit card validator factory which returns a different validator for each card type.
```java
public ICardValidator GetCardValidator (string cardType)
{
    switch (cardType.ToLower())
    {
        case "visa":
            return new VisaCardValidator();
        case "mastercard":
        case "ecmc":
            return new MastercardValidator();
        default:
            throw new CreditCardTypeException("Do not recognise this type");
    }
}
```
Abstract Factory patterns work around a super-factory which creates other factories. This factory is also called as factory of factories. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.

In Abstract Factory pattern an interface is responsible for creating a factory of related objects without explicitly specifying their classes. Each generated factory can give the objects as per the Factory pattern.

#### Q. What are the methods used to implement for key Object in HashMap?
**1. equals()** and **2. hashcode()**
Class inherits methods from the following classes in terms of HashMap

* java.util.AbstractMap
* java.util.Object
* java.util.Map

#### Q. What is difference between the Inner Class and Sub Class?
Nested Inner class can access any private instance variable of outer class. Like any other instance variable, we can have access modifier private, protected, public and default modifier.
```java
class Outer { 
   class Inner { 
      public void show() { 
           System.out.println("In a nested class method"); 
      } 
   } 
} 
class Main { 
   public static void main(String[] args) { 
       Outer.Inner in = new Outer().new Inner(); 
       in.show(); 
   } 
} 
```
A subclass is class which inherits a method or methods from a superclass.
```java
class Car {
    //...
}
 
class HybridCar extends Car {
    //...
}
```
#### Q. Can we import same package/class two times? Will the JVM load the package twice at runtime?
We can import the same package or same class multiple times. The JVM will internally load the class only once no matter how many times import the same class.

#### Q. Distinguish between static loading and dynamic class loading?
**Static Class Loading**: Creating objects and instance using `new` keyword is known as static class loading. The retrieval of class definition and instantiation of the object is done at compile time.
```java
class TestClass {
  public static void main(String args[]) {
      TestClass tc = new TestClass();
  }
}
```

**Dynamic Class Loading**: Loading classes use `Class.forName()` method. Dynamic class loading is done when the name of the class is not known at compile time.
```java
Class.forName (String className);
```
#### Q. Why we use Vector class?
Vector implements a dynamic array that means it can grow or shrink as required. Like an array, it contains components that can be accessed using an integer index. They are very similar to ArrayList but Vector is **synchronised** and have some legacy method which collection framework does not contain. It extends AbstractList and implements List interfaces.
```java
import java.util.*; 
class Vector_demo { 

    public static void main(String[] arg) { 

        // create default vector 
        Vector v = new Vector(); 
        v.add(10); 
        v.add(20); 
        v.add("Numbers");   
        System.out.println("Vector is " + v); 
    } 
}
```
#### Q. What is the difference between transient and volatile variable in Java?
**Transient**: The transient modifier tells the Java object serialization subsystem to exclude the field when serializing an instance of the class. When the object is then deserialized, the field will be initialized to the default value; i.e. null for a reference type, and zero or false for a primitive type.
```java
public transient int limit = 55;   // will not persist
public int b;   // will persist
```
**Volatile**: The volatile modifier tells the JVM that writes to the field should always be synchronously flushed to memory, and that reads of the field should always read from memory. This means that fields marked as volatile can be safely accessed and updated in a multi-thread application without using native or standard library-based synchronization.
```java
public class MyRunnable implements Runnable {
   private volatile boolean active;
   public void run() {
      active = true;
      while (active) {    
      }
   }
   public void stop() {
      active = false;  
   }
}
```
#### Q. How many types of memory areas are allocated by JVM?
JVM is a program which takes Java bytecode and converts the byte code (line by line) into machine understandable code. JVM perform some particular types of operations:

* Loading of code
* Verification of code
* Executing the code
* It provide run-time environment to the users

**Types of Memory areas allocated by the JVM:**  

**1. Classloader**: Classloader is a subsystem of JVM that is used to load class files.  
**2. Class(Method) Area**: Class(Method) Area stores per-class structures such as the runtime constant pool, field and method data, the code for methods.  
**3. Heap**: It is the runtime data area in which objects are allocated.  
**4. Stack**: Java Stack stores frames.It holds local variables and partial results, and plays a part in method invocation and return. Each thread has a private JVM stack, created at the same time as thread.  
**5. Program Counter Register**: PC (program counter) register. It contains the address of the Java virtual machine instruction currently being executed.  
**6. Native Method Stack**: It contains all the native methods used in the application.

#### Q. What will be the initial value of an object reference which is defined as an instance variable?
The object references are all initialized to `null` in Java. However in order to do anything useful with these references, It must set to a valid object, else you will get NullPointerExceptions everywhere you try to use such default initialized references.

#### Q. How can constructor chaining be done using this keyword?
Java constructor chaining is a method of calling one constructor with the help of another while considering the present object. It can be done in 2 ways –

* **Within same class**: It can be done using `this()` keyword for constructors in the same class.
* **From base class**: By using `super()` keyword to call a constructor from the base class.

```java
// Java program to illustrate Constructor Chaining 
// within same class Using this() keyword 
class Temp 
{ 
    // default constructor 1 
    // default constructor will call another constructor 
    // using this keyword from same class 
    Temp() { 
        // calls constructor 2 
        this(5); 
        System.out.println("The Default constructor"); 
    } 
  
    // parameterized constructor 2 
    Temp(int x) { 
        // calls constructor 3 
        this(10, 20); 
        System.out.println(x); 
    } 
  
    // parameterized constructor 3 
    Temp(int x, int y) { 
        System.out.println(10 + 20); 
    } 
  
    public static void main(String args[]) { 
        // invokes default constructor first 
        new Temp(); 
    } 
} 
```
Ouput:
```
30
10
The Default constructor
```
```java
// Java program to illustrate Constructor Chaining to 
// other class using super() keyword 
class Base 
{ 
    String name; 
  
    // constructor 1 
    Base() { 
        this(""); 
        System.out.println("No-argument constructor of base class"); 
    } 
  
    // constructor 2 
    Base(String name) { 
        this.name = name; 
        System.out.println("Calling parameterized constructor of base"); 
    } 
} 
  
class Derived extends Base 
{ 
    // constructor 3 
    Derived() { 
        System.out.println("No-argument constructor of derived"); 
    } 
  
    // parameterized constructor 4 
    Derived(String name) { 
        // invokes base class constructor 2 
        super(name); 
        System.out.println("Calling parameterized constructor of derived"); 
    } 
  
    public static void main(String args[]) { 
        // calls parameterized constructor 4 
        Derived obj = new Derived("test"); 
  
        // Calls No-argument constructor 
        // Derived obj = new Derived(); 
    } 
} 
```
Output:
```
Calling parameterized constructor of base
Calling parameterized constructor of derived
```
#### Q. Can you declare the main method as final?
Yes. We can declare main method as final. But, In inheritance concept we cannot declare main method as final in parent class. It give compile time error. The main method has to be public because it has to be called by JVM which is outside the scope of the package and hence would need the access specifier-public.
```java
public class Test {
	public final static void main(String[] args) throws Exception {
		System.out.println("This is Test Class");
	}
}
 
class Child extends Test {
	public static void main(String[] args) throws Exception {
		System.out.println("This is Child Class");
	}
}
```
Output
```
Cannot override the final method from Test.
```
#### Q. What is the difference between the final method and abstract method?
Final method is a method that is marked as final, i.e. it cannot be overridden anymore. Just like final class cannot be inherited anymore.

Abstract method, on the other hand, is an empty method that is ought to be overridden by the inherited class. Without overriding, you will quickly get compilation error.

#### Q. What is the difference between compile-time polymorphism and runtime polymorphism?
There are two types of polymorphism in java:
1) Static Polymorphism also known as compile time polymorphism
2) Dynamic Polymorphism also known as runtime polymorphism

**Example of static Polymorphism**  

Method overloading is one of the way java supports static polymorphism. Here we have two definitions of the same method add() which add method would be called is determined by the parameter list at the compile time. That is the reason this is also known as compile time polymorphism.
```java
class SimpleCalculator
{
    int add(int a, int b) {
         return a + b;
    }
    int  add(int a, int b, int c) {
         return a + b + c;
    }
}
public class Demo
{
   public static void main(String args[]) {

	   SimpleCalculator obj = new SimpleCalculator();
       System.out.println(obj.add(10, 20));
       System.out.println(obj.add(10, 20, 30));
   }
}
```
Output:
```
30
60
```
**Runtime Polymorphism (or Dynamic polymorphism)**  

It is also known as Dynamic Method Dispatch. Dynamic polymorphism is a process in which a call to an overridden method is resolved at runtime, thats why it is called runtime polymorphism. 
```java
class ABC {

   public void myMethod() {
	System.out.println("Overridden Method");
   }
}
public class XYZ extends ABC {

   public void myMethod() {
	System.out.println("Overriding Method");
   }
   public static void main(String args[]) {
	ABC obj = new XYZ();
	obj.myMethod();
   }
}
```
Output:
```
Overriding Method
```
#### Q. Can you achieve Runtime Polymorphism by data members?
No, we cannot achieve runtime polymorphism by data members. Method is overridden not the data members, so runtime polymorphism can't be achieved by data members.

#### Q. Can you have virtual functions in Java?
In Java, all non-static methods are by default **virtual functions**. Only methods marked with the `keyword final`, which cannot be overridden, along with `private methods`, which are not inherited, are non-virtual.

**Example with virtual functions with interfaces** 

```java
interface Bicycle {         //the function applyBrakes() is virtual because
    void applyBrakes();     //functions in interfaces are designed to be 
}                           //overridden.

class ACMEBicycle implements Bicycle {
    public void applyBrakes(){               //Here we implement applyBrakes()
       System.out.println("Brakes applied"); //function
    }
}
```
#### Q. What is covariant return type?
It is possible to have different return type for a overriding method in child class, but child’s return type should be sub-type of parent’s return type. Overriding method becomes variant with respect to return type. The covariant return type specifies that the return type may vary in the same direction as the subclass.
```java
class SuperClass {
   SuperClass get() {
      System.out.println("SuperClass");
      return this;
   }
}
public class Tester extends SuperClass {
   Tester get() {
      System.out.println("SubClass");
      return this;
   }
   public static void main(String[] args) {
      SuperClass tester = new Tester();
      tester.get();
   }
}
```
Output:
```
Subclass
```
#### Q. What is the difference between abstraction and encapsulation?
* Abstraction solves the problem at design level while Encapsulation solves it implementation level. 

* In Java, Abstraction is supported using `interface` and `abstract class` while Encapsulation is supported using access modifiers e.g. public, private and protected.

* Abstraction is about hiding unwanted details while giving out most essential details, while Encapsulation means hiding the code and data into a single unit e.g. class or method to protect inner working of an object from outside world. 

#### Q. Can there be an abstract method without an abstract class?
Yes. because methods in an interface are also abstract. so the interface can be use to declare abstract method.

#### Q. Can you declare an interface method static?
Java 8 interface changes include static methods and default methods in interfaces. Prior to Java 8, we could have only method declarations in the interfaces. But from Java 8, we can have default methods and static methods in the interfaces.

#### Q. Can we define private and protected modifiers for the members in interfaces?
#### Q. When can an object reference be cast to an interface reference?
#### Q. How the metacharacters are different from the ordinary characters?
#### Q. Give the hierarchy of InputStream and OutputStream classes.
#### Q. What is the difference between the Reader/Writer class hierarchy and the InputStream/OutputStream class hierarchy?
#### Q. What is the purpose of the finalize() method?
#### Q. What will be the problem if you don't override hashcode() method?
#### Q. Can you access non static variable in static context?
#### Q. What is the purpose of the Runtime class and System class?
#### Q. What are FilterStreams?
#### Q. What are assertions in Java?
#### Q. Can we have multiple public classes in a java source file?
#### Q. What is Java Package and which package is imported by default?
#### Q. What is static keyword?
#### Q. What is final, finally and finalize in java?
#### Q. What is the difference between abstract class and interface?
#### Q. What are Wrapper classes?
#### Q. What is Java Annotations?
#### Q. What is Java Reflection API?
#### Q. What is singleton class and how can we make a class singleton?
#### Q. What is the numeric promotion?
#### Q. Which API is provided by Java for operations on a set of objects?
#### Q. Is delete, next, main, exit or null keyword in java?
#### Q. What is the default value of the local variables?
#### Q. How many types of constructors are used in Java?
#### Q. What do you understand by copy constructor in Java?
#### Q. What are the restrictions that are applied to the Java static methods?
#### Q. What is the difference between aggregation and composition?
#### Q. What is object cloning?
#### Q. What is method overloading with type promotion?
#### Q. Can we override the private methods?
#### Q. Can we change the scope of the overridden method in the subclass?
#### Q. What is the final variable, final class, and final blank variable?
#### Q. How to make a read-only and write-only class in Java?
#### Q. What are the advantages of Encapsulation in Java?
#### Q. What is the static import?
#### Q. Name some classes present in java.util.regex package.
#### Q. What is a nested class? Is there any difference between nested classes and inner classes?
#### Q. What is the nested interface?
#### Q. How will you invoke any external process in Java?
#### Q. What do you understand by an IO stream?
#### Q. What are the super most classes for all the streams?
#### Q. What is the purpose of using BufferedInputStream and BufferedOutputStream classes?
#### Q. How to set the Permissions to a file in Java?
#### Q. In Java, How many ways you can take input from the console?
#### Q. How can you avoid serialization in child class if the base class is implementing the Serializable interface?
#### Q. Can a Serialized object be transferred via network?
#### Q. What is the difference between Serializable and Externalizable interface?
#### Q. How do I convert a numeric IP address like 192.18.97.39 into a hostname like java.sun.com?
#### Q. What is the purpose of using java.lang.Class class?
#### Q. What are the ways to instantiate the Class class?
#### Q. What is the purpose of using javap?
#### Q. What are autoboxing and unboxing? When does it occur?
#### Q. What is a native method?
#### Q. What comes to mind when someone mentions a shallow copy in Java?
#### Q. What is Locale?
#### Q. What is the right data type to represent a price in Java?
#### Q. What will happen if you put return statement or System.exit () on try or catch block? Will finally block execute?
#### Q. What will happen if we put a key object in a HashMap which is already there?
#### Q. If a method throws NullPointerException in the superclass, can we override it with a method which throws RuntimeException?
#### Q. What is immutable object? Can you write immutable object?
#### Q. What is runtime polymorphism or dynamic method dispatch?
#### Q. What is difference between dependency injection and factory design pattern?
#### Q. Difference between Adapter and Decorator pattern?
#### Q. Difference between Adapter and Proxy Pattern?
#### Q. What is Template method pattern?
#### Q. When do you use Visitor design pattern?
#### Q. When do you use Composite design pattern?
#### Q. The difference between Inheritance and Composition?
#### Q. Difference between Abstract factory and Prototype design pattern?
#### Q. The difference between nested public static class and a top level class in Java?
#### Q. Give me an example of design pattern which is based upon open closed principle?
#### Q. Can you explain Liskov Substitution principle?
#### Q. What is Law of Demeter violation? Why it matters?
#### Q. When do you use Flyweight pattern?
#### Q. The difference between nested static class and top level class?
#### Q. The difference between DOM and SAX parser in Java?
#### Q. What is the difference between an object-oriented programming language and object-based programming language?
#### Q. Difference between Static binding and Dynamic binding in java ?
#### Q. Define a StringJoiner and write a sample code?
#### Q. What is the difference between creating String as new() and literal?
#### Q. Why is char array better than String for storing password?
#### Q. Why are the objects immutable in java?
#### Q. How many ways can we create the string object?
#### Q. How can we create an immutable class in Java?
#### Q. Why CharArray() is preferred over String to store the password?
#### Q. Difference between String, StringBuffer and StringBuilder?
#### Q. What is a Memory Leak? How can a memory leak appear in garbage collected language?
#### Q. How many objects will be created with string initialization code?
#### Q. What is String in Java? How does String work in Java? String is a data type?
#### Q. What are different ways to create String Object?
#### Q. How can we make String upper case or lower case?
#### Q. What is String subSequence method?
#### Q. How to convert String to char and vice versa?
#### Q. How to convert String to byte array and vice versa?
#### Q. Can we use String in switch case?
#### Q. How to Split String in java?
#### Q. Why Char array is preferred over String for storing password?
#### Q. How do you check if two Strings are equal in Java?
#### Q. Does String is thread-safe in Java?
#### Q. Why String is popular HashMap key in Java?
#### Q. How do you check if two Strings are equal in Java?
#### Q. What does String intern() method do?
#### Q. How to convert String to int and vice versa?
#### Q. How to convert String to Date in java?
#### Q. How do you convert bytes to String?
#### Q. How to Optimize Java String Creation?
#### Q. Is String keyword in Java?
#### Q. String comparison with equals() and '=='?
#### Q. How do you convert a String(YYYYMMDD) to date in Java?
#### Q. Why java uses the concept of the string literal?
#### Q. What is the purpose of toString() method in Java?
#### Q. What is UnsupportedOperationException?
#### Q. What is difference between Error and Exception?
#### Q. What are the types of Exceptions? Explain the hierarchy of Java Exception classes?
#### Q. Explain about Exception Propagation.
#### Q. What’s the base class of all exception classes?
#### Q. What are important methods of Java Exception Class?
#### Q. How to write custom exception in Java?
#### Q. What is OutOfMemoryError in Java?
#### Q. What are different scenarios causing “Exception in thread main”?
#### Q. What happens when exception is thrown by main method?
#### Q. Provide some Java Exception Handling Best Practices?
#### Q. What are the differences between Checked Exception and Unchecked Exception?
#### Q. What purpose does the keywords final, finally, and finalize, fulfill?
#### Q. What are the differences between throw and throws?
#### Q. What is a finally block? Is there a case when finally will not execute?
#### Q. What is the base class for Error and Exception?
#### Q. Is it necessary that each try block must be followed by a catch block?
#### Q. Can finally block be used without a catch?
#### Q. Is there any case when finally will not be executed?
#### Q. Can an exception be rethrown?
#### Q. Can subclass overriding method declare an exception if parent class method doesn't throw an exception?
#### Q. What will happen to the Exception object after exception handling?
#### Q. How can an object be unreferenced?
#### Q. What is the purpose of garbage collection in Java, and when is it used?
#### Q. The difference between Serial and Parallel Garbage Collector?
#### Q. A difference between WeakReference and SoftReference in Java?
#### Q. How do you find memory usage from Java program? How much percent of the heap is used?
#### Q. How do WeakHashMap works?
#### Q. What is -XX:+UseCompressedOops JVM option? Why use it?
#### Q. How do you find if JVM is 32-bit or 64-bit from Java Program?
#### Q. What is the maximum heap size of 32-bit and 64-bit JVM?
#### Q. What's the difference between "a == b" and "a.equals(b)"?
#### Q. What is a compile time constant in Java? What is the risk of using it?
#### Q. What is the size of an int variable in 32-bit and 64-bit JVM?
#### Q. If an object reference is set to null, will the Garbage Collector immediately free the memory held by that object?
#### Q. What is the difference between Serial and Throughput Garbage collector?
#### Q. Does Garbage collection occur in permanent generation space in JVM?
#### Q. When does an Object becomes eligible for Garbage collection in Java?
#### Q. How do you test static method?
#### Q. How to do you test a method for an exception using JUnit?
#### Q. Which unit testing libraries you have used for testing Java programs?
#### Q. What is the difference between @Before and @BeforeClass annotation?
#### Q. How to check if a String contains only numeric digits?