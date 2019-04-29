package basics;

public class EnumDemo01 {

	enum Color {
		RED, GREEN, BLUE;
	}
	public static void main(String[] args) {
		Color c1 = Color.RED;
		System.out.println("Enum value: "+c1);
	}
}
