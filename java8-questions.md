## Java 8 Interview Questions and Answers



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
<div align="right">
    <b><a href="#">↥ back to top</a></b>
</div>

#### Q. Can you declare an interface method static?
Java 8 interface changes include static methods and default methods in interfaces. Prior to Java 8, we could have only method declarations in the interfaces. But from Java 8, we can have default methods and static methods in the interfaces.
