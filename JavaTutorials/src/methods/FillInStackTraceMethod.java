package methods;

public class FillInStackTraceMethod {

	public static void main(String[] args) throws Throwable {
		FillInStackTraceMethod obj = new FillInStackTraceMethod();
		try {
			obj.showResult();
		} catch (Exception e) {
			System.out.println("Exception: "+e);
			e.printStackTrace();
			
		}

	}
	
	public void showResult() throws Throwable {
		
	}

}
