## Multithreading Interview Questions

#### Q. What are the states in the lifecycle of a Thread?
A java thread can be in any of following thread states during it’s life cycle i.e. New, Runnable, Blocked, Waiting, Timed Waiting or Terminated. These are also called life cycle events of a thread in java. 

* New
* Runnable
* Running
* Non-Runnable (Blocked)
* Terminated

**1. New**: The thread is in new state if you create an instance of Thread class but before the invocation of start() method.  
**2. Runnable**: The thread is in runnable state after invocation of start() method, but the thread scheduler has not selected it to be the running thread.  
**3. Running**: The thread is in running state if the thread scheduler has selected it.  
**4. Non-Runnable (Blocked)**: This is the state when the thread is still alive, but is currently not eligible to run.  
**5. Terminated**: A thread is in terminated or dead state when its run() method exits.  

#### Q. What are the different ways of implementing thread? 
There are two ways to create a thread:
* extends Thread class
* implement Runnable interface

**1. Extends Thread class**  
Create a thread by a new class that extends Thread class and create an instance of that class. The extending class must override run() method which is the entry point of new thread.
```java
public class MyThread extends Thread {
     
    public void run() {
      System.out.println("Thread started running..");
    }
    public static void main( String args[] ) {
       MyThread mt = new  MyThread();
       mt.start();
    }
}
```
Output
```
Thread started running..
```
**2. Implementing the Runnable Interface**  
After implementing runnable interface, the class needs to implement the run() method, which is `public void run()`.

* run() method introduces a concurrent thread into your program. This thread will end when run() returns.
* You must specify the code for your thread inside run() method.
* run() method can call other methods, can use other classes and declare variables just like any other normal method.
```java
class MyThread implements Runnable {

    public void run() {
        System.out.println("Thread started running..");
    }
    public static void main(String args[]) {
        MyThread mt = new MyThread();
        Thread t = new Thread(mt);
        t.start();
    }
}
```

**Difference between Runnable vs Thread**  

* Implementing Runnable is the preferred way to do it. Here, you’re not really specializing or modifying the thread’s behavior. You’re just giving the thread something to run. That means composition is the better way to go.
* Java only supports single inheritance, so you can only extend one class.
* Instantiating an interface gives a cleaner separation between your code and the implementation of threads.
* Implementing Runnable makes your class more flexible. If you extend Thread then the action you’re doing is always going to be in a thread. However, if you implement Runnable it doesn’t have to be. You can run it in a thread, or pass it to some kind of executor service, or just pass it around as a task within a single threaded application.

#### Q. What is the difference between Process and Thread?
Both processes and threads are independent sequences of execution. The typical difference is that threads (of the same process) run in a shared memory space, while processes run in separate memory spaces.

**Process**  

* An executing instance of a program is called a process.
* Some operating systems use the term **task** to refer to a program that is being executed.
* A process is always stored in the main memory also termed as the primary memory or random access memory.
* Therefore, a process is termed as an active entity. It disappears if the machine is rebooted.
* Several process may be associated with a same program.
* On a multiprocessor system, multiple processes can be executed in parallel.
* On a uni-processor system, though true parallelism is not achieved, a process scheduling algorithm is applied and the processor is scheduled to execute each process one at a time yielding an illusion of concurrency.


**Thread**  

* A thread is a subset of the process.
* It is termed as a **lightweight process**, since it is similar to a real process but executes within the context of a process and shares the same resources allotted to the process by the kernel.
* Usually, a process has only one thread of control – one set of machine instructions executing at a time.
* A process may also be made up of multiple threads of execution that execute instructions concurrently.
* Multiple threads of control can exploit the true parallelism possible on multiprocessor systems.
* On a uni-processor system, a thread scheduling algorithm is applied and the processor is scheduled to run each thread one at a time.
* All the threads running within a process share the same address space, file descriptors, stack and other process related attributes.
* Since the threads of a process share the same memory, synchronizing the access to the shared data within the process gains unprecedented importance.

#### Q. What is difference between user Thread and daemon Thread?
Daemon threads are low priority threads which always run in background and user threads are high priority threads which always run in foreground. User Thread or Non-Daemon are designed to do specific or complex task where as daemon threads are used to perform supporting tasks.

**Difference Between Daemon Threads And User Threads In Java**  

