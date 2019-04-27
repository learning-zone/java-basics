package oopsconcepts;

//Java program to demonstrate that we can have 
//different return types if return type in 
//overridden method is sub-type 

class X {}
class Y extends X {}

class BaseX {
	X fun() {
		System.out.println("Base fun()");
		return new X();
	}
}
class DerivedY extends BaseX {
	Y fun() {
		System.out.println("Derived fun()");
		return new Y();
	}
}

public class CovariantReturnTypes {

	public static void main(String[] args) {
		BaseX base = new BaseX();
		base.fun();
		
		DerivedY derived = new DerivedY();
		derived.fun();
	}
}
