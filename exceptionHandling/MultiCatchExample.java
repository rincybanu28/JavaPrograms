package exceptionHandling;
//order of catch block must be most specific to most general
//exception e should put last
public class MultiCatchExample {

	public static void main(String[] args) {
		try {
			int a[] = new int[10];
			a[12] = 25/0;
			System.out.println(a);
		}
		
		catch (ArithmeticException e) {
			e.printStackTrace();
		} //after printing arithmetic exception it will come out of try catch block, will not go to next catch block
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();	
		}
		
		
		//during java 7, adding multiple exceptions in one catch is possible
		try {
			int a[] = new int[10];
			a[12] = 25/0;
			System.out.println(a);
		}
		catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		System.out.println("rest of the code.........");
	}
}
