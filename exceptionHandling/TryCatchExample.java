package exceptionHandling;

public class TryCatchExample {

	public static void main(String[] args) {
		try {
			 int a = 25/0;
			 System.out.println(a);
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			//System.out.println(e);
			//System.err.println(e);
			e.printStackTrace(); //this better because it will show in which line we are getting exception
			
		}
		
		 
		 System.out.println("rest of the code.......");
	}
}
