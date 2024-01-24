package exceptionHandling;

public class BadFood {
	
	public static void checkFruit(String fruitName) throws BadFoodException
	{
		if(fruitName.equalsIgnoreCase("Mango"))
			System.out.println("I like "+fruitName);
		else
			throw new BadFoodException("I dont like "+fruitName);
	}
	public static void main(String[] args) {
		try {
			checkFruit("Grape");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("rest of the code.........");
	}
}
