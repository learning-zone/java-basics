package inheritance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Java Program to demonstrate that if supper class is 
 * serializable then subclass is automatically
 * serializable
 *
 */

class A implements Serializable {
	int i;
	public A(int i) {
		this.i = i;
	}
}
class B extends A {
	int j;
	public B(int i, int j) {
		super(i);
		this.j = j;
	}
}
public class ObjectSerializationInInheritance {

	public static void main(String[] args) throws Exception {
		B b1 = new B(10, 20);
		
		System.out.println("i = " + b1.i);
		System.out.println("j = " + b1.j);
		
		
		//Saving of object in a file
		FileOutputStream fos = new FileOutputStream("file.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		// Method for serialization of B's class object
		oos.writeObject(b1);
		oos.close();
		fos.close();
		
		System.out.println("Object has been serialized");
		
		//Reading the object from a file
		FileInputStream fis = new FileInputStream("file.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		// Method for de-serialization of B's class object
		B b2 = (B)ois.readObject();
		ois.close();
		fis.close();
		System.out.println("Object has been deserialized");
		
		System.out.println("i = " + b2.i);
		System.out.println("J = "+b2.j);

	}
}
