package java8features;
import java.util.Scanner;
import java.util.stream.Collectors;
//created by Rincy banu 
public class SpaceInStringWithLE {

	public String insertSpace(String s)
	 {
		return s.chars().//converting into characters 
			mapToObj(ch->(char) ch+ " ") //adding space for each char 
			.collect(Collectors.joining()); // joining characters
	 }
			
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in); 
		//System.out.println("Enter input string: ");
		String input = "capgemini";
		SpaceInStringWithLE s1= new SpaceInStringWithLE();
		String result= s1.insertSpace(input); 
		System.out.println(result);
		//sc.close();
	
	}
}
