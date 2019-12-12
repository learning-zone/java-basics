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
#### Q. What is difference between ArrayList and LinkedList?
#### Q. What is difference between Comparable and Comparator interface?
#### Q. Why Collection doesn’t extend Cloneable and Serializable interfaces?
#### Q. Why Map interface doesn’t extend Collection interface?
#### Q. What is difference between Enumeration and Iterator interface?
#### Q. What is different between Iterator and ListIterator?
#### Q. What are different ways to iterate over a list?
#### Q. What is the difference between fail-fast and fail-safe iterator?
#### Q. How to avoid ConcurrentModificationException while iterating a collection?
#### Q. Why there are no concrete implementations of Iterator interface?
#### Q. What are different Collection views provided by Map interface?
#### Q. What is difference between HashMap and Hashtable?
#### Q. What are similarities and difference between ArrayList and Vector?
#### Q. Which collection classes provide random access of it’s elements?
#### Q. What is EnumSet?
#### Q. What are concurrent Collection Classes?
#### Q. What is BlockingQueue? How to implement producer-consumer problem by using BlockingQueue?
#### Q. What is Queue and Stack, list their differences?
#### Q. How can we sort a list of Objects?
#### Q. How can we create a synchronized collection from given collection?
#### Q. What are common algorithms implemented in Collections Framework?
#### Q. What are best practices related to Java Collections Framework?
#### Q. What is Java Priority Queue?
#### Q. What is LinkedHashMap in Java?
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
#### Q. How to remove duplicates from ArrayList?
#### Q. How to reverse ArrayList?
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
