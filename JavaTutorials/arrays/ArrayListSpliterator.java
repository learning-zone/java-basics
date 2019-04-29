package arrays;

import java.util.*;
import java.util.ArrayList;
import java.lang.String;

public class ArrayListSpliterator {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("abc@gmail.com");
		list.add("xyz@gmail.com");
		list.add("user@gmail.com");
		list.add("mno@gmail.com");
		list.add("random@gmail.com");
		
		Spliterator<String> emails = list.spliterator();
		
		System.out.println("List of Emails: ");
		emails.forEachRemaining((n) -> System.out.println(n));
	}
}
