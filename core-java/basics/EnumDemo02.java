package basics;

enum Day {
	SUNDAY, MONDAY, TUESDAY, THURSDAY, FRIDAY, SATURDAY;
}
public class EnumDemo02 {

	Day day;
	
	public EnumDemo02(Day day) {
		this.day = day;
	}
	
	public void dayIsLike() {
		switch(day){
		
		case MONDAY: System.out.println("Today is Monday"); break;
		
		case FRIDAY: System.out.println("Friday is better"); break;
		
		default: System.out.println("Weekends are best"); break;
		
		}
	}
	public static void main(String[] args) {
		
		String str = "FRIDAY";
		EnumDemo02 t = new EnumDemo02(Day.valueOf(str));
		t.dayIsLike();
	}
}