* User threads are created by the application (user) to perform some specific task. Where as daemon threads are mostly created by the JVM to perform some background tasks like garbage collection.

* JVM will wait for user threads to finish their tasks. JVM will not exit until all user threads finish their tasks. On the other side, JVM will not wait for daemon threads to finish their tasks. It will exit as soon as all user threads finish their tasks.
* User threads are high priority threads, They are designed mainly to execute some important task in an application. Where as daemon threads are less priority threads. They are designed to serve the user threads.
* User threads are foreground threads. They always run in foreground and perform some specific task assigned to them. Where as daemon threads are background threads. They always run in background and act in a supporting role to user threads.
* JVM will not force the user threads to terminate. It will wait for user threads to terminate themselves. On the other hand, JVM will force the daemon threads to terminate if all the user threads have finished their task.

**create Daemon Thread**  
```java
/**
 * Java Program to demonstrate difference beween a daemon and a user thread .
 * 
 */
public class DaemonThreadDemo {

    public static void main(String[] args) throws InterruptedException {

        // main thread is a non-daemon thread
        String name = Thread.currentThread().getName();
        boolean isDaemon = Thread.currentThread().isDaemon();

        System.out.println("name: " + name + ", isDaemon: " + isDaemon);

        // Any new thread spawned from main is also non-daemon or user thread
        // as seen below:
        Runnable task = new Task();
        Thread t1 = new Thread(task, "T1");
        System.out.println("Thread spawned from main thread");
        System.out.println("name: " + t1.getName() + ", isDaemon: " + t1.isDaemon());

        // though you can make a daemon thread by calling setDaemon()
        // before starting it as shown below:
        t1.setDaemon(true);
        t1.start();

        // let's wait for T1 to finish
        t1.join();
    }

    private static class Task implements Runnable {

        @Override
        public void run() {
            Thread t = Thread.currentThread();
            System.out.println("Thread made daemon by calling setDaemon() method");
            System.out.println("name: " + t.getName() + ", isDaemon: " + t.isDaemon());

            // Any new thread created from daemon thread is also daemon
            Thread t2 = new Thread("T2");
            System.out.println("Thread spawned from a daemon thread");
            System.out.println("name: " + t2.getName() + ", isDaemon: " + t2.isDaemon());
        }
    }
}
```
Output
```
name: main, isDaemon: false
Thread spawned from main thread
name: T1, isDaemon: false
Thread made daemon by calling setDaemon() method
name: T1, isDaemon: true
Thread spawned from a daemon thread
name: T2, isDaemon: true
```
#### Q. How does thread communicate with each other?
**Inter-thread communication** is a mechanism in which a thread is paused running in its critical section and another thread is allowed to enter (or lock) in the same critical section to be executed. It is implemented by following methods of Object class:

* wait()
* notify()
* notifyAll()

```java
class ThreadA {

    public static void main(String [] args) {
      ThreadB b = new ThreadB();
      b.start();
      synchronized(b) {
       try {
            System.out.println("Waiting for b to complete...");
            b.wait();
       } catch (InterruptedException e) {}
            System.out.println("Total is: " + b.total);
      }
    }
}

class ThreadB extends Thread {
 int total;

 public void run() {
   synchronized(this) {
    for(int i = 0; i < 100; i++) {
        total += i;
    }
    notify();
   }
  }
}
```
#### Q. What do you understand about Thread Priority?
Every thread in Java has a priority that helps the thread scheduler to determine the order in which threads scheduled. The threads with higher priority will usually run before and more frequently than lower priority threads. By default, all the threads had the same priority, i.e., they regarded as being equally distinguished by the scheduler, when a thread created it inherits its priority from the thread that created it.

Default priority of a thread is 5 (NORM_PRIORITY). The value of MIN_PRIORITY is 1 and the value of MAX_PRIORITY is 10.

* public static int MIN_PRIORITY
* public static int NORM_PRIORITY
* public static int MAX_PRIORITY

