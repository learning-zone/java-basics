package basics;

public class StrictMathLog {

	public static void main(String[] args) {
		double num = 10;

		// It returns natural logarithm(base e)
		double log_value = StrictMath.log(num);
		System.out.print("Log value of: " + num + " = " + log_value);
	}
}
