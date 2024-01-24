package exceptionHandling;

public class ThrowExample {

	
	public static void CheckAge(int age)
	{
		if(age>=18)
			System.out.println("Eligible for voting");
		else
			throw new ArithmeticException("Age is not valid");
	}
	public static void main(String[] args) {
		try
		{
			CheckAge(15);
		}
		catch(ArithmeticException e){
			e.printStackTrace();
		}

		System.out.println("rest of the code");
	}

}
