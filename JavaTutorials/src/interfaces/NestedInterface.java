package interfaces;

class Test {
	interface nested {
		void show();
	}
}

class Testing implements Test.nested {
	public void show() {
		System.out.println("Show method of interface");
	}
}

public class NestedInterface {

	public static void main(String[] args) {
		Test.nested obj;
		Testing t = new Testing();
		obj = t;
		obj.show();

	}

}
