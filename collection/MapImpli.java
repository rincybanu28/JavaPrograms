package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

//Created by Rincy banu
public class MapImpli {

	public static void main(String[] args) {
		//HashMap
		Map<String, String> map = new HashMap<>();
		map.put("In","India" );
		map.put("Br","Brazil" );
		map.put("Ge","Germany" );
		map.put("Fr","France" );
		map.put(null, null);
		
		System.out.println("Implimenting HashMap: ");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("Country code : "+entry.getKey()+", Country: "+entry.getValue());	
		}
		
		System.out.println(map.get("Br"));
		
		//TreeMap
		Map<String, String> treemap = new TreeMap<>();
		treemap.put("BR101", "Coffee");
		treemap.put("L202", "Meals");
		treemap.put("D303", "Pasta");
		treemap.put("BR102", "Tea");
		treemap.put("L203", "Biriyani");
		
		
		System.out.println("\nImplimenting TreeMap: ");
		for (Map.Entry<String, String> entry : treemap.entrySet()) {
			System.out.println("Code : "+entry.getKey()+", Menu: "+entry.getValue());
			
		}
		
		//HashTable
		Hashtable<String, String> hashtable = new Hashtable<>();
		hashtable.put("BR101", "Coffee");
		hashtable.put("L202", "Dosa");
		hashtable.put("D303", "Pizza");
		hashtable.put("BR102", "Tea");
		hashtable.put("L203", "Roti");
		
		System.out.println("\nImplimenting Hashtable: ");
		for (Map.Entry<String, String> entry : hashtable.entrySet()) {
			System.out.println("Code : "+entry.getKey()+", Menu: "+entry.getValue());
			
		}
		

	}

}