```java
class TestMultiPriority1 extends Thread {  
  
    public void run() {  
        System.out.println("Running thread name is:" + Thread.currentThread().getName());  
        System.out.println("Running thread priority is:" + Thread.currentThread().getPriority());  
    }  

    public static void main(String args[]) {  
        TestMultiPriority1 m1 = new TestMultiPriority1();  
        TestMultiPriority1 m2 = new TestMultiPriority1();  
        m1.setPriority(Thread.MIN_PRIORITY);  
        m2.setPriority(Thread.MAX_PRIORITY);  
        m1.start();  
        m2.start();  
    }  
}     
```
Output
```
Running thread name is: Thread-0
Running thread priority is: 10
Running thread name is: Thread-1
Running thread priority is: 1    
```
#### Q. What is Thread Scheduler and Time Slicing?
**Thread scheduler** in java is the part of the JVM that decides which thread should run. The thread scheduler mainly uses preemptive or time slicing scheduling to schedule the threads.

**Preemptive scheduling**: The highest priority task executes until it enters the waiting or dead states or a higher priority task comes into existence.

**Time slicing**: A task executes for a predefined slice of time and then reenters the pool of ready tasks. The scheduler then determines which task should execute next, based on priority and other factors.

Example: Thread Scheduler
```java
class FirstThread extends Thread {
	public void run(){
		for(int i = 0; i < 10; ++i) {
			System.out.println("I am in first thread");
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie) {
				System.out.println("Exception occurs ");
			}
		}
	}
}

class SecondThread {
	public static void main(String[] args){
		FirstThread ft = new FirstThread();
		ft.start();
		for(int j = 1; j < 10; ++j) {
			System.out.println("I am in second thread");
		}
	}
}
```
Output
```
cmd> java SecondThread
I am in second thread
I am in first thread
I am in second thread
I am in second thread
I am in second thread
I am in second thread
I am in second thread
I am in second thread
I am in second thread
I am in second thread
I am in first thread
I am in first thread
I am in first thread
I am in first thread
I am in first thread
I am in first thread
I am in first thread
I am in first thread
I am in first thread
```
#### Q. What is context-switching in multi-threading?
Context Switching is the process of storing and restoring of CPU state so that Thread execution can be resumed from the same point at a later point of time. Context Switching is the essential feature for multitasking operating system and support for multi-threaded environment.

#### Q. What is Deadlock? How to analyze and avoid deadlock situation?
**Deadlock** is a programming situation where two or more threads are blocked forever, this situation arises with at least two threads and two or more resources.
```java
class HelloClass {
	public synchronized void first(HiClass hi) {
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException ie) {}
		System.out.println(" HelloClass is calling 	HiClass second() method");
		hi.second();
	}

	public synchronized void second() {
		System.out.println("I am inside second method of HelloClass");
	}
}

class HiClass {
	public synchronized void first(HelloClass he) {
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException ie){}
		System.out.println(" HiClass is calling HelloClass second() method");
		he.second();
	}

	public synchronized void second() {
		System.out.println("I am inside second method of HiClass");
	}
}

class DeadlockClass extends Thread {
	HelloClass he = new HelloClass();
	HiClass hi = new HiClass();

	public void demo() {
		this.start();
		he.first(hi);
	} 
	public void run() {
		hi.first(he);
	}

	public static void main(String[] args) {
		DeadlockClass dc = new DeadlockClass();
		dc.demo();
	}
}
```
Output
```
cmd> java DeadlockClass
HelloClass is calling HiClass second() method
HiClass is calling HelloClass second() method
```
**Avoid deadlock**  

**1. Avoid Nested Locks**: This is the most common reason for deadlocks, avoid locking another resource if you already hold one. It’s almost impossible to get deadlock situation if you are working with only one object lock. For example, here is the another implementation of run() method without nested lock and program runs successfully without deadlock situation.
```java
public void run() {
    String name = Thread.currentThread().getName();
    System.out.println(name + ' acquiring lock on ' + obj1);
    synchronized (obj1) {
        System.out.println(name + ' acquired lock on ' + obj1);
        work();
    }
    System.out.println(name + ' released lock on ' + obj1);
    System.out.println(name + ' acquiring lock on ' + obj2);
    synchronized (obj2) {
        System.out.println(name + ' acquired lock on ' + obj2);
        work();
    }
    System.out.println(name + ' released lock on ' + obj2);
    System.out.println(name + ' finished execution.');
}
```
**2. Lock Only What is Required**: You should acquire lock only on the resources you have to work on, for example in above program I am locking the complete Object resource but if we are only interested in one of it’s fields, then we should lock only that specific field not complete object.

