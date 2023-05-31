/*
 *8. Write a Java program to test if a hash set is empty or not. 

 */

package Collection;

import java.util.HashSet;

public class Q8Collection {
	public static void main(String[] args) {
		HashSet set= new HashSet();
		
		set.add(33);
		set.add(3);
		set.add(333);
		set.add(3);
		
		System.out.println(set);
		System.out.println(set.isEmpty());
		
	}

}
