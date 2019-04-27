package input.output;

import java.util.*;
import java.util.stream.*;
import java.util.stream.DoubleStream;

/**
 * 
 * @author U6044324
 * Oct 31, 2018
 * 
 * Using DoubleStream mapToObj(DoubleFunction mapper)
 * and displaying an object-value stream consisting
 * of the results of applying the given function
 */
public class DoubleStreamExample01 {

	public static void main(String[] args) {
		// Create a DoubleStream
		DoubleStream stream = DoubleStream.of(2, 3, 4, 5);
		
		stream.mapToObj(num ->{return num * num * num;})
							.forEach(System.out::println);
	}
}
