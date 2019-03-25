package misc;
import java.util.ArrayList;
import java.util.List;

public class ConvertArrayListToStringArray {
	public static void main(String args[]) {
		List<String> list = new ArrayList<String>();
		
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");
		
		String[] stringArrayObject = new String[list.size()];
		list.toArray(stringArrayObject);
		
		for(String str: stringArrayObject) {
			System.out.print(str + ", ");
		}
	}
}
