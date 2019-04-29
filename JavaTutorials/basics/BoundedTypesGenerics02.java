package basics;

interface SampleInterface {
	public void displayClass();
}
class BoundTest<T extends SampleClass & SampleInterface> {
	private T objRef;
	public BoundTest(T obj) {
		this.objRef = obj;
	}
	
	public void doRunTest(){
		this.objRef.displayClass();
	}
}


class SampleClass implements SampleInterface {
	public void displayClass() {
		System.out.println("Inside supper Class A");
	}
}
class BoundedTypesGenerics02 {

	public static void main(String a[]) {
		BoundTest<SampleClass> b = new BoundTest<>(new SampleClass());
		b.doRunTest();
	}
}
