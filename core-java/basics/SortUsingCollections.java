package basics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortUsingCollections {

	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		
		al.add("Red");
		al.add("Green");
		al.add("Yellow");
		
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("Sorted List Array: " + al );
	}
}
