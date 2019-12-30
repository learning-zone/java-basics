## Java Programs

#### Q. Write a function to find out duplicate words in a given string?
**Algorithm**  

1. Define a string.
1. Convert the string into lowercase to make the comparison insensitive.
1. Split the string into words.
1. Two loops will be used to find duplicate words. Outer loop will select a word and Initialize variable count to 1. Inner loop will compare the word selected by outer loop with rest of the words.
1. If a match found, then increment the count by 1 and set the duplicates of word to '0' to avoid counting it again.
1. After the inner loop, if count of a word is greater than 1 which signifies that the word has duplicates in the string.

```java
public class DuplicateWord {  

    public static void main(String[] args) {  
    
        String string = "Big black bug bit a big black dog on his big black nose";  
        int count;  
          
        //Converts the string into lowercase  
        string = string.toLowerCase();  
          
        //Split the string into words using built-in function  
        String words[] = string.split(" ");  
          
        System.out.println("Duplicate words in a given string : ");   
        for(int i = 0; i < words.length; i++) {  
            count = 1;  
            for(int j = i+1; j < words.length; j++) {  
                if(words[i].equals(words[j])) {  
                    count++;  
                    //Set words[j] to 0 to avoid printing visited word  
                    words[j] = "0";  
                }  
            }  
              
            //Displays the duplicate word if count is greater than 1  
            if(count > 1 && words[i] != "0")  
                System.out.println(words[i]);  
        }  
    }  
}  
```
Output
```
Duplicate words in a given string : 
big
black
```
#### Q. Find the missing number in an array?
**Algorithm**  

1. Calculate `A = n (n+1)/2` where n is largest number in series 1…N.
1. Calculate B = Sum of all numbers in given series
1. Missing number = A – B

```java
// Java program to find missing Number 

public class Test {  
    
	public static void main(String[] args) {

		int total;
		int[] numbers = new int[]{1, 2, 3, 4, 6, 7};
		total = 7;
		int expected_sum = total * ((total + 1) / 2);
		int num_sum = 0;
		
		for (int i: numbers) {
		 num_sum += i;
		}
		
		System.out.print( expected_sum - num_sum );
	}
}   
```
Output
```
5
```
#### Q. Write a program to generate random numbers between the given range?
*TODO*
#### Q. Write a java program to swap two string variables without using temp variable?
**Algorithm**  

1. Append second string to first string and store in first string:
   a = a + b

2. call the method substring(int beginindex, int endindex)
   by passing beginindex as 0 and endindex as,
      a.length() - b.length():
   b = substring(0,a.length()-b.length());

3. call the method substring(int beginindex) by passing 
   b.length() as argument to store the value of initial 
   b string in a
   a = substring(b.length());

```java
/**
* Java program to swap two strings without using a temporary 
* variable.
**/ 
import java.util.*; 

class Swap 
{	 
	public static void main(String args[]) {

		// Declare two strings 
		String a = "Hello"; 
		String b = "World"; 
		
		// Print String before swapping 
		System.out.println("Strings before swap: a = " + a + " and b = "+b); 
		
		// append 2nd string to 1st 
		a = a + b; 
		
		// store intial string a in string b 
		b = a.substring(0, a.length() - b.length()); 
		
		// store initial string b in string a 
		a = a.substring(b.length()); 
		
		// print String after swapping 
		System.out.println("Strings after swap: a = " + a + " and b = " + b);		 
	}	 
} 
```
Output
```
Strings before swap: a = Hello and b = World
Strings after swap: a = World and b = Hello
```