**3. Avoid waiting indefinitely**: You can get deadlock if two threads are waiting for each other to finish indefinitely using thread join. If your thread has to wait for another thread to finish, it’s always best to use join with maximum time you want to wait for thread to finish.

#### Q. What is Thread Pool? How can we create Thread Pool in Java?
A thread pool reuses previously created threads to execute current tasks and offers a solution to the problem of thread cycle overhead and resource thrashing. Since the thread is already existing when the request arrives, the delay introduced by thread creation is eliminated, making the application more responsive.

Java provides the Executor framework which is centered around the Executor interface, its sub-interface –**ExecutorService** and the class-**ThreadPoolExecutor**, which implements both of these interfaces. By using the executor, one only has to implement the Runnable objects and send them to the executor to execute.

To use thread pools, we first create a object of ExecutorService and pass a set of tasks to it. ThreadPoolExecutor class allows to set the core and maximum pool size.The runnables that are run by a particular thread are executed sequentially.
```java
// Java program to illustrate  
// ThreadPool 
import java.text.SimpleDateFormat;  
import java.util.Date; 
import java.util.concurrent.ExecutorService; 
import java.util.concurrent.Executors; 
  
// Task class to be executed (Step 1) 
class Task implements Runnable    
{ 
    private String name; 
      
    public Task(String s) { 
        name = s; 
    } 
      
    // Prints task name and sleeps for 1s 
    // This Whole process is repeated 5 times 
    public void run() { 
        try { 
            for (int i = 0; i<=5; i++) { 
                if (i == 0) { 
                    Date d = new Date(); 
                    SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss"); 
                    System.out.println("Initialization Time for"
                            + " task name - "+ name +" = " +ft.format(d));    
                    //prints the initialization time for every task  
                } 
                else { 
                    Date d = new Date(); 
                    SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss"); 
                    System.out.println("Executing Time for task name - "+ 
                            name +" = " +ft.format(d));    
                    // prints the execution time for every task  
                } 
                Thread.sleep(1000); 
            } 
            System.out.println(name+" complete"); 
        } 
        catch(InterruptedException e) { 
            e.printStackTrace(); 
        } 
    } 
} 
public class Test 
{ 
     // Maximum number of threads in thread pool 
    static final int MAX_T = 3;              
  
    public static void main(String[] args) { 
        // creates five tasks 
        Runnable r1 = new Task("task 1"); 
        Runnable r2 = new Task("task 2"); 
        Runnable r3 = new Task("task 3"); 
        Runnable r4 = new Task("task 4"); 
        Runnable r5 = new Task("task 5");       
          
        // creates a thread pool with MAX_T no. of  
        // threads as the fixed pool size(Step 2) 
        ExecutorService pool = Executors.newFixedThreadPool(MAX_T);   
         
        // passes the Task objects to the pool to execute (Step 3) 
        pool.execute(r1); 
        pool.execute(r2); 
        pool.execute(r3); 
        pool.execute(r4); 
        pool.execute(r5);  
          
        // pool shutdown ( Step 4) 
        pool.shutdown();     
    } 
} 
```
Output
```
Initialization Time for task name - task 2 = 02:32:56
Initialization Time for task name - task 1 = 02:32:56
Initialization Time for task name - task 3 = 02:32:56
Executing Time for task name - task 1 = 02:32:57
Executing Time for task name - task 2 = 02:32:57
Executing Time for task name - task 3 = 02:32:57
Executing Time for task name - task 1 = 02:32:58
Executing Time for task name - task 2 = 02:32:58
Executing Time for task name - task 3 = 02:32:58
Executing Time for task name - task 1 = 02:32:59
Executing Time for task name - task 2 = 02:32:59
Executing Time for task name - task 3 = 02:32:59
Executing Time for task name - task 1 = 02:33:00
Executing Time for task name - task 3 = 02:33:00
Executing Time for task name - task 2 = 02:33:00
Executing Time for task name - task 2 = 02:33:01
Executing Time for task name - task 1 = 02:33:01
Executing Time for task name - task 3 = 02:33:01
task 2 complete
task 1 complete
task 3 complete
Initialization Time for task name - task 5 = 02:33:02
Initialization Time for task name - task 4 = 02:33:02
Executing Time for task name - task 4 = 02:33:03
Executing Time for task name - task 5 = 02:33:03
Executing Time for task name - task 5 = 02:33:04
Executing Time for task name - task 4 = 02:33:04
Executing Time for task name - task 4 = 02:33:05
Executing Time for task name - task 5 = 02:33:05
Executing Time for task name - task 5 = 02:33:06
Executing Time for task name - task 4 = 02:33:06
Executing Time for task name - task 5 = 02:33:07
Executing Time for task name - task 4 = 02:33:07
task 5 complete
task 4 complete
```
**Risks in using Thread Pools**   

