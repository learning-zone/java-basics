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
#### Q. What is Java Timer Class? How to schedule a task to run after specific interval?
#### Q. What is Thread Pool? How can we create Thread Pool in Java?
#### Q. Why must wait() method be called from the synchronized block?
#### Q. What is the difference between wait() and sleep() method?
#### Q. What is shutdown hook?
#### Q. Can Java object be locked down for exclusive use by a given thread?
#### Q. What is static synchronization?
#### Q. How is the safety of a thread achieved?
#### Q. What is difference between start() and run() method of thread class.
#### Q. What is false sharing in the context of multi-threading?
#### Q. What is Thread Group? Why it’s advised not to use it?
#### Q. How do you stop a thread in java?
#### Q. Can we call run() method of a Thread class?
#### Q. How can we make sure main() is the last thread to finish in Java Program?
#### Q. Why Thread sleep() and yield() methods are static?
#### Q. What is ThreadLocal?
#### Q. What is Java Thread Dump, How can we get Java Thread dump of a Program?
#### Q. What will happen if we don’t override Thread class run() method?
#### Q. What is differentiate between the Thread class and Runnable interface for creating a Thread?
#### Q. What does join() method?
#### Q. Can we make the user thread as daemon thread if the thread is started?
#### Q. What is race-condition?
#### Q. What is the difference between ScheduledExecutorService and ExecutorService interface?
#### Q. What does yield() method of the Thread class do?
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