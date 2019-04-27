package input.output;

public class CommandLineArguments {

	public static void main(String[] args) {
		if(args.length > 0){
			System.out.println("The Command line arguments are: ");
			for(String val: args) {
				System.out.println(val);
			}
		} else {
			System.out.println("No command line arguments found !");
		}
	}
}
