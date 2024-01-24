package abstration;

public interface Pritable {

	public void div(double a,double b);

default void show() {
	System.out.println("Inside show: Printable");
}
}