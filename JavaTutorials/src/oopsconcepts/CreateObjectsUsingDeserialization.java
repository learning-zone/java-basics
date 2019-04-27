package oopsconcepts;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CreateObjectsUsingDeserialization implements Serializable {
	
	private String name;
	CreateObjectsUsingDeserialization(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		
		try (
				FileOutputStream fos = new FileOutputStream("file.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				) {
			CreateObjectsUsingDeserialization d = new CreateObjectsUsingDeserialization("Hello World!");
			oos.writeObject(d);
		} catch ( Exception e) {
			e.printStackTrace();
		}

	}

}
