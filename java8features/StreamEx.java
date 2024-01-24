package java8features;

import java.util.ArrayList;

public class StreamEx {
	//created by Rincy banu
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Rincy");
		list.add("Darshini");
		list.add("Pooja");
		list.add("Swati");
		list.add("Priyanka");
		
		// without stream API
		int count = 0;
		for (String string : list) {
			if(string.length()<7) {
				count++;
			}
		}
		System.out.println("There are "+count+" strings with length less than 7");

		// with stream API
		long count1 = list.stream().filter(str -> str.length()<7).count();
		System.out.println("There are "+count1+" strings with length less than 7");
	}

}
