package oopsconcepts;

import java.lang.reflect.Constructor;

public class ReflectionExample {

	private String name;
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		try {
			Constructor<ReflectionExample> constructor = ReflectionExample.class.getDeclaredConstructor();
			ReflectionExample r = constructor.newInstance();
			r.setName("Hello World!");
			System.out.println(r.name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
