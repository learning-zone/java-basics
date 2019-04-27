package oopsconcepts;

class Complex {
	private double re, im;
	public Complex(double re, double im) {
		this.re = re;
		this.im = im;
	}
	@Override
	public boolean equals(Object o) {
		if(o == this) {
			return true;
		}
		
		if(!(o instanceof Complex)) {
			return false;
		}
		
		Complex c = (Complex) o;
		return Double.compare(re,  c.re) == 0 && Double.compare(im, c.im) == 0;
	}
}

public class OverridingEquals {

	public static void main(String[] args) {
		Complex c1 = new Complex(10, 15);
		Complex c2 = new Complex(10, 15);
		if(c1.equals(c2)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
	}
}
