package collection;

import java.util.ArrayList;
import java.util.Iterator;

//Created by Rincy banu
public class ArrayListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();  //non-generic list
		list.add("Swati");
		list.add(101);
		list.add(55.78);
		list.add(true);
		list.add(null);
		list.add("Rincy");
		 
		System.out.println("List Elements : "+list);
		
		ArrayList<String> list2 = new ArrayList<>();  //generic list
		list2.add("Rose");
		list2.add("Lilly");
		list2.add("Lotus");
		list2.add("Ziniya");
		list2.add("Jarbera");
		list2.add(null);
		System.out.println("Generic List  : "+list2);
		
		System.out.println("Iterating list using Iterator interface : ");
         Iterator<String> iterator = list2.iterator();
         while(iterator.hasNext())
         {
        	 System.out.println(iterator.next());
         }
         
         System.out.println("Iterating list using foreach loop : ");
         for (String string : list2) {
			System.out.println(string);
		}
         
	}

}
