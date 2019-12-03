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

#### Q. What are the different ways of implementing thread? Which one is more advantageous?
#### Q. What is the difference between Process and Thread?
#### Q. What are the benefits of multi-threaded programming?
#### Q. What is difference between user Thread and daemon Thread?
#### Q. How does thread communicate with each other?
#### Q. What do you understand about Thread Priority?
#### Q. What is Thread Scheduler and Time Slicing?
#### Q. What is context-switching in multi-threading?
#### Q. Which is more preferred – Synchronized method or Synchronized block?
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