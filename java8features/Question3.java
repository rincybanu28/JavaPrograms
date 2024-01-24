package java8features;

import java.util.Scanner;

@FunctionalInterface
interface CalculateSI{
	float SimpleInterest(float p, float n,float r);
}
//created by Rincy banu
public class Question3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal amount: ");
		float pa = sc.nextFloat();
		System.out.println("Enter the rate: ");
		float rate = sc.nextFloat();
		System.out.println("Enter year: ");
		float year = sc.nextFloat();
		
		CalculateSI si = (p,n,r)->{
			return (p*n*r)/100;
		};

		System.out.println("Simple interest: "+si.SimpleInterest(pa, rate, year));
	}

}
