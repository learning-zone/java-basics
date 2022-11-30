# Java Basics

> *Click &#9733; if you like the project. Your contributions are heartily ♡ welcome.*

<br/>

## Related Topics

* *[Multithreading Basics](multithreading-questions.md)*
* *[Collections Basics](collections-questions.md)*
* *[JDBC Basics](JDBC-questions.md)*
* *[Java Programs](java-programs.md)*
* *[Java String Methods](java-string-methods.md)*
* *[JSP Basics](jsp-questions.md)*
* *[Servlets Basics](servlets-questions.md)*
* *[Java Multiple Choice Questions](java-multiple-choice-questions-answers.md)*
* *[Spring Basics](https://github.com/learning-zone/spring-basics)*
* *[Hibernate Basics](https://github.com/learning-zone/hibernate-basics)*
* *[Java Design Pattern](https://github.com/learning-zone/java-design-patterns)*

<br/>

## Table of Contents

* [Introduction](#-1-introduction)
* [Java Architecture](#-2-java-architecture)
* [Java Data Types](#-3-java-data-types)
* [Java Methods](#-4-java-methods)
* [Java Functional programming](#-5-java-functional-programming)
* [Java Lambda expressions](#-6-java-lambda-expressions)
* [Java Classes](#-7-java-classes)
* [Java Constructors](#-8-java-constructors)
* [Java Array](#-9-java-array)
* [Java Strings](#-10-java-strings)
* [Java Reflection](#-11-java-reflection)
* [Java Streams](#-12-java-streams)
* [Java Regular Expressions](#-13-java-regular-expressions)
* [Java File Handling](#-14-java-file-handling)
* [Java Exceptions](#-15-java-exceptions)
* [Java Inheritance](#-16-java-inheritance)
* [Java Method Overriding](#-17-java-method-overriding)
* [Java Polymorphism](#-18-java-polymorphism)
* [Java Abstraction](#-19-java-abstraction)
* [Java Interfaces](#-20-java-interfaces)
* [Java Encapsulation](#-21-java-encapsulation)
* [Java Generics](#-22-java-generics)
* [Miscellaneous](#-23-miscellaneous)

<br/>

## # 1. INTRODUCTION

<br/>

## Q. What are the important features of Java 8 release?

* Interface methods by default;
* Lambda expressions;
* Functional interfaces;
* References to methods and constructors;
* Repeatable annotations
* Annotations on data types;
* Reflection for method parameters;
* Stream API for working with collections;
* Parallel sorting of arrays;
* New API for working with dates and times;
* New JavaScript Nashorn Engine ;
* Added several new classes for thread safe operation;
* Added a new API for `Calendar`and `Locale`;
* Added support for Unicode 6.2.0 ;
* Added a standard class for working with Base64 ;
* Added support for unsigned arithmetic;
* Improved constructor `java.lang.String(byte[], *)` and method performance `java.lang.String.getBytes()`;
* A new implementation `AccessController.doPrivileged` that allows you to set a subset of privileges without having to check all * other access levels;
* Password-based algorithms have become more robust;
* Added support for SSL / TLS Server Name Indication (NSI) in JSSE Server ;
* Improved keystore (KeyStore);
* Added SHA-224 algorithm;
* Removed JDBC Bridge - ODBC;
* PermGen is removed , the method for storing meta-data of classes is changed;
* Ability to create profiles for the Java SE platform, which include not the entire platform, but some part of it;
* Tools
    * Added utility `jjs` for using JavaScript Nashorn;
    * The command `java` can run JavaFX applications;
    * Added utility `jdeps` for analyzing .class files.

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What is Nashorn?

**Nashorn** is a JavaScript engine developed in Java by Oracle. Designed to provide the ability to embed JavaScript code in Java applications. Compared to Rhino , which is supported by the Mozilla Foundation, Nashorn provides 2 to 10 times better performance, as it compiles code and transfers bytecode to the Java virtual machine directly in memory. Nashorn can compile JavaScript code and generate Java classes that are loaded with a special loader. It is also possible to call Java code directly from JavaScript.

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What is jjs?

`jjs` - This is a command line utility that allows you to execute JavaScript programs directly in the console.

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. In Java, How many ways you can take input from the console?

In Java, there are three different ways for reading input from the user in the command line environment ( console ).

**1. Using Buffered Reader Class:**

This method is used by wrapping the System.in ( standard input stream ) in an InputStreamReader which is wrapped in a BufferedReader, we can read input from the user in the command line.

```java
/**
 * Buffered Reader Class
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Reading data using readLine
        String name = reader.readLine();

        // Printing the read line
        System.out.println(name);
    }
}
```

**2. Using Scanner Class:**

The main purpose of the Scanner class is to parse primitive types and strings using regular expressions, however it is also can be used to read input from the user in the command line.

```java
/**
 * Scanner Class
 */
import java.util.Scanner;

class GetInputFromUser {
    public static void main(String args[]) {
        // Using Scanner for Getting Input from User
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        System.out.println("You entered string " + s);

        int a = in.nextInt();
        System.out.println("You entered integer " + a);

        float b = in.nextFloat();
        System.out.println("You entered float " + b);
    }
}
```  

**3. Using Console Class:**

It has been becoming a preferred way for reading user\'s input from the command line. In addition, it can be used for reading password-like input without echoing the characters entered by the user; the format string syntax can also be used ( like System.out.printf() ).

```java
/**
 * Console Class
 */
public class Sample {
    public static void main(String[] args) {
        // Using Console to input data from user
        String name = System.console().readLine();
        System.out.println(name);
    }
}
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What is the purpose of using javap?

The **javap** command displays information about the fields, constructors and methods present in a class file. The javap command ( also known as the Java Disassembler ) disassembles one or more class files.

 ```java
 /**
  * Java Disassembler
  */
class Simple {
    public static void main(String args[]) {
        System.out.println("Hello World");
    }
}
```

```cmd
cmd> javap Simple.class  
```

Output

```java
Compiled from ".java"  
class Simple {  
  Simple();  
  public static void main(java.lang.String[]);  
}  
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. Explain the expression `System.out::println`?

The specified expression illustrates passing a reference to a static method of a `println()`class `System.out`.

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. Tell us about parallel processing in Java 8?

Streams can be sequential and parallel. Operations on sequential streams are performed in one processor thread, on parallel streams - using several processor threads. Parallel streams use the shared stream `ForkJoinPool`through the static `ForkJoinPool.commonPool()`method. In this case, if the environment is not multi-core, then the stream will be executed as sequential. In fact, the use of parallel streams is reduced to the fact that the data in the streams will be divided into parts, each part is processed on a separate processor core, and in the end these parts are connected, and final operations are performed on them.

You can also use the `parallelStream()`interface method to create a parallel stream from the collection `Collection`.

To make a regular sequential stream parallel, you must call the `Stream`method on the object `parallel()`. The method `isParallel()`allows you to find out if the stream is parallel.

Using, methods `parallel()`and `sequential()`it is possible to determine which operations can be parallel, and which only sequential. You can also make a parallel stream from any sequential stream and vice versa:

```java
collection
  .stream ()
  .peek ( ... ) // operation is sequential
  .parallel ()
  .map ( ... ) // the operation can be performed in parallel,
  .sequential ()
  .reduce ( ... ) // operation is sequential again
```

As a rule, elements are transferred to the stream in the same order in which they are defined in the data source. When working with parallel streams, the system preserves the sequence of elements. An exception is a method `forEach()`that can output elements in random order. And in order to maintain the order, it is necessary to apply the method `forEachOrdered()`.

* Criteria that may affect performance in parallel streams:
* Data size - the more data, the more difficult it is to separate the data first, and then combine them.
* The number of processor cores. Theoretically, the more cores in a computer, the faster the program will work. If the machine has one core, it makes no sense to use parallel threads.
* The simpler the data structure the stream works with, the faster operations will occur. For example, data from is `ArrayList`easy to use, since the structure of this collection assumes a sequence of unrelated data. But a type collection  `LinkedList`is not the best option, since in a sequential list all the elements are connected with previous / next. And such  data is difficult to parallelize.
* Operations with primitive types will be faster than with class objects.
* It is highly recommended that you do not use parallel streams for any long operations (for example, network connections),  since all parallel streams work with one `ForkJoinPool`, such long operations can stop all parallel streams in the JVM due to  the lack of available threads in the pool, etc. e. parallel streams should be used only for short operations where the count  goes for milliseconds, but not for those where the count can go for seconds and minutes;
* Saving order in parallel streams increases execution costs, and if order is not important, it is possible to disable its  saving and thereby increase productivity by using an intermediate operation `unordered()`:

```java
collection.parallelStream ()
    .sorted ()
    .unordered ()
    .collect ( Collectors . toList ());
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## # 2. JAVA ARCHITECTURE

<br/>

## Q. What is JVM and is it platform independent?

Java Virtual Machine (JVM) is a specification that provides runtime environment in which java bytecode(.class files) can be executed. The JVM is the platform. The JVM acts as a "virtual" machine or processor. Java\'s platform independence consists mostly of its Java Virtual Machine (JVM). JVM makes this possible because it is aware of the specific instruction lengths and other particularities of the platform (Operating System).

The JVM is not platform independent. Java Virtual Machine (JVM) provides the environment to execute the java file(. Class file). So at the end it's depends on kernel and kernel is differ from OS (Operating System) to OS. The JVM is used to both translate the bytecode into the machine language for a particular computer and actually execute the corresponding machine-language instructions as well.

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What is JIT compiler in Java?

The Just-In-Time (JIT) compiler is a component of the runtime environment that improves the performance of Java applications by compiling bytecodes to native machine code at run time.

Java programs consists of classes, which contain platform-neutral bytecodes that can be interpreted by a JVM on many different computer architectures. At run time, the JVM loads the class files, determines the semantics of each individual bytecode, and performs the appropriate computation. The additional processor and memory usage during interpretation means that a Java application performs more slowly than a native application. The JIT compiler helps improve the performance of Java programs by compiling bytecodes into native machine code at run time. The JIT compiler is enabled by default. When a method has been compiled, the JVM calls the compiled code of that method directly instead of interpreting it.

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What is Classloader in Java?

The **Java ClassLoader** is a part of the Java Runtime Environment that dynamically loads Java classes into the Java Virtual Machine. Java code is compiled into class file by javac compiler and JVM executes Java program, by executing byte codes written in class file. ClassLoader is responsible for loading class files from file system, network or any other source.

**Types of ClassLoader:**

**1. Bootstrap Class Loader**:

It loads standard JDK class files from rt.jar and other core classes. It loads class files from jre/lib/rt.jar. For example, java.lang package class.

**2. Extensions Class Loader**:

It loads classes from the JDK extensions directly usually `JAVA_HOME/lib/ext` directory or any other directory as java.ext.dirs.

**3. System Class Loader**:

It loads application specific classes from the CLASSPATH environment variable. It can be set while invoking program using -cp or classpath command line options.

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. Java Compiler is stored in JDK, JRE or JVM?

**1. JDK**:

Java Development Kit is the core component of Java Environment and provides all the tools, executables and binaries required to compile, debug and execute a Java Program.

**2. JVM**:

JVM is responsible for converting Byte code to the machine specific code. JVM is also platform dependent and provides core java functions like memory management, garbage collection, security etc. JVM is customizable and we can use java options to customize it, for example allocating minimum and maximum memory to JVM. JVM is called virtual because it provides an interface that does not depend on the underlying operating system and machine hardware.

**2. JRE**:

Java Runtime Environment provides a platform to execute java programs. JRE consists of JVM and java binaries and other classes to execute any program successfully.

<p align="center">
  <img src="assets/jdk.jpg" alt="Java Compiler" width="500px"  />
</p>

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What is difference between Heap and Stack Memory in java?

**1. Java Heap Space:**  

Java Heap space is used by java runtime to allocate memory to **Objects** and **JRE classes**. Whenever we create any object, it\'s always created in the Heap space.

Garbage Collection runs on the heap memory to free the memory used by objects that doesn\'t have any reference. Any object created in the heap space has global access and can be referenced from anywhere of the application.

**2. Java Stack Memory:**

Stack in java is a section of memory which contains **methods**, **local variables** and **reference variables**. Local variables are created in the stack.

Stack memory is always referenced in LIFO ( Last-In-First-Out ) order. Whenever a method is invoked, a new block is created in the stack memory for the method to hold local primitive values and reference to other objects in the method.

As soon as method ends, the block becomes unused and become available for next method. Stack memory size is very less compared to Heap memory.

**Difference:**  

|Parameter	       |Stack Memory	               |Heap Space                       |
|------------------|-----------------------------|-----------------------------------|
|Application	   |Stack is used in parts, one at a time during execution of a thread|	The entire application uses Heap space during runtime|
|Size	           |Stack has size limits depending upon OS and is usually smaller then Heap|There is no size limit on Heap|
|Storage	       |Stores only primitive variables and references to objects that are created in Heap Space|All the newly created objects are stored here|
|Order	           |It is accessed using Last-in First-out (LIFO) memory allocation system|	This memory is accessed via complex memory management techniques that include Young Generation, Old or Tenured Generation, and Permanent Generation.|
|Life	           |Stack memory only exists as long as the current method is running|Heap space exists as long as the application runs|
|Efficiency	       |Comparatively much faster to allocate when compared to heap| Slower to allocate when compared to stack|
|Allocation/Deallocation| This Memory is automatically allocated and deallocated when a method is called and returned respectively|Heap space is allocated when new objects are created and deallocated by Gargabe Collector when they are no longer referenced |

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. How many types of memory areas are allocated by JVM?

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

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## # 3. JAVA DATA TYPES

<br/>

## Q. What are autoboxing and unboxing?

The automatic conversion of primitive data types into its equivalent Wrapper type is known as boxing and opposite operation is known as unboxing.

**Example:** Autoboxing

```java
/**
 * Autoboxing
 */
class BoxingExample {
    public static void main(String args[]) {
        int a = 50;
        Integer a2 = new Integer(a); // Boxing
        Integer a3 = 5; // Boxing

        System.out.println(a2 + " " + a3);
    }
} 
```

**Example:** Unboxing

```java
/**
 * Unboxing
 */
class UnboxingExample {
    public static void main(String args[]) {
        Integer i = new Integer(50);
        int a = i;

        System.out.println(a);
    }
}
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What is the difference between transient and volatile variable in Java?

**1. Transient:**

The transient modifier tells the Java object serialization subsystem to exclude the field when serializing an instance of the class. When the object is then deserialized, the field will be initialized to the default value; i.e. null for a reference type, and zero or false for a primitive type.

**Example:**

```java
/**
 * Transient
 */
public transient int limit = 55;   // will not persist
public int b;   // will persist
```

**2. Volatile:**

The volatile modifier tells the JVM that writes to the field should always be synchronously flushed to memory, and that reads of the field should always read from memory. This means that fields marked as volatile can be safely accessed and updated in a multi-thread application without using native or standard library-based synchronization.

**Example:**

```java
/**
 * Volatile
 */
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

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What are assertions in Java?

An assertion allows testing the correctness of any assumptions that have been made in the program. Assertion is achieved using the assert statement in Java.

While executing assertion, it is believed to be true. If it fails, JVM throws an error named `AssertionError`. It is mainly used for testing purposes during development.

The assert statement is used with a Boolean expression and can be written in two different ways.

```java
// First way 
assert expression;

// Second way
assert expression1 : expression2;
```

**Example:**

```java
/**
 * Assertions
 */
public class Example {
    public static void main(String[] args) {
        int age = 14;
        assert age <= 18 : "Cannot Vote";
        System.out.println("The voter's age is " + age);
    }
}
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What is the final variable, final class, and final blank variable?

**1. Final Variable:**

Final variables are nothing but constants. We cannot change the value of a final variable once it is initialized.

**Example:**

```java
/**
 * Final Variable
 */
class Demo {

    final int MAX_VALUE = 99;

    void myMethod() {
        MAX_VALUE = 101;
    }

    public static void main(String args[]) {
        Demo obj = new Demo();
        obj.myMethod();
    }
}
```

Output

```java
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The final field Demo.MAX_VALUE cannot be assigned

	at beginnersbook.com.Demo.myMethod(Details.java:6)
	at beginnersbook.com.Demo.main(Details.java:10)
```

**2. Blank final variable:**

A final variable that is not initialized at the time of declaration is known as blank final variable. We must initialize the blank final variable in constructor of the class otherwise it will throw a compilation error ( Error: `variable MAX_VALUE might not have been initialized` ).

**Example:**

```java
/**
 * Blank final variable
 */
class Demo {
    // Blank final variable
    final int MAX_VALUE;

    Demo() {
        // It must be initialized in constructor
        MAX_VALUE = 100;
    }

    void myMethod() {
        System.out.println(MAX_VALUE);
    }

    public static void main(String args[]) {
        Demo obj = new Demo();
        obj.myMethod();
    }
}
```

Output

```java
100
```

**3. Final Method:**

A final method cannot be overridden. Which means even though a sub class can call the final method of parent class without any issues but it cannot override it.

**Example:**

```java
/**
 * Final Method
 */
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
        ABC obj = new ABC();
        obj.demo();
    }
}
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What is a compile time constant in Java?

If a primitive type or a string is defined as a constant and the value is known at compile time, the compiler replaces the constant name everywhere in the code with its value. This is called a compile-time constant.

**Compile time constant must be:**  

* Declared final
* Primitive or String
* Initialized within declaration
* Initialized with constant expression

They are replaced with actual values at compile time because compiler know their value up-front and also knows that it cannot be changed during run-time.

```java
private final int x = 10;
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What are the different access specifiers available in java?

* access specifiers/modifiers helps to restrict the scope of a class, constructor, variable, method, or data member.
* There are four types of access modifiers available in java:
    1. `default` – No keyword required, when a class, constructor,variable, method, or data member declared without any access specifier then it is having default access scope i.e. accessible only within the same package.
    2. `private` - when declared as a private , access scope is limited within the enclosing class.
    3. `protected` - when declared as protocted, access scope is limited to enclosing classes, subclasses from same package as well as other packages.
    4. `public` - when declared as public, accessible everywhere in the program.

```java
    ... /* data member variables */
    String firstName="Pradeep";     /* default scope */
    protected isValid=true;         /* protected scope */
    private String otp="AB0392";    /* private scope */
    public int id = 12334;          /* public scope */
    ...
    ... /* data member functions */
    String getFirstName(){ return this.firstName; } /* default scope */
    protected boolean getStatus(){this.isValid;}    /* protected scope */
    private void generateOtp(){                     /* private scope */
        this.otp = this.hashCode() << 16;
    };    
    public int getId(){ return this.id; }           /* public scope */
    ...
    .../* inner classes */
    class A{}            /* default scope */
    protected class B{}  /* protected scope */
    private class C{}    /* private scope */
    public class D{}     /* public scope */
    ...
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## # 4. JAVA METHODS

<br/>

## Q. Can you have virtual functions in Java?

In Java, all non-static methods are by default **virtual functions**. Only methods marked with the keyword `final`, which cannot be overridden, along with `private methods`, which are not inherited, are non-virtual.

**Example:** Virtual function with Interface

```java
/**
 * The function applyBrakes() is virtual because
 * functions in interfaces are designed to be overridden.
 **/
interface Bicycle {
    void applyBrakes();
}

class ACMEBicycle implements Bicycle {
    public void applyBrakes() { // Here we implement applyBrakes()
        System.out.println("Brakes applied"); // function
    }
}
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What is a native method?

A native method is a Java method (either an instance method or a class method) whose implementation is also written in another programming language such as C/C++. Moreover, a method marked as native cannot have a body and should end with a semicolon:

**Main.java:**

```java
public class Main {
    public native int intMethod(int i);

    public static void main(String[] args) {
        System.loadLibrary("Main");
        System.out.println(new Main().intMethod(2));
    }
}
```

**Main.c:**

```c
#include <jni.h>
#include "Main.h"

JNIEXPORT jint JNICALL Java_Main_intMethod(
    JNIEnv *env, jobject obj, jint i) {
  return i * i;
}
```

**Compile and Run:**  

```java
javac Main.java
javah -jni Main
gcc -shared -fpic -o libMain.so -I${JAVA_HOME}/include \
  -I${JAVA_HOME}/include/linux Main.c
java -Djava.library.path=. Main
```

Output

```java
4
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What are the restrictions that are applied to the Java static methods?

If a method is declared as static, it is a member of a class rather than belonging to the object of the class. It can be called without creating an object of the class. A static method also has the power to access static data members of the class.

There are a few restrictions imposed on a static method

* The static method cannot use non-static data member or invoke non-static method directly.
* The `this` and `super` cannot be used in static context.
* The static method can access only static type data ( static type instance variable ).
* There is no need to create an object of the class to invoke the static method.
* A static method cannot be overridden in a subclass

**Example:**

```java
/**
 * Static Methods
 */
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

```java
Example.java:10: error: display() in Example cannot override display() in Parent
void display()  // trying to override display()
     ^
overridden method is static

1 error
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What is a lambda?

 What is the structure and features of using a lambda expression?
A lambda is a set of instructions that can be separated into a separate variable and then repeatedly called in various places of the program.

The basis of the lambda expression is the _lambda operator_ , which represents the arrow `->`. This operator divides the lambda expression into two parts: the left side contains a list of expression parameters, and the right actually represents the body of the lambda expression, where all actions are performed.

The lambda expression is not executed by itself, but forms the implementation of the method defined in the functional interface. It is important that the functional interface should contain only one single method without implementation.

```java
interface  Operationable {
     int  calculate ( int  x , int  y );
}

public  static  void main ( String [] args) {
    Operationable operation = (x, y) - > x + y;     
    int result = operation.calculate ( 10 , 20 );
    System.out.println (result); // 30 
}
```

In fact, lambda expressions are in some way a shorthand form of internal anonymous classes that were previously used in Java.

* _Deferred execution lambda expressions_ - it is defined once in one place of the program, it is called if necessary, any number of times and in any place of the program.

* _The parameters of the lambda expression_ must correspond in type to the parameters of the functional interface method:

```javascript
operation = ( int x, int y) - > x + y;
// When writing the lambda expression itself, the parameter type is allowed not to be specified: 
(x, y) - > x + y;
// If the method does not accept any parameters, then empty brackets are written, for example: 
() - >  30  +  20 ;
// If the method accepts only one parameter, then the brackets can be omitted: 
n - > n * n;
```

* Trailing lambda expressions are not required to return any value.

```java
interface  Printable {
     void  print( String  s );
}
 
public  static  void main ( String [] args) {
    Printable printer = s - >  System.out.println(s);
    printer.print("Hello, world");
}

// _ Block lambda - expressions_ are surrounded by curly braces . The modular lambda - expressions can be used inside nested blocks, loops, `design the if ` ` switch statement ', create variables, and so on . d . If you block a lambda - expression must return a value, it explicitly applies `statement return statement ' :


Operationable operation = ( int x, int y) - > {       
    if (y ==  0 ) {
        return  0 ;
    }
    else {
        return x / y;
    }
};
```

* Passing a lambda expression as a method parameter

```java
interface  Condition {
     boolean  isAppropriate ( int  n );
}

private  static  int sum ( int [] numbers, Condition condition) {
     int result =  0 ;
    for ( int i : numbers) {
         if (condition.isAppropriate(i)) {
            result + = i;
        }
    }
    return result;
}

public  static  void main ( String [] args) {
     System.out.println(sum ( new  int [] { 0 , 1 , 0 , 3 , 0 , 5 , 0 , 7 , 0 , 9 }, (n) - > n ! =  0 ));
} 
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What variables do lambda expressions have access to?

Access to external scope variables from a lambda expression is very similar to access from anonymous objects.

* immutable ( effectively final - not necessarily marked as final) local variables;
* class fields
* static variables.

The default methods of the implemented functional interface are not allowed to be accessed inside the lambda expression.

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What is a method reference?

If the method existing in the class already does everything that is necessary, then you can use the method reference mechanism (method reference) to directly pass this method. The result will be exactly the same as in the case of defining a lambda expression that calls this method.

**Example:**

```java
private interface Measurable {
   public int length(String string);
}

public  static  void main ( String [] args) {
   Measurable a =  String::length;
   System.out.println(a.length("abc"));
}
```

Method references are potentially more efficient than using lambda expressions. In addition, they provide the compiler with better information about the type, and if you can choose between using a reference to an existing method and using a lambda expression, you should always use a method reference.

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What types of method references do you know?

* on the static method;
* per instance method;
* to the constructor.

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## # 5. JAVA FUNCTIONAL PROGRAMMING

<br/>

## # 6. JAVA LAMBDA EXPRESSIONS

<br/>

## # 7. JAVA CLASSES

<br/>

## Q. What is difference between the Inner Class and Sub Class?

Nested Inner class can access any private instance variable of outer class. Like any other instance variable, we can have access modifier private, protected, public and default modifier.

**Example:**

```java
/**
 * Inner Class
 */
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

**Example:**

```java
/**
 * Sub Class 
 */
class Car {
    //...
}
 
class HybridCar extends Car {
    //...
}
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. Distinguish between static loading and dynamic class loading?

**1. Static Class Loading:**

Creating objects and instance using `new` keyword is known as static class loading. The retrieval of class definition and instantiation of the object is done at compile time.

**Example:**

```java
/**
 * Static Class Loading 
 */
class TestClass {
  public static void main(String args[]) {
      TestClass tc = new TestClass();
  }
}
```

**2. Dynamic Class Loading:**

Loading classes use `Class.forName()` method. Dynamic class loading is done when the name of the class is not known at compile time.

**Example:**

```java
/**
 * Dynamic Class Loading 
 */
Class.forName (String className);
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What is the purpose of the Runtime class and System class?

**1. Runtime Class:**

The **java.lang.Runtime** class is a subclass of Object class, provide access to the Java runtime system. The runtime information like memory availability, invoking the garbage collector, etc.

**Example:**

```java
/**
 * Runtime Class
 */
public class RuntimeTest 
{
    static class Message extends Thread {
        public void run() {
            System.out.println(" Exit");
        }
    }

    public static void main(String[] args) {
        try {
            Runtime.getRuntime().addShutdownHook(new Message());
            System.out.println(" Program Started...");
            System.out.println(" Wait for 5 seconds...");
            Thread.sleep(5000);
            System.out.println(" Program Ended...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

**2. System Class:**

The purpose of the System class is to provide access to system resources. It contains accessibility to standard input, standart output, error output streams, current time in millis, terminating the application, etc.

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What are the ways to instantiate the Class class?

**1. Using new keyword:**

```java
MyObject object = new MyObject();
```

**2. Using Class.forName():**

```java
MyObject object = (MyObject) Class.forName("subin.rnd.MyObject").newInstance();
```

**3. Using clone():**

```java
MyObject anotherObject = new MyObject();
MyObject object = (MyObject) anotherObject.clone();
```

**4. Using object deserialization:**

```java
ObjectInputStream inStream = new ObjectInputStream(anInputStream );
MyObject object = (MyObject) inStream.readObject();
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What is immutable object?

Immutable objects are objects that don\'t change. A Java immutable object must have all its fields be internal, private final fields. It must not implement any setters. It needs a constructor that takes a value for every single field.

**Creating an Immutable Object:**  

* Do not add any setter method
* Declare all fields final and private
* If a field is a mutable object create defensive copies of it for getter methods
* If a mutable object passed to the constructor must be assigned to a field create a defensive copy of it
* Don\'t allow subclasses to override methods.

```java
/**
 * Immutable Object
 */
public class DateContainer {
    private final Date date;

    public DateContainer() {
        this.date = new Date();
    }

    public Date getDate() {
        return new Date(date.getTime());
    }
}
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. How can we create an immutable class in Java?

Immutable class means that once an object is created, we cannot change its content. In Java, all the wrapper classes (like Integer, Boolean, Byte, Short) and String class is immutable.

**Rules to create immutable classes:**  

* The class must be declared as final
* Data members in the class must be declared as final
* A parameterized constructor
* Getter method for all the variables in it
* No setters

```java
/**
 * Immutable Class
 */
public final class Employee {

    final String pancardNumber;

    public Employee(String pancardNumber) {
        this.pancardNumber = pancardNumber;
    }

    public String getPancardNumber() {
        return pancardNumber;
    }
}
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. How bootstrap class loader works in java?

Bootstrap ClassLoader is repsonsible for loading standard JDK classs files from **rt.jar** and it is parent of all class loaders in java. There are three types of built-in ClassLoader in Java:

**1. Bootstrap Class Loader:** It loads JDK internal classes, typically loads rt.jar and other core classes for example java.lang.* package classes  

**2. Extensions Class Loader:** It loads classes from the JDK extensions directory, usually $JAVA_HOME/lib/ext directory.  

**3. System Class Loader:** It loads classes from the current classpath that can be set while invoking a program using -cp or -classpath command line options.

```java
/**
 * ClassLoader
 */
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClassLoaderTest {

    public static void main(String args[]) {
        try {
            // printing ClassLoader of this class
            System.out.println("ClassLoader : " + ClassLoaderTest.class.getClassLoader());

            // trying to explicitly load this class again using Extension class loader
            Class.forName("Explicitly load class", true, ClassLoaderTest.class.getClassLoader().getParent());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClassLoaderTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. How can we create a object of a class without using new operator?

Different ways to create an object in Java

* **Using new Keyword:**

```java
class ObjectCreationExample{
	String Owner;
}
public class MainClass {
	public static void main(String[] args) {
		// Here we are creating Object of JBT using new keyword
		ObjectCreationExample obj = new ObjectCreationExample();
	}
}
```

* **Using New Instance (Reflection)**

```java
class CreateObjectClass {
	static int j = 10;
	CreateObjectClass() {
		i = j++;
	}
	int i;
	@Override
	public String toString() {
		return "Value of i :" + i;
	}
}

class MainClass {
	public static void main(String[] args) {
		try {
			Class cls = Class.forName("CreateObjectClass");
			CreateObjectClass obj = (CreateObjectClass) cls.newInstance();
			CreateObjectClass obj1 = (CreateObjectClass) cls.newInstance();
			System.out.println(obj);
			System.out.println(obj1);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
```

* **Using Clone:**

```java
 class CreateObjectWithClone implements Cloneable {
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	int i;
	static int j = 10;
	CreateObjectWithClone() {
		i = j++;
	}
	@Override
	public String toString() {
		return "Value of i :" + i;
	}
}

class MainClass {
	public static void main(String[] args) {
		CreateObjectWithClone obj1 = new CreateObjectWithClone();
		System.out.println(obj1);
		try {
			CreateObjectWithClone obj2 = (CreateObjectWithClone) obj1.clone();
			System.out.println(obj2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
```

* **Using ClassLoader**

```java
class CreateObjectWithClassLoader {
	static int j = 10;
	CreateObjectWithClassLoader() {
		i = j++;
	}
	int i;
	@Override
	public String toString() {
		return "Value of i :" + i;
	}
}

public class MainClass {
	public static void main(String[] args) {
		CreateObjectWithClassLoader obj = null;
		try {
			obj = (CreateObjectWithClassLoader) new MainClass().getClass()
					.getClassLoader().loadClass("CreateObjectWithClassLoader").newInstance();
        // Fully qualified classname should be used.
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(obj);
	}
}
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What are methods of Object Class?

The Object class is the parent class of all the classes in java by default.

<table class="alt">
<tbody><tr><th>Method</th><th>Description</th></tr>
<tr><td>public final Class getClass()</td><td>returns the Class class object of this object. The Class class can further be used to get the metadata of this class.</td></tr>
<tr><td>public int hashCode()</td><td> returns the hashcode number for this object.</td></tr>
<tr><td>public boolean equals(Object obj)</td><td> compares the given object to this object.</td></tr>
<tr><td>protected Object clone() throws CloneNotSupportedException</td><td> creates and returns the exact copy (clone) of this object.</td></tr>
<tr><td>public String toString()</td><td> returns the string representation of this object.</td></tr>
<tr><td>public final void notify()</td><td> wakes up single thread, waiting on this object\'s monitor.</td></tr>
<tr><td>public final void notifyAll()</td><td> wakes up all the threads, waiting on this object\'s monitor.</td></tr>
<tr><td>public final void wait(long timeout)throws InterruptedException</td><td> causes the current thread to wait for the specified milliseconds, until another thread notifies (invokes notify() or notifyAll() method).</td></tr>
<tr><td>public final void wait(long timeout,int nanos)throws InterruptedException</td><td>causes the current thread to wait for the specified milliseconds and nanoseconds, until another thread notifies (invokes notify() or notifyAll() method).</td></tr>
<tr><td>public final void wait()throws InterruptedException</td><td> causes the current thread to wait, until another thread notifies (invokes notify() or notifyAll() method).</td></tr>
<tr><td>protected void finalize()throws Throwable</td><td> is invoked by the garbage collector before object is being garbage collected.</td></tr>
</tbody></table>

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What is Optional

An optional value `Optional`is a container for an object that may or may not contain a value `null`. Such a wrapper is a convenient means of prevention `NullPointerException`, as has some higher-order functions, eliminating the need for repeating `if null/notNullchecks`:

```java
Optional < String > optional =  Optional.of( " hello " );

optional.isPresent(); // true 
optional.ifPresent(s ->  System.out.println(s.length())); // 5 
optional.get(); // "hello" 
optional.orElse( " ops ... " ); // "hello"
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## # 8. JAVA CONSTRUCTORS

<br/>

## Q. How many types of constructors are used in Java?

In Java, a constructor is a block of codes similar to the method. It is called when an instance of the class is created. At the time of calling constructor, memory for the object is allocated in the memory.

**Types of Java Constructors:**  

* Default Constructor (or) no-arg Constructor
* Parameterized Constructor

**Example:** Default Constructor (or) no-arg constructor

```java
/**
 * Default Constructor
 */
public class Car {
    Car() {
        System.out.println("Default Constructor of Car class called");
    }

    public static void main(String args[]) {
        // Calling the default constructor
        Car c = new Car();
    }
}
```

Output

```java
Default Constructor of Car class called
```

**Example:** Parameterized Constructor

```java
/**
 * Parameterized Constructor
 */
public class Car {
    String carColor;

    Car(String carColor) {
        this.carColor = carColor;
    }

    public void display() {
        System.out.println("Color of the Car is : " + carColor);
    }

    public static void main(String args[]) {
        // Calling the parameterized constructor
        Car c = new Car("Blue");
        c.display();
    }
}
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. How can constructor chaining be done using this keyword?

Java constructor chaining is a method of calling one constructor with the help of another while considering the present object. It can be done in 2 ways –

* **Within same class**: It can be done using `this()` keyword for constructors in the same class.
* **From base class**: By using `super()` keyword to call a constructor from the base class.

```java
/**
 * Constructor Chaining 
 * within same class Using this() keyword 
 */
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

```java
30
10
The Default constructor
```

```java
/**
 * Constructor Chaining to 
 * other class using super() keyword 
 */
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

```java
Calling parameterized constructor of base
Calling parameterized constructor of derived
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What is a private constructor?

* A constructor with private access specifier/modifier is private constructor. 
* It is only accessible inside the class by its data members(instance fields,methods,inner classes) and in static block.
* Private Constructor be used in **Internal Constructor chaining and Singleton class design pattern**

```java
public class MyClass {
    
    static{
        System.out.println("outer static block..");
        new MyClass();
    }
    
    private MyInner in;
    
    {
        System.out.println("outer instance block..");
        //new MyClass(); //private constructor accessbile but bad practive will cause infinite loop 
    }
    
    private MyClass(){
        System.out.println("outer private constructor..");
    }
    
    public void getInner(){
        System.out.println("outer data member function..");
        
        new MyInner();
    }

    private static class MyInner{
        {
            System.out.println("inner instance block..");
            new MyClass();
        }
        
        MyInner(){
            System.out.println("inner constructor..");
        }
    }
    
    
    public static void main(String args[]) {
        System.out.println("static main method..");
        MyClass m=new MyClass();
        m.getInner();
    }
}

class Visitor{
    {
        new MyClass();//gives compilation error as MyClass() has private access in MyClass
    }
}
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## # 9. JAVA ARRAY

<br/>

## Q. What is copyonwritearraylist in java?

* `CopyOnWriteArrayList` class implements `List` and `RandomAccess` interfaces and thus provide all functionalities available in `ArrayList` class.
* Using `CopyOnWriteArrayList` is costly for update operations, because each mutation creates a cloned copy of underlying array and add/update element to it.
* It is `thread-safe` version of ArrayList. Each thread accessing the list sees its own version of snapshot of backing array created while initializing the iterator for this list.
* Because it gets `snapshot` of underlying array while creating iterator, it does not throw `ConcurrentModificationException`.
* Mutation operations on iterators (remove, set, and add) are not supported. These methods throw `UnsupportedOperationException`.
* CopyOnWriteArrayList is a concurrent `replacement for a synchronized List` and offers better concurrency when iterations outnumber mutations.
* It `allows duplicate elements and heterogeneous Objects` (use generics to get compile time errors).
* Because it creates a new copy of array everytime iterator is created, `performance is slower than ArrayList`.
* We can prefer to use CopyOnWriteArrayList over normal ArrayList in following cases:

    - When list is to be used in concurrent environemnt.
    - Iterations outnumber the mutation operations.
    - Iterators must have snapshot version of list at the time when they were created.
    - We don\'t want to synchronize the thread access programatically.

```java
        import java.util.concurrent.CopyOnWriteArrayList;
        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<String>();
        copyOnWriteArrayList.add("captain america");
        Iterator it = copyOnWriteArrayList.iterator();  //iterator creates separate snapshot
        copyOnWriteArrayList.add("iron man");           //doesn't throw ConcurrentModificationException
        while(it.hasNext())
            System.out.println(it.next());              // prints captain america only , since add operation is after returning iterator

        it = copyOnWriteArrayList.iterator();           //fresh snapshot
        while(it.hasNext())
            System.out.println(it.next());              // prints captain america and iron man, 
        
        it = copyOnWriteArrayList.iterator();           //fresh snapshot
        while(it.hasNext()){
            System.out.println(it.next());
            it.remove();                                //mutable operation 'remove' not allowed ,throws UnsupportedOperationException                            
        }

        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        Iterator ait = list.iterator();
        list.add("B");                                      // immediately throws  ConcurrentModificationException
        while(ait.hasNext())
            System.out.println(ait.next()); 
        
        ait = list.iterator();
        while(ait.hasNext()){
            System.out.println(ait.next());
            ait.remove();                                //mutable operation 'remove' allowed without any exception                            
        }
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## # 10. JAVA STRINGS

<br/>

## Q. What is the difference between creating String as new() and literal?

When you create String object using `new()` operator, it always create a new object in heap memory. On the other hand, if you create object using String literal syntax e.g. "Java", it may return an existing object from String pool ( a cache of String object in Perm gen space, which is now moved to heap space in recent Java release ), if it\'s already exists. Otherwise it will create a new string object and put in string pool for future re-use.

**Example:**

```java
/**
 * String literal
 */
String a = "abc"; 
String b = "abc";
System.out.println(a == b);  // true

/**
 * Using new()
 */
String c = new String("abc");
String d = new String("abc");
System.out.println(c == d);  // false
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What is difference between String, StringBuffer and StringBuilder?

**1. Mutability Difference:**

`String` is **immutable**, if you try to alter their values, another object gets created, whereas `StringBuffer` and `StringBuilder` are **mutable** so they can change their values.

**2. Thread-Safety Difference:**

The difference between `StringBuffer` and `StringBuilder` is that StringBuffer is thread-safe. So when the application needs to be run only in a single thread then it is better to use StringBuilder. StringBuilder is more efficient than StringBuffer.

**Example:**  

```java
/**
 * StringBuffer
 */
public class BufferTest {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Hello");
        buffer.append(" World");
        System.out.println(buffer);
    }
}
```

**Example:**  

```java
/**
 * StringBuilder
 */
public class BuilderTest {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Hello");
        builder.append(" World");
        System.out.println(builder);
    }
}
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. Why string is immutable in java?

The string is Immutable in Java because String objects are cached in String pool. Since cached String literals are shared between multiple clients there is always a risk, where one client\'s action would affect all another client.

Since string is immutable it can safely share between many threads and avoid any synchronization issues in java.

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What is Java String Pool?

String Pool in java is a pool of Strings stored in Java Heap Memory. String pool helps in saving a lot of space for Java Runtime although it takes more time to create the String.

When we use double quotes to create a String, it first looks for String with the same value in the String pool, if found it just returns the reference else it creates a new String in the pool and then returns the reference. However using **new** operator, we force String class to create a new String object in heap space.

```java
/**
 * String Pool
 */
public class StringPool {

    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");

        System.out.println("s1 == s2 :" + (s1 == s2)); // true
        System.out.println("s1 == s3 :" + (s1 == s3)); // false
    }
}
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What is difference between String, StringBuilder and StringBuffer?

String is `immutable`, if you try to alter their values, another object gets created, whereas `StringBuffer` and `StringBuilder` are mutable so they can change their values.  

The difference between `StringBuffer` and `StringBuilder` is that `StringBuffer` is thread-safe. So when the application needs to be run only in a single thread then it is better to use `StringBuilder`. `StringBuilder` is more efficient than StringBuffer.

**Situations:**

* If your string is not going to change use a String class because a `String` object is immutable.
* If your string can change (example: lots of logic and operations in the construction of the string) and will only be accessed from a single thread, using a `StringBuilder` is good enough.
* If your string can change, and will be accessed from multiple threads, use a `StringBuffer` because `StringBuffer` is synchronous so you have thread-safety.  

**Example:**

```java
class StringExample {

    // Concatenates to String 
    public static void concat1(String s1) { 
        s1 = s1 + "World"; 
    } 
  
    // Concatenates to StringBuilder 
    public static void concat2(StringBuilder s2) { 
        s2.append("World"); 
    } 
  
    // Concatenates to StringBuffer 
    public static void concat3(StringBuffer s3) { 
        s3.append("World"); 
    } 
  
    public static void main(String[] args) { 
        String s1 = "Hello"; 
        concat1(s1);  // s1 is not changed 
        System.out.println("String: " + s1); 
  
        StringBuilder s2 = new StringBuilder("Hello"); 
        concat2(s2); // s2 is changed 
        System.out.println("StringBuilder: " + s2); 
  
        StringBuffer s3 = new StringBuffer("Hello"); 
        concat3(s3); // s3 is changed 
        System.out.println("StringBuffer: " + s3); 
    } 
} 
```

Output  

```java
String: Hello
StringBuilder: World
StringBuffer: World
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What is StringJoiner?

The class is StringJoinerused to create a sequence of strings separated by a separator with the ability to append a prefix and suffix to the resulting string:

```java
StringJoiner joiner =  new  StringJoiner ( " . " , " Prefix- " , " -suffix " );
for ( String s :  " Hello the brave world " . split ( "  " )) {
    , joiner, . add (s);
}
System.out.println(joiner); // prefix-Hello.the.brave.world-suffix
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## # 11. JAVA REFLECTION

<br/>

## Q. What is Java Reflection API?

Reflection API in Java is used to manipulate class and its members which include fields, methods, constructor, etc. at **runtime**.

The **java.lang.Class** class provides many methods that can be used to get metadata, examine and change the run time behavior of a class. There are 3 ways to get the instance of Class class.

* forName() method of Class class
* getClass() method of Object class
* the .class syntax

**1. forName() method:**  

* is used to load the class dynamically.
* returns the instance of Class class.
* It should be used if you know the fully qualified name of class.This cannot be used for primitive types.

```java
/**
 * forName()
 */
class Simple {
}

class Test {
    public static void main(String args[]) {
        Class c = Class.forName("Simple");
        System.out.println(c.getName());
    }
}
```

Output

```java
Simple
```

**2. getClass() method:**  

It returns the instance of Class class. It should be used if you know the type. Moreover, it can be used with primitives.

```java
/**
 * getClass
 */
class Simple {
}

class Test {
    void printName(Object obj) {
        Class c = obj.getClass();
        System.out.println(c.getName());
    }

    public static void main(String args[]) {
        Simple s = new Simple();
        Test t = new Test();
        t.printName(s);
    }
} 
```

Output

```java
Simple
```

**3. The .class syntax:**  

If a type is available but there is no instance then it is possible to obtain a Class by appending ".class" to the name of the type. It can be used for primitive data type also.

```java
/**
 * .class Syntax
 */
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

```java
boolean
Test
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## # 12. JAVA STREAMS

<br/>

## Q. What is Stream?

An interface `java.util.Stream` is a sequence of elements on which various operations can be performed.

Operations on streams can be either intermediate (intermediate) or final (terminal) . Final operations return a result of a certain type, and intermediate operations return the same stream. Thus, you can build chains of several operations on the same stream.

A stream can have any number of calls to intermediate operations and the last call to the final operation. At the same time, all intermediate operations are performed lazily and until the final operation is called, no actions actually happen (similar to creating an object `Thread`or `Runnable`, without a call `start()`).

Streams are created based on sources of some, for example, classes from `java.util.Collection`.

Associative arrays (maps), for example `HashMap`, are not supported.

Operations on streams can be performed both sequentially and in parallel.

Streams cannot be reused. As soon as some final operation has been called, the flow is closed.

In addition to the universal object, there are special types of streams to work with primitive data types `int`, `long`and `double`: `IntStream`, `LongStream`and `DoubleStream`. These primitive streams work just like regular object streams, but with the following differences:

* use specialized lambda expressions, for example, `IntFunction`or `IntPredicate`instead of `Function`and `Predicate`;
* support additional end operations `sum()`, `average()`, `mapToObj()`.

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What are the ways to create a stream?

* Using collection:

```java
Stream < String > fromCollection =  Arrays.asList ( " x " , " y " , " z " ).stream ();
```

* Using  set of values:

```java
Stream < String > fromValues =  Stream.of( " x " , " y " , " z " );
```

* Using Array

```java
Stream < String > fromArray =  Arrays.stream( new  String [] { " x " , " y " , " z " });
```

* Using file (each line in the file will be a separate element in the stream):

```java
Stream < String > fromFile =  Files.lines( Paths.get(" input.txt "));
```

* From the line:

```java
IntStream fromString =  " 0123456789 " . chars ();
```

* With the help of `Stream.builder()`:

```java
Stream < String > fromBuilder =  Stream.builder().add (" z ").add(" y ").add(" z ").build ();
```

* Using `Stream.iterate()(infinite)`:

```java
Stream < Integer > fromIterate =  Stream.iterate ( 1 , n - > n +  1 );
```

* Using `Stream.generate()(infinite)`:

```java
Stream < String > fromGenerate =  Stream.generate(() ->  " 0 " );
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What is the difference between `Collection` and `Stream`?

Collections allow you to work with elements separately, while streams do not allow this, but instead provides the ability to perform functions on data as one.

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What is the method `collect()`for streams for?

A method `collect()`is the final operation that is used to represent the result as a collection or some other data structure.

`collect()`accepts an input that contains four stages:

* **supplier** — initialization of the battery,
* **accumulator** — processing of each element,
* **combiner** — connection of two accumulators in parallel execution,
* **[finisher]** —a non-mandatory method of the last processing of the accumulator. 

In Java 8, the class `Collectors` implements several common collectors:  

* `toList()`, `toCollection()`, `toSet()`- present stream in the form of a list, collection or set;
* `toConcurrentMap()`, `toMap()`- allow you to convert the stream to `Map`;
* `averagingInt()`, `averagingDouble()`, `averagingLong()`- return the average value;
* `summingInt()`, `summingDouble()`, `summingLong()`- returns the sum;
* `summarizingInt()`, `summarizingDouble()`, `summarizingLong()`- return SummaryStatisticswith different values of the aggregate;
* `partitioningBy()`- divides the collection into two parts according to the condition and returns them as `Map<Boolean, List>`;
* `groupingBy()`- divides the collection into several parts and returns `Map<N, List<T>>`;
* `mapping()`- Additional value conversions for complex Collectors.

There is also the possibility of creating your own collector through `Collector.of()`:

```java
Collector < String , a List < String > , a List < String > > toList =  Collector.of (
    ArrayList :: new ,
    List :: add,
    (l1, l2) -> {l1 . addAll (l2); return l1; }
);
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. Why do streams use `forEach()`and `forEachOrdered()` methods?

* `forEach()` applies a function to each stream object; ordering in parallel execution is not guaranteed;
* `forEachOrdered()` applies a function to each stream object while maintaining the order of the elements.

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What are `map()`, `mapToInt()`, `mapToDouble()` and `mapToLong()` methods in Stream?

The method `map()`is an intermediate operation, which transforms each element of the stream in a specified way.

`mapToInt()`, `mapToDouble()`, `mapToLong()`- analogues `map()`, returns the corresponding numerical stream (ie the stream of numerical primitives):
```java
Stream 
    .of ( " 12 " , " 22 " , " 4 " , " 444 " , " 123 " )
    .mapToInt ( Integer :: parseInt)
    .toArray (); // [12, 22, 4, 444, 123]
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What is the purpose of `filter()` method in streams?

The method `filter()` is an intermediate operation receiving a predicate that filters all elements, returning only those that match the condition.

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What is the use of `limit()` method in streams?

The method `limit()`is an intermediate operation, which allows you to limit the selection to a certain number of first elements.

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What is the use of `sorted()` method in streams?

The method `sorted()`is an intermediate operation, which allows you to sort the values ​​either in natural order or by setting Comparator.

The order of the elements in the original collection remains untouched - `sorted()`it just creates its sorted representation.

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What streamers designed methods `flatMap()`, `flatMapToInt()`, `flatMapToDouble()`, `flatMapToLong()`?

The method `flatMap()` is similar to map, but can create several from one element. Thus, each object will be converted to zero, one or more other objects supported by the stream. The most obvious way to use this operation is to convert container elements using functions that return containers.

```java
Stream 
    .of ( " Hello " , " world! " )
    .flatMap ((p) ->  Arrays.stream (p . split ( " , " )))
    .toArray ( String [] :: new ); // ["H", "e", "l", "l", "o", "w", "o", "r", "l", "d", "!"]
```

`flatMapToInt()`, `flatMapToDouble()`, `flatMapToLong()`- are analogues `flatMap()`, returns the corresponding numerical stream.

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What are the final methods of working with streams you know?

* `findFirst()` returns the first element
* `findAny()` returns any suitable item
* `collect()` presentation of results in the form of collections and other data structures
* `count()` returns the number of elements
* `anyMatch()`returns trueif the condition is satisfied for at least one element
* `noneMatch()`returns trueif the condition is not satisfied for any element
* `allMatch()`returns trueif the condition is satisfied for all elements
* `min()`returns the minimum element, using as a condition Comparator
* `max()`returns the maximum element, using as a condition Comparator
* `forEach()` applies a function to each object (order is not guaranteed in parallel execution)
* `forEachOrdered()` applies a function to each object while preserving the order of elements
* `toArray()` returns an array of values
* `reduce()`allows you to perform aggregate functions and return a single result.
* `sum()` returns the sum of all numbers
* `average()` returns the arithmetic mean of all numbers.

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What intermediate methods of working with streams do you know?

* `filter()` filters records, returning only records matching the condition;
* `skip()` allows you to skip a certain number of elements at the beginning;
* `distinct()`returns a stream without duplicates (for a method `equals()`);
* `map()` converts each element;
* `peek()` returns the same stream, applying a function to each element;
* `limit()` allows you to limit the selection to a certain number of first elements;
* `sorted()`allows you to sort values ​​either in natural order or by setting `Comparator`;
* `mapToInt()`, `mapToDouble()`, `mapToLong()`- analogues `map()`return stream numeric primitives;
* `flatMap()`, `flatMapToInt()`, `flatMapToDouble()`, `flatMapToLong()`- similar to `map()`, but can create a single element more.

For numerical streams, an additional method is available `mapToObj()`that converts the numerical stream back to the object stream.

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

#### Q. Explain Difference between Collection API and Stream API?

*ToDo*

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## # 13. JAVA REGULAR EXPRESSIONS

<br/>

## Q. Name some classes present in java.util.regex package?

The Java Regex or Regular Expression is an API to define a pattern for searching or manipulating strings.

**Regular Expression Package:**  

* MatchResult interface
* Matcher class
* Pattern class
* PatternSyntaxException class

**Example:**

```java
/**
 * Regular Expression
 */
import java.util.regex.*;

public class Index {
    public static void main(String args[]) {

        // Pattern, String
        boolean b = Pattern.matches(".s", "as");

        System.out.println("Match: " + b);
    }
}
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## # 14. JAVA FILE HANDLING

<br/>

## Q. What is the purpose of using BufferedInputStream and BufferedOutputStream classes?

`BufferedInputStream` and `BufferedOutputStream` class is used for buffering an input and output stream while reading and writing, respectively. It internally uses buffer to store data. It adds more efficiency than to write data directly into a stream. So, it makes the performance fast.

**Example:**

```java
/**
 * BufferedInputStream
 */
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

```java
This is an example of reading data from file
```

**Example:**  

```java
/**
 * BufferedOutputStream
 */
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {

    public static void main(String[] args) {
        File file = new File("outfile.txt");
        FileOutputStream fileOutputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            bufferedOutputStream.write("This is an example of writing data to a file".getBytes());
            bufferedOutputStream.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                if (bufferedOutputStream != null) {
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

```java
This is an example of writing data to a file
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. How to set the Permissions to a file in Java?

Java 7 has introduced PosixFilePermission Enum and **java.nio.file.Files** includes a method setPosixFilePermissions( Path path, `Set<PosixFilePermission> perms` ) that can be used to set file permissions easily.

**Example:**

```java
/**
 * FilePermissions 
 */
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

        // change permission to 777 for all the users
        // no option for group and others
        file.setExecutable(true, false);
        file.setReadable(true, false);
        file.setWritable(true, false);

        // using PosixFilePermission to set file permissions 777
        Set<PosixFilePermission> perms = new HashSet<PosixFilePermission>();

        // add owners permission
        perms.add(PosixFilePermission.OWNER_READ);
        perms.add(PosixFilePermission.OWNER_WRITE);
        perms.add(PosixFilePermission.OWNER_EXECUTE);

        // add group permissions
        perms.add(PosixFilePermission.GROUP_READ);
        perms.add(PosixFilePermission.GROUP_WRITE);
        perms.add(PosixFilePermission.GROUP_EXECUTE);

        // add others permissions
        perms.add(PosixFilePermission.OTHERS_READ);
        perms.add(PosixFilePermission.OTHERS_WRITE);
        perms.add(PosixFilePermission.OTHERS_EXECUTE);

        Files.setPosixFilePermissions(Paths.get("/Users/run.sh"), perms);
    }
}
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. Give the hierarchy of InputStream and OutputStream classes?

A stream can be defined as a sequence of data. There are two kinds of Streams −

* **InPutStream** − The InputStream is used to read data from a source.
* **OutPutStream** − The OutputStream is used for writing data to a destination.

**1. Byte Streams:**

Java byte streams are used to perform input and output of 8-bit bytes. Though there are many classes related to byte streams but the most frequently used classes are, FileInputStream and FileOutputStream.

**Example:**

```java
/**
 * Byte Streams
 */
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

**2. Character Streams:**

Java Character streams are used to perform input and output for 16-bit unicode. Though there are many classes related to character streams but the most frequently used classes are, FileReader and FileWriter.

**Example:**

```java
/**
 * Character Streams
 */
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

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. How serialization works in java?

Serialization is a mechanism of converting the state of an object into a byte stream. Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory. This mechanism is used to persist the object.

**Example:**

```java
/**
* Serialization and Deserialization
*/
import java.io.*;

class Employee implements Serializable {
    private static final long serialversionUID = 129348938L;
    transient int a;
    static int b;
    String name;
    int age;

    // Default constructor
    public Employee(String name, int age, int a, int b) {
        this.name = name;
        this.age = age;
        this.a = a;
        this.b = b;
    }
}

public class SerialExample {

    public static void printdata(Employee object1) {
        System.out.println("name = " + object1.name);
        System.out.println("age = " + object1.age);
        System.out.println("a = " + object1.a);
        System.out.println("b = " + object1.b);
    }

    public static void main(String[] args) {
        Employee object = new Employee("ab", 20, 2, 1000);
        String filename = "file.txt";

        // Serialization
        try {
            // Saving of object in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object
            out.writeObject(object);

            out.close();
            file.close();

            System.out.println("Object has been serialized\n"
                    + "Data before Deserialization.");
            printdata(object);
            // value of static variable changed
            object.b = 2000;
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        }

        object = null;

        // Deserialization
        try {
            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            object = (Employee) in.readObject();

            in.close();
            file.close();
            System.out.println("Object has been deserialized\n"
                    + "Data after Deserialization.");
            printdata(object);
            System.out.println("z = " + object1.z);
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }
    }
}
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## # 15. JAVA EXCEPTIONS

<br/>

## Q. What are the types of Exceptions?

Exception is an error event that can happen during the execution of a program and disrupts its normal flow.

**1. Checked Exception**:

The classes which directly inherit **Throwable class** except RuntimeException and Error are known as checked exceptions e.g. IOException, SQLException etc. Checked exceptions are checked at compile-time.  

**2. Unchecked Exception**:

The classes which inherit **RuntimeException** are known as unchecked exceptions e.g. ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException etc. Unchecked exceptions are not checked at compile-time, but they are checked at runtime.  

**3. Error**:

Error is irrecoverable e.g. OutOfMemoryError, VirtualMachineError, AssertionError etc.

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. Explain hierarchy of Java Exception classes?

The **java.lang.Throwable** class is the root class of Java Exception hierarchy which is inherited by two subclasses: Exception and Error.

<p align="center">
  <img src="assets/exception.png" alt="Exception in Java" width="500px" />
</p>

**Example:**

```java
/**
 * Exception classes
 */
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

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What is difference between Error and Exception?

|BASIS FOR COMPARISON	|ERROR                                    |EXCEPTION                               |
|-----------------------|-----------------------------------------|----------------------------------------|
|Basic	               |An error is caused due to lack of system resources.|An exception is caused because of the code.|
|Recovery	            |An error is irrecoverable.	            |An exception is recoverable.|
|Keywords	            |There is no means to handle an error by the program code.|	Exceptions are handled using three keywords "try", "catch", and "throw".|
|Consequences           |As the error is detected the program will terminated abnormally.|As an exception is detected, it is thrown and caught by the "throw" and "catch" keywords correspondingly.|
|Types	               |Errors are classified as unchecked type.|Exceptions are classified as checked or unchecked type.|
|Package	               |In Java, errors are defined "java.lang.Error" package.|In Java, an exceptions are defined in"java.lang.Exception".|
|Example	               |OutOfMemory, StackOverFlow.|Checked Exceptions: NoSuchMethod, ClassNotFound.Unchecked Exceptions: NullPointer, IndexOutOfBounds.|

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. Explain about Exception Propagation?

An exception is first thrown from the top of the stack and if it is not caught, it drops down the call stack to the previous method, If not caught there, the exception again drops down to the previous method, and so on until they are caught or until they reach the very bottom of the call stack. This is called exception propagation.

**Example:**

```java
/**
 * Exception Propagation
 */
class TestExceptionPropagation {

    void method1() {
        int data = 10 / 0; // generates an exception
        System.out.println(data);
    }

    void method2() {
        method1(); // doesn't catch the exception
    }

    void method3() { // method3 catches the exception
        try {
            method2();
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }

    public static void main(String args[]) {
        TestExceptionPropagation obj = new TestExceptionPropagation();
        obj.method3();
    }
}
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What are different scenarios causing "Exception in thread main"?

Some of the common main thread exception are as  follows:

* **Exception in thread main java.lang.UnsupportedClassVersionError**: This exception comes when your java class is compiled from another JDK version and you are trying to run it from another java version.

* **Exception in thread main java.lang.NoClassDefFoundError**: There are two variants of this exception. The first one is where you provide the class full name with .class extension. The second scenario is when Class is not found.

* **Exception in thread main java.lang.NoSuchMethodError: main**: This exception comes when you are trying to run a class that doesn\'t have main method.

* **Exception in thread "main" java.lang.ArithmeticException**: Whenever any exception is thrown from main method, it prints the exception is console. The first part explains that exception is thrown from main method, second part prints the exception class name and then after a colon, it prints the exception message.

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What are the differences between throw and throws?

**Throw** keyword is used in the method body to throw an exception, while **throws** is used in method signature to declare the exceptions that can occur in the statements present in the method.

**Example:**

```java
/**
 * Throw in Java
 */
public class ThrowExample {
    void checkAge(int age) {
        if (age < 18)
            throw new ArithmeticException("Not Eligible for voting");
        else
            System.out.println("Eligible for voting");
    }

    public static void main(String args[]) {
        ThrowExample obj = new ThrowExample();
        obj.checkAge(13);
        System.out.println("End Of Program");
    }
}
```

Output

```java
Exception in thread "main" java.lang.ArithmeticException: 
Not Eligible for voting
at Example1.checkAge(Example1.java:4)
at Example1.main(Example1.java:10)
```

**Example:**  

```java
/**
 * Throws in Java
 */
public class ThrowsExample {
    int division(int a, int b) throws ArithmeticException {
        int t = a / b;
        return t;
    }

    public static void main(String args[]) {
        ThrowsExample obj = new ThrowsExample();
        try {
            System.out.println(obj.division(15, 0));
        } catch (ArithmeticException e) {
            System.out.println("You shouldn't divide number by zero");
        }
    }
}
```

Output

```java
You shouldn\'t divide number by zero
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. While overriding a method can you throw another exception or broader exception?

If a method declares to throw a given exception, the overriding method in a subclass can only declare to throw that exception or its subclass. This is because of polymorphism.

**Example:**

```java
class A {
   public void message() throws IOException {..}
}

class B extends A {
   @Override
   public void message() throws SocketException {..} // allowed

   @Override
   public void message() throws SQLException {..} // NOT allowed

   public static void main(String args[]) {
        A a = new B();
        try {
            a.message();
        } catch (IOException ex) {
            // forced to catch this by the compiler
        }
   }
}
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What is checked, unchecked exception and errors?

**1. Checked Exception**:

* These are the classes that extend **Throwable** except **RuntimeException** and **Error**.
* They are also known as compile time exceptions because they are checked at **compile time**, meaning the compiler forces us to either handle them with try/catch or indicate in the function signature that it **throws** them and forcing us to deal with them in the caller.
* They are programmatically recoverable problems which are caused by unexpected conditions outside the control of the code (e.g. database down, file I/O error, wrong input, etc).

**Example:** **IOException, SQLException** etc.

```java
import java.io.*; 
  
class Main { 
    public static void main(String[] args) { 
        FileReader file = new FileReader("C:\\assets\\file.txt"); 
        BufferedReader fileInput = new BufferedReader(file); 
          
        for (int counter = 0; counter < 3; counter++)  
            System.out.println(fileInput.readLine()); 
          
        fileInput.close(); 
    } 
} 
```

output:

```java
Exception in thread "main" java.lang.RuntimeException: Uncompilable source code - 
unreported exception java.io.FileNotFoundException; must be caught or declared to be 
thrown
    at Main.main(Main.java:5)
```

After adding IOException

```java
import java.io.*; 
  
class Main { 
    public static void main(String[] args) throws IOException { 
        FileReader file = new FileReader("C:\\assets\\file.txt"); 
        BufferedReader fileInput = new BufferedReader(file); 
           
        for (int counter = 0; counter < 3; counter++)  
            System.out.println(fileInput.readLine()); 
          
        fileInput.close(); 
    } 
} 
```

output:

```java
Output: First three lines of file “C:\assets\file.txt”
```

**2. Unchecked Exception**:

* The classes that extend **RuntimeException** are known as unchecked exceptions.
* Unchecked exceptions are not checked at compile-time, but rather at **runtime**, hence the name.
* They are also programmatically recoverable problems but unlike checked exception they are caused by faults in code flow or configuration.

**Example:**  **ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException** etc.

```java
class Main { 
   public static void main(String args[]) { 
      int x = 0; 
      int y = 10; 
      int z = y/x; 
  } 
} 
```

Output:

```java
Exception in thread "main" java.lang.ArithmeticException: / by zero
    at Main.main(Main.java:5)
Java Result: 1
```

**3. Error**:

**Error** refers to an irrecoverable situation that is not being handled by a **try/catch**.
Example: **OutOfMemoryError, VirtualMachineError, AssertionError** etc.

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What is difference between ClassNotFoundException and NoClassDefFoundError?

`ClassNotFoundException` and `NoClassDefFoundError` occur when a particular class is not found at runtime. However, they occur at different scenarios.

`ClassNotFoundException` is an exception that occurs when you try to load a class at run time using `Class.forName()` or `loadClass()` methods and mentioned classes are not found in the classpath.

`NoClassDefFoundError` is an error that occurs when a particular class is present at compile time, but was missing at run time.

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## # 16. JAVA INHERITANCE

<br/>

## Q. What is the difference between aggregation and composition?

**1. Aggregation:**

We call aggregation those relationships whose **objects have an independent lifecycle, but there is ownership**, and child objects cannot belong to another parent object.

**Example:** Since Organization has Person as employees, the relationship between them is Aggregation. Here is how they look like in terms of Java classes

```java
/**
 * Aggregation
 */
public class Organization {
   private List employees;
}

public class Person {
   private String name;   
}
```

**2. Composition:**

We use the term composition to refer to relationships whose objects **don\'t have an independent lifecycle**, and if the parent object is deleted, all child objects will also be deleted.

**Example:** Since Engine is-part-of Car, the relationship between them is Composition. Here is how they are implemented between Java classes.

```java
/**
 * Composition
 */
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

<p align="center">
  <img src="assets/aggregation.png" alt="Aggregation" width="400px" />
</p>

<table class="alt">
<tbody><tr><th>Aggregation</th><th>Composition</th></tr>
<tr><td>Aggregation is a weak Association.</td><td>Composition is a strong Association.</td></tr>
<tr><td>Class can exist independently without owner.</td><td>Class can not meaningfully exist without owner.</td></tr>
<tr><td>Have their own Life Time.</td><td>Life Time depends on the Owner.</td></tr>
<tr><td>A uses B.</td><td>A owns B.</td></tr>
<tr><td>Child is not owned by 1 owner.</td><td>Child can have only 1 owner.</td></tr>
<tr><td>Has-A relationship. A has B.</td><td>Part-Of relationship. B is part of A.</td></tr>
<tr><td>Denoted by a empty diamond in UML.</td><td>Denoted by a filled diamond in UML.</td></tr>
<tr><td>We do not use "final" keyword for Aggregation.</td><td>"final" keyword is used to represent Composition.</td></tr>
<tr><td>Examples:<br>- Car has a Driver.<br>- A Human uses Clothes.<br>- A Company is an aggregation of People.<br>- A Text Editor uses a File.<br>- Mobile has a SIM Card.</td><td>Examples:<br>- Engine is a part of Car.<br>- A Human owns the Heart.<br>- A Company is a composition of Accounts.<br>- A Text Editor owns a Buffer.<br>- IMEI Number is a part of a Mobile.</td></tr>
</tbody></table>

*Note: "final" keyword is used in Composition to make sure child variable is initialized.*

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. The difference between Inheritance and Composition?

Though both Inheritance and Composition provides code reusablility, main difference between Composition and Inheritance in Java is that Composition allows reuse of code without extending it but for Inheritance you must extend the class for any reuse of code or functionality. Inheritance is an **"is-a"** relationship. Composition is a **"has-a"**.

**Example:** Inheritance

```java
/**
 * Inheritance
 */
class Fruit {
    // ...
}

class Apple extends Fruit {
    // ...
}
```

**Example:** Composition

```java
/**
 * Composition
 */
class Fruit {
    // ...
}

class Apple {
    private Fruit fruit = new Fruit();
    // ...
}
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. Can you declare the main method as final?

Yes. We can declare main method as final. But, In inheritance concept we cannot declare main method as final in parent class. It give compile time error.

The main method has to be public because it has to be called by JVM which is outside the scope of the package and hence would need the access specifier-public.

**Example:**

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

```java
Cannot override the final method from Test.
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What is covariant return type?

It is possible to have different return type for a overriding method in child class, but child\'s return type should be sub-type of parent\'s return type. Overriding method becomes variant with respect to return type. The covariant return type specifies that the return type may vary in the same direction as the subclass.

**Example:**

```java
/**
 * Covariant Return Type
 */
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

```java
Subclass
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. Can you explain Liskov Substitution principle?

Liskov Substitution principle (LSP) states that **sub/child/derived-classes should be substitutable for their base/parent-classes.**

Given a class B is subclass of class A , we should be able to pass an object of class B to any method that expects(takes as an argument/parameter) an object of class A and the method should not give any weird output in that case.

`ClientTestProgram` class has a method `playVideoInAllMediaPlayers()` which accepts list of all `MediaPlayer` objects and plays video for each , but method fails at `WinampMediaPlayer` ? Let's check whether it satisfies **LSP**.

```java
public class MediaPlayer {

    // Play audio implementation
    public void playAudio() {
        System.out.println("Playing audio...");
    }

    // Play video implementation
    public void playVideo() {
        System.out.println("Playing video...");
    }
}

public class VlcMediaPlayer extends MediaPlayer {}

public class WinampMediaPlayer extends MediaPlayer {

    // Play video is not supported in Winamp player
    public void playVideo() {
        throw new VideoUnsupportedException();
    }
}

public class VideoUnsupportedException extends RuntimeException {

    private static final long serialVersionUID = 1 L;

}

public class ClientTestProgram {

    public static void main(String[] args) {

        // Created list of players
        List < MediaPlayer > allPlayers = new ArrayList < MediaPlayer > ();
        allPlayers.add(new VlcMediaPlayer());
        allPlayers.add(new DivMediaPlayer());

        // Play video in all players
        playVideoInAllMediaPlayers(allPlayers);

        // Well - all works as of now...... :-)
        System.out.println("---------------------------");

        // Now adding new Winamp player
        allPlayers.add(new WinampMediaPlayer());

        // Again play video in all players & Oops it broke the program... :-(
        // Why we got unexpected behavior in client? --- Because LSP is violated in WinampMediaPlayer.java, 
        // as it changed the original behavior of super class MediaPlayer.java
        playVideoInAllMediaPlayers(allPlayers);
    }

    /**
     * This method is playing video in all players
     * 
     * @param allPlayers
     */
    public static void playVideoInAllMediaPlayers(List < MediaPlayer > allPlayers) {

        for (MediaPlayer player: allPlayers) {
            player.playVideo();
        }
    }
}
```

Let\'s refactor the code to make "good" design using **LSP**?
- `MediaPlayer` is super class having play audio ability.
- `VideoMediaPlayer` extends `MediaPlayer` and adds play video ability.
- `DivMediaPlayer` and `VlcMediaPlayer` both extends `VideoMediaPlayer` for playing audio and video ability.
- `WinampMediaPlayer` which extends `MediaPlayer` for playing audio ability only.
- so client program can substitute `DivMediaPlayer` or `VlcMediaPlayer` for their super class `VideoMediaPlayer`

lets reimplement the refactored code

```java
public class MediaPlayer {

    // Play audio implementation
    public void playAudio() {
        System.out.println("Playing audio...");
    }
}

//separated video playing ability from base class 
public class VideoMediaPlayer extends MediaPlayer {

    // Play video implementation
    public void playVideo() {
        System.out.println("Playing video...");
    }
}

public class DivMediaPlayer extends VideoMediaPlayer {}

public class VlcMediaPlayer extends VideoMediaPlayer {}

//as Winamp expects only audio playing ability, so it must only extend relative base class behaviour, no need to inherit unnecessary behaviour
public class WinampMediaPlayer extends MediaPlayer {}

    /**
     * This method is playing video in all players
     * 
     * @param allPlayers
     */
    public static void playVideoInAllMediaPlayers(List <VideoMediaPlayer> allPlayers) {

        for (VideoMediaPlayer player: allPlayers) {
            player.playVideo();
        }
    }
```

Now, in `ClientTestProgram` , instead of creating list of type `MediaPlayer`, we will create list of `VideoMediaPlayer` type that should give us compile time error at statement `allPlayers.add(new WinampMediaPlayer()); ` as `WinampMediaPlayer` isnt subclass of `VideoMediaPlayer`.But in case of  `DivMediaPlayer` and `VlcMediaPlayer` they are substitutable for their parent class as seen in `playVideoInAllMediaPlayers()` method
that satisefies *Liskov's substitution principle*.

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## # 17. JAVA METHOD OVERRIDING

<br/>

## # 18. JAVA POLYMORPHISM

<br/>

## Q. What is the difference between compile-time polymorphism and runtime polymorphism?

There are two types of polymorphism in java:

1. Static Polymorphism also known as Compile time polymorphism
2. Runtime polymorphism also known as Dynamic Polymorphism  

**1. Static Polymorphism:**  

Method overloading is one of the way java supports static polymorphism. Here we have two definitions of the same method add() which add method would be called is determined by the parameter list at the compile time. That is the reason this is also known as compile time polymorphism.

**Example:**

```java
/**
 * Static Polymorphism
 */
class SimpleCalculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Demo {
    public static void main(String args[]) {
        SimpleCalculator obj = new SimpleCalculator();
        System.out.println(obj.add(10, 20));
        System.out.println(obj.add(10, 20, 30));
    }
}
```

Output

```java
30
60
```

**2. Runtime Polymorphism:**  

It is also known as **Dynamic Method Dispatch**. Dynamic polymorphism is a process in which a call to an overridden method is resolved at runtime, thats why it is called runtime polymorphism.

**Example:**

```java
/**
 * Runtime Polymorphism
 */
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

```java
Overriding Method
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What do you mean Run time Polymorphism?

`Polymorphism` in Java is a concept by which we can perform a single action in different ways.
There are two types of polymorphism in java:  

* **Static Polymorphism** also known as compile time polymorphism
* **Dynamic Polymorphism** also known as runtime polymorphism

**Example:** Static Polymorphism

```java
class SimpleCalculator {

    int add(int a, int b) {
        return a + b;
    }
    int  add(int a, int b, int c) {
        return a + b + c;
    }
}
public class MainClass
{
   public static void main(String args[]) {
	   SimpleCalculator obj = new SimpleCalculator();
       System.out.println(obj.add(10, 20));
       System.out.println(obj.add(10, 20, 30));
   }
}
```

Output

```java
30
60
```

**Example:** Runtime polymorphism

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

Output

```java
Overriding Method
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What is runtime polymorphism in java?

**Runtime polymorphism** or **Dynamic Method Dispatch** is a process in which a call to an overridden method is resolved at runtime rather than compile-time.

An overridden method is called through the reference variable of a superclass. The determination of the method to be called is based on the object being referred.

```java
class Bank{  
    public float roi=0.0f;
float getRateOfInterest(){return this.roi;}  
}  
class SBI extends Bank{ 
    float roi=8.4f; 
float getRateOfInterest(){return this.roi;}  
}  
class ICICI extends Bank{ 
    float roi=7.3f; 
float getRateOfInterest(){return this.roi;}  
}  
class AXIS extends Bank{  
    float roi=9.7f;
float getRateOfInterest(){return this.roi;}  
}  

Bank b;  
b=new SBI();  
System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());

b=new ICICI();  
System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());

b=new AXIS();  
System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest()); 

System.out.println("Bank Rate of Interest: "+b.roi); 

/**output:
SBI Rate of Interest: 8.4
ICICI Rate of Interest: 7.3
AXIS Rate of Interest: 9.7
Bank Rate of Interest: 0.0 

//you might think it should be 9.7 , as recent object being refered to is of AXIS but method is overridden, not the data members, so runtime polymorphism can't be achieved by data members/instance variables.
**/
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## # 19. JAVA ABSTRACTION

<br/>

## Q. What is the difference between abstract class and interface?

Abstract class and interface both are used to achieve abstraction where we can declare the abstract methods. Abstract class and interface both can\'t be instantiated.

|Abstract Class               |Interface                        |
|-----------------------------|---------------------------------|
|Abstract class can have abstract and non-abstract methods.|Interface can have only abstract methods. Since Java 8, it can have default and static methods also.|
|Abstract class doesn\'t support multiple inheritance.|Interface supports multiple inheritance.|
|Abstract class can have final, non-final, static and non-static variables.|Interface has only static and final variables.|
|Abstract class can provide the implementation of interface.|Interface can\'t provide the implementation of abstract class.|
|An abstract class can extend another Java class and implement multiple Java interfaces.|An interface can extend another Java interface only.|
|An abstract class can be extended using keyword "extends".|An interface can be implemented using keyword "implements".|
|A Java abstract class can have class members like private, protected, etc.|Members of a Java interface are public by default.|

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What are Wrapper classes?

The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive.

**Use of Wrapper classes in Java:**  

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

**Example:** Primitive to Wrapper

```java
/**
 * Java program to convert primitive into objects
 * Autoboxing example of int to Integer
 */
class WrapperExample {
    public static void main(String args[]) {
        int a = 20;
        Integer i = Integer.valueOf(a); // converting int into Integer explicitly
        Integer j = a; // autoboxing, now compiler will write Integer.valueOf(a) internally

        System.out.println(a + " " + i + " " + j);
    }
}
```

Output

```java
20 20 20
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What is the difference between abstraction and encapsulation?

In Java, Abstraction is supported using `interface` and `abstract class` while Encapsulation is supported using access modifiers e.g. public, private and protected. Abstraction solves the problem at design level while Encapsulation solves it implementation level.

Abstraction is about hiding unwanted details while giving out most essential details, while Encapsulation means hiding the code and data into a single unit e.g. class or method to protect inner working of an object from outside world.

**Difference:**

<table class="alt">
<tbody><tr><th>Abstraction</th><th>Encapsulation</th></tr>
<tr><td>Abstraction is a process of hiding the implementation details and showing only functionality to the user.</td>
<td> Encapsulation is a process of wrapping code and data together into a single unit</td></tr>
<tr><td>Abstraction lets you focus on what the object does instead of how it does it.</td>
<td>Encapsulation provides you the control over the data and keeping it safe from outside misuse.</td></tr>
<tr><td>Abstraction solves the problem in the Design Level.</td>
<td>Encapsulation solves the problem in the Implementation Level.</td></tr>
<tr><td>Abstraction is implemented by using Interfaces and Abstract Classes.</td>
<td>Encapsulation is implemented by using Access Modifiers (private, default, protected, public)</td></tr>
<tr><td>Abstraction means hiding implementation complexities by using interfaces and abstract class.</td>
<td>Encapsulation means hiding data by using setters and getters.</td></tr>
</tbody></table>

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## # 20. JAVA INTERFACES

<br/>

## Q. Can we use private or protected member variables in an interface?

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

* Interfaces cannot be instantiated that is why the variable are **static**
* Interface are used to achieve the 100% abstraction there for the variable are **final**
* An interface provide a way for the client to interact with the object. If variables were not public, the clients would not have access to them. that is why variable are **public**

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. When can an object reference be cast to a Java interface reference?

An interface reference can point to any object of a class that implements this interface

```java
/**
 * Interface
 */
interface MyInterface {
    void display();
}

public class TestInterface implements MyInterface {

    void display() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        MyInterface myInterface = new TestInterface();
        MyInterface.display();
    }
}
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. How can you avoid serialization in child class if the base class is implementing the Serializable interface?

If superClass has implemented Serializable that means subclass is also Serializable ( as subclass always inherits all features from its parent class ), for avoiding Serialization in sub-class we can define **writeObject()** method and throw **NotSerializableException()** from there as done below.

```java
/**
 * Serialization
 */
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
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

Output

```java
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

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What is the difference between Serializable and Externalizable interface?

|SERIALIZABLE    |EXTERNALIZABLE        |
|----------------|-----------------------|
|Serializable is a marker interface i.e. does not contain any method.|	Externalizable interface contains two methods writeExternal() and readExternal() which implementing classes MUST override.|
|Serializable interface pass the responsibility of serialization to JVM and it\'s default algorithm.|	Externalizable provides control of serialization logic to programmer – to write custom logic.|
|Mostly, default serialization is easy to implement, but has higher performance cost.|Serialization done using Externalizable, add more responsibility to programmer but often result in better performance.|
|It\'s hard to analyze and modify class structure because any change may break the serialization.|	It\'s more easy to analyze and modify class structure because of complete control over serialization logic.|
|Default serialization does not call any class constructor.|A public no-arg constructor is required while using Externalizable interface. |

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. How to create marker interface?

An interface with no methods is known as marker or tagged interface. It provides some useful information to JVM/compiler so that JVM/compiler performs some special operations on it. It is used for better readability of code. For example Serializable, Clonnable etc.

**Syntax:**

```java
public interface Interface_Name {

}
```

**Example:**

```java
/**
 * Maker Interface
 */
interface Marker {
}

class MakerExample implements Marker {
    // do some task
}

class Main {
    public static void main(String[] args) {
        MakerExample obj = new MakerExample();
        if (obj instanceOf Marker) {
            // do some task
        }
    }
}
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. Can you declare an interface method static?

Java 8 interface changes include static methods and default methods in interfaces. Prior to Java 8, we could have only method declarations in the interfaces. But from Java 8, we can have default methods and static methods in the interfaces.

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What is a Functional Interface?

A **functional interface** is an interface that defines only one abstract method.

To accurately determine the interface as functional, an annotation has been added `@FunctionalInterface` that works on the principle of `@Override`. It will designate a plan and will not allow to define the second abstract method in the interface.

An interface can include as many `default` methods as you like while remaining functional, because `default` methods are not abstract.

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What are `default` interface methods?

Java 8 allows you to add non-abstract method implementations to an interface using the keyword default:

```java
interface  Example {
    int  process ( int  a );
    default void  show () {
        System.out.println("default show ()");
    }
}
```

* If a class implements an interface, it can, but does not have to, implement the default methods already implemented in the * interface. The class inherits the default implementation.
* If a class implements several interfaces that have the same default method, then the class must implement the method with the same signature on its own. The situation is similar if one interface has a default method, and in the other the same method is abstract - no class default implementation is inherited.
* The default method cannot override the class method `java.lang.Object`.
* They help implement interfaces without fear of disrupting other classes.
* Avoid creating utility classes, since all the necessary methods can be represented in the interfaces themselves.
* They give classes the freedom to choose the method to be redefined.
* One of the main reasons for introducing default methods is the ability of collections in Java 8 to use lambda expressions.

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. How to call `default` interface method in a class that implements this interface?

Using the keyword superalong with the interface name:

```java
interface  Paper {
    default void  show () {
        System.out.println(" default show ()");
    }
}

class  License  implements  Paper {
     public  void  show () {
        Paper.super.show();
    }
}
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What is `static` interface method?

Static interface methods are similar to default methods, except that there is no way to override them in classes that implement the interface.

* Static methods in the interface are part of the interface without the ability to use them for objects of the implementation class
* Class methods `java.lang.Object`cannot be overridden as static
* Static methods in the interface are used to provide helper methods, for example, checking for null, sorting collections, etc.

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. How to call `static` interface method?

Using the interface name:

```java
interface  Paper {
     static  void  show () {
         System.out.println( " static show () " );
    }
}

class  License {
     public  void  showPaper () {
         Paper.show ();
    }
}
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What are the functional interfaces `Function<T,R>`, `DoubleFunction<R>`, `IntFunction<R>` and `LongFunction<R>`?

`Function<T, R>`- the interface with which a function is implemented that receives an instance of the class `T` and returns an instance of the class at the output `R`.

Default methods can be used to build call chains ( `compose`, `andThen`).

```java
Function < String , Integer > toInteger =  Integer :: valueOf;
Function < String , String > backToString = toInteger.andThen ( String :: valueOf);
backToString.apply("123");     // "123"
```

* `DoubleFunction<R>`- a function that receives input `Double` and returns an instance of the class at the output `R`;
* `IntFunction<R>`- a function that receives input `Integer`and returns an instance of the class at the output `R`;
* `LongFunction<R>`- a function that receives input `Long`and returns an instance of the class at the output `R`.

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What are the functional interfaces `UnaryOperator<T>`, `DoubleUnaryOperator`, `IntUnaryOperator`and `LongUnaryOperator`?

`UnaryOperator<T>`(**unary operator**) takes an object of type as a parameter `T`, performs operations on them and returns the result of operations in the form of an object of type `T`:

```java
UnaryOperator < Integer > operator = x - > x * x;
System.out.println(operator.apply ( 5 )); // 25
```

* `DoubleUnaryOperator`- unary operator receiving input `Double`;
* `IntUnaryOperator`- unary operator receiving input `Integer`;
* `LongUnaryOperator`- unary operator receiving input `Long`.

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What are the functional interfaces `BinaryOperator<T>`, `DoubleBinaryOperator`, `IntBinaryOperator`and `LongBinaryOperator`?

`BinaryOperator<T>`(**binary operator**) - an interface through which a function is implemented that receives two instances of the class `T`and returns an instance of the class at the output `T`.

```java
BinaryOperator < Integer > operator = (a, b) -> a + b;
System.out.println(operator.apply ( 1 , 2 )); // 3
```

* `DoubleBinaryOperator`- binary operator receiving input Double;
* `IntBinaryOperator`- binary operator receiving input Integer;
* `LongBinaryOperator`- binary operator receiving input Long.

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What are the functional interfaces `Predicate<T>`, `DoublePredicate`, `IntPredicateand` `LongPredicate`?

`Predicate<T>`(**predicate**) - the interface with which a function is implemented that receives an instance of the class as input `T`and returns the type value at the output `boolean`.

The interface contains a variety of methods by default, allow to build complex conditions ( `and`, `or`, `negate`).

```java
Predicate < String > predicate = (s) -> s.length () >  0 ;
predicate.test("foo"); // true 
predicate.negate().test("foo"); // false
```

* `DoublePredicate`- predicate receiving input `Double`;
* `IntPredicate`- predicate receiving input `Integer`;
* `LongPredicate`- predicate receiving input `Long`.

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What are the functional interfaces `Consumer<T>`, `DoubleConsumer`, `IntConsumer`and `LongConsumer`?

`Consumer<T>`(**consumer**) - the interface through which a function is implemented that receives an instance of the class as an input `T`, performs some action with it, and returns nothing.

```java
Consumer<String> hello = (name) ->  System.out.println( " Hello, "  + name);
hello.accept( " world " );
```

* `DoubleConsumer`- the consumer receiving the input `Double`;
* `IntConsumer`- the consumer receiving the input `Integer`;
* `LongConsumer`- the consumer receiving the input `Long`.

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What are the functional interfaces `Supplier<T>`, `BooleanSupplier`, `DoubleSupplier`, `IntSupplier`and `LongSupplier`?

`Supplier<T>`(**provider**) - the interface through which a function is implemented that takes nothing to the input, but returns the result of the class to the output `T`;

```java
Supplier < LocalDateTime > now =  LocalDateTime::now;
now.get();
```

* `DoubleSupplier`- the supplier is returning `Double`;
* `IntSupplier`- the supplier is returning `Integer`;
* `LongSupplier`- the supplier is returning `Long`.

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

#### Q. What is Spliterator in Java SE 8?
#### Q. What is Type Inference in Java 8?
#### Q. What is difference between External Iteration and Internal Iteration?

*ToDo*

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## # 21. JAVA ENCAPSULATION

<br/>

## Q. How Encapsulation concept implemented in JAVA?

Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit. In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class. Therefore, it is also known as `data hiding`.

To achieve encapsulation in Java −

* Declare the variables of a class as private.
* Provide public setter and getter methods to modify and view the variables values.

**Example:**

```java
public class EncapClass {
   private String name;

   public String getName() {
      return name;
   }
   public void setName(String newName) {
      name = newName;
   }
}

public class MainClass {

   public static void main(String args[]) {
      EncapClass obj = new EncapClass();
      obj.setName("Pradeep Kumar");
      System.out.print("Name : " + obj.getName());
   }
}
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## # 22. JAVA GENERICS

<br/>

## Q. Do you know Generics? How did you used in your coding?

`Generics` allows type (Integer, String, … etc and user defined types) to be a parameter to methods, classes and interfaces. For example, classes like HashSet, ArrayList, HashMap, etc use generics very well.

**Advantages:**

* **Type-safety**: We can hold only a single type of objects in generics. It doesn\'t allow to store other objects.
* **Type Casting**: There is no need to typecast the object.
* **Compile-Time Checking**: It is checked at compile time so problem will not occur at runtime.

**Example:**

```java
/** 
* A Simple Java program to show multiple 
* type parameters in Java Generics 
*
* We use < > to specify Parameter type
*
**/ 
class GenericClass<T, U> { 
    T obj1;  // An object of type T 
    U obj2;  // An object of type U 
  
    // constructor 
    GenericClass(T obj1, U obj2) { 
        this.obj1 = obj1; 
        this.obj2 = obj2; 
    } 
  
    // To print objects of T and U 
    public void print() { 
        System.out.println(obj1); 
        System.out.println(obj2); 
    } 
} 
  
// Driver class to test above 
class MainClass { 
    public static void main (String[] args) { 
        GenericClass <String, Integer> obj = 
            new GenericClass<String, Integer>("Generic Class Example !", 100); 
  
        obj.print(); 
    } 
}
```

Output:

```java
Generic Class Example !
100
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## # 23. MISCELLANEOUS

<br/>

## Q. How will you invoke any external process in Java?

In java, external process can be invoked using **exec()** method of **Runtime Class**.

**Example:**

```java
/**
 * exec()
 */
import java.io.IOException;

class ExternalProcessExample {
    public static void main(String[] args) { 
        try { 
            // Command to create an external process 
             String command = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe"; 
  
            // Running the above command 
            Runtime run  = Runtime.getRuntime(); 
            Process proc = run.exec(command); 
        } catch (IOException e) { 
            e.printStackTrace(); 
        } 
    }
}
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What is the static import?

The static import feature of Java 5 facilitate the java programmer to access any static member of a class directly. There is no need to qualify it by the class name.

```java
/**
 * Static Import
 */
import static java.lang.System.*;

class StaticImportExample {

    public static void main(String args[]) {
        out.println("Hello");// Now no need of System.out
        out.println("Java");
    }
}
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What is the difference between factory and abstract factory pattern?

The Factory Method is usually categorised by a switch statement where each case returns a different class, using the same root interface so that the calling code never needs to make decisions about the implementation.

**Example:** credit card validator factory which returns a different validator for each card type.

```java
/**
 * Abstract Factory Pattern
 */
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

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What are the methods used to implement for key Object in HashMap?

**1. equals()** and **2. hashcode()**

Class inherits methods from the following classes in terms of HashMap

* java.util.AbstractMap
* java.util.Object
* java.util.Map

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What is a Memory Leak?

The standard definition of a memory leak is a scenario that occurs when **objects are no longer being used by the application, but the Garbage Collector is unable to remove them from working memory** – because they\'re still being referenced. As a result, the application consumes more and more resources – which eventually leads to a fatal OutOfMemoryError.

Some tools that do memory management to identifies useless objects or memeory leaks like:

* <a href="https://support.hpe.com/hpsc/doc/public/display?docId=emr_na-c00990822&docLocale=en_US">HP OpenView</a>
* <a href="https://h20392.www2.hpe.com/portal/swdepot/displayProductInfo.do?productNumber=HPJMETER">HP JMETER</a>
* <a href="http://www.javaperformancetuning.com/tools/jprobe/index.shtml">JProbe</a>
* <a href="https://www.ibm.com/support/knowledgecenter/en/SSTFXA_6.3.0/com.ibm.itm.doc_6.3/install/itm_over.htm">IBM Tivoli</a>

**Example:**

```java
/**
 * Memory Leaks 
 */
import java.util.Vector;

public class MemoryLeaksExample {
    public static void main(String[] args) {
        Vector v = new Vector(214444);
        Vector v1 = new Vector(214744444);
        Vector v2 = new Vector(214444);
        System.out.println("Memory Leaks Example");
    }
}
```

Output

```java
Exception in thread "main" java.lang.OutOfMemoryError: Java heap space exceed
```

**Types of Memory Leaks in Java:**  

* Memory Leak through static Fields
* Unclosed Resources/connections
* Adding Objects With no `hashCode()` and `equals()` Into a HashSet
* Inner Classes that Reference Outer Classes
* Through `finalize()` Methods
* Calling `String.intern()` on Long String

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. The difference between Serial and Parallel Garbage Collector?

**1. Serial Garbage Collector:**  

Serial garbage collector works by holding all the application threads. It is designed for the single-threaded environments. It uses just a single thread for garbage collection. The way it works by freezing all the application threads while doing garbage collection may not be suitable for a server environment. It is best suited for simple command-line programs.

Turn on the `-XX:+UseSerialGC` JVM argument to use the serial garbage collector.

**2. Parallel Garbage Collector:**  

Parallel garbage collector is also called as throughput collector. It is the default garbage collector of the JVM. Unlike serial garbage collector, this uses multiple threads for garbage collection. Similar to serial garbage collector this also freezes all the application threads while performing garbage collection.

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What is difference between WeakReference and SoftReference in Java?

**1. Weak References:**

Weak Reference Objects are not the default type/class of Reference Object and they should be explicitly specified while using them.

```java
/**
 * Weak Reference
 */
import java.lang.ref.WeakReference;

class MainClass {
    public void message() {
        System.out.println("Weak References Example");
    }
}

public class Example {
    public static void main(String[] args) {
        // Strong Reference
        MainClass g = new MainClass();
        g.message();

        // Creating Weak Reference to MainClass-type object to which 'g'
        // is also pointing.
        WeakReference<MainClass> weakref = new WeakReference<MainClass>(g);
        g = null;
        g = weakref.get();
        g.message();
    }
}
```

**2. Soft References:**

In Soft reference, even if the object is free for garbage collection then also its not garbage collected, until JVM is in need of memory badly.The objects gets cleared from the memory when JVM runs out of memory.To create such references java.lang.ref.SoftReference class is used.

```java
/**
 * Soft Reference
 */
import java.lang.ref.SoftReference;

class MainClass {
    public void message() {
        System.out.println("Soft References Example");
    }
}

public class Example {
    public static void main(String[] args) {
        // Strong Reference
        MainClass g = new MainClass();
        g.message();

        // Creating Soft Reference to MainClass-type object to which 'g'
        // is also pointing.
        SoftReference<MainClass> softref = new SoftReference<MainClass>(g);
        g = null;
        g = softref.get();
        g.message();
    }
}
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. How Garbage collector algorithm works?

Garbage collection works on **Mark** and **Sweep** algorithm. In Mark phase it detects all the unreachable objects and Sweep phase it reclaim the heap space used by the garbage objects and make the space available again to the program.

There are methods like `System.gc()` and `Runtime.gc()` which is used to send request of Garbage collection to JVM but it\'s not guaranteed that garbage collection will happen. If there is no memory space for creating a new object in Heap Java Virtual Machine throws `OutOfMemoryError` or `java.lang.OutOfMemoryError` heap space

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. Java Program to Implement Singly Linked List?

The singly linked list is a linear data structure in which each element of the list contains a pointer which points to the next element in the list. Each element in the singly linked list is called a node. Each node has two components: data and a pointer next which points to the next node in the list.

**Example:**

```java
public class SinglyLinkedList {    
    // Represent a node of the singly linked list    
    class Node{    
        int data;    
        Node next;    
            
        public Node(int data) {    
            this.data = data;    
            this.next = null;    
        }    
    }    
     
    // Represent the head and tail of the singly linked list    
    public Node head = null;    
    public Node tail = null;    
        
    // addNode() will add a new node to the list    
    public void addNode(int data) {    
        // Create a new node    
        Node newNode = new Node(data);    
            
        // Checks if the list is empty    
        if(head == null) {    
            // If list is empty, both head and tail will point to new node    
            head = newNode;    
            tail = newNode;    
        }    
        else {    
            // newNode will be added after tail such that tail's next will point to newNode    
            tail.next = newNode;    
            // newNode will become new tail of the list    
            tail = newNode;    
        }    
    }    
        
    // display() will display all the nodes present in the list    
    public void display() {    
        // Node current will point to head    
        Node current = head;    
            
        if(head == null) {    
            System.out.println("List is empty");    
            return;    
        }    
        System.out.println("Nodes of singly linked list: ");    
        while(current != null) {    
            // Prints each node by incrementing pointer    
            System.out.print(current.data + " ");    
            current = current.next;    
        }    
        System.out.println();    
    }    
        
    public static void main(String[] args) {    
            
        SinglyLinkedList sList = new SinglyLinkedList();    
            
        // Add nodes to the list    
        sList.addNode(10);    
        sList.addNode(20);    
        sList.addNode(30);    
        sList.addNode(40);    
            
        // Displays the nodes present in the list    
        sList.display();    
    }    
}  
```

**Output:**

```java
Nodes of singly linked list: 
10 20 30 40
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What do we mean by weak reference?

A weakly referenced object is cleared by the Garbage Collector when it\'s weakly reachable.
Weak reachability means that an object has neither strong nor soft references pointing to it. The object can be reached only by traversing a weak reference. To create such references `java.lang.ref.WeakReference` class is used.

```java
/**
* Weak reference
*/ 
import java.lang.ref.WeakReference; 

class WeakReferenceExample { 
    
    public void message() { 
        System.out.println("Weak Reference Example!"); 
    } 
} 

public class MainClass {

    public static void main(String[] args) { 
        // Strong Reference 
        WeakReferenceExample obj = new WeakReferenceExample();    
        obj.message(); 
          
        // Creating Weak Reference to WeakReferenceExample-type object to which 'obj'  
        // is also pointing. 
        WeakReference<WeakReferenceExample> weakref = new WeakReference<WeakReferenceExample>(obj); 

        obj = null;  // is available for garbage collection.
        obj = weakref.get();  
        obj.message(); 
    } 
} 
```

Output

```java
Weak Reference Example!
Weak Reference Example!
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What are the different types of JDBC Driver?

JDBC Driver is a software component that enables java application to interact with the database.
There are 4 types of JDBC drivers:

1. **JDBC-ODBC bridge driver**: The JDBC-ODBC bridge driver uses ODBC driver to connect to the database. The JDBC-ODBC bridge driver converts JDBC method calls into the ODBC function calls. This is now discouraged because of thin driver.
1. **Native-API driver**: The Native API driver uses the client-side libraries of the database. The driver converts JDBC method calls into native calls of the database API. It is not written entirely in java.
1. **Network Protocol driver**: The Network Protocol driver uses middleware (application server) that converts JDBC calls directly or indirectly into the vendor-specific database protocol. It is fully written in java.
1. **Thin driver**: The thin driver converts JDBC calls directly into the vendor-specific database protocol. That is why it is known as thin driver. It is fully written in Java language.

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What additional methods for working with associative arrays (maps) appeared in Java 8?

* `putIfAbsent()` adds a key-value pair only if the key was missing:

```java
map.putIfAbsent("a", "Aa");
```

* `forEach()` accepts a function that performs an operation on each element:

```java
map.forEach((k, v) -> System.out.println(v));
```

* `compute()` creates or updates the current value to the result of the calculation (it is possible to use the key and the current value):

```java
map.compute("a", (k, v) -> String.valueOf(k).concat(v)); //["a", "aAa"]
```

* `computeIfPresent()` if the key exists, updates the current value to the result of the calculation (it is possible to use the key and the current value):

```java
map.computeIfPresent("a", (k, v) -> k.concat(v));
```

* `computeIfAbsent()` if the key is missing, creates it with the value that is calculated (it is possible to use the key):

```java
map.computeIfAbsent("a", k -> "A".concat(k)); //["a","Aa"]
```

* `getOrDefault()` if there is no key, returns the passed value by default:

```java
map.getOrDefault("a", "not found");
```

* `merge()` accepts a key, a value, and a function that combines the transmitted and current values. If there is no value under the specified key, then it writes the transmitted value there.

```java
map.merge("a", "z", (value, newValue) -> value.concat(newValue)); //["a","Aaz"]
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What is LocalDateTime?

`LocalDateTime`combines together `LocaleDate`and `LocalTime`contains the date and time in the calendar system ISO-8601 without reference to the time zone. Time is stored accurate to the nanosecond. It contains many convenient methods such as plusMinutes, plusHours, isAfter, toSecondOfDay, etc.

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What is ZonedDateTime?

`java.time.ZonedDateTime`- an analogue `java.util.Calendar`, a class with the most complete amount of information about the temporary context in the calendar system ISO-8601. It includes a time zone, therefore, this class carries out all operations with time shifts taking into account it.

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. How to determine repeatable annotation?

To define a repeatable annotation, you must create a container annotation for the list of repeatable annotations and designate a repeatable meta annotation `@Repeatable`:

```java
@interface  Schedulers {
    Scheduler [] value ();
}

@Repeatable ( Schedulers . Class)
 @interface  Scheduler {
    String  birthday () default "Jan 8 2000";
 }
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. What class appeared in Java 8 for encoding / decoding data?

`Base64`- a thread-safe class that implements a data encoder and decoder using a base64 encoding scheme according to RFC 4648 and RFC 2045 .

Base64 contains 6 basic methods:

`getEncoder() / getDecoder()`- returns a base64 encoder / decoder conforming to the RFC 4648 standard ; getUrlEncoder()/ `getUrlDecoder()`- returns URL-safe base64 encoder / decoder conforming to RFC 4648 standard ;
`getMimeEncoder() / getMimeDecoder()`- returns a MIME encoder / decoder conforming to RFC 2045 .

<div align="right">
  <b><a href="#related-topics">↥ back to top</a></b>
</div>

## Q. How to create a Base64 encoder and decoder?

```java
// Encode 
String b64 =  Base64.getEncoder().encodeToString ( " input " . getBytes ( " utf-8 " )); // aW5wdXQ == 
// Decode 
new  String ( Base64.getDecoder().decode ( " aW5wdXQ == " ), " utf-8 " ); // input
```

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>

#### Q. Give me an example of design pattern which is based upon open closed principle?
#### Q. How do you test static method?
#### Q. How to do you test a method for an exception using JUnit?
#### Q. Which unit testing libraries you have used for testing Java programs?
#### Q. What is the difference between @Before and @BeforeClass annotation?

<div align="right">
    <b><a href="#related-topics">↥ back to top</a></b>
</div>
