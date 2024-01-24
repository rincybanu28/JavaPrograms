package collection;

import java.util.Scanner;

public class Menu {
	public double subTotal;
	public static double Total;
	private static double itemPrice;
	static boolean ordering=true;
	static Scanner input=new Scanner(System.in);
	static double j=0.0;

	
	public static void menu() 
	{
		System.out.println("Welcome to our Restaurant :) \n\nFoodname & Price.\n1.Chappati - Rs 12/-\n2.Dosa - Rs 15/-\n3.Idli - Rs 10/-\n4.Pongal - Rs 50/-\n5.Ghee Roast - Rs 30/-\n\nOur Special BIRIYANI\n\n6.Bornless Chicken Biriyani - Rs 180/-\n7.Malabar Biriyani - Rs 160/-\n8.Chicken 65 Biriyani - Rs 160/n\n9.Paneer Biriyani - Rs 200/-\n10.Mutton Biriyani - Rs 190/-\n\nEnter 0 for DONE");
	
	}
	public static double itemPrice(int foodItem)
	{
		if(foodItem==1)
		{
			System.out.println("You have selected Chappati");
			itemPrice=12;
		}
		if(foodItem==2)
		{
			System.out.println("You have selected Dosa");
			itemPrice=15;
		}
		if(foodItem==3)
		{
			System.out.println("You have selected Idli");
			itemPrice=10;
		}
		if(foodItem==4)
		{
			System.out.println("You have selected Pongal");
			itemPrice=50;
		}
		if(foodItem==5)
		{
			System.out.println("You have selected Ghee Roast");
			itemPrice=30;
		}
		if(foodItem==6)
		{
			System.out.println("You have selected Bornless Chicken Biriyani");
			itemPrice=180;
		}
		if(foodItem==7)
		{
			System.out.println("You have selected Malabar Biriyani");
			itemPrice=160;
		}
		if(foodItem==8)
		{
			System.out.println("You have selected Chicken 65 Biriyani");
			itemPrice=160;
		}
		if(foodItem==9)
		{
			System.out.println("You have selected Paneer Biriyani");
			itemPrice=200;
		}
		if(foodItem==10)
		{
			System.out.println("You have selected Mutton Biriyani");
			itemPrice=190;
		}
		quantity();
		return j;
		
	}
	public static double quantity()
	{
		System.out.println("Enter quantity");
		double quantity=input.nextDouble();
		subTotal(quantity, itemPrice);
		return quantity;
		
	}
	public static double subTotal(double quantity, double itemPrice) {
		double subTotal=quantity*itemPrice;
		System.out.println("subTotal: "+subTotal+"\n");
		j=subTotal;
		return subTotal;
		
	}
	public static void done(double Total)
	{
		ordering=false;
		System.out.println("");
		
	}
	
	public static void main(String[] args)
	{
		int foodItem=0;
		input=new Scanner(System.in);
		double runningTotal=0;
		do {
			menu();
			System.out.println("\nEnter Item Number: ");
			int menuOption=input.nextInt();
			switch(menuOption)
			{
				
				case 1:foodItem=1;
						Total+=itemPrice(foodItem);
						break;
				case 2:foodItem=2;
						Total+=itemPrice(foodItem);
						break;
				case 3:foodItem=3;
						Total+=itemPrice(foodItem);
						break;
				case 4:foodItem=4;
						Total+=itemPrice(foodItem);
						break;
				case 5:foodItem=5;
						Total+=itemPrice(foodItem);
						break;
				case 6:foodItem=6;
						Total+=itemPrice(foodItem);
						break;
				case 7:foodItem=7;
						Total+=itemPrice(foodItem);
						break;
				case 8:foodItem=8;
						Total+=itemPrice(foodItem);
						break;
				case 9:foodItem=9;
						Total+=itemPrice(foodItem);
						break;
				case 10:foodItem=10;
						Total+=itemPrice(foodItem);
						break;
				case 0:done(runningTotal);
						break;
				default:System.out.println("Invalid option");	
			}
						
		}
		while(ordering);
		
		
		System.out.println("Total Amount: "+Total);
		System.out.println("Enjoy Your Food!..\nVisit Again");
			
			
			
		}
		
}	
		

