# Java Multiple Choice Questions 


## Q. Which of the follwing below live on the heap in java?
* Class
* Instance variable
* Method
* Object
```
Object
```
## Q. Which of the following interface is used to declare core methods in java?
* Set
* EventListner
* Collection
* Comparator
```
Collection
```
## Q. Which of these interface handle sequences?
* Set
* List
* Comparator
* Collection
```
List
```
## Q. Which of this interface must contain a unique element?
* Set
* List
* Array
* Collection
```
Set
```
## Q. Which of the following declarations does not compile?
A. double num1, int num2 = 0;  
B. int num1, num2;  
C. int num1, num2 = 0;  
D. int num1 = 0, num2 = 0;  
```
A. double num1, int num2 = 0;
```
## Q. What is the output of following program?
```java
public class Test {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			System.out.println(i + ' ');
		}
	}
}
```
Output
```
32
33
34
35
36
```
<div align="right">
    <b><a href="#">↥ back to top</a></b>
</div>

## Q. What is the output of following program?
```java
import java.util.ArrayList;
public class Test {

	public static void main(String[] args) {
		ArrayList arrList = new ArrayList();
		arrList.add(1);
		arrList.add('1');
		arrList.add("1");
		
		System.out.println(arrList);
	}
}
```
Output
```
[1, 1, 1]
```
## Q. What is the output of following program?
```java
public class Test {

	public static void main(String[] args) {
		for(int i=0; 0; i++) {
			System.out.println("Hello World!");
		}
	}
}
```
Output
```java
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Type mismatch: cannot convert from int to boolean

	at Test.main(Test.java:5)
```
## Q. Which statement about a valid .java file is true?
**A.** It can only contain one class declaration.  
**B.** It can contain one pulic class declaration and one public interface definition.  
**C.** It must define at least one public class.  
**D.** It may define at most one public class.  
```
Answer: D
```
## Q. What is the output of following program?
```java
public class Test {  
    
    private static int one = 10;
    int two = 20;

    public static void main(String []args) {    
    	Test test = new Test();
    	int today = 20; two = 40;
    	System.out.println(today + test.two + test.one);
    }  
}  
```
Output
```java
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Cannot make a static reference to the non-static field two

	at Test.main(Test.java:9)
```
<div align="right">
    <b><a href="#">↥ back to top</a></b>
</div>

## Q. What is the output of following program?
```java
public class Test{  
    
	static int start = 2;
	final int end;
	public Test(int x) {
		x = 4;
		end = x;
	}
	public void fly(int distance) {
		System.out.println(end-start+" ");
		System.out.println(distance);
	}
    public static void main(String []args){  
    	new Test(10).fly(5);
    }  
}  
```
Output
```
[2 5]
```
## Q. What is the output of following program?
```java
public class Test 
{
    public static void main(String a[]) {
    	try {
    		int val = 10/0;
    	} catch(Exception e) {
    		System.out.println(e);
    	} catch(ArithmeticException ae) {
    		System.out.println(ae);
    	}
    }
} 
```
Output
```java
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Unreachable catch block for ArithmeticException. It is already handled by the catch block for Exception

	at Test.main(Test.java:12)
```
<div align="right">
    <b><a href="#">↥ back to top</a></b>
</div>

## Q. What is the output of following program?
```java
public class Test 
{  	
    static void charNum(String inputString) {
    	HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
    	char[] strArray = inputString.toCharArray();
    	for(char c: strArray) {
    		if(charMap.containsKey(c)) {
    			charMap.put(c,  charMap.get(c)+1);
    		} else {
    			charMap.put(c, 1);
    		}
    	}
    	Set<Character> charInString = charMap.keySet();
    	for(Character ch: charInString) {
    		if(charMap.get(ch) > 1) {
    			System.out.println(ch +" : "+ charMap.get(ch));
    		}
    	}
    }
	public static void main(String[] args) {
       charNum("JavaJ2Ee");
    }   
} 
```
Output
```
a : 2
J : 2
```
## Q. Which of the following declarations does not compile?
A. double num1, int num2 = 0;  
B. int num1, num2;  
C. int num1, num2 = 0;  
D. int num1 = 0, num2 = 0;  
```
A. double num1, int num2 = 0;
```
**Explanation**: A. Option A does not compile because Java does not allow declaring different types as part of the same declaration. 

## Q. What is the output of the following?
```java
public static void main(String... args) {
   String chair, table = "metal";
   chair = chair + table;
   System.out.println(chair);
} 
```
A. metal    
B. metalmetal  
C. nullmetal  
D. The code does not compile  
```
D. The code does not compile 
```
**Explanation**: The local variable chair may not have been initialized

<div align="right">
    <b><a href="#">↥ back to top</a></b>
</div>

## Q. Which is correct about an instance variable of type String?
A. It defaults to an empty string.  
B. It defaults to null.  
C. It does not have a default value.  
D. It will not compile without initializing on the declaration line  
```
B. It defaults to null.  
```
## Q. How many of the following methods compile?
```java
public class Test 
{
	public String convert(int value) {
		return value.toString();
	}
	public String convert(Integer value) {
		return value.toString();
    }
	public String convert(Object value) {
		return value.toString();
	}
		
	public static void main(String... args) {
		Test obj = new Test();
		System.out.println(obj.convert(10));
	}
}
```
A. None  
B. One  
C. Two  
D. Three  
```
C. Two
```
**Explanation**: Objects have instance methods while primitives do not. Since int is a primitive, you cannot call instance methods on it. Integer and String are both objects and have instance methods.

