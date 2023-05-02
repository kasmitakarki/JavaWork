/*Write a program to print the table of given numbers.*/
import java.util.Scanner;

public class Q22 {
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter number here: ");
	int a= sc.nextInt();
	
	for(int i=0;i<=10;i++) {
		System.out.println(a+"*"+i+"="+a*i);
	}
}
}
