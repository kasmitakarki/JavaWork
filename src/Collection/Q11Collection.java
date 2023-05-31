/*
11. Given an integer x, return true if x is a
palindrome
, and false otherwise.

Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

 */


package Collection;

import java.util.Scanner;

public class Q11Collection {
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);

		System.out.println("Enter integer here : ");
		Integer x=sc.nextInt();
		if(x<0) {
			System.out.println("false");
		}else {
		
		String sx= String.valueOf(x);
		
		String rx="";
		for(int i=0;i<sx.length();i++) {
			rx= sx.charAt(i)+rx;
		}
		
		
		
		Integer revx= Integer.parseInt(rx);
		
		
		System.out.println((x==revx));
		}
		
	





	}

}
