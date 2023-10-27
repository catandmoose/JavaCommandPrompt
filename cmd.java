import java.io.IOException;
import java.io.BufferedReader;
import java.util.*;
import java.io.InputStreamReader;

class cmd {
	public static void main(String[] args) throws IOException {
		execCommand();
	}
	static void execCommand() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("/");
		String commands = sc.nextLine();
		Runtime rt = Runtime.getRuntime();
		
		Process proc = rt.exec(commands);

		BufferedReader stdInput = new BufferedReader(new 
		     InputStreamReader(proc.getInputStream()));

		BufferedReader stdError = new BufferedReader(new 
		     InputStreamReader(proc.getErrorStream()));

		// Read the output from the command
		System.out.println("Standard output of the command:\n");
		String s = null;
		while ((s = stdInput.readLine()) != null) {
		    System.out.println(s);
		}

		// Read any errors from the attempted command
		System.out.println("Standard error of the command (if there are any):\n");
		while ((s = stdError.readLine()) != null) {
		    System.out.println(s);
		}

	}
}