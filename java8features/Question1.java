package java8features;

import java.util.Scanner;

@FunctionalInterface
interface Square{
	int square(int n);
}
//created by Rincy banu
public class Question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		Square s = x->x*x;
		System.out.println("Square: "+s.square(num));
		

	}

}
