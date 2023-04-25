/*Write a program to convert Fahrenheit to Celsius 
 and Celsius to Fahrenheit.*/

import java.util.Scanner;
public class Q9 {
 public static void main(String [] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Fahrenheit here: ");
	double F= sc.nextDouble();
	
	double cel= (F-32)*5/9;
	System.out.println(F+ "Fahrenheit in celsius is"+ cel);
	
	System.out.println("Enter celsius here: ");
	double C= sc.nextDouble();
	double F2= C*9/5+32;
	
	System.out.println(C+"celsius in fahrenheit is"+F2);
	
	
	
 }
}
