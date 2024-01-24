package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx1 {
//created by Rincy banu
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Print Using Foreach() method:");
		
		List<String> names = Arrays.asList("Rajkumar", "Rincy", "Sakshi", "Priyanka", "Darshini", "Pooja");
		
		//Create a stream
		Stream<String> allNames = names.stream();
		
		//perform intermediate operation
		Stream<String> longName = allNames.filter(str -> str.length()>7);
		
		//perform terminal operation
		longName.forEach(str -> System.out.println(str));
		
		System.out.println("\nPrint Using Collect() method:");
		
		//in single line
		//collect(Collector.toList() : used to convert stream into list
		List<String> namesCollect = names.stream().filter(str -> str.length()>7).collect(Collectors.toList());
		//namesCollect.forEach(str -> System.out.println(str));
		namesCollect.forEach(System.out::println);
		
		

	}

}
