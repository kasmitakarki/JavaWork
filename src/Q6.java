import java.util.Scanner;

class Console {
	public static String readLine() {
		Scanner sc= new Scanner(System.in);
		return sc.nextLine();
	}
	
	public static void writeLine(String message) {
		System.out.println(message);
	}
}

public class Q6 {
public static void main(String[] args) {
	
	
	Console.writeLine("Enter pound value here: ");
	double p= Double.parseDouble(Console.readLine());
	
	double k= p*  0.45359237;
	System.out.println(p +"pound is "+ k+ "kg.");
	
	
}



}




