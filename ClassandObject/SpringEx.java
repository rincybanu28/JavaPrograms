package ClassandObject;

public class SpringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//if u r printing an object of string, to string will called
		String s1 = new String("Hello world");
		System.out.println(s1);
		
		String s2 = "Welcomeeee";
		System.out.println(s2);
		
		String s3 = " ";
		
		String s4 = "Rincy";
		String s5 = "rincy";
		
		System.out.println("length :"+ s2.length());
		
		System.out.println("Substring: "+s2.substring(3));
		
		System.out.println("Substring: "+s2.substring(0,2));
		
		System.out.println("c present in s2: "+s2.contains("c"));
		
		System.out.println("x present in s2: "+s2.contains("x"));
		
		System.out.println("isEmpty: "+s3.isEmpty());//consider blank space
		
		System.out.println("isEmpty: "+s3.isBlank());//not consider space
		
		System.out.println("index of: "+s2.indexOf("e"));
		
		System.out.println("index of: "+s2.indexOf("e",3));
		
		System.out.println("last index of: "+s2.lastIndexOf("e"));
		
		System.out.println("equals: "+s4.equals(s5));
		
		System.out.println("equalsIgnoreCase: "+s4.equalsIgnoreCase(s5));
		
		System.out.println("Concat String: "+s4.concat(" banu"));
		
		//only rincy will print
		System.out.println(s4);
		
		//change reference or else string value will not change bcz its immutable
		s4 = s4.concat(" banu");
		System.out.println(s4);
		
		
		System.out.println("Replace: "+s2.replace("e", "o"));
			
		System.out.println("Uppercase: "+s4.toUpperCase());
		
		System.out.println("Lowercase: "+s4.toLowerCase());
		
		//trim
		String s7 = "         Strting example            ";
		System.out.println("length before removing spaces: "+s7.length());
		s7 = s7.trim();
		System.out.println("length After removing spaces: "+s7.length());
		
		
		String s8 = "this is an example of split function";
		String splittedString[] = s8.split(" ");
		System.out.println("count of words: "+splittedString.length);
		
		StringBuffer buffer = new StringBuffer("String buffer example");
		System.out.println(buffer);
		
		StringBuilder builder = new StringBuilder("String builder example");
		System.out.println(builder);
		
	}

}
