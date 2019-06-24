package strings;

public class StringBufferMethods {

	public static void main(String[] args) {
		
	  StringBuffer str = new StringBuffer("Hello");

	  int len = str.length();
	  System.out.println("Length of String Hello: " + len);
	  
	  int cap = str.capacity();
	  System.out.println("Capacity of String Hello: " + cap);
	  
	  str.append(" World");
	  System.out.println("Appended String: " + str);
	  
	  str.insert(5, " for");
	  System.out.println("After Insert String: " + str);
	  
	  str.insert(0, 5);
	  System.out.println("After inserting 5 at first position: "+str);
	  
	  str.insert(3, true);
	  System.out.println("After inseting true at 3rd position: "+ str);
	  
	  char arr[] = {'p', 'r', 'a', 'd', 'e', 'e', 'p'};
	  
	  // insert character array at offset 9
	  str.insert(0, arr);
	  System.out.println(str);
	  
	  str.reverse();
	  System.out.println("Reverse String: " + str);
	  
	  str.delete(0, 5);
	  System.out.println("After Delete: " + str);
	  
	  str.deleteCharAt(7);
	  System.out.println("After delete: " + str);
	  
	  str.replace(5,  8, "Happy");
	  System.out.println("After Replace: "+str);
	  
	}

}