* Deadlock
* Thread Leakage
* Resource Thrashing

#### Q. Why wait(), notify() and notifyAll() must be called from inside of the synchronized block or method.?
`wait()` forces the thread to release its lock. This means that it must own the lock of an object before calling the `wait()` method of that (same) object. Hence the thread must be in one of the object's synchronized methods or synchronized block before calling wait().

When a thread invokes an object's `notify()` or `notifyAll()` method, one (an arbitrary thread) or all of the threads in its waiting queue are removed from the waiting queue to the entry queue. They then actively contend for the object's lock, and the one that gets the lock goes on to execute.

#### Q. What is the difference between wait() and sleep() method?
**1.  Class  belongs**:  The wait() method belongs to `java.lang.Object` class, thus can be called on any Object. The sleep() method belongs to `java.lang.Thread` class, thus can be called on Threads.  

**2. Context**:  The wait() method can only be called from Synchronized context i.e. using synchronized block or synchronized method. The sleep() method can be called from any context.  

**3. Locking**:  The wait() method releases the lock on an object and gives others chance to execute. The sleep() method does not releases the lock of an object for specified time or until interrupt. 

**4. Wake up condition**:  A waiting thread can be awake by notify() or notifyAll() method. A sleeping can be awaked by interrupt or time expires.  

**5. Execution**:  Each object has each wait() method for inter-communication between threads. The sleep() method is static method belonging to Thread class. There is a common mistake to write t.sleep(1000) because sleep() is a class method and will pause the current running thread not t.  
```java
synchronized(LOCK) {
    Thread.sleep(1000); // LOCK is held
}


synchronized(LOCK) {
    LOCK.wait(); // LOCK is not held
}
```
#### Q. What is static synchronization?
Static synchronization is achieved by static synchronized methods. Static synchronized method locked on **class** and non-static synchronized method locked on **current object** i.e. static and non-static synchronized methods can run at same time. It can produce inconsistency problem.

If static synchronized method is called a class level lock is acquired and then if an object is tries to access non-static synchronized method at the same time it will not be accessible because class level lock is already acquired.
```java
/**
 * This program is used to show the multithreading 
 * example with synchronization using static synchronized method.
 * @author codesjava
 */
class PrintTable {    
    public synchronized static void printTable(int n) {
	   System.out.println("Table of " + n);
       for(int i = 1; i <= 10; i++) {
           System.out.println(n*i);  
           try {  
        	 Thread.sleep(500);  
           } catch(Exception e) {
        	 System.out.println(e);
           }  
        }         
    }  
}  
 
class MyThread1 extends Thread {    
    public void run() { 
    	PrintTable.printTable(2);  
    }        
}  
 
class MyThread2 extends Thread {   
	public void run() {  
		PrintTable.printTable(5);  
	}  
}  
 
public class MultiThreadExample {  
    public static void main(String args[]) {
 
    	//creating threads.
	    MyThread1 t1 = new MyThread1();  
	    MyThread2 t2 = new MyThread2();  
 
	    //start threads.
	    t1.start();  
	    t2.start();  
    }  
}
```
Output
```
Table of 2
2
4
6
8
10
12
14
16
18
20
Table of 5
5
10
15
20
25
30
35
40
45
50
```
#### Q. How is the safety of a thread achieved?
* Immutable objects are by default thread-safe because there state can not be modified once created. Since String is immutable in Java, its inherently thread-safe.
* Read only or final variables in Java are also thread-safe in Java.
* Locking is one way of achieving thread-safety in Java.
* Static variables if not synchronized properly becomes major cause of thread-safety issues.
* Example of thread-safe class in Java: Vector, Hashtable, ConcurrentHashMap, String etc.
* Atomic operations in Java are thread-safe e.g. reading a 32 bit int from memory because its an atomic operation it can't interleave with other thread.
* local variables are also thread-safe because each thread has there own copy and using local variables is good way to writing thread-safe code in Java.
* In order to avoid thread-safety issue minimize sharing of objects between multiple thread.
* Volatile keyword in Java can also be used to instruct thread not to cache variables and read from main memory and can also instruct JVM not to reorder or optimize code from threading perspective.