#### Q. Write a java program to Move all zeroes to end of array?
```
Input:  arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
Output: arr[] = {1, 2, 4, 3, 5, 0, 0, 0};
```
```java

public class Test 
{  
   	static void pushZerosToEnd(int arr[], int n) {
		
        int count = 0;  // Count of non-zero elements 
  
        // Traverse the array. If element encountered is 
        // non-zero, then replace the element at index 'count' 
        // with this element 
        for (int i = 0; i < n; i++) 
            if (arr[i] != 0) 
                arr[count++] = arr[i]; 
  
        // Now all non-zero elements have been shifted to 
        // front and 'count' is set as index of first 0. 
        // Make all elements 0 from count to end. 
        while (count < n) 
            arr[count++] = 0; 
    } 
  
   
    public static void main (String[] args) { 
    	
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9}; 
        int n = arr.length; 
        pushZerosToEnd(arr, n); 
        System.out.println("Array after pushing zeros to the back: "); 
        for (int i=0; i<n; i++) 
            System.out.print(arr[i]+" "); 
    } 	 
}  
```
Output
```
Array after pushing all zeros to end of array:
1 9 8 4 2 7 6 9 0 0 0 0
```
#### Q. Write a multi-threading program to print odd number using one thread and even number using other?
```java
class TaskEvenOdd implements Runnable {

    private int max;
    private Printer print;
    private boolean isEvenNumber;

    TaskEvenOdd(Printer print, int max, boolean isEvenNumber) {
        this.print = print;
        this.max = max;
        this.isEvenNumber = isEvenNumber;
    }

    @Override
    public void run() {
   
        int number = isEvenNumber == true ? 2 : 1;
        while (number <= max) {

            if (isEvenNumber) {
                //System.out.println("Thread Even: "+ Thread.currentThread().getName());
                print.printEven(number);
            } else {
                //System.out.println("Thread Odd: "+ Thread.currentThread().getName());
                print.printOdd(number);
            }
            number += 2;
        }
    }
}

class Printer {

    boolean isOdd = false;

    synchronized void printEven(int number) {

        while (isOdd == false) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread Even: " + number);
        isOdd = false;
        notifyAll();
    }

    synchronized void printOdd(int number) {
        while (isOdd == true) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread Odd: " + number);
        isOdd = true;
        notifyAll();
    }
}

public class Test 
{  
	static int MAX = 5;
	public static void main(String... args) {
        Printer print = new Printer();
        Thread t1 = new Thread(new TaskEvenOdd(print, MAX, false));
        Thread t2 = new Thread(new TaskEvenOdd(print, MAX, true));
        t1.start();
        t2.start();
    }	 
} 
```
Output
```
Thread Odd: 1
Thread Even: 2
Thread Odd: 3
Thread Even: 4
Thread Odd: 5
```
#### Q. How to print all permutations of a String in Java?
**Algorithm**  

1. Define a string.
1. Fix a character and swap the rest of the characters.
1. Call the generatePermutation() for rest of the characters.
1. Backtrack and swap the characters again.

**Recursive Approach**  


