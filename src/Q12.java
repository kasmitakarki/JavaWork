/* Write a program to print the number entered by the user 
 * only if the number entered is negative*/

import java.util.Scanner;

public class Q12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number here: ");
		double a= sc.nextDouble();
		
		if(a<0) {
			System.out.println(a);
		}else {
			System.out.println("invalid entry");
		}
	}
}
