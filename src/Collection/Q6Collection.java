/*
 6. Write a Java program that swaps two elements in a linked list.

 */


package Collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Q6Collection {
	public static void main(String[] args) {
		LinkedList list= new LinkedList(Arrays.asList(25,3,4,7,1));
		System.out.println(list);
		
		//swapping 0 index to 1st
		swap(list, 0,1);
		
		System.out.println(list);
	
}
	
	
	public static void swap(LinkedList list,int index1, int index2 ) {
		int element1=(int) list.get(index1);
		
		int element2=(int) list.get(index2);
		
		list.set(index1, element2);
		list.set(index2, element1);
		
	}
}
