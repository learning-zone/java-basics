## Java Design Pattern Questions and Answers



#### Q. Exaplain MVC, Front-Controller, DAO, DTO, Service-Locator, Prototype design patterns?
*TODO*

#### Q. What are the design patterns available in Java?
Java Design Patterns are divided into three categories – creational, structural, and behavioral design patterns.

**1. Creational Design Patterns**
* Singleton Pattern
* Factory Pattern
* Abstract Factory Pattern
* Builder Pattern
* Prototype Pattern

**2. Structural Design Patterns**
* Adapter Pattern
* Composite Pattern
* Proxy Pattern
* Flyweight Pattern
* Facade Pattern
* Bridge Pattern
* Decorator Pattern

**3. Behavioral Design Patterns**
* Template Method Pattern
* Mediator Pattern
* Chain of Responsibility Pattern
* Observer Pattern
* Strategy Pattern
* Command Pattern
* State Pattern
* Visitor Pattern
* Interpreter Pattern
* Iterator Pattern
* Memento Pattern

**4. Miscellaneous Design Patterns**
* DAO Design Pattern
* Dependency Injection Pattern
* MVC Pattern

#### Q. Explain Singleton Design Pattern in Java? 
**1. Eager initialization:**  
In eager initialization, the instance of Singleton Class is created at the time of class loading.

Example:
```java
public class EagerInitializedSingleton {
    
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
    
    // private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton(){}

    public static EagerInitializedSingleton getInstance(){
        return instance;
    }
}
```

**2. Static block initialization**  
Static block initialization implementation is similar to eager initialization, except that instance of class is created in the static block that provides option for exception handling.

Example:
```java
public class StaticBlockSingleton  {

    private static StaticBlockSingleton  instance;
    
    private StaticBlockSingleton (){}
    
    // static block initialization for exception handling
    static{
        try{
            instance = new StaticBlockSingleton ();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating Singleton instance");
        }
    }
    
    public static StaticBlockSingleton getInstance(){
        return instance;
    }
}
```

**3. Lazy Initialization**  
Lazy initialization method to implement Singleton pattern creates the instance in the global access method.

Example:
```java
public class LazyInitializedSingleton  {

    private static LazyInitializedSingleton  instance;
    
    private LazyInitializedSingleton(){}
    
    public static LazyInitializedSingleton  getInstance(){
        if(instance == null){
            instance = new LazyInitializedSingleton ();
        }
        return instance;
    }
}
```

**4. Thread Safe Singleton**  
The easier way to create a thread-safe singleton class is to make the global access method synchronized, so that only one thread can execute this method at a time.

Example:
```java
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;
    
    private ThreadSafeSingleton(){}
    
    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}
```

**5. Bill Pugh Singleton Implementation**  
Prior to Java5, memory model had a lot of issues and above methods caused failure in certain scenarios in multithreaded environment. So, Bill Pugh suggested a concept of inner static classes to use for singleton.

Example:
```java
public class BillPughSingleton {

    private BillPughSingleton(){}
    
    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
    
    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
```
<div align="right">
    <b><a href="#">↥ back to top</a></b>
</div>

#### Q. Explain Adapter Design Pattern in Java?
Adapter design pattern is one of the structural design pattern and its used so that two unrelated interfaces can work together. The object that joins these unrelated interface is called an Adapter.

Example:

we have two incompatible interfaces: **MediaPlayer** and **MediaPackage**. MP3 class is an implementation of the MediaPlayer interface and we have VLC and MP4 as implementations of the MediaPackage interface. We want to use MediaPackage implementations as MediaPlayer instances. So, we need to create an adapter to help to work with two incompatible classes.

MediaPlayer.java
```java
public interface MediaPlayer {
    void play(String filename);
}
```

MediaPackage.java
```java
public interface MediaPackage {
    void playFile(String filename);
}
```

MP3.java
```java
public class MP3 implements MediaPlayer {
 @Override
 public void play(String filename) {
    System.out.println("Playing MP3 File " + filename);
 }
}
```

MP4.java
```java
public class MP4 implements MediaPackage {
    @Override
    public void playFile(String filename) {
        System.out.println("Playing MP4 File " + filename);
    }
}
```

VLC.java
```java
public class VLC implements MediaPackage {
    @Override
    public void playFile(String filename) {
        System.out.println("Playing VLC File " + filename);
    }
}
```

FormatAdapter.java
```java
public class FormatAdapter implements MediaPlayer {
    private MediaPackage media;
    public FormatAdapter(MediaPackage m) {
        media = m;
    }
    @Override
    public void play(String filename) {
        System.out.print("Using Adapter --> ");
        media.playFile(filename);
    }
}
```

Main.java
```java
public class Main {
    public static void main(String[] args) {
        MediaPlayer player = new MP3();
        player.play("file.mp3");
        player = new FormatAdapter(new MP4());
        player.play("file.mp4");
        player = new FormatAdapter(new VLC());
        player.play("file.avi");
    }
}
```
<div align="right">
    <b><a href="#">↥ back to top</a></b>