![Recursive Approach](https://github.com/learning-zone/java-interview-questions/blob/master/assets/recursive.png)

```java
public class PermuteString 
{  
    // Function for swapping the characters   
    public static String swapString(String a, int i, int j) {  
        char[] b =a.toCharArray();  
        char ch;  
        ch = b[i];  
        b[i] = b[j];  
        b[j] = ch;  
        return String.valueOf(b);  
    }  

    // Function for generating different permutations of the string  
    public static void generatePermutation(String str, int start, int end) {

        //Prints the permutations  
        if (start == end-1)  
            System.out.println(str);  
        else {  

            for (int i = start; i < end; i++) {

                //Swapping the string by fixing a character  
                str = swapString(str,start,i);  
                //Recursively calling function generatePermutation() for rest of the characters   
                generatePermutation(str,start+1,end);  
                //Backtracking and swapping the characters again.  
                str = swapString(str,start,i);  
            }  
        }  
    }

    public static void main(String[] args) {

        String str = "ABC";  
        int len = str.length();  
        System.out.println("All the permutations of the string are: ");  
        generatePermutation(str, 0, len);  
    }   
}  
```
Output
```
All the permutations of the string are: 

ABC
ACB
BAC
BCA
CBA
CAB
```
#### Q. Reverse the string with preserving the position of spaces
**Algorithm**  

1. Create a string to store result. Mark the space position of the given string in this string.
1. Insert the character from input string into the result string in reverse order.
1. while inserting the character check if the result string already contains a space at index ‘j’ or not. If it contains, we copy the character to the next position.

```java
// Java program to reverse a string 
// preserving spaces. 
public class ReverseStringPreserveSpace 
{ 
	static void reverses(String str) { 
			
	  char[] inputArray = str.toCharArray(); 
	  char[] result = new char[inputArray.length]; 
	  // Mark spaces in result 
	  for (int i = 0; i < inputArray.length; i++) { 
	    if (inputArray[i] == ' ') { 
	    	result[i] = ' '; 
	    } 
	  } 		
	  // Traverse input string from beginning 
	  // and put characters in result from end 
	  int j = result.length - 1; 
	  for (int i = 0; i < inputArray.length; i++) { 	
	    // Ignore spaces in input string 
	    if (inputArray[i] != ' ') { 			
	      // ignore spaces in result. 
	      if (result[j] == ' ') { 
	      	j--; 
	      }	 
	      result[j] = inputArray[i]; 
	      j--; 
	    } 
	  } 
	  System.out.println(String.valueOf(result)); 
	} 
	public static void main(String[] args) {
		reverses("India Is my country"); 
	} 
} 
```
Output
```
India Is my country --> yrtnu oc ym sIaidnI
```
#### Q. How do you find longest substring without repeating characters in a string?
**Algorithm**  

1. Start traversing the string from left to right and maintain track
2. Check the non-repeating characters in current substring with the help of a start and end index

```java
public class Test 
{  
	public static String getUniqueCharacterSubstring(String input) {

	    Map<Character, Integer> visited = new HashMap<>();
	    String output = "";
	    for (int start = 0, end = 0; end < input.length(); end++) {
	        char currChar = input.charAt(end);
	        if (visited.containsKey(currChar)) {
	            start = Math.max(visited.get(currChar) + 1, start);
	        }
	        if (output.length() < end - start + 1) {
	            output = input.substring(start, end + 1);
	        }
	        visited.put(currChar, end);
	    }
	    return output;
	}

	public static void main(String[] args) {
		
	    String input = "LongestSubstringFindOut";
	    System.out.println(getUniqueCharacterSubstring(input));
	} 
} 
```
Output
```
LongestSubstringFindOut --> LongestSub
```
#### Q. A Program to check if strings are rotations of each other or not?
**Algorithm**

1. Create a temp string and store concatenation of str1 to str1 in temp.
        temp = str1.str1
2. If str2 is a substring of temp then str1 and str2 are rotations of each other.

Example:                 
        str1 = "ABACD"
        str2 = "CDABA"

        temp = str1.str1 = "ABACDABACD"
Since str2 is a substring of temp, str1 and str2 are rotations of each other.

```java
class StringRotation 
{

	static boolean areRotations(String str1, String str2) { 
		// There lengths must be same and str2 must be 
		// a substring of str1 concatenated with str1. 
		return (str1.length() == str2.length()) && ((str1 + str1).indexOf(str2) != -1); 
	} 
	
	public static void main (String[] args) { 
		String str1 = "AACD"; 
		String str2 = "ACDA"; 

		if (areRotations(str1, str2)) 
			System.out.println("Strings are rotations of each other"); 
		else
			System.out.printf("Strings are not rotations of each other"); 
	} 
} 
```
Output
```
Strings are rotations of each other
```
#### Q. Can you write a regular expression to check if String is a number?
```java
public class StringTest 
{
	public static void main (String[] args) { 
		String regex = "[0-9]+";
		// String regex = "\\d+";
		String data = "23343453";
		System.out.println("Is Number: "+ data.matches(regex));
	} 
} 
```
Output
```
Is Number: true
```
#### Q. Write a program to find top two maximum numbers in a array?
```java
public class TwoMaxNumbers {
 
    public void printTwoMaxNumbers(int[] nums) {
        int maxOne = 0;
        int maxTwo = 0;
        for(int n:nums) {
            if(maxOne < n) {
                maxTwo = maxOne;
                maxOne = n;
            } else if(maxTwo < n) {
                maxTwo = n;
            }
        }
        System.out.println("First Max Number: "+maxOne);
        System.out.println("Second Max Number: "+maxTwo);
    }
     
    public static void main(String a[]) {
        int num[] = {5,34,78,2,45,1,99,23};
        TwoMaxNumbers tmn = new TwoMaxNumbers();
        tmn.printTwoMaxNumbers(num);
    }
}
```
Output
```
First Max Number: 99
Second Max Number: 78
```
#### Q. How to find all the leaders in an integer array in java?
An element is leader if it is greater than all the elements to its right side. And the rightmost element is always a leader. For example int the array {16, 17, 4, 3, 5, 2}, leaders are 17, 5 and 2.

```java
public class Test 
{
    void printLeaders(int arr[], int size) { 
        for (int i = 0; i < size; i++) { 
            int j; 
            for (j = i + 1; j < size; j++) { 
                if (arr[i] <= arr[j]) 
                    break; 
            } 
            if (j == size) // the loop didn't break 
                System.out.print(arr[i] + " "); 
        } 
    } 

    public static void main(String[] args) { 
    	Test lead = new Test(); 
        int arr[] = new int[]{25, 10, 2, 4, 1, 3}; 
        int n = arr.length; 
        lead.printLeaders(arr, n); 
    } 
} 
```
Output
```
25 10 4 3 
```
#### Q. Write a java program to find number of characters, number of words and number of lines in a text file?
```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test 
{
	public static void main(String[] args) {

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;
         
        try (
        	BufferedReader reader = new BufferedReader(new FileReader("C:\\file.txt"));
        ) {    
            // Reading the first line into currentLine
            String currentLine = reader.readLine();
             
            while (currentLine != null) {
                // Updating the lineCount
                lineCount++;
                 
                // Getting number of words in currentLine
                String[] words = currentLine.split(" ");
                 
                // Updating the wordCount
                wordCount = wordCount + words.length;

                for (String word : words) {
                    charCount = charCount + word.length();
                }
                 
                // Reading next line into currentLine
                currentLine = reader.readLine();
            }
 
            System.out.println("Number Of Chars In A File : "+charCount);
            System.out.println("Number Of Words In A File : "+wordCount);
            System.out.println("Number Of Lines In A File : "+lineCount);
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }   
} 
```
#### Q. Find all pairs of elements whose sum is equal to given number?
```java
public class Test 
{  	
	// Prints number of pairs in arr[0..n-1] with sum equal 
    // to 'sum' 
    public static void getPairsCount(int[] arr, int sum) {
        // Consider all possible pairs and check their sums 
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == sum) {
                	System.out.printf("(%d, %d) %n", arr[i], arr[j]); 
                }
            }
        }
    }
	public static void main(String args[]) { 
        int[] arr = { 1, 5, 7, -1, 5 }; 
        int sum = 12; 
        getPairsCount(arr, sum); 
    }
} 
```
Output
```
(5, 7) 
(7, 5)
```
#### Q. Program to convert lower to upper case without using toUppercase()?
```java
public class Test 
{  	
    public static void toLowerCase(String a) {
        for (int i = 0; i< a.length(); i++) {
            char character = a.charAt(i);
            if (65 <= character && character <= 90) {
            	character = (char)( (character + 32) ); 
            }
            System.out.print(character);
         }
     }
    public static void main(String[] args) {
		String str = "HELLO WORLD";
        toLowerCase(str);
    }
} 
```
Output
```
HELLO WORLD --> hello world
```
#### Q. Write a program to create deadlock between two threads?
```java
public class Test 
{  	
	// Creating Object Locks
    static Object ObjectLock1 = new Object();
    static Object ObjectLock2 = new Object();
   
    private static class ThreadName1 extends Thread {
      public void run() {
         synchronized (ObjectLock1) {
            System.out.println("Thread 1: Has  ObjectLock1");
            /* Adding sleep() method so that
               Thread 2 can lock ObjectLock2 */
            try { 
                Thread.sleep(100);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 1: Waiting for ObjectLock 2");
            /*Thread 1 has ObjectLock1 
              but waiting for ObjectLock2*/
            synchronized (ObjectLock2) {
               System.out.println("Thread 1: No DeadLock");
            }
         }
      }
   }
   private static class ThreadName2 extends Thread {
      public void run() {
         synchronized (ObjectLock2) {
            System.out.println("Thread 2: Has  ObjectLock2");
            /* Adding sleep() method so that
               Thread 1 can lock ObjectLock1 */
            try { 
                Thread.sleep(100);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 2: Waiting for ObjectLock 1");
            /*Thread 2 has ObjectLock2 
              but waiting for ObjectLock1*/
            synchronized (ObjectLock1) {
               System.out.println("Thread 2: No DeadLock");
            }
         }
      }
   }
   
   public static void main(String args[]) {
      ThreadName1 thread1 = new ThreadName1();
      ThreadName2 thread2 = new ThreadName2();
      thread1.start();
      thread2.start();
   }
} 
```
Output
```
Thread 1: Has  ObjectLock1
Thread 2: Has  ObjectLock2
Thread 2: Waiting for ObjectLock 1
Thread 1: Waiting for ObjectLock 2
```
**To get the Deadlocak details**  
```
To get the Thread PID
cmd > jps   // 9004 Test
cmd > jcmd 9004 Thread.print


9004:
2019-12-30 20:39:13
Full thread dump Java HotSpot(TM) 64-Bit Server VM (25.121-b13 mixed mode):

"DestroyJavaVM" #12 prio=5 os_prio=0 tid=0x000000000261d800 nid=0x25a8 waiting on condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"Thread-1" #11 prio=5 os_prio=0 tid=0x000000001d746000 nid=0xe78 waiting for monitor entry [0x000000001de9e000]
   java.lang.Thread.State: BLOCKED (on object monitor)
        at Test$ThreadName2.run(Test.java:45)
        - waiting to lock <0x000000076b3eae68> (a java.lang.Object)
        - locked <0x000000076b3eae78> (a java.lang.Object)

"Thread-0" #10 prio=5 os_prio=0 tid=0x000000001d745000 nid=0x468c waiting for monitor entry [0x000000001dd9e000]
   java.lang.Thread.State: BLOCKED (on object monitor)
        at Test$ThreadName1.run(Test.java:24)
        - waiting to lock <0x000000076b3eae78> (a java.lang.Object)
        - locked <0x000000076b3eae68> (a java.lang.Object)

"Service Thread" #9 daemon prio=9 os_prio=0 tid=0x000000001d6c1000 nid=0x2c08 runnable [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"C1 CompilerThread2" #8 daemon prio=9 os_prio=2 tid=0x000000001bd6c000 nid=0x265c waiting on condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"C2 CompilerThread1" #7 daemon prio=9 os_prio=2 tid=0x000000001bd46000 nid=0x461c waiting on condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"C2 CompilerThread0" #6 daemon prio=9 os_prio=2 tid=0x000000001bd3c800 nid=0x2bb8 waiting on condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"Attach Listener" #5 daemon prio=5 os_prio=2 tid=0x000000001bd3b000 nid=0x2b2c waiting on condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"Signal Dispatcher" #4 daemon prio=9 os_prio=2 tid=0x000000001bd39800 nid=0x55e4 runnable [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"Finalizer" #3 daemon prio=8 os_prio=1 tid=0x000000001bd29000 nid=0x32fc in Object.wait() [0x000000001d09f000]
   java.lang.Thread.State: WAITING (on object monitor)
        at java.lang.Object.wait(Native Method)
        - waiting on <0x000000076b388ec8> (a java.lang.ref.ReferenceQueue$Lock)
        at java.lang.ref.ReferenceQueue.remove(ReferenceQueue.java:143)
        - locked <0x000000076b388ec8> (a java.lang.ref.ReferenceQueue$Lock)
        at java.lang.ref.ReferenceQueue.remove(ReferenceQueue.java:164)
        at java.lang.ref.Finalizer$FinalizerThread.run(Finalizer.java:209)

"Reference Handler" #2 daemon prio=10 os_prio=2 tid=0x0000000002751000 nid=0x39e4 in Object.wait() [0x000000001cf9f000]
   java.lang.Thread.State: WAITING (on object monitor)
        at java.lang.Object.wait(Native Method)
        - waiting on <0x000000076b386b68> (a java.lang.ref.Reference$Lock)
        at java.lang.Object.wait(Object.java:502)
        at java.lang.ref.Reference.tryHandlePending(Reference.java:191)
        - locked <0x000000076b386b68> (a java.lang.ref.Reference$Lock)
        at java.lang.ref.Reference$ReferenceHandler.run(Reference.java:153)

"VM Thread" os_prio=2 tid=0x000000001bd06800 nid=0x5990 runnable

"GC task thread#0 (ParallelGC)" os_prio=0 tid=0x0000000002676800 nid=0x51d8 runnable

"GC task thread#1 (ParallelGC)" os_prio=0 tid=0x0000000002678000 nid=0x489c runnable

"GC task thread#2 (ParallelGC)" os_prio=0 tid=0x000000000267a000 nid=0x2e5c runnable

"GC task thread#3 (ParallelGC)" os_prio=0 tid=0x000000000267b800 nid=0x52ec runnable

"VM Periodic Task Thread" os_prio=2 tid=0x000000001d6cb000 nid=0x45ec waiting on condition

JNI global references: 5


Found one Java-level deadlock:
=============================
"Thread-1":
  waiting to lock monitor 0x00000000027572b8 (object 0x000000076b3eae68, a java.lang.Object),
  which is held by "Thread-0"
"Thread-0":
  waiting to lock monitor 0x0000000002759d58 (object 0x000000076b3eae78, a java.lang.Object),
  which is held by "Thread-1"

Java stack information for the threads listed above:
===================================================
"Thread-1":
        at Test$ThreadName2.run(Test.java:45)
        - waiting to lock <0x000000076b3eae68> (a java.lang.Object)
        - locked <0x000000076b3eae78> (a java.lang.Object)
"Thread-0":
        at Test$ThreadName1.run(Test.java:24)
        - waiting to lock <0x000000076b3eae78> (a java.lang.Object)
        - locked <0x000000076b3eae68> (a java.lang.Object)

Found 1 deadlock.


```
#### Q. How to find the word with the highest frequency from a file in Java?
#### Q. Write a program to convert a given Collection to Synchronized Collection?
#### Q. How to sort a text file in java?
#### Q. Find out middle index where sum of both ends are equal.
#### Q. What do the expression 1.0 / 0.0 will return? will it throw Exception? any compile time error? 
* Output: Infinity, No Exception
#### Q. How do you check the equality of two arrays in java?
* Arrays.equals() 
#### Q. How to perform matrix operations in java?
#### Q. How to remove duplicate elements from ArrayList in java?
#### Q. How to find trigonometric values of an angle in java?
#### Q. Decimal To Binary, Decimal To Octal And Decimal To HexaDecimal In Java
#### Q. Reverse and add until you get a palindrome
#### Q. Selection sort in java
#### Q. Write a java program to append text to a file?
#### Q. Write a singleton class.
#### Q. Write a program to sort a map by value.
#### Q. Write a program to get a line with max word count from the given file.
#### Q. Write a program to find two lines with max characters in descending order.
#### Q. FizzBuzz problem
#### Q. Write a Comparator in Java to compare two employees based upon there name, departments and age?
#### Q. How to calculate complexity of algorithm
#### Q. Implement Producer Consumer design Pattern in Java using wait, notify and notifyAll method in Java?
#### Q. Find Minimum numbers of platforms required for railway station in java
#### Q. How to check whether given number is binary or not?
#### Q. Armstrong number program in java
#### Q. How to find sum of all digits of a number in java?
#### Q. How to find largest number less than a given number and without a given digit?
#### Q. Roman equivalent of a decimal number
#### Q. How to check whether user input is number or not in java?
#### Q. Write a program to convert decimal number to binary format.
#### Q. Write a program to find perfect number or not.
#### Q. Write a program to find sum of each digit in the given number using recursion.
#### Q. Write a program to check the given number is a prime number or not?
#### Q. Write a program to convert binary to decimal number.
#### Q. Write a program to check the given number is binary number or not?
#### Q. Find prime factors of number in java
#### Q. Write code to avoid deadlock in Java where N threads are accessing N shared resources?
#### Q. How to find duplicate number on Integer array in Java?
#### Q. How to check if array contains a number in Java?
#### Q. How to find largest and smallest number in unsorted array?
#### Q. How to find repeated numbers in an array if it contains multiple duplicates?
#### Q. How to sort an array in place using QuickSort algorithm?
#### Q. Write a program to find intersection of two sorted arrays in Java?
#### Q. There is an array with every element repeated twice except one. Find that element?
#### Q. How find the first repeating element in an array of integers?
#### Q. How to find first non-repeating element in array of integers?
#### Q. How to find top two numbers from an integer array?
#### Q. How to find the smallest positive integer value that cannot be represented as sum of any subset of a given array?
#### Q. How to rearrange array in alternating positive and negative number?
#### Q. How to find if there is a sub array with sum equal to zero?
#### Q. How to remove a given element from array in Java?
#### Q. How to merge sorted array?
#### Q. How to find sub array with maximum sum in an array of positive and negative number?
#### Q. How to find sub array with largest product in array of both positive and negative number?
#### Q. Write a program to find length of longest consecutive sequence in array of integers?
#### Q. How to find minimum value in a rotated sorted array?
#### Q. Given an array of of size n and a number k, find all elements that appear more than n/k times?
#### Q. Returns the largest sum of contiguous integers in the array
#### Q. Return the sum two largest integers in an array
#### Q. How to search an array to check if an element exists there?
#### Q. How to copy array in Java?
#### Q. Write a function to find out longest palindrome in a given string?
#### Q. Can you make array volatile in Java?
#### Q. How to find top two numbers from an integer array in Java?
#### Q. Can you pass the negative number as an array size?
#### Q. What is an anonymous array? Give example?
#### Q. What is the difference between int[] a and int a[] ?
#### Q. What are jagged arrays in java? Give example?
#### Q. While creating the multidimensional arrays, can you specify an array dimension after an empty dimension?
#### Q. How to reverse Singly Linked List?
#### Q. Create a Java program to find middle node of linked list in Java in one pass?
#### Q. How to find if a linked list contains cycle or not in Java?
#### Q. How to find nth element from end of linked list
#### Q. How to check if linked list is palindrome in java
#### Q. Add two numbers represented by linked list in java
#### Q. How to sort a Stack using a temporary Stack?
#### Q. Implement Binary Search Tree (BST)
#### Q. Find min and max value from Binary Search Tree (BST)
#### Q. Find height of a Binary Search Tree (BST)
#### Q. Implement Binary Search Tree (BST) Level order traversal (breadth first).
#### Q. Implement Binary Search Tree (BST) pre-order traversal (depth first).
#### Q. Implement Binary Search Tree (BST) in-order traversal (depth first).
#### Q. Implement Binary Search Tree (BST) post-order traversal (depth first).
#### Q. How to check the given Binary Tree is Binary Search Tree (BST) or not?
#### Q. How to delete a node from Binary Search Tree (BST)?
#### Q. Binary tree level order traversal
#### Q. Binary tree spiral order traversal
#### Q. Binary tree reverse level order traversal
#### Q. Binary tree boundary traversal
#### Q. Print leaf nodes of binary tree
#### Q. Count leaf nodes in binary tree
#### Q. Get maximum element in binary tree
#### Q. Print all paths from root to leaf in binary tree
#### Q. Print vertical sum of binary tree in java
#### Q. Get level of node in binary tree in java
#### Q. Lowest common ancestor(LCA) in binary tree in java
#### Q. Search element in row wise and column wise sorted matrix
#### Q. Stock buy and sell to maximize profit.
#### Q. How to implement merge sort in java
#### Q. How to implement bubble sort in java
#### Q. How to implement insertion sort in java
#### Q. Write a program to implement hashcode and equals.
#### Q. Write wait-notify code for producer-consumer problem?
#### Q. Write a program to implement ArrayList.
#### Q. A maximal subarray
#### Q. Sort a linked list
#### Q. Iterative Quick sort
#### Q. Bucket sort
#### Q. Counting sort
#### Q. Square root of number
#### Q. Printing patterns
#### Q. Leap year
#### Q. Design a Vending Machine
#### Q. Transpose a matrix
#### Q. Adding two matrices in Java
#### Q. Matrix multiplication
#### Q. Write a java program to print Floyd’s Triangle?
#### Q. Spiral Matrix Program.
#### Q. Anagram program in java
#### Q. Write a program to print fibonacci series.
#### Q. How to you calculate the difference between two dates in Java? 
#### Q. Java Program to find gcd and lcm of two numbers
#### Q. Write a program to find the sum of the first 1000 prime numbers?


