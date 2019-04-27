package constructors;

class Complex {
	private double  re, im;
	
	public Complex(double re, double im) {
		this.re = re;
		this.im = im;
	}
	
	//copy constructor
	Complex(Complex c) {
		System.out.println("Copy constructor called");
		re = c.re;
		im = c.im;
	}
	//Overrding the toString of Object class
	@Override
	public String toString() {
		return "(" + re + " + " + im + "i)";
	}
}

public class CopyConstructor {

	public static void main(String[] args) {
		Complex c1 = new Complex(10, 20);
		
		// Following involves a copy constructor call
		Complex c2 = new Complex(c1);
		
		Complex c3 = c2;
		System.out.println(c2);
	}
}
