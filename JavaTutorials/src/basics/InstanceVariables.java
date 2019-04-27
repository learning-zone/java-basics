package basics;
class Marks {
	int mathMarks;
}
public class InstanceVariables {

	public static void main(String[] args) {
		//First Object
		Marks obj1 = new Marks();
	    obj1.mathMarks = 99;
	    
	    //Second Object
	    Marks obj2 = new Marks();
	    obj2.mathMarks = 90;
	    
	    System.out.println("Marks for first Object:" +obj1.mathMarks);
	    System.out.println("Marks for second Object:" +obj2.mathMarks);
	}
}
