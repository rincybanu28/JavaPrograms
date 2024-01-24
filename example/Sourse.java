package example;

class MyException1 extends Exception{
	
	public MyException1(String msg) 
	{
		super(msg);
	}
}
// Created by Rincy banu

public class Sourse {

	public void checkAge(int age) throws MyException1
	{
		if(age>=15)
			System.out.println("Valid");
		else
			throw new MyException1("invalid");
	}
	
	public static void main(String[] args) throws MyException1 {
		Sourse sourse = new Sourse();
		sourse.checkAge(22);
	}

}
