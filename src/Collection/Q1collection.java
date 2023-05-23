//1. Write a Java program to remove the third element
//from an array list



package Collection;

import java.util.*;

public class Q1collection {
	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,4,2));
		
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
	}
}
