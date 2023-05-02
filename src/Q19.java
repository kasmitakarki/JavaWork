/* Write a Program to accept three sides of a triangle
 *  and display which kind of triangle is formed.*/

import java.util.Scanner;
public class Q19 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	Console.writeLine("Enter frist side here: ");
	int a= Integer.parseInt(Console.readLine());
	
	Console.writeLine("Enter second side here: ");
	int b= Integer.parseInt(Console.readLine());
	
	Console.writeLine("Enter second side here: ");
	int c= Integer.parseInt(Console.readLine());
	
	if(a==b && b==c) {
		System.out.println("Its equilateral triangle.");
	}else if (a==b || b==c||c==a) {
		System.out.println("It's isosceles triangle. ");
	}else {
		System.out.println("It's scalene triangle.");
	}
	
}
}
