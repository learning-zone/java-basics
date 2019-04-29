package inheritance;

class Parent01 {
	int value = 10;
	Parent01() {
		System.out.println("Parent Constructor");
	}
}

class Child01 extends Parent01 {
	int value = 20;
	Child01() {
		System.out.println("Child Constructor");
	}
}

public class ParentChildHavingSameDataMember {

	public static void main(String[] args) {
		Child01 obj = new Child01();
		System.out.println("Reference of Child type: " +obj.value);
		
		Parent01 par = obj;
		System.out.println("Reference of Parent Type: "+par.value);
	}
}
