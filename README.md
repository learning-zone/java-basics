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

#### Q. Can we use private or protected member variables in an interface?
The java compiler adds public and abstract keywords before the interface method and **public, static and final keyword** before data members automatically
```java
public interface Test {
   public string name1;
   private String email;
   protected pass;
}
```
as you have declare variable in test interface with private and protected it will give error. if you do not specify the modifier the compiler will add public static final automatically.
```java
public interface Test {
   public static final string name1;
   public static final  String email;
   public static final pass;
}
```
* interfaces cannot be instantiated that is why the variable are **static**
* interface are used to achieve the 100% abstraction there for the variable are **final**
* An interface provide a way for the client to interact with the object. If variables were not public, the clients would not have access to them. that is why variable are **public**

#### Q. When can an object reference be cast to a Java interface reference?
An interface reference can point to any object of a class that implements this interface 
```java
interface Foo {
  void display();
}

public class TestFoo implements Foo {

    void display() {
      System.out.println(“Hello World”);
    }

    public static void main(String[] args) {
      Foo foo = new TestFoo();
      foo.display();
    }
}
``` 
#### Q. Give the hierarchy of InputStream and OutputStream classes?
A stream can be defined as a sequence of data. There are two kinds of Streams −

* **InPutStream** − The InputStream is used to read data from a source.
* **OutPutStream** − The OutputStream is used for writing data to a destination.

**Byte Streams**  
Java byte streams are used to perform input and output of 8-bit bytes. Though there are many classes related to byte streams but the most frequently used classes are, FileInputStream and FileOutputStream.

```java
import java.io.*;
public class CopyFile {

   public static void main(String args[]) throws IOException {  
      FileInputStream in = null;
      FileOutputStream out = null;

      try {
         in = new FileInputStream("input.txt");
         out = new FileOutputStream("output.txt");
         
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      } finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}
```
**Character Streams**  
Java Byte streams are used to perform input and output of 8-bit bytes, whereas Java Character streams are used to perform input and output for 16-bit unicode. Though there are many classes related to character streams but the most frequently used classes are, FileReader and FileWriter. 

```java
import java.io.*;
public class CopyFile {

   public static void main(String args[]) throws IOException {
      FileReader in = null;
      FileWriter out = null;

      try {
         in = new FileReader("input.txt");
         out = new FileWriter("output.txt");
         
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      } finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}
```
#### Q. What are the types of Exceptions? Explain the hierarchy of Java Exception classes?
Exception is an error event that can happen during the execution of a program and disrupts its normal flow.

**Types of Java Exceptions**  

**1. Checked Exception**: The classes which directly inherit `Throwable class` except RuntimeException and Error are known as checked exceptions e.g. IOException, SQLException etc. Checked exceptions are checked at compile-time.  
**2. Unchecked Exception**: The classes which inherit `RuntimeException` are known as unchecked exceptions e.g. ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException etc. Unchecked exceptions are not checked at compile-time, but they are checked at runtime.  
**3. Error**: Error is irrecoverable e.g. OutOfMemoryError, VirtualMachineError, AssertionError etc.

**Hierarchy of Java Exception classes**   
The java.lang.Throwable class is the root class of Java Exception hierarchy which is inherited by two subclasses: Exception and Error. 

