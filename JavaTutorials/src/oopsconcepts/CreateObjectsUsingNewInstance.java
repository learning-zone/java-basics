package oopsconcepts;

public class CreateObjectsUsingNewInstance {

	String name = "Hello World!";
	public static void main(String[] args) {
		try {
			Class cls = Class.forName("oopsconcepts.CreateObjectsUsingNewInstance");
			CreateObjectsUsingNewInstance obj = (CreateObjectsUsingNewInstance) cls.newInstance();
			System.out.println(obj.name);
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); 
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
