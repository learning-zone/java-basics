package methods;

import java.util.Arrays;
import java.util.List;

public class ReturnListObjectClass {

	public static List<Object> getDetails() {
		String name = "Pradeep";
		int age = 22;
		char gender = 'M';
		
		return Arrays.asList(name, age, gender);
	}
	public static void main(String[] args) {
		List<Object> person = getDetails();
		System.out.println(person);
	}
}
