## Collections Interview Questions

#### Q. What is Java Collections Framework? List out some benefits of Collections framework?
The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects. Java Collections can achieve all the operations that we perform on a data such as searching, sorting, insertion, manipulation, and deletion.

Java Collection means a single unit of objects. Java Collection framework provides many interfaces (Set, List, Queue, Deque) and classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).

**Collection**  

**Collection interface** is at the root of the hierarchy. Collection interface provides all general purpose methods which all collections classes must support (or throw UnsupportedOperationException). It extends **Iterable** interface which adds support for iterating over collection elements using the “for-each loop” statement.

**List**  

Lists represents an **ordered collection** of elements. Using lists, we can access elements by their integer index (position in the list), and search for elements in the list. index start with 0, just like an array.

Some useful classes which implement List interface are – **ArrayList**, **CopyOnWriteArrayList**, **LinkedList**, **Stack** and **Vector**.

**Set**  

Sets represents a collection of **sorted** elements. Sets do not allow the duplicate elements. Set interface does not provides no guarantee to return the elements in any predictable order; though some Set implementations store elements in their natural ordering and guarantee this order.

Some useful classes which implement Set interface are – **ConcurrentSkipListSet**, **CopyOnWriteArraySet**, **EnumSet**, **HashSet**, **LinkedHashSet** and **TreeSet**.

**Map**  

The Map interface enable us to store data in key-value pairs (keys should be immutable). A map cannot contain duplicate keys; each key can map to at most one value.

The Map interface provides three collection views, which allow a map’s contents to be viewed as a set of keys, collection of values, or set of key-value mappings. Some map implementations, like the TreeMap class, make specific guarantees as to their order; others, like the HashMap class, do not.

Some useful classes which implement Map interface are – **ConcurrentHashMap**, **ConcurrentSkipListMap**, **EnumMap**, **HashMap**, **Hashtable**, **IdentityHashMap**, **LinkedHashMap**, **Properties**, **TreeMap** and **WeakHashMap**.

**Stack**  

The Java Stack interface represents a classical stack data structure, where elements can be pushed to last-in-first-out (LIFO) stack of objects. In Stack we push an element to the top of the stack, and popped off from the top of the stack again later.

**Queue**  

A queue data structure is intended to hold the elements (put by producer threads) prior to processing by consumer thread(s). Besides basic Collection operations, queues provide additional insertion, extraction, and inspection operations.

Some useful classes which implement Map interface are – **ArrayBlockingQueue, ArrayDeque, ConcurrentLinkedDeque, ConcurrentLinkedQueue, DelayQueue, LinkedBlockingDeque, LinkedBlockingQueue, LinkedList, LinkedTransferQueue, PriorityBlockingQueue, PriorityQueue and SynchronousQueue**.

**Deque**  

A double ended queue (pronounced “deck“) that supports element insertion and removal at both ends. When a deque is used as a queue, FIFO (First-In-First-Out) behavior results. When a deque is used as a stack, LIFO (Last-In-First-Out) behavior results.

Some common known classes implementing this interface are **ArrayDeque, ConcurrentLinkedDeque, LinkedBlockingDeque** and **LinkedList**.


**The Java Collections Framework provides the following benefits:**

* Reduces programming effort
* Increases program speed and quality
* Allows interoperability among unrelated APIs
* Reduces effort to learn and to use new APIs
* Reduces effort to design new APIs
* Fosters software reuse

