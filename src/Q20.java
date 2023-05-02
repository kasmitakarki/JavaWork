/* Write a program to create the equivalent of a 
 * four-function calculator. The program to enter two 
 * integer’s numbers and an operator. It then carries 
 * out the specified arithmetic operator operation: 
 * addition, subtraction, multiplication or division of 
 * the two numbers. Finally, it displays the result.*/

import java.util.Scanner;

public class Q20 {
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter first number here: ");
	int num1=sc.nextInt();
	
	System.out.println("Enter second number here: ");
	int num2=sc.nextInt();
	
	System.out.println("Enter operator + or - or * or / here: ");
	Scanner sc1= new Scanner(System.in);
	String op = sc1.nextLine();
	
	if(op.equals("+")) {
		System.out.println(num1+num2);
	}else if (op.equals("-")) {
		System.out.println(num1-num2);
	}else if(op.equals("*")) {
		System.out.println(num1*num2);
	}else if(op.equals("/")) {
		System.out.println(num1/num2);
	}

	
	
	
	
	
}
}
