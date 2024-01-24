package exceptionHandling;

public class FinallyBlockEx {

	public static void main(String[] args) {
		System.out.println("case 1: where exception deosn't occure");
		try {
			int a = 25/5;
			System.out.println("Div: " +a);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("case 1: finally block always execute");
		}
		System.out.println("case 1: rest of the code..........");

		System.out.println("--------------------------------------------");
		
		//case2
		
		
		System.out.println("case 2: where exception occure and handle it");
		try {
			String s = null;
			System.out.println(s.length());
			
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("case 2: finally block always execute");
		}
		System.out.println("case 2: rest of the code..........");

		System.out.println("--------------------------------------------");
		
		
		//case3
		
		System.out.println("case 3: where exception occures but deosnt hanndle");
		try {
			int a = 25/0;
			System.out.println("Div: " +a);
			
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("case 3: finally block always execute");
		}
		System.out.println("case 3: rest of the code..........");

		System.out.println("--------------------------------------------");

	}


}