![Java Collections Framework](https://github.com/learning-zone/java-interview-questions/blob/master/assets/collection.png)

#### Q. What will be the problem if you don't override hashcode() method?
Some collections, like HashSet, HashMap or HashTable use the hashcode value of an object to find out how the object would be stored in the collection, and subsequently hashcode is used to help locate the object in the collection. Hashing retrieval involves:

* First, find out the right bucket using hashCode().
* Secondly, search the bucket for the right element using equals()

If hashcode() in not overridden then the default implementation in Object class will be used by collections. This implementation gives different values for different objects, even if they are equal according to the equals() method.

Example:
```java
public class Student {
    private int id;
    private String name;
    public Student(int id, String name) {
        this.name = name;
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

public class HashcodeEquals {
    public static void main(String[] args) {
        Student alex1 = new Student(1, "Alex");
        Student alex2 = new Student(1, "Alex");
        System.out.println("alex1 hashcode = " + alex1.hashCode());
        System.out.println("alex2 hashcode = " + alex2.hashCode());
        System.out.println("Checking equality between alex1 and alex2 = " + alex1.equals(alex2));
    }
}
```
Output
```
alex1 hashcode = 1852704110
alex2 hashcode = 2032578917
Checking equality between alex1 and alex2 = false
```
#### Q. What is the benefit of Generics in Collections Framework?
Generics allow us to provide the type of Object that a collection can contain, so if we try to add any element of other type it throws compile time error. This avoids ClassCastException at Runtime because we will get the error at compilation. Also Generics make code clean since we don’t need to use casting and instanceof operator. 

#### Q. How do WeakHashMap works?
WeakHashMap is a Hash table-based implementation of the Map interface with weak keys. An entry in a WeakHashMap will automatically be removed when its key is no longer in ordinary use. Both null values and the null key are supported. This class has performance characteristics similar to those of the HashMap class and has the same efficiency parameters of initial capacity and load factor. 
```java
// Java program to illustrate  
// WeakHashmap  
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;
public class WeakHashMapExample {

    public static void main(final String[] args) {

        final Map<Key, Project> map = new WeakHashMap<>();
        Key key1 = new Key("ACTIVE");
        final Key key2 = new Key("INACTIVE");
        map.put(key1, new Project(100, "Customer Management System", "Customer Management System"));
        map.put(key2, new Project(200, "Employee Management System", "Employee Management System"));
        key1 = null;
        System.gc();
        for (final Entry<Key, Project> entry : map.entrySet()) {
            System.out.println(entry.getKey().getKey() + "   " + entry.getValue());
        }
    }
}
class Key {
    private String key;
    public Key(final String key) {
        super();
        this.key = key;
    }
    public String getKey() {
        return key;
    }
    public void setKey(final String key) {
        this.key = key;
    }
}

```
Output
```
INACTIVE   [project id : 200, project name : Employee Management System, 
           project desc : Employee Management System ]
```

#### Q. What is difference between Array and ArrayList?
**1. Size**: Array in Java is fixed in size. We can not change the size of array after creating it. ArrayList is dynamic in size. When we add elements to an ArrayList, its capacity increases automatically.

**2. Performance**: In Java Array and ArrayList give different performance for different operations.

add() or get(): Adding an element to or retrieving an element from an array or ArrayList object has similar performance. These are constant time operations.

resize(): Automatic resize of ArrayList slows down the performance. ArrayList is internally backed by an Array. In resize() a temporary array is used to copy elements from old array to new array.

**3. Primitives**: Array can contain both primitive data types as well as objects. But ArrayList can not contain primitive data types. It contains only objects.

**4. Iterator**: In an ArrayList we use an Iterator object to traverse the elements. We use for loop for iterating elements in an array.

**5. Type Safety**: Java helps in ensuring Type Safety of elements in an ArrayList by using Generics. An Array can contain objects of same type of classe. If we try to store a different data type object in an Array then it throws ArrayStoreException.

**6. Length**: Size of ArrayList can be obtained by using size() method. Every array object has length variable that is same as the length/size of the array.

**7. Adding elements**: In an ArrayList we can use add() method to add objects. In an Array assignment operator is used for adding elements.

**8. Multi-dimension**: An Array can be multi-dimensional. An ArrayList is always of single dimension
```java
// A Java program to demonstrate differences between array 
// and ArrayList 
import java.util.ArrayList; 
import java.util.Arrays; 
  
class Test 
{ 
    public static void main(String args[]) { 
        /* ........... Normal Array............. */
        int[] arr = new int[2]; 
        arr[0] = 10; 
        arr[1] = 20; 
        System.out.println(arr[0]); 
  
        /*............ArrayList..............*/
        // Create an arrayList with initial capacity 2 
        ArrayList<Integer> arrL = new ArrayList<Integer>(2); 
  
        // Add elements to ArrayList 
        arrL.add(30); 
        arrL.add(40); 
  
        // Access elements of ArrayList 
        System.out.println(arrL.get(0)); 
    } 
} 
```
Output
```
10
30
```
#### Q. What is difference between ArrayList and LinkedList?
ArrayList and LinkedList both implements List interface and maintains insertion order. Both are non synchronized classes.

|Sl.No |ArrayList               |LinkedList                                                                 |
|------|------------------------|--------------------------------------------------------------------------|
|  01. |ArrayList internally uses a dynamic array to store the elements.|LinkedList internally uses a doubly linked list to store the elements.|
| 02. |Manipulation with ArrayList is slow because it internally uses an array. If any element is removed from the array, all the bits are shifted in memory.	|Manipulation with LinkedList is faster than ArrayList because it uses a doubly linked list, so no bit shifting is required in memory.|
| 03. |An ArrayList class can act as a list only because it implements List only.|	LinkedList class can act as a list and queue both because it implements List and Deque interfaces.|
| 04. | ArrayList is better for storing and accessing data.|LinkedList is better for manipulating data.|

```java
// Java program to demonstrate difference between ArrayList and 
// LinkedList. 
import java.util.ArrayList; 
import java.util.LinkedList; 

public class ArrayListLinkedListExample 
{ 
	public static void main(String[] args) {

		ArrayList<String> arrlistobj = new ArrayList<String>(); 
		arrlistobj.add("One"); 
		arrlistobj.add("Two"); 
		arrlistobj.add("Three"); 
		arrlistobj.remove(1); // Remove value at index 2 
		System.out.println("ArrayList object output: " + arrlistobj); 

		// Checking if an element is present. 
		if (arrlistobj.contains("Two")) 
			System.out.println("Found"); 
		else
			System.out.println("Not found"); 


		LinkedList llobj = new LinkedList(); 
		llobj.add("Four"); 
		llobj.add("Five"); 
		llobj.add("Six"); 
		llobj.remove("Five"); 
		System.out.println("LinkedList object output: " + llobj); 

		// Checking if an element is present. 
		if (llobj.contains("Five")) 
			System.out.println("Found"); 
		else
			System.out.println("Not found"); 
	} 
} 
```
#### Q. What is difference between Comparable and Comparator interface?
**Comparable**: A comparable object is capable of comparing itself with another object. The class itself must implements the `java.lang.Comparable` interface in order to be able to compare its instances.

**Comparator**: A comparator object is capable of comparing two different objects. The class is not comparing its instances, but some other class’s instances. This comparator class must implement the `java.util.Comparator` interface.

Comparable and Comparator both are interfaces and can be used to sort collection elements.

| Sl.No|Comparable	         |Comparator                                                |
|------|-----------------------|----------------------------------------------------------|
| 01.|Comparable provides a single sorting sequence. In other words, we can sort the collection on the basis of a single element such as id, name, and price.|The Comparator provides multiple sorting sequences. In other words, we can sort the collection on the basis of multiple elements such as id, name, and price etc.|
| 02.|Comparable affects the original class, i.e., the actual class is modified.|Comparator doesn't affect the original class, i.e., the actual class is not modified.|
| 03.|Comparable provides compareTo() method to sort elements.|	Comparator provides compare() method to sort elements.|
| 04.|Comparable is present in java.lang package.|A Comparator is present in the java.util package.|
| 05.|We can sort the list elements of Comparable type by Collections.sort(List) method.|We can sort the list elements of Comparator type by Collections.sort(List, Comparator) method.|

```java
//Java Program to demonstrate the use of Java Comparable.  
//Creating a class which implements Comparable Interface  
import java.util.*;  
import java.io.*;  

class Student implements Comparable<Student> {  
  int rollno;  
  String name;  
  int age;  
  Student(int rollno,String name,int age) {  
    this.rollno = rollno;  
    this.name = name;  
    this.age = age;  
  }  
  public int compareTo(Student st){  
    if(age == st.age)  
        return 0;  
    else if(age > st.age)  
        return 1;  
    else  
        return -1;  
  }  
}  
//Creating a test class to sort the elements  
public class TestSort3 {  

  public static void main(String args[]) {  
    ArrayList<Student> al = new ArrayList<Student>();  
    al.add(new Student(101,"Vijay",23));  
    al.add(new Student(106,"Ajay",27));  
    al.add(new Student(105,"Jai",21));  
    
    Collections.sort(al);  
    for(Student st:al) {  
        System.out.println(st.rollno+" "+st.name+" "+st.age);  
    }  
  }  
}  
```
#### Q. How to remove duplicates from ArrayList?
The LinkedHashSet is the best approach for removing duplicate elements in an arraylist. LinkedHashSet does two things internally :

* Remove duplicate elements
* Maintain the order of elements added to it
```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
 
public class ArrayListExample 
{
    public static void main(String[] args) {

        // ArrayList with duplicate elements
        ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
         
        System.out.println("ArrayList with duplicate elements: ", numbersList);
 
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(numbersList); 
        ArrayList<Integer> listWithoutDuplicates = new ArrayList<>(hashSet);
         
        System.out.println("ArrayList without duplicate elements: ", listWithoutDuplicates);
    }
}
```
Output
```
ArrayList with duplicate elements: [1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8]
ArrayList without duplicate elements: [1, 2, 3, 4, 5, 6, 7, 8]
```
#### Q. What is Java Priority Queue?
A priority queue in Java is a special type of queue wherein all the elements are ordered as per their natural ordering or based on a custom Comparator supplied at the time of creation.

The front of the priority queue contains the least element according to the specified ordering, and the rear of the priority queue contains the greatest element. So when we remove an element from the priority queue, the least element according to the specified ordering is removed first. The Priority Queue class is part of Java’s collections framework and implements the Queue interface. 
```java
import java.util.*;

public class CreatePriorityQueueStringExample {

    public static void main(String args[]){  

        PriorityQueue<String> queue = new PriorityQueue<String>();  
        queue.add("Amit");  
        queue.add("Vijay");  
        queue.add("Karan");  
        queue.add("Jai");  
        queue.add("Rahul");  
        System.out.println("head: "+queue.element());  
        System.out.println("head: "+queue.peek());  
        System.out.println("Iterating the queue elements: ");  

        Iterator itr = queue.iterator();  
        while(itr.hasNext()) {  
            System.out.println(itr.next());  
        }  
        queue.remove();  
        queue.poll();  
        System.out.println("after removing two elements: ");  

        Iterator<String> itr2 = queue.iterator();  
        while(itr2.hasNext()) {  
            System.out.println(itr2.next());  
        }  
    }
}
```
Output
```
head: Amit
head: Amit
iterating the queue elements:
Amit
Jai
Karan
Vijay
Rahul
after removing two elements:
Karan
Rahul
Vijay 
```
#### Q. What is LinkedHashMap in Java?
#### Q. What are different Collection views provided by Map interface?
#### Q. What is difference between HashMap and Hashtable?
#### Q. What are similarities and difference between ArrayList and Vector?
#### Q. Which collection classes provide random access of it’s elements?
#### Q. What is EnumSet?
#### Q. What are concurrent Collection Classes?
#### Q. What is BlockingQueue? How to implement producer-consumer problem by using BlockingQueue?
#### Q. What is Queue and Stack, list their differences?
#### Q. How can we sort a list of Objects?
#### Q. How to reverse ArrayList?
#### Q. What is difference between Enumeration and Iterator interface?
#### Q. What is different between Iterator and ListIterator?
#### Q. What are different ways to iterate over a list?
#### Q. What is the difference between fail-fast and fail-safe iterator?
#### Q. How to avoid ConcurrentModificationException while iterating a collection?
#### Q. Why there are no concrete implementations of Iterator interface?
#### Q. How can we create a synchronized collection from given collection?
#### Q. What are common algorithms implemented in Collections Framework?
#### Q. Which kind of tree is used to implement TreeMap in Java?
#### Q. What is default size of ArrayList and HashMap in Java?
#### Q. What is the difference between HashSet and TreeSet?
#### Q. What is the difference between Set and Map?
#### Q. What is the difference between HashSet and HashMap?
#### Q. What is the difference between HashMap and TreeMap?
#### Q. What is the difference between Collection and Collections?
#### Q. What is the advantage of the generic collection?
#### Q. What is hash-collision in Hashtable and how it is handled in Java?
#### Q. What is the Dictionary class?
#### Q. How to synchronize ArrayList?
#### Q. What are all the Classes and Interfaces that are available in the collections?
#### Q. What is meant by Ordered and Sorted in collections?
#### Q. Explain about the different lists available in the collection.
#### Q. Explain about Map and their types?
#### Q. What is the difference between List and Set?
#### Q. What is the difference between peek(), poll() and remove() method of the Queue interface?
#### Q. What is the difference between HashMap and ConcurrentHashMap?
#### Q. What is CopyOnWriteArrayList? How it is different from ArrayList in Java?
#### Q. What are concurrentCollectionClasses?
#### Q. How to make Java ArrayList Read-Only?
#### Q. How to sort ArrayList in descending order?
#### Q. Which design pattern followed by Iterator?
#### Q. What is difference between IdentityHashMap and HashMap in Java?
#### Q. What is CompareAndSwap approach?
#### Q. Why there is not method like Iterator.add() to add elements to the collection?
#### Q. What is ConcurrentLinkedQueue in Java?
#### Q. What is ConcurrentLinkedDequeue in Java?
#### Q. What is difference between ArrayBlockingQueue & LinkedBlockingQueue in Java Concurrency?
#### Q. What is PriorityBlockingQueue in Java Concurrency?
#### Q. What is DelayQueue in Java Concurrency?
#### Q. Write a code to make Collections readOnly?
#### Q. Why ConcurrentHashMap is faster than Hashtable in Java?
#### Q. What is SynchronousQueue in Java?
#### Q. What is the default size of load factor in hashing based collection?
#### Q. Why Collection doesn’t extend Cloneable and Serializable interfaces?
Collection is an interface that specifies a group of objects known as elements. The details of how the group of elements is maintained is left up to the concrete implementations of `Collection`. For example, some Collection implementations like `List` allow duplicate elements whereas other implementations like `Set` don't.

Collection is the root interface for all the collection classes ( like ArrayList, LinkedList ). If collection interface extends Cloneable/Serializable interfaces, then it is mandating all the concrete implementations of this interface to implement cloneable and serializable interfaces. To give freedom to concrete implementation classes, Collection interface don’t extended Cloneable or Serializable interfaces.

#### Q. Why Map interface doesn’t extend Collection interface?

