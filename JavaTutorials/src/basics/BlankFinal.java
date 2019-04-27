package basics;

public class BlankFinal {

	final public int i;
	
	BlankFinal(int val) {
		this.i = val;
	}
	
	BlankFinal(){
		this(10);
	}
	
	public static void main(String[] args) {
		BlankFinal obj1 = new BlankFinal();
		System.out.println(obj1.i);
		
		BlankFinal obj2 = new BlankFinal(20);
		System.out.println(obj2.i);
	}
}
