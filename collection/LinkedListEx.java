package collection;

import java.util.LinkedList;
//Created by Rincy banu
public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkedlist= new LinkedList<>();
		linkedlist.add("Apple");
		linkedlist.add("Mango");
		linkedlist.add("Banana");
		linkedlist.add("Grapes");
		linkedlist.add("Apple");
		linkedlist.add(null);
		for (String string : linkedlist) {
			System.out.println(string );
		}
		
		LinkedList<String> linkedlist2= new LinkedList<>();
		linkedlist.add("Lilly");
		linkedlist.add("Rose");
		linkedlist.addAll(linkedlist2);
		System.out.println("Adding list2 in list1 : \n"+linkedlist);

	}

}