![Java Exception](https://github.com/learning-zone/java-interview-questions/blob/master/assets/exception.png)


Example:
```java
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class CustomExceptionExample {

	public static void main(String[] args) throws MyException {
		try {
			processFile("file.txt");
		} catch (MyException e) {
			processErrorCodes(e);
		}
	}

	private static void processErrorCodes(MyException e) throws MyException {
		switch(e.getErrorCode()){
		  case "BAD_FILE_TYPE":
			 System.out.println("Bad File Type, notify user");
			 throw e;
		  case "FILE_NOT_FOUND_EXCEPTION":
			 System.out.println("File Not Found, notify user");
			 throw e;
		  case "FILE_CLOSE_EXCEPTION":
			 System.out.println("File Close failed, just log it.");
			 break;
		  default:
			 System.out.println("Unknown exception occured," +e.getMessage());
			 e.printStackTrace();
		}
	}

	private static void processFile(String file) throws MyException {		
		InputStream fis = null;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			throw new MyException(e.getMessage(),"FILE_NOT_FOUND_EXCEPTION");
		} finally {
			try {
				if(fis !=null) fis.close();
			} catch (IOException e) {
				throw new MyException(e.getMessage(),"FILE_CLOSE_EXCEPTION");
			}
		}
	}
}
```

#### Q. Can you access non static variable in static context?
No, non-static variable cannot be referenced in a static context directly one needs to use object.

#### Q. What is the purpose of the Runtime class and System class?
**Runtime Class**: The purpose of the Runtime class is to provide access to the Java runtime system. The runtime information like memory availability, invoking the garbage collector, etc.

**System Class**: The purpose of the System class is to provide access to system resources. It contains accessibility to standard input, standart output, error output streams, current time in millis, terminating the application, etc.

#### Q. What are assertions in Java?
An assertion allows testing the correctness of any assumptions that have been made in the program. Assertion is achieved using the assert statement in Java. While executing assertion, it is believed to be true. If it fails, JVM throws an error named `AssertionError`. It is mainly used for testing purposes during development.

The assert statement is used with a Boolean expression and can be written in two different ways.
```
// First way 
assert expression;

// Second way
assert expression1 : expression2;
```
Example:
```java
public class Example {
   public static void main(String[] args) {
      int age = 14;
      assert age <= 18 : "Cannot Vote";
      System.out.println("The voter's age is " + age);
   }
}
```
#### Q. Can we have multiple public classes in a java source file?
A Java source file can have only one class declared as **public**, we cannot put two or more public classes together in a **.java** file. This is because of the restriction that the file name should be same as the name of the public class with **.java** extension. If we want to multiple classes under consideration are to be declared as public, we have to store them in separate source files and attach the package statement as the first statement in those source files.

#### Q. What is the difference between abstract class and interface?
Abstract class and interface both are used to achieve abstraction where we can declare the abstract methods. Abstract class and interface both can't be instantiated.

|Sl.No|Abstract Class	            |Interface                        |
|-----|-----------------------------|---------------------------------|
| 01. |Abstract class can have abstract and non-abstract methods.|	Interface can have only abstract methods. Since Java 8, it can have default and static methods also.|
| 02. |Abstract class doesn't support multiple inheritance.|	Interface supports multiple inheritance.|
| 03. |Abstract class can have final, non-final, static and non-static variables.	|Interface has only static and final variables.|
| 04. |Abstract class can provide the implementation of interface.|Interface can't provide the implementation of abstract class.|
| 05. |The abstract keyword is used to declare abstract class.|The interface keyword is used to declare interface.|
| 06. |An abstract class can extend another Java class and implement multiple Java interfaces.|An interface can extend another Java interface only.|
| 07. |An abstract class can be extended using keyword "extends".|An interface can be implemented using keyword "implements".|
| 08. |A Java abstract class can have class members like private, protected, etc.|Members of a Java interface are public by default.|

#### Q. What are Wrapper classes?
The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive.

**Use of Wrapper classes in Java**  

* **Change the value in Method**: Java supports only call by value. So, if we pass a primitive value, it will not change the original value. But, if we convert the primitive value in an object, it will change the original value.
* **Serialization**: We need to convert the objects into streams to perform the serialization. If we have a primitive value, we can convert it in objects through the wrapper classes.
* **Synchronization**: Java synchronization works with objects in Multithreading.
* **java.util package**: The java.util package provides the utility classes to deal with objects.
* **Collection Framework**: Java collection framework works with objects only. All classes of the collection framework (ArrayList, LinkedList, Vector, HashSet, LinkedHashSet, TreeSet, PriorityQueue, ArrayDeque, etc.) deal with objects only.

| Sl.No|Primitive Type  |	Wrapper class       |
|------|----------------|----------------------|
| 01.  |boolean	      |Boolean|
| 02.  |char	         |Character|
| 03.  |byte	         |Byte|
| 04.  |short	         |Short|
| 05.  |int	            |Integer|
| 06.  |long	         |Long|
| 07.  |float	         |Float|
| 08.  |double	         |Double|

Example: Primitive to Wrapper
```java
//Java program to convert primitive into objects  
//Autoboxing example of int to Integer  
class WrapperExample {  
  public static void main(String args[]){  
      //Converting int into Integer  
      int a=20;  
      Integer i = Integer.valueOf(a);//converting int into Integer explicitly  
      Integer j = a; //autoboxing, now compiler will write Integer.valueOf(a) internally  
  
   System.out.println(a+" "+i+" "+j);  
  }
}  
```
Output
```
20 20 20
```

#### Q. What is Java Reflection API?
Java Reflection is the process of analyzing and modifying all the capabilities of a class at runtime. Reflection API in Java is used to manipulate class and its members which include fields, methods, constructor, etc. at runtime. The **java.lang.Class** class provides many methods that can be used to get metadata, examine and change the run time behavior of a class.

There are 3 ways to get the instance of Class class. They are as follows:

* forName() method of Class class
* getClass() method of Object class
* the .class syntax

**1. forName() method of Class class**  

* is used to load the class dynamically.
* returns the instance of Class class.
* It should be used if you know the fully qualified name of class.This cannot be used for primitive types.
```java
class Simple{}  
  
class Test {  
   public static void main(String args[]) {  
      Class c = Class.forName("Simple");  
      System.out.println(c.getName());  
   }  
}  
```
Output
```
Simple
```
**2. getClass() method of Object class**  

It returns the instance of Class class. It should be used if you know the type. Moreover, it can be used with primitives.
```java
class Simple{}  
  
class Test {  
  void printName(Object obj) {  
    Class c=obj.getClass();    
    System.out.println(c.getName());  
  }  
  public static void main(String args[]) {  
    Simple s=new Simple();  
    Test t=new Test();  
    t.printName(s);  
  }  
}  
```
Output
```
Simple
```
**3. The .class syntax**  

If a type is available but there is no instance then it is possible to obtain a Class by appending ".class" to the name of the type.It can be used for primitive data type also.
```java
class Test {  
  public static void main(String args[]) {  
   Class c = boolean.class;   
   System.out.println(c.getName());  
  
   Class c2 = Test.class;   
   System.out.println(c2.getName());  
 }  
}  
```
Output
```
boolean
Test
```
#### Q. What is the default value of the local variables?
There is no default value for local variables, so local variables should be declared and an initial value should be assigned before the first use.

#### Q. How many types of constructors are used in Java?
In Java, a constructor is a block of codes similar to the method. It is called when an instance of the class is created. At the time of calling constructor, memory for the object is allocated in the memory.

**Types of Java Constructors**  

* Default Constructor (or) no-arg Constructor
* Parameterized Constructor

Example: Default Constructor (or) no-arg constructor
```java
public class Car 
{
    Car() {
      System.out.println("Default Constructor of Car class called");
    }
    public static void main(String args[]) {
      //Calling the default constructor
      Car c = new Car();
    }
}
```
Output
```
Default Constructor of Car class called
```
Example: Parameterized Constructor   
```java
public class Car 
{
    String carColor;
    Car(String carColor) {
        this.carColor = carColor;
    }
    
    public void disp() {
        System.out.println("Color of the Car is : "+carColor);
    }
    public static void main(String args[]) {
        //Calling the parameterized constructor
        Car c = new Car("Blue");
        c.disp();
    }
}
```
#### Q. What are the restrictions that are applied to the Java static methods?
If a method is declared as static, it is a member of a class rather than belonging to the object of the class. It can be called without creating an object of the class. A static method also has the power to access static data members of the class.

* There are a few restrictions imposed on a static method
* The static method cannot use non-static data member or invoke non-static method directly.
* The `this` and `super` cannot be used in static context.
* The static method can access only static type data (static type instance variable).
* There is no need to create an object of the class to invoke the static method.
* A static method cannot be overridden in a subclass

```java
class Parent {
   static void display() {
      System.out.println("Super class");    
   }
}
public class Example extends Parent {
   void display()  // trying to override display() {
      System.out.println("Sub class");  
   }
   public static void main(String[] args) {
      Parent obj = new Example();
      obj.display();
   }
}
```
This generates a compile time error. The output is as follows −
```
Example.java:10: error: display() in Example cannot override display() in Parent
void display()  // trying to override display()
     ^
overridden method is static

1 error
```
#### Q. What is the difference between aggregation and composition?
**Aggregation**: We call aggregation those relationships whose **objects have an independent lifecycle, but there is ownership**, and child objects cannot belong to another parent object.

Example: Since Organization has Person as employees, the relationship between them is Aggregation. Here is how they look like in terms of Java classes
```java
public class Organization {
   private List employees;
}

public class Person {
   private String name;   
}
```

**Composition**: We use the term composition to refer to relationships whose objects **don’t have an independent lifecycle**, and if the parent object is deleted, all child objects will also be deleted.

Example: Since Engine is-part-of Car, the relationship between them is Composition. Here is how they are implemented between Java classes.
```java
public class Car {
    //final will make sure engine is initialized
    private final Engine engine;  
       
    public Car(){
       engine  = new Engine();
    }
}

class Engine {
    private String type;
}
```
#### Q. What is the final variable, final class, and final blank variable?
**Final Variable**: final variables are nothing but constants. We cannot change the value of a final variable once it is initialized.
```java
class Demo {  

   final int MAX_VALUE = 99;
   void myMethod() {  
      MAX_VALUE = 101;
   }  
   public static void main(String args[]) {  
      Demo obj = new  Demo();  
      obj.myMethod();  
   }  
}
```
Output
```
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The final field Demo.MAX_VALUE cannot be assigned

	at beginnersbook.com.Demo.myMethod(Details.java:6)
	at beginnersbook.com.Demo.main(Details.java:10)
```
**Blank final variable**: A final variable that is not initialized at the time of declaration is known as blank final variable. We must initialize the blank final variable in constructor of the class otherwise it will throw a compilation error (Error: `variable MAX_VALUE might not have been initialized`).
```java
class Demo {  
   //Blank final variable
   final int MAX_VALUE;
	 
   Demo() {
      //It must be initialized in constructor
      MAX_VALUE = 100;
   }
   void myMethod() {  
      System.out.println(MAX_VALUE);
   }  
   public static void main(String args[]) {  
      Demo obj = new  Demo();  
      obj.myMethod();  
   }  
}
```
Output
```
100
```
**Final Method**: A final method cannot be overridden. Which means even though a sub class can call the final method of parent class without any issues but it cannot override it.
```java
class XYZ {  
   final void demo() {
      System.out.println("XYZ Class Method");
   }  
}  
	     
class ABC extends XYZ {  
   void demo() {
      System.out.println("ABC Class Method");
   }  
	     
   public static void main(String args[]) {  
      ABC obj= new ABC();  
      obj.demo();  
   }  
}
```
#### Q. What is the static import?
The static import feature of Java 5 facilitate the java programmer to access any static member of a class directly. There is no need to qualify it by the class name.
```java
import static java.lang.System.*;    
class StaticImportExample {

  public static void main(String args[]) {    
   out.println("Hello");//Now no need of System.out  
   out.println("Java");  
  }   
}  
```
#### Q. Name some classes present in java.util.regex package.
**Java Regex**: The Java Regex or Regular Expression is an API to define a pattern for searching or manipulating strings.

**java.util.regex package**  

* MatchResult interface
* Matcher class
* Pattern class
* PatternSyntaxException class

```java
import java.util.regex.*;  
public class RegexExample {  
   public static void main(String args[]) {  
      //1st way  
      Pattern p = Pattern.compile(".s");//. represents single character  
      Matcher m = p.matcher("as");  
      boolean b = m.matches();  
      
      //2nd way  
      boolean b2 = Pattern.compile(".s").matcher("as").matches();  
      
      //3rd way  
      boolean b3 = Pattern.matches(".s", "as");  
      
      System.out.println(b + " " + b2 + " " + b3);  
   }
}  
```
#### Q. How will you invoke any external process in Java?
We can invoke the external process in Java using **exec()** method of **Runtime Class**.
```java
class ExternalProcessExample 
{ 
    public static void main(String[] args) { 
        try { 
            // Command to create an external process 
            String command = "C:\Program Files (x86)"+ 
                 "\Google\Chrome\Application\chrome.exe"; 
  
            // Running the above command 
            Runtime run  = Runtime.getRuntime(); 
            Process proc = run.exec(command); 
        } catch (IOException e) { 
            e.printStackTrace(); 
        } 
    } 
} 
```
#### Q. What is the purpose of using BufferedInputStream and BufferedOutputStream classes?
`BufferedInputStream` and `BufferedOutputStream` class is used for buffering an input and output stream while reading and writing, respectively. It internally uses buffer to store data. It adds more efficiency than to write data directly into a stream. So, it makes the performance fast.

**BufferedInputStreamExample.java**
```java
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamExample {

	public static void main(String[] args) {
		File file = new File("file.txt");
		FileInputStream fileInputStream = null;
		BufferedInputStream bufferedInputStream = null;

		try {
			fileInputStream = new FileInputStream(file);
			bufferedInputStream = new BufferedInputStream(fileInputStream);
			// Create buffer
			byte[] buffer = new byte[1024];
			int bytesRead = 0;
			while ((bytesRead = bufferedInputStream.read(buffer)) != -1) {
				System.out.println(new String(buffer, 0, bytesRead));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileInputStream != null) {
					fileInputStream.close();
				}
				if (bufferedInputStream != null) {
					bufferedInputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
```
Output
```
This is an example of reading data from file
```
**BufferedOutputStreamExample.java**  
```java
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {

	public static void main(String[] args) {
		File file = new File("outfile.txt");
		FileOutputStream fileOutputStream=null;
		BufferedOutputStream bufferedOutputStream=null;
		try {
			fileOutputStream = new FileOutputStream(file);
			bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
			bufferedOutputStream.write("This is an example of writing data to a file".getBytes());
			bufferedOutputStream.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fileOutputStream != null) {
					fileOutputStream.close();
				}
				if(bufferedOutputStream != null) {
					bufferedOutputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
```
Output 
```
This is an example of writing data to a file
```
#### Q. How to set the Permissions to a file in Java?
Java 7 has introduced PosixFilePermission Enum and **java.nio.file.Files** includes a method setPosixFilePermissions(Path path, `Set<PosixFilePermission> perms`) that can be used to set file permissions easily.
```java
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFilePermission;
import java.util.HashSet;
import java.util.Set;

public class FilePermissions {

    public static void main(String[] args) throws IOException {
        File file = new File("/Users/file.txt");
               
        //change permission to 777 for all the users
        //no option for group and others
        file.setExecutable(true, false);
        file.setReadable(true, false);
        file.setWritable(true, false);
        
        //using PosixFilePermission to set file permissions 777
        Set<PosixFilePermission> perms = new HashSet<PosixFilePermission>();
        //add owners permission
        perms.add(PosixFilePermission.OWNER_READ);
        perms.add(PosixFilePermission.OWNER_WRITE);
        perms.add(PosixFilePermission.OWNER_EXECUTE);
        //add group permissions
        perms.add(PosixFilePermission.GROUP_READ);
        perms.add(PosixFilePermission.GROUP_WRITE);
        perms.add(PosixFilePermission.GROUP_EXECUTE);
        //add others permissions
        perms.add(PosixFilePermission.OTHERS_READ);
        perms.add(PosixFilePermission.OTHERS_WRITE);
        perms.add(PosixFilePermission.OTHERS_EXECUTE);
        
        Files.setPosixFilePermissions(Paths.get("/Users/run.sh"), perms);
    }
}
```
#### Q. In Java, How many ways you can take input from the console?
In Java, there are three different ways for reading input from the user in the command line environment(console).

**1. Using Buffered Reader Class**: This method is used by wrapping the System.in (standard input stream) in an InputStreamReader which is wrapped in a BufferedReader, we can read input from the user in the command line.
```java
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
public class Test  
{ 
    public static void main(String[] args) throws IOException { 
        //Enter data using BufferReader 
        BufferedReader reader =  
                   new BufferedReader(new InputStreamReader(System.in)); 
         
        // Reading data using readLine 
        String name = reader.readLine(); 
  
        // Printing the read line 
        System.out.println(name);         
    } 
} 
```
**2. Using Scanner Class**: The main purpose of the Scanner class is to parse primitive types and strings using regular expressions, however it is also can be used to read input from the user in the command line.
```java
import java.util.Scanner; 
  
class GetInputFromUser 
{ 
    public static void main(String args[]) { 
        // Using Scanner for Getting Input from User 
        Scanner in = new Scanner(System.in); 
  
        String s = in.nextLine(); 
        System.out.println("You entered string "+s); 
  
        int a = in.nextInt(); 
        System.out.println("You entered integer "+a); 
  
        float b = in.nextFloat(); 
        System.out.println("You entered float "+b); 
    } 
} 
```  
**3. Using Console Class**: It has been becoming a preferred way for reading user’s input from the command line. In addition, it can be used for reading password-like input without echoing the characters entered by the user; the format string syntax can also be used (like System.out.printf()).
```java
public class Sample  
{ 
   public static void main(String[] args) {         
      // Using Console to input data from user 
      String name = System.console().readLine(); 
      System.out.println(name); 
   } 
}
```
#### Q. How can you avoid serialization in child class if the base class is implementing the Serializable interface?
If superClass has implemented Serializable that means subclass is also Serializable (as subclass always inherits all features from its parent class), for avoiding Serialization in sub-class we can define **writeObject()** method and throw **NotSerializableException()** from there as done below.
```java
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

class Super implements Serializable {
   private static final long serialVersionUID = 1L;
}
 
class Sub extends Super {
    
    private static final long serialVersionUID = 1L;
    private Integer id;
    
    public Sub(Integer id) {
           this.id = id;
    }
 
    @Override
    public String toString() {
           return "Employee [id=" + id + "]";
    }
    
    /*
     * define how Serialization process will write objects.  
     */
   private void writeObject(ObjectOutputStream os) throws NotSerializableException {
         throw new NotSerializableException("This class cannot be Serialized");
   }
}
 
public class SerializeDeserialize {
 
    public static void main(String[] args) {
 
           Sub object1 = new Sub(8);
           try {
                  OutputStream fout = new FileOutputStream("ser.txt");
                  ObjectOutput oout = new ObjectOutputStream(fout);
                  System.out.println("Serialization process has started, serializing objects...");
                  oout.writeObject(object1);
                  fout.close();
                  oout.close();
                  System.out.println("Object Serialization completed.");
           } catch (IOException  e) {
                  e.printStackTrace();
           }
    }
}
```
Output
```
Serialization process has started, serializing objects...
java.io.NotSerializableException: This class cannot be Serialized
    at SerDeser11throwNotSerExc.Sub.writeObject(SerializeConstructorCheck.java:35)
    at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
    at sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)
    at sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)
    at java.lang.reflect.Method.invoke(Unknown Source)
    at java.io.ObjectStreamClass.invokeWriteObject(Unknown Source)
    at java.io.ObjectOutputStream.writeSerialData(Unknown Source)
    at java.io.ObjectOutputStream.writeOrdinaryObject(Unknown Source)
    at java.io.ObjectOutputStream.writeObject0(Unknown Source)
    at java.io.ObjectOutputStream.writeObject(Unknown Source)
    at SerDeser11throwNotSerExc.SerializeConstructorCheck.main(SerializeConstructorCheck.java:51)
```
#### Q. What is the difference between Serializable and Externalizable interface?

|Sl.No |SERIALIZABLE |	EXTERNALIZABLE        |
|----|----------------|-----------------------|
| 01.|Serializable is a marker interface i.e. does not contain any method.|	Externalizable interface contains two methods writeExternal() and readExternal() which implementing classes MUST override.|
| 02.|Serializable interface pass the responsibility of serialization to JVM and it’s default algorithm.|	Externalizable provides control of serialization logic to programmer – to write custom logic.|
| 03.|Mostly, default serialization is easy to implement, but has higher performance cost.|Serialization done using Externalizable, add more responsibility to programmer but often result in better performance.|
| 04.|It’s hard to analyze and modify class structure because any change may break the serialization.|	It’s more easy to analyze and modify class structure because of complete control over serialization logic.|
| 05.|Default serialization does not call any class constructor.|A public no-arg constructor is required while using Externalizable interface. |

#### Q. What are the ways to instantiate the Class class?
**1. Using new keyword**
```java
MyObject object = new MyObject();
```
**2. Using Class.forName()**
```java
MyObject object = (MyObject) Class.forName("subin.rnd.MyObject").newInstance();
```
**3. Using clone()**
```java
MyObject anotherObject = new MyObject();
MyObject object = (MyObject) anotherObject.clone();
```
**4. Using object deserialization**
```java
ObjectInputStream inStream = new ObjectInputStream(anInputStream );
MyObject object = (MyObject) inStream.readObject();
```
#### Q. What is the purpose of using javap?
The javap command displays information about the fields, constructors and methods present in a class file. The javap command (also known as the Java Disassembler) disassembles one or more class files. 

 ```java
class Simple {  
  public static void main(String args[]) {  
    System.out.println("Hello World");  
  }  
}  
```
```
cmd> javap Simple  
```
Output
```
Compiled from ".java"  
class Simple {  
  Simple();  
  public static void main(java.lang.String[]);  
}  
```
#### Q. What are autoboxing and unboxing? When does it occur?
The automatic conversion of primitive data types into its equivalent Wrapper type is known as boxing and opposite operation is known as unboxing.

Example: Autoboxing
```java
class BoxingExample1 {  
   public static void main(String args[]) {  
      int a = 50;  
      Integer a2 = new Integer(a); //Boxing  
      Integer a3 = 5; //Boxing  
      
      System.out.println(a2+" "+a3);  
   }   
}  
```

Example: Unboxing 
```java
class UnboxingExample1 {  
   public static void main(String args[]) {  
      Integer i = new Integer(50);  
      int a = i;  
          
      System.out.println(a);  
   }   
} 
```
#### Q. What is a native method?
A native method is a Java method (either an instance method or a class method) whose implementation is also written in another programming language such as C/C++. Moreover, a method marked as native cannot have a body and should end with a semicolon:

**Main.java**
```java
public class Main {
   public native int intMethod(int i);
   public static void main(String[] args) {
      System.loadLibrary("Main");
      System.out.println(new Main().intMethod(2));
   }
}
```
**Main.c**
```c
#include <jni.h>
#include "Main.h"

JNIEXPORT jint JNICALL Java_Main_intMethod(
    JNIEnv *env, jobject obj, jint i) {
  return i * i;
}
```
**Compile and run**  
```
javac Main.java
javah -jni Main
gcc -shared -fpic -o libMain.so -I${JAVA_HOME}/include \
  -I${JAVA_HOME}/include/linux Main.c
java -Djava.library.path=. Main
```
Output
```
4
```
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
#### Q. Explain about Exception Propagation.
#### Q. What’s the base class of all exception classes?
#### Q. What are important methods of Java Exception Class?
#### Q. How to write custom exception in Java?
#### Q. What are different scenarios causing “Exception in thread main”?
#### Q. What happens when exception is thrown by main method?
#### Q. Provide some Java Exception Handling Best Practices?
#### Q. What are the differences between Checked Exception and Unchecked Exception?
#### Q. What purpose does the keywords final, finally, and finalize, fulfill?
#### Q. What are the differences between throw and throws?
#### Q. What is the base class for Error and Exception?
#### Q. Is it necessary that each try block must be followed by a catch block?
#### Q. Can finally block be used without a catch?
#### Q. Can an exception be rethrown?
#### Q. Can subclass overriding method declare an exception if parent class method doesn't throw an exception?
#### Q. What will happen to the Exception object after exception handling?
#### Q. How can an object be unreferenced?
#### Q. What is the purpose of garbage collection in Java, and when is it used?
#### Q. The difference between Serial and Parallel Garbage Collector?
#### Q. A difference between WeakReference and SoftReference in Java?
#### Q. How do you find memory usage from Java program? How much percent of the heap is used?
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