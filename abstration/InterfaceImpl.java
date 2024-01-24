package abstration;

public class InterfaceImpl implements Addable,Pritable{

	//unimplemented method from Addable class

	@Override
	public void print() {
		// TODO Auto-generated method stub
		float r = 10;
		System.out.println("Area: "+(PI*r*r));	
	}
	
	//unimplemented method from Printable class
	@Override
	public void div(double a, double b) {
		// TODO Auto-generated method stub
		System.out.println("div: "+(a/b));
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		Addable.super.show(); //Diamond problem solution
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceImpl impl = new InterfaceImpl();
		impl.print();
		Addable.add(4,6);
		impl.mul(5, 7);
		impl.div(15, 2);
		impl.show();
	}

}
