/*
 5. Write a Java program to iterate a linked list in reverse order. 

 */


package Collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;



public class Q5Collection {

	public static void main(String[] args) {
		LinkedList list= new LinkedList(Arrays.asList(25,3,4,7,1));
		System.out.println(list);
		
		Iterator revIt= (Iterator) list.descendingIterator();
		
		while(revIt.hasNext()) {
			System.out.println(revIt.next());
		}
		
		

	}
	
}
