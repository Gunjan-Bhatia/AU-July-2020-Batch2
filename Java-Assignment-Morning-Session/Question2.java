//Question 2. Write a Java program to get a reverse order view of the keys contained in a given map

import java.util.*;


public class Question2 {
	public static void main(String args[]) {

		
		TreeMap<String, String> map = new TreeMap<String, String>();

		
		map.put("C2", "Red");
		map.put("C1", "Green");
		map.put("C4", "Black");
		map.put("C3", "White");

		System.out.println("Orginal content: " + map);
		System.out.println("Reverse order view of the keys: " + map.descendingKeySet());
	}
}

/*
Output
Orginal content: {C1=Green, C2=Red, C3=White, C4=Black}
Reverse order view of the keys: [C4, C3, C2, C1]
 
 */
