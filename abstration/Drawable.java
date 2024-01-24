package abstration;

public abstract class Drawable {

	
	public Drawable() {
		System.out.println("constructor inside abstract drawable class");
	}
	//abstract method
	public abstract void area();// it should be overridden in child class
	
	
	//non abstract method
	public void print() {
		System.out.println("inside non abstract method of abstract class");
	}
}
