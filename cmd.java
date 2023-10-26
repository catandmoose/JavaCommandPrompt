import java.io.IOException;
import java.util.*;

class cmd {
	public static void main(String[] args) throws IOException {
		execCommand();
	}
	static void execCommand() throws IOException {
		Scanner s = new Scanner(System.in);
		System.out.print("/");
		String command = s.nextLine();
		//System.out.println(command);
		if (command == "exit") {
			System.out.println("Exiting...");
		} else {
			Process process = Runtime.getRuntime().exec(command);
			execCommand();
		}
	}
}