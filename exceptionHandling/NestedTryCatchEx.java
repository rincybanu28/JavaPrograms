package exceptionHandling;

public class NestedTryCatchEx {

	public static void main(String[] args) {
		
		//main try catch
		try {
			//nested try catch block
			try {
				String s = null;
				System.out.println(s.length());
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
			
			//nested try catch block
			try {
				String s1 = "abc";
				System.out.println(Integer.parseInt(s1));
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
			System.out.println("other line of code....");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("rest of the code....");

	}

}
