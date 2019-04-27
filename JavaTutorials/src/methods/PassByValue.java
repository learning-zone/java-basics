package methods;

class Test {
	int x;
	Test(int i) { x = i; }
	Test() { x = 0; }
}
public class PassByValue {
	

	public static void main(String[] args) {
		Test t = new Test(10);
		
		change(t);
		System.out.println("New Value :" + t.x);
	}
	
	public static void change(Test t) {
		t.x = 10;
	}
}
