/*24.	Write a program to print the factorial number of given numbers. */


public class Q24 {
public static void main(String[] args) {
	Console.writeLine("Enter integer here: ");
	int num= Integer.parseInt(Console.readLine());
	
	int factorial=1;
	
	for(int i=1;i<=num; i++) {
		factorial= factorial*i;
	}
	
	System.out.println(factorial);
	
}
}