#### Q. What is difference between start() and run() method of thread class?
* When program calls `start()` method a **new Thread** is created and code inside `run()` method is executed in new Thread while if you call `run()` method directly **no new Thread is created** and code inside `run()` will execute on current Thread.

* `start()` Can't be invoked more than one time otherwise throws `java.lang.IllegalStateException`  but `run()` can be invoked multiple times
```java
class MyThread extends Thread
{
    @Override
    public void run() {
        System.out.println("I am executed by " +currentThread().getName());
    }
}
 
public class ThreadExample
{
    public static void main(String[] args) {

        MyThread myThread = new MyThread();
 
        // Calling run() method directly 
        myThread.run();
 
        // Calling start() method. It creates a new thread which executes run() method
        myThread.start();
    }
}
```
Output
```
I am executed by main
I am executed by Thread-0
```
#### Q. What is Thread Group? Why it’s advised not to use it?
ThreadGroup creates a group of threads. It offers a convenient way to manage groups of threads as a unit. This is particularly valuable in situation in which you want to suspend and resume a number of related threads.

* The thread group form a tree in which every thread group except the initial thread group has a parent.
* A thread is allowed to access information about its own thread group but not to access information about its thread group’s parent thread group or any other thread group.
```java
// Java code illustrating Thread Group 
import java.lang.*; 
class NewThread extends Thread  
{ 
    NewThread(String threadname, ThreadGroup tgob) { 
        super(tgob, threadname); 
        start(); 
    } 
    public void run() { 
  
        for (int i = 0; i < 1000; i++) { 
            try { 
                Thread.sleep(10); 
            } 
            catch (InterruptedException ex) { 
                System.out.println("Exception encounterted"); 
            } 
        } 
    } 
}  
public class ThreadGroupExample  
{ 
    public static void main(String arg[]) { 
        // creating the thread group 
        ThreadGroup tg = new ThreadGroup("Parent Thread Group"); 
  
        NewThread t1 = new NewThread("One", tg); 
        System.out.println("Starting One"); 
        NewThread t2 = new NewThread("Two", tg); 
        System.out.println("Starting two"); 
  
        // checking the number of active thread 
        System.out.println("Number of active thread: "
                           + tg.activeCount()); 
    } 
} 
```
#### Q. How do you stop a thread in java?
A thread is automatically destroyed when the run() method has completed. But it might be required to kill/stop a thread before it has completed its life cycle. Modern ways to suspend/stop a thread are by using a boolean flag and `Thread.interrupt()` method.
```java
class MyThread extends Thread
{
    //Initially setting the flag as true
    private volatile boolean flag = true;
     
    //This method will set flag as false
    public void stopRunning() {
        flag = false;
    }
     
    @Override
    public void run() {
         
        //This will make thread continue to run until flag becomes false
        while (flag) {
            System.out.println("I am running....");
        }
        System.out.println("Stopped Running....");
    }
}
 
public class MainClass 
{   
    public static void main(String[] args) {

        MyThread thread = new MyThread();
        thread.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 
        //call stopRunning() method whenever you want to stop a thread
        thread.stopRunning();
    }   
}
```
Output 
```
I am running….
I am running….
I am running….
I am running….
I am running….
I am running….
I am running….
I am running….
Stopped Running….
```
#### Q. Can we call run() method of a Thread class?
No, you can not directly call run method to start a thread. You need to call start method to create a new thread.
If you call run method directly, it won’t create a new thread and it will be in same stack as main.
```java
class CustomThread extends Thread {
 
 public void run() {
  for (int i = 0; i < 5; i++) {
    try {
        Thread.sleep(300);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
     System.out.println("Thread is running :"+i);
  }
 }
}
 
public class StartThreadAgainMain {
 
 public static void main(String[] args) {
   CustomThread ct1 = new CustomThread();
   CustomThread ct2 = new CustomThread();
   ct1.run();
   ct2.run();
 }
}
```
Output
```
Thread is running :0
Thread is running :1
Thread is running :2
Thread is running :3
Thread is running :4
Thread is running :0
Thread is running :1
Thread is running :2
Thread is running :3
Thread is running :4
```
#### Q. What is difference between Yield and Sleep method in Java?
**1. Currently executing thread state**: sleep()  method causes the currently executing thread to sleep for the number of milliseconds specified in the argument. yield() method temporarily pauses the currently executing thread to give a chance to the remaining waiting threads of the same priority to execute.
If there is no waiting thread or all the waiting threads of low priority then the current thread will continue its execution.

