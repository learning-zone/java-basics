package keywords;

public class StrictfpKeyword {
	
	public  double calculate() {
		double num1 = 10e+102;
		double num2 = 6e+08;
		
		return (num1 * num2);
	}

	public static  void main(String[] args) {
		StrictfpKeyword obj = new StrictfpKeyword();
		System.out.println(obj.calculate());
	}
}
