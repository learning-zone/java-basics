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
#### Q. Write a program to generate random numbers between the given range?
#### Q. Write a java program to swap two string variables without using temp variable?
#### Q. Write a java program to Move all zeroes to end of array?
```
Input:  arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
Output: arr[] = {1, 2, 4, 3, 5, 0, 0, 0};
```
#### Q. Write a multi-threading program to print odd number using one thread and even number using other?
#### Q. How to print all permutation of a String in Java?
#### Q. How to find duplicate characters in a string in java?
#### Q. Reverse the string with preserving the position of spaces
#### Q. How do you find longest substring without repeating characters in a string?
#### Q. Find all substrings of String in java
#### Q. Check if two string rotation of each other
#### Q. Can you write a regular expression to check if String is a number?
#### Q. Write a method that will remove given character from the String?
#### Q. Write a function to find out longest palindrome in a given string?
#### Q. Write a program to find top two maximum numbers in a array?
#### Q. How to separate zeros from non-zeros in an array?
#### Q. Find pair whose sum is closest to zero in array in java
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
#### Q. What do the expression 1.0 / 0.0 will return? will it throw Exception? any compile time error? [ Output: Infinity, No Exception ]
#### Q. How do you check the equality of two arrays in java? [ Arrays.equals() ]
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
#### Q. How to you calculate the difference between two dates in Java? (program)
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
#### Q. How to find all pairs on integer array whose sum is equal to given number?
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
#### Q. How do you find all pair whose sum is equal to given number from integer array in Java?
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

