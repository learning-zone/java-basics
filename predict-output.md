## Predict the Output

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
    
  int birds = 10;
  public static void main(String[] args) {  
    System.out.println(birds);
  }  
}  
```
Output
```
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Cannot make a static reference to the non-static field birds

	at Test.main(Test.java:7)
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
