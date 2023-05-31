/*
 9. Write a Java program to count the number of key-value (size) mappings in a map. 

 */

package Collection;

import java.util.HashMap;

public class Q9Collection {
	public static void main(String[] args) {
		
		HashMap map= new HashMap();
		
		map.put(0, 33);
		map.put(1, 3);
		map.put(1, 5);
		map.put(3, 333);
		
		System.out.println(map);
		System.out.println(map.size());
		
		
	}

}