## Q. Which of the following does not compile?
A. int num = 999;  
B. int num = 9_9_9;  
C. int num = _9_99;  
D. None of the above; they all compile.  
```
C. int num = _9_99; 
```
## Q. Which is the first line to trigger a compiler error?
```java
double d1 = 5f; // p1
double d2 = 5.0; // p2
float f1 = 5f; // p3
float f2 = 5.0; // p4
```
A. p1  
B. p2  
C. p3  
D. p4  
```
D. P4
```
**Explanation**: Type mismatch: cannot convert from double to float
<div align="right">
    <b><a href="#">↥ back to top</a></b>
</div>

## Q. How many instance initializers are in this code?
```java
public class Bowling {
 { 
     System.out.println(); 
 }
 public Bowling () {
    System.out.println();
 }
 static { 
    System.out.println(); 
 }
 { 
     System.out.println(); 
 }
}
```
A. None  
B. One  
C. Two  
D. Three  
```
C. Two
```
## Q. What is true of the finalize() method?
A. It may be called zero or one times.  
B. It may be called zero or more times.  
C. It will be called exactly once.  
D. It may be called one or more times.  
```
A. It may be called zero or one times.
```
**Explanation**: The `finalize()` method may not be called, such as if your program crashes. However, it is guaranteed to be called no more than once.

## Q. Which of the following is true about primitives?
A. You can call methods on a primitive.  
B. You can convert a primitive to a wrapper class object simply by assigning it.  
C. You can convert a wrapper class object to a primitive by calling valueOf().  
D. You can store a primitive directly into an ArrayList.  
```
B. You can convert a primitive to a wrapper class object simply by assigning it.
```
## Q. What is the output of the following?
```java
Integer integer = new Integer(4);
System.out.print(integer.byteValue());
System.out.print("-");
int i = new Integer(4);
System.out.print(i.byteValue());
```
A. 4-0  
B. 4-4  
C. The code does not compile.  
D. The code compiles but throws an exception at runtime  
```
C. The code does not compile.
```
<div align="right">
    <b><a href="#">↥ back to top</a></b>
</div>

## Q. Which two primitives have wrapper classes that are not merely the name of the primitive with an uppercase letter?
A. byte and char  
B. byte and int  
C. char and int  
D. None of the above  
```
C. char and int
```
**Explanation**: The wrapper class for int is Integer and the wrapper class for char is Character. All other primitives have the same name. For example, the wrapper class for boolean is Boolean.

## Q. How do you force garbage collection to occur at a certain point?
A. Call System.forceGc()  
B. Call System.gc()  
C. Call System.requireGc()  
D. None of the above   
```
D. None of the above
```
**Explanation**: While you can suggest to the JVM that it might want to run a garbage collection cycle, the JVM is free to ignore your suggestion.

## Q. How many of the String objects are eligible for garbage collection right before the end of the main method?
```java
public static void main(String[] fruits) {
  String fruit1 = new String("apple");
  String fruit2 = new String("orange");
  String fruit3 = new String("pear");
  fruit3 = fruit1;
  fruit2 = fruit3;
  fruit1 = fruit2;
}
```
A. None  
B. One  
C. Two  
D. Three  
```
C. Two 
```
**Explanation**: All three references point to the String apple. This makes the other two String objects eligible for garbage collection.

## Q. Which of the following does not compile?
A. double num = 2.718;  
B. double num = 2._718;  
C. double num = 2.7_1_8;  
D. None of the above; they all compile  
```
B. double num = 2._718;
```
**Explanation**: Underscores are allowed between any two digits in a numeric literal. Underscores are not allowed adjacent to a decimal point
<div align="right">
    <b><a href="#">↥ back to top</a></b>
</div>

## Q. Which of the following is the output of this code, assuming it runs to completion?
```java
public class Toy {
  public void play() {
  	System.out.print("play-");
  }
  public void finalizer() {
  	System.out.print("clean-");
  }
  public static void main(String[] fun) {
  	Toy car = new Toy();
  	car.play();
  	System.gc();
  	Toy doll = new Toy();
  	doll.play();
  }
}
```
A. play-  
B. play-play-  
C. play-clean-play-  
D. play-play-clean-clean-  
```
B. play-play-  
```
**Explanation**: If there was a finalize() method, this would be a different story. However, the method here is finalizer. Tricky! That’s just a normal method that doesn’t get called automatically. Therefore clean is never output.

## Q. What is the value of tip after executing the following code snippet?
```java
int meal = 5;
int tip = 2;
int total = meal + (meal>6 ? ++tip : --tip);
```
A. 1  
B. 2  
C. 3  
D. 6  
```
D. 6
```
**Explanation**: In ternary expressions, only one of the two right-most expressions are evaluated. Since `meal>6` is false, `––tip` is evaluated and `++tip` is skipped. `tip` is changed from 2 to 1 and `total` becomes `meal + (1)` which means `5 + 1 = 6`.
 
## Q. What is the output of the following application?
```java
String john = "john";
String jon = new String(john);

System.out.println((john==jon) + " "+ (john.equals(jon)));
```
A. true true  
B. true false  
C. false true  
D. false false  
```
C. false true
```
<div align="right">
    <b><a href="#">↥ back to top</a></b>
</div>
