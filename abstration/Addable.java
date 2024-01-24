package abstration;

public interface Addable {
	
	float PI = 3.14f; //public static final float PI =3.14f;
	
	
	void print(); // JVM will read public abstract void print

	
	public static void add(int a, int b) {
		System.out.println("add: "+ (a+b));
	}
	
	default void mul(int a,int b) {
		System.out.println("mul: "+ a*b);
	}
	
	default void show() {
		System.out.println("Inside show: Addable");
	}
}
