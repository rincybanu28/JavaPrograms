package exceptionHandling;

public class CheckAge {

	public static void checkAge(int age) throws MyException
	{
		if(age>=15)
			System.out.println("Valid");
		else
			throw new MyException("invalid");
	}
	
	public static void main(String[] args) {
		try
		{
			checkAge(14);
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("rest of the code");
	}

}
