package abstration;

import java.util.Scanner;

abstract class Bank{
	public abstract float getRateOfInterest();
}


class BOI extends Bank{
	@Override
	public float getRateOfInterest() {
		// TODO Auto-generated method stub
		return 8.7f;
	}
}

class SBI extends Bank{
	@Override
	public float getRateOfInterest() {
		// TODO Auto-generated method stub
		return 6.6f;
	}
}


public class BankAbstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float principleAmount, years, rateBOI, rateSBI;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principle amount: ");
		principleAmount = sc.nextFloat();
		System.out.println("Enter number of years: ");
		years = sc.nextFloat();
		
		//Creating an object of BOI by referring Bank class
		Bank bBOI = new BOI();
		rateBOI = bBOI.getRateOfInterest();
		
		//Creating an object of SBI by referring Bank class
		Bank bSBI = new SBI();
		rateSBI = bSBI.getRateOfInterest();
	
		float interestBOI = (principleAmount*years*rateBOI)/100;
		float interestSBI = (principleAmount*years*rateSBI)/100;
		
		System.out.println("simple interest for BOI: " + interestBOI);
		System.out.println("simple interest for SBI: " + interestSBI);

	}

}
