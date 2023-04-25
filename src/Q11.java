/* WWrite a program to swap two numbers
a) using temp variable
b) without temp variable
 */

public class Q11 {
	public static void main(String[] args) {
		
		//with temporary variable
		int a=10;
		int b=20;
		
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		//without temporary variable
		int x=100;
		int y=10;
		
		x=x+y; //x=110
		y=x-y; //y=100
		x=x-y; //x=10
	}
}
