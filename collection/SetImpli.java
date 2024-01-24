package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
//Created by Rincy banu
public class SetImpli {
	public static void main(String[] args) {
		Set<String> hashset = new HashSet<>();
		hashset.add("Rincy");
		hashset.add("Riya");
		hashset.add("Meera");
		hashset.add("Riya");
		hashset.add(null);
		System.out.println("Implimenting hashset: ");
		for(String string: hashset) {
			System.out.println(string);
		}
		System.out.println("--------------------");
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("Mango");
		linkedHashSet.add("Banana");
		linkedHashSet.add("Guava");
		linkedHashSet.add("Mango");
		linkedHashSet.add("Apple");
		linkedHashSet.add(null);
		System.out.println("Implimenting LinkedHashSet: \n"+linkedHashSet);
		System.out.println("--------------------");
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("Pizza");
		treeSet.add("Burger");
		treeSet.add("Salad");
		treeSet.add("Sandwich");
		treeSet.add("Burger");
		//treeSet.add(null);
		System.out.println("Implimenting TreeSet: \n"+treeSet);
	}

}
