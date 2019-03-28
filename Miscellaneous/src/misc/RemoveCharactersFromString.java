package misc;

public class RemoveCharactersFromString {

	public static void main(String[] args) {
		String str = "(123)-456-78910";
		str = str.replaceAll("[^0-9]", "");
		System.out.println("Final String: "+ str);
	}
}
