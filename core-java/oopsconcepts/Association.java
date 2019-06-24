package oopsconcepts;

class Bank {
	private String name;
	Bank(String name) {
		this.name = name;
	}
	public String getBankName() {
		return this.name;
	}
}

class Employee {
	private String name;
	Employee(String name) {
		this.name = name;
	}
	public String getEmployee() {
		return this.name;
	}
}

public class Association {

	public static void main(String[] args) {
		Bank bank = new Bank("Axis Bank");
		Employee emp = new Employee("Neha");
		System.out.println(emp.getEmployee() + " is employee of " + bank.getBankName());
	}
}
