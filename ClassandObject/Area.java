package ClassandObject;

import java.util.Scanner;

public class Area {
	
	float area; //instant variable and can use in any method but cannot use in static method
	Scanner sc = new Scanner(System.in); //scanner class to take value from user
	
	public void circle()  //default method
	{
		float radius; //creating variable
		System.out.println("enter radius: ");
		radius = sc.nextFloat();
		area= 3.14f * radius *radius;//default type of decimal values is double, to convert into float add small letter f
		System.out.println("Area of the circle = "+area );
	}

	
	public int square()  //default methods with return type
	{
		int side;
		System.out.println("Enter side: ");
		side = sc.nextInt();
		return side*side; //need variable to store the value
	}
	
	
	public void rectangle(int length, int breadth ) //Parameterized method without return type
	{
		System.out.println("Area of a rectangle ="+(length * breadth ));
	}
	
	
	public float triangle(float base, float height) //Parameterized method with return type
	{
		area = 0.5f * base * height;
		return area;
	}
	
	
	//static method belongs to class rather than object of a class
	//no need to create an object to call static method
	//inside static method you can see only static data
	public static void add(int a, int b ) { //static method
		System.out.println("Adding: "+ (a+b ));
		
	}
	
	
	
	public static void main(String[] args) {
	
		Area area = new Area();
		// calling circle method
		area.circle();
		
		
		//calling square method
		int ar= area.square();
		System.out.println("Area of square ="+ar);
		
		
		//calling rectangle method
		int length,breath;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length and breadth : ");
		length = sc.nextInt();
		breath = sc.nextInt();
		area.rectangle(length, breath);
		
		
		//calling triangle method
		float tr = area.triangle(3.8f, 2.6f);
		System.out.println("Area of triangle : "+tr);
		

		//calling static method
		//add(10+6);
		Area.add(10, 20);
	}
	
	


}
