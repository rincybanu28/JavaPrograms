package collection;

import java.util.ArrayList;
import java.util.Collections;

//Created by Rincy banu
public class Sorting {

	public static void main(String[] args) {
		//String class is comparable
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("B");
		list2.add("D");
		list2.add("C");
		list2.add("E");
		list2.add("A");
		//list2.add(null);
		
         System.out.println("ArrayList before sorting : ");
         for (String string : list2) {
			System.out.println(string);
		}
         
         System.out.println("After sorting: ");
         Collections.sort(list2);
         for (String string : list2) {
			System.out.println(string);
		} 
	}

}
