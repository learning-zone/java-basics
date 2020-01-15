## Java Multiple Choice Questions 


#### Q. Which of the follwing below live on the heap in java?
* Class
* Instance variable
* Method
* Object
```
Object
```
#### Q. Which of the following interface is used to declare core methods in java?
* Set
* EventListner
* Collection
* Comparator
```
Collection
```
#### Q. Which of these interface handle sequences?
* Set
* List
* Comparator
* Collection
```
List
```
#### Q. Which of this interface must contain a unique element?
* Set
* List
* Array
* Collection
```
Set
```
#### Q. Which of the following declarations does not compile?
A. double num1, int num2 = 0;
B. int num1, num2;
C. int num1, num2 = 0;
D. int num1 = 0, num2 = 0;
```
A. double num1, int num2 = 0;
```
#### Q. What is the output of following program?
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
#### Q. What is the output of following program?
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
#### Q. What is the output of following program?
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
```
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Type mismatch: cannot convert from int to boolean

	at Test.main(Test.java:5)
```
#### Q. Which statement about a valid .java file is true?
**A.** It can only contain one class declaration.  
**B.** It can contain one pulic class declaration and one public interface definition.  
**C.** It must define at least one public class.  
**D.** It may define at most one public class.  
```
Answer: D
```
#### Q. What is the output of following program?
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
```
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Cannot make a static reference to the non-static field two

	at Test.main(Test.java:9)
```
#### Q. What is the output of following program?
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
#### Q. What is the output of following program?
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
```
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Unreachable catch block for ArithmeticException. It is already handled by the catch block for Exception

	at Test.main(Test.java:12)
```
#### Q. What is the output of following program?
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
#### Q. Which of the following declarations does not compile?
A. double num1, int num2 = 0;  
B. int num1, num2;  
C. int num1, num2 = 0;  
D. int num1 = 0, num2 = 0;  
```
A. double num1, int num2 = 0;

Explanation: A. Option A does not compile because Java does not allow declaring different types as
part of the same declaration. 
```
#### Q. What is the output of the following?
public static void main(String... args) {
   String chair, table = "metal";
   chair = chair + table;
   System.out.println(chair);
} 
A. metal  
B. metalmetal  
C. nullmetal  
D. The code does not compile  
```
D. The code does not compile 

Explanation: The local variable chair may not have been initialized
```
#### Q. Which is correct about an instance variable of type String?
A. It defaults to an empty string.  
B. It defaults to null.  
C. It does not have a default value.  
D. It will not compile without initializing on the declaration line  
```
B. It defaults to null.  
```
#### Q. How many of the following methods compile?
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

Explanation: Objects have instance methods while primitives do not. Since int is a primitive, you
cannot call instance methods on it. Integer and String are both objects and have
instance methods
```
#### Q. Which of the following does not compile?
A. int num = 999;  
B. int num = 9_9_9;  
C. int num = _9_99;  
D. None of the above; they all compile.  
```
C. int num = _9_99; 
```
#### Q. Which is the first line to trigger a compiler error?
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

Explanation: Type mismatch: cannot convert from double to float
```
#### Q. How many instance initializers are in this code?
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
#### Q. What is true of the finalize() method?
A. It may be called zero or one times.  
B. It may be called zero or more times.  
C. It will be called exactly once.  
D. It may be called one or more times.  
```
A. It may be called zero or one times.

The finalize() method may not be called, such as if your program crashes.
However, it is guaranteed to be called no more than once.
```
