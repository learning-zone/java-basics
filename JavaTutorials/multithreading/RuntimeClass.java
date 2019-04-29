package multithreading;

public class RuntimeClass {

	public static void main(String[] args) {
		Runtime run = Runtime.getRuntime();
		System.out.println("Current free Memory: " + run.freeMemory());
		System.out.println("Total Memory in bytes: " + run.totalMemory());
		System.out.println("Number of processors available: " + run.availableProcessors());
		
		
		
		try {
			// Process process = Runtime.getRuntime().exec("C:/Program Files (x86)/Google/Chrome/Application/chrome.exe");
			System.out.println("Google Chrome successfully started ");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
