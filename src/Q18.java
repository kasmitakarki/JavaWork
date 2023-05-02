/*Write a program to display the largest number 
 * from given three values */


public class Q18 {
	public static void main(String[] args) {
		int a=8;
		int b=9;
		int c=18;

		if(a>b &&a>c) {
			System.out.println(a +"is greater than "+b+" & "+c);
		}else if (b>a &&b>c) {
			System.out.println(b +"is greater than "+a+" & "+c);
		} else  {
			System.out.println(c +"is greater than "+a+" & "+b);
		}
	}

}
