package basics;
import java.util.ArrayList;

public class OutOfMemoryException {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i = 0; i < Integer.MAX_VALUE; i++){
			arr.add(i);
			
			if(i >= 10){
				break;
			}
		}
		System.out.println("Value: "+ arr);
	}
}