</div>

#### Q. Explain Factory Design Pattern in Java?
A Factory Pattern or Factory Method Pattern says that just define an interface or abstract class for creating an object but let the subclasses decide which class to instantiate. In other words, subclasses are responsible to create the instance of the class.

Example: Calculate Electricity Bill
Plan.java
```java
import java.io.*;      
abstract class Plan {  
    protected double rate;  
    abstract void getRate();  

    public void calculateBill(int units){  
        System.out.println(units*rate);  
    }  
}  
```

DomesticPlan.java
```java
class  DomesticPlan extends Plan{  
    @override  
    public void getRate(){  
        rate=3.50;              
    }  
}
```

CommercialPlan.java
```java
class  CommercialPlan extends Plan{  
    @override   
    public void getRate(){   
        rate=7.50;  
    }   
}  
```

InstitutionalPlan.java
```java
class  InstitutionalPlan extends Plan{  
    @override  
    public void getRate(){   
        rate=5.50;  
   }   
} 
```

GetPlanFactory.java
```java
class GetPlanFactory {  
      
    // use getPlan method to get object of type Plan   
    public Plan getPlan(String planType){  
        if(planType == null){  
            return null;  
        }  
        if(planType.equalsIgnoreCase("DOMESTICPLAN")) {  
                return new DomesticPlan();  
            }   
        else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){  
            return new CommercialPlan();  
        }   
        else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {  
            return new InstitutionalPlan();  
        }  
         return null;  
    }  
} 
```

GenerateBill.java
```java
import java.io.*;    
class GenerateBill {

    public static void main(String args[])throws IOException {  
      GetPlanFactory planFactory = new GetPlanFactory();  
        
      System.out.print("Enter the name of plan for which the bill will be generated: ");  
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
  
      String planName=br.readLine();  
      System.out.print("Enter the number of units for bill will be calculated: ");  
      int units=Integer.parseInt(br.readLine());  
  
      Plan p = planFactory.getPlan(planName);  
      // call getRate() method and calculateBill()method of DomesticPaln.  
  
       System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");  
           p.getRate();  
           p.calculateBill(units);  
    }  
} 
```
<div align="right">
    <b><a href="#">↥ back to top</a></b>
</div>

#### Q. Explain Strategy Design Pattern in Java?
Strategy design pattern is one of the behavioral design pattern. Strategy pattern is used when we have multiple algorithm for a specific task and client decides the actual implementation to be used at runtime.

Example: Simple Shopping Cart where we have two payment strategies – using Credit Card or using PayPal.

PaymentStrategy.java
```java
public interface PaymentStrategy {
	public void pay(int amount);
}
```

CreditCardStrategy.java
```java
public class CreditCardStrategy implements PaymentStrategy {

	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;
	
	public CreditCardStrategy(String nm, String ccNum, String cvv, String expiryDate){
		this.name=nm;
		this.cardNumber=ccNum;
		this.cvv=cvv;
		this.dateOfExpiry=expiryDate;
	}
	@Override
	public void pay(int amount) {
		System.out.println(amount +" paid with credit/debit card");
	}
}
```

PaypalStrategy.java
```java
public class PaypalStrategy implements PaymentStrategy {

	private String emailId;
	private String password;
	
	public PaypalStrategy(String email, String pwd){
		this.emailId=email;
		this.password=pwd;
	}
	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid using Paypal.");
	}
}
```

Item.java
```java
public class Item {

	private String upcCode;
	private int price;
	
	public Item(String upc, int cost){
		this.upcCode=upc;
		this.price=cost;
	}
	public String getUpcCode() {
		return upcCode;
	}
	public int getPrice() {
		return price;
	}
}
```

ShoppingCart.java
```java
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	List<Item> items;
	
	public ShoppingCart(){
		this.items=new ArrayList<Item>();
	}
	public void addItem(Item item){
		this.items.add(item);
	}
	public void removeItem(Item item){
		this.items.remove(item);
	}
	public int calculateTotal(){
		int sum = 0;
		for(Item item : items){
			sum += item.getPrice();
		}
		return sum;
	}
	public void pay(PaymentStrategy paymentMethod){
		int amount = calculateTotal();
		paymentMethod.pay(amount);
	}
}
```

ShoppingCartTest.java
```java
public class ShoppingCartTest {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		Item item1 = new Item("1234",10);
		Item item2 = new Item("5678",40);
		
		cart.addItem(item1);
		cart.addItem(item2);
		
		// pay by paypal
		cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));
		
		// pay by credit card
		cart.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"));
	}
}
```
Output 
```
500 paid using Paypal.
500 paid with credit/debit card
```
<div align="right">
    <b><a href="#">↥ back to top</a></b>
</div>