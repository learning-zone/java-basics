package basics;

class Bound<T extends A> {
	private T objRef;
	
	public Bound(T obj){
		this.objRef = obj;
	}
	
	public void doRunTest(){
		this.objRef.displayClass();
	}
}

class A {
	public void displayClass() {
		System.out.println("Inside super class A");
	}
}

class B extends A {
	public void displayClass() {
		System.out.println("Inside sub class B");
	}
}

class C extends A {
	public void displayClass() {
		System.out.println("Inside sub class C");
	}
}

public class BoundedTypesGenerics {

	public static void main(String[] args) {
		
		Bound<C> objc = new Bound<C>(new C());
		objc.doRunTest();
		
		Bound<B> objb = new Bound<B>(new B());
		objb.doRunTest();
		
		Bound<A> obja = new Bound<A>(new A());
		obja.doRunTest();

	}
}
