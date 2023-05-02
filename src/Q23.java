/* 23.	Write a Program to sum 1 to nth natural numbers.*/


public class Q23 {
	public static void main(String[] args) {
		Console.writeLine("Enter n number here: ");
		int num= Integer.parseInt(Console.readLine());
		
		int sum=0;
	for(int i=0; i<=num; i++) {
		System.out.println();
		sum=i+sum;
	}
	System.out.println(sum);
	}
}
