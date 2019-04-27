package basics;

public class JVMDemo02 {

	public static void main(String[] args) {
		// String class is loaded by bootstrap loader and
		// bootstrap loader is not Java Object, hence null
		System.out.println(String.class.getClassLoader());
		
		// JVMDemo class is loaded by Application loader
		System.out.println(JVMDemo02.class.getClassLoader());
	}
}
