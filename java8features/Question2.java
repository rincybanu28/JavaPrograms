package java8features;

import java.util.Scanner;

@FunctionalInterface
interface Circle{
	float circle(float r);
}
//created by Rincy banu
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		float n = sc.nextFloat();
		Circle c = x-> 2.14f *(x*x);
		System.out.println("Area of Circle: "+c.circle(n));

	}

}
