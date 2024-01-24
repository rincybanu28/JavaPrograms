package Assessment_Problems;

import java.util.Scanner;

public class TrianglePattern {

	public static void main(String[] args) {
		int a, b, c, i, j;
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a: ");
		a = sc.nextInt();
		System.out.println("enter b: ");
		b = sc.nextInt();
		System.out.println("enter c: ");
		c = sc.nextInt();
		
		
		for(i=1;i<=a;i++) {  //row
			for(j=1;j<=a-i;j++) { //to print spaces
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {  //to print numbers
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		for(i=1;i<=b;i++) {
			for(j=1;j<=b-i;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		for(i=1;i<=c;i++) {
			for(j=1;j<=c-i;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}
}
