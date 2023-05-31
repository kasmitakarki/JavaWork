/*
 7. Write a Java program to convert a linked list to an array list.

 */


package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Q7Collection {
	public static void main(String[] args) {
		LinkedList list= new LinkedList(Arrays.asList(25,3,4,7,1));
		
		ArrayList list2= new ArrayList(list);
		
		System.out.println(list);
		
	}

}
