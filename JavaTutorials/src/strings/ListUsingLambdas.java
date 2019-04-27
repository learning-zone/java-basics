package strings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListUsingLambdas {
	
	public static <T> List<T>
	removeElements(List<T> l, Predicate<T> p) {
		
		l = l.stream()
				.filter(p)
				.collect(Collectors.toList());
		
		return l;			
		
	}

	public static void main(String[] args) {
		List<String> l = new ArrayList<>(
				Arrays.asList("Geeks",
							null,
							"forGeeks",
							null,
							"A counputer portal"));
		
		System.out.println("List with null values: "+l);
		
		// Creating a Predicate condition checking for null
		Predicate<String> isNull = i -> (i == null);
		l = removeElements(l, isNull);
		
		System.out.println("List with null values removed: " + l);

	}

}
