package java8features;

import java.util.Scanner;
import java.util.stream.Collectors;

public class SpaceInString {
	@FunctionalInterface
	interface Space{
		String insertspace(String s);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input string: ");
		String input = sc.nextLine();
		String s = input.toString().chars().mapToObj(c->(char)c+ " ").collect(Collectors.joining()).trim();
		System.out.println("String after inserting space: ");		
		System.out.println(s);
		

	}

}
