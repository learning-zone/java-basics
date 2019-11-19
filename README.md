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
**2. Pipelines and Streams**  
Pipelines and streams enrich the Java collections framework. Sequence of aggregate operations is a pipeline. Stream is used to propagate elements from a source through a pipeline. It is a sequence of elements. Pipeline and streams makes easier in accessing the elements from collections and applying operations on it.

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

#### Q. What is JVM and is it platform independent?
Java Virtual Machine (JVM) is a specification that provides runtime environment in which java bytecode(.class files) can be executed. The JVM is the platform. The JVM acts as a "virtual" machine or processor. Java's platform independence consists mostly of its Java Virtual Machine (JVM). JVM makes this possible because it is aware of the specific instruction lengths and other particularities of the platform (Operating System).

The JVM is not platform independent. Java Virtual Machine (JVM) provides the environment to execute the java file(. Class file). So at the end it's depends on kernel and kernel is differ from OS (Operating System) to OS. The JVM is used to both translate the bytecode into the machine language for a particular computer and actually execute the corresponding machine-language instructions as well.

#### Q. What is JIT compiler?
#### Q. What is Classloader in Java? What are different types of classloaders?
#### Q. Java Compiler is stored in JDK, JRE or JVM?
#### Q. What is the difference between factory and abstract factory pattern?
#### Q. What are the methods used to implement for key Object in HashMap?
#### Q. Difference between Serialization and Deserialization in Java.
#### Q. What is SerialVersionUID?
#### Q. Difference between the Inner Class and Sub Class.
#### Q. What are the advantages of JSON over XML?
#### Q. Can we import same package/class two times? Will the JVM load the package twice at runtime?
#### Q. Distinguish between static loading and dynamic class loading?
#### Q. How can we find the actual size of an object on the heap?
#### Q. Why we use Vector class?
#### Q. What is the difference between transient and volatile variable in Java?
#### Q. Mention the uses of Synchronized block
#### Q. What is the default size of load factor in hashing based collection?
#### Q. Write a code to make Collections readOnly?
#### Q. Distinguish between a predicate and a function?
#### Q. What is Nashorn in Java8?
#### Q. How many types of memory areas are allocated by JVM?
#### Q. What will be the initial value of an object reference which is defined as an instance variable?
#### Q. How can constructor chaining be done using this keyword?
#### Q. Can you declare the main method as final?
#### Q. Can we declare a constructor as final?
#### Q. Can we declare an interface as final?
#### Q. What is the difference between the final method and abstract method?
#### Q. What is the difference between compile-time polymorphism and runtime polymorphism?
#### Q. Can you achieve Runtime Polymorphism by data members?
#### Q. Can you have virtual functions in Java?
#### Q. What is covariant return type?
#### Q. What is the difference between abstraction and encapsulation?
#### Q. Can there be an abstract method without an abstract class?
#### Q. Can you declare an interface method static?
#### Q. What is a marker interface?
#### Q. Can we define private and protected modifiers for the members in interfaces?
#### Q. When can an object reference be cast to an interface reference?
#### Q. How the metacharacters are different from the ordinary characters?
#### Q. Give the hierarchy of InputStream and OutputStream classes.
#### Q. What is the difference between the Reader/Writer class hierarchy and the InputStream/OutputStream class hierarchy?
#### Q. What is the purpose of the finalize() method?
#### Q. What is difference between CyclicBarrier and CountDownLatch in Java ?
#### Q. What will be the problem if you don't override hashcode() method
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
#### Q. What is anonymous inner class?
#### Q. What is default constructor?
#### Q. Java is Pass by Value or Pass by Reference?
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
#### Q. What is Adapter pattern? When to use it?
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
#### Q. Why strings have been made immutable in Java?
#### Q. What is String Constant Pool?
#### Q. What is String Pool?
#### Q. Difference between String, StringBuffer and StringBuilder?
#### Q. Why String is immutable or final in Java
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
#### Q. Explain Java Heap space and Garbage collection?
#### Q. How do you find memory usage from Java program? How much percent of the heap is used?
#### Q. What is the difference between stack and heap in Java?
#### Q. What does System.gc() and Runtime.gc() methods do?
#### Q. How do WeakHashMap works?
#### Q. What is -XX:+UseCompressedOops JVM option? Why use it?
#### Q. How do you find if JVM is 32-bit or 64-bit from Java Program?
#### Q. What is the maximum heap size of 32-bit and 64-bit JVM?
#### Q. Can you guarantee the garbage collection process?
#### Q. What's the difference between "a == b" and "a.equals(b)"?
#### Q. What is a.hashCode() used for? How is it related to a.equals(b)?
#### Q. What is a compile time constant in Java? What is the risk of using it?
#### Q. What is the size of int in 64-bit JVM?
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