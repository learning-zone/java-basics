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
		System.out.println("Strings before swap: a = " + 
									a + " and b = "+b); 
		
		// append 2nd string to 1st 
		a = a + b; 
		
		// store intial string a in string b 
		b = a.substring(0, a.length() - b.length()); 
		
		// store initial string b in string a 
		a = a.substring(b.length()); 
		
		// print String after swapping 
		System.out.println("Strings after swap: a = " + 
									a + " and b = " + b);		 
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


![Backtrack](https://github.com/learning-zone/java-interview-questions/blob/master/assets/exception.png)

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

#### Q. How to find duplicate characters in a string in java?
#### Q. Reverse the string with preserving the position of spaces
#### Q. How do you find longest substring without repeating characters in a string?
#### Q. Find all substrings of String in java
#### Q. Check if two string rotation of each other
#### Q. Can you write a regular expression to check if String is a number?
#### Q. Write a method that will remove given character from the String?
#### Q. Write a function to find out longest palindrome in a given string?
#### Q. Write a program to find top two maximum numbers in a array?
#### Q. How to find all the leaders in an integer array in java?
#### Q. Can you store String in an array of Integer in Java? compile time error or runtime exception?
#### Q. Java Program to find gcd and lcm of two numbers
#### Q. Write a program to find the sum of the first 1000 prime numbers?
#### Q. Write a java program to find number of characters, number of words and number of lines in a text file?
#### Q. Find all pairs of elements whose sum is equal to given number
#### Q. Program to convert lower to upper case without using toUppercase()
#### Q. Write a program to create deadlock between two threads?
#### Q. How to find the word with the highest frequency from a file in Java?
#### Q. Write a program to convert a given Collection to Synchronized Collection ?
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
#### Q. Launch external applications using java
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
#### Q. How to find the missing number in integer array of 1 to 100?
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


