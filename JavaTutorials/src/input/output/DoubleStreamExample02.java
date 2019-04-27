package input.output;

import java.math.BigDecimal;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class DoubleStreamExample02 {

	public static void main(String[] args) {
		DoubleStream stream = DoubleStream.of(2, 3, 4, 5);
		
		Stream<BigDecimal> obj = stream.mapToObj(BigDecimal::valueOf);
		
		obj.forEach(num -> System.out.println(num.add(BigDecimal.TEN)));
	}
}