**2. Interrupted Exception**: Sleep method throws the Interrupted exception if another thread interrupts the sleeping thread.  yield method does not throw Interrupted Exception.

**3. Give up monitors**:  Thread.sleep() method does not cause cause currently executing thread to give up any monitors while yield() method give up the monitors.

#### Q. What is ThreadLocal?
The Java ThreadLocal class enables you to create variables that can only be read and written by the same thread. Thus, even if two threads are executing the same code, and the code has a reference to the same ThreadLocal variable, the two threads cannot see each other's ThreadLocal variables. Thus, the Java ThreadLocal class provides a simple way to make code thread safe that would not otherwise be so.

**Creating a ThreadLocal**   
```java
private ThreadLocal threadLocal = new ThreadLocal();
```
**Set ThreadLocal Value**
```java
threadLocal.set("A thread local value");
```
**Get ThreadLocal Value**
```java
String threadLocalValue = (String) threadLocal.get();
```
**Remove ThreadLocal Value**
```java
threadLocal.remove();
```
Example
```java
// Java code illustrating get() and set() method 
public class ThreadLocalExample { 
  
    public static void main(String[] args) { 
  
        ThreadLocal<Number> tlObj = new ThreadLocal<Number>(); 
  
        // setting the value 
        tlObj.set(100);  
        System.out.println("value = " + tlObj.get()); 
    } 
} 
```
#### Q. What is Java Thread Dump, How can we get Java Thread dump of a Program?
#### Q. What will happen if we don’t override Thread class run() method?
#### Q. What is differentiate between the Thread class and Runnable interface for creating a Thread?
#### Q. What does join() method?
#### Q. Can we make the user thread as daemon thread if the thread is started?
#### Q. What is race-condition?
#### Q. What is the difference between ScheduledExecutorService and ExecutorService interface?
#### Q. What is Lock interface in Java Concurrency API? What are it’s benefits over synchronization?
#### Q. What are Concurrent Collection Classes?
#### Q. What is the difference between the Runnable and Callable interfaces?
#### Q. What is the Thread’s interrupt flag? How can you set and check it? How does it relate to the InterruptedException?
#### Q. What is Java Memory Model (JMM)? Describe its purpose and basic ideas.
#### Q. Describe the conditions of livelock, and starvation.
#### Q. How ReadWritelock can help in reducing contention among multiple threads?
#### Q. What is the Difference between ReentrantLock and Synchronized?
#### Q. What is SynchronousQueue in Java?
#### Q. Why ConcurrentHashMap is faster than Hashtable in Java?
#### Q. How do you share data between two threads in Java?
#### Q. Describe the purpose and use-cases of the fork/join framework
#### Q. What is Phaser in Java concurrency?
#### Q. What is Exchanger in Java concurrency?
#### Q. What is Semaphore in Java concurrency?
#### Q. What is lock striping in concurrent programming?
#### Q. What is blocking method in Java?
#### Q. What is Callable and Future in Java concurrency?
#### Q. What is atomic variable in Java?
#### Q. What is Busy Spinning? Why will you use Busy Spinning as wait strategy?
#### Q. What is Executors Framework?
#### Q. What is FutureTask class?
#### Q. What are the available implementations of ExecutorService in the standard library?
#### Q. What are the main components of concurrency API?
#### Q. What is difference between CyclicBarrier and CountDownLatch in Java?
#### Q. Can we make array volatile in Java?
#### Q. What are practical uses of volatile modifier?
#### Q. What kind of thread is the Garbage collector thread?
#### Q. How can we pause the execution of a Thread for specific time?
#### Q. What is difference between Executor.submit() and Executer.execute() method?