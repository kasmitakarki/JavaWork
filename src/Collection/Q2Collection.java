//2. Write a Java program to sort a given array list. 


package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q2Collection {
	public static void main(String[] args) {
		
		ArrayList list= new ArrayList(Arrays.asList(10,5, 13, 22, 54, 2));
		
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
	}
}
