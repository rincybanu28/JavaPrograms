package ClassandObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CustomerBufferEx {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int id;
		String name;
		Double principalAmount, rate, year, total;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter id: ");
		id = Integer.parseInt(reader.readLine());
		System.out.println("Enter name: ");
		name = reader.readLine();
		System.out.println("Enter principal amount: ");
		principalAmount = Double.parseDouble(reader.readLine());
		System.out.println("Enter year: ");
		year = Double.parseDouble(reader.readLine());
		System.out.println("Enter rate: ");
		rate = Double.parseDouble(reader.readLine());
		
		total =(principalAmount*year*rate)/100;
		
		System.out.println("Simple interest = "+total);
	}

}
