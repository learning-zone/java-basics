package basics;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class JVMDemo01 {

	public static void main(String[] args) {
		Employee s1 = new Employee();
		
		// Getting hold of class object created by JVM
		Class c1 = s1.getClass();
		System.out.println("Class Name: "+c1.getName());
		
		// getting all methods in array
		Method m[] = c1.getDeclaredMethods();
		for (Method method : m)
			System.out.println("Method Name: "+method.getName());
		
		// getting all fields in array
		Field f[] = c1.getDeclaredFields();
		for(Field field: f)
			System.out.println("Field Name: "+field.getName());
	}
}

// A Sample class whose information is fetched above using its Class Object.
class Employee{
	private String name;
	private int emp_id;
	public String getName()  {  return name;   } 
    public void setName(String name) { this.name = name; } 
    public int getEmp_id()  { return emp_id;  } 
    public void setEmp_id(int emp_id) { 
        this.emp_id = emp_id; 
    } 
}

















