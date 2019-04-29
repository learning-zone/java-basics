package misc;
import java.util.ArrayList;
import java.util.Collections;

public class RandomNumberGenerator {

    public static void main(String  args[]) {
    	ArrayList numbers = new ArrayList();
    	for(int i = 1; i < 50; i++) {
    		numbers.add(i+1);
    	}
    	Collections.shuffle(numbers);
    	System.out.println("Random Number: "+numbers.get(0));	
    }       
}