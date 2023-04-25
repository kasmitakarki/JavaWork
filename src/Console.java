import java.util.Scanner;


public class Console {
	public static String readLine() {
		Scanner sc= new Scanner(System.in);
		return sc.nextLine();
	}
	
	public static void writeLine(String message) {
		System.out.println(message);
	}
}