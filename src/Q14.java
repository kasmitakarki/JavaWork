/* Write a program to relate two integers entered
  by the user using = =or > or < sign.*/
import java.util.Scanner;

public class Q14 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter first number here: ");
		int num1= sc.nextInt();
		
		System.out.println("Enter second number here: ");
		int num2= sc.nextInt();
		
		if(num1==num2) {
			System.out.println("First number is equal to second number.");
		} else if(num1<num2) {
			System.out.println("First number is smaller then second number.");
		}else {
			System.out.println("Frist number is greater than second number.");
		}
		
		
	}
}
