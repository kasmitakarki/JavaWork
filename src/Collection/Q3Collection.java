//Write a Java program to reverse elements in an array list

package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Q3Collection {
public static void main(String[] args) {
		
	ArrayList<Integer> list= new ArrayList();
	
	list.addAll(Arrays.asList(10,15,5,3,20));
	
	Collections.reverse(list);
	
	System.out.println(list);

	}
}


