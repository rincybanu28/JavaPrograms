package example;
import java.util.Scanner;

public class DistanceTraveled {
	
	public void getDistance(int t) {
		int u = 10;
		int a = 5;
		int d = u*t+((a*t*t)/2);
		System.out.println(d);
	}

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		int a = 10;
		int b = 8;
		
		DistanceTraveled ds = new DistanceTraveled();
		ds.getDistance(a);
		ds.getDistance(b);
	}
}
