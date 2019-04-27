package oopsconcepts;

class Comp {
	private double re, im;
	
	public Comp(double re, double im) {
		this.re = re;
		this.im = im;
	}
	
	/**
	 * Returns the String representation of this Complex number
	 * The format of String is "Re + iIm" where Re is real part
	 * and iIm is imaginary part.
	 */
	
	@Override
	public String toString() {
		return String.format(re + " + i" +im);
	}
}

public class OverridingToString {

	public static void main(String[] args) {
		Comp c1 = new Comp(10, 15);
		System.out.println(c1);
	}
}
