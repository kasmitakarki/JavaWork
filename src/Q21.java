/*Program to input the number of (1...7) and 
 * translate to its equivalent name of the day of the week. */
import java.util.Scanner;


public class Q21 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number from 1 to 7 here: ");
		int num= sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
		case 4:
			System.out.println("wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid entry.");
		}
	}
}
