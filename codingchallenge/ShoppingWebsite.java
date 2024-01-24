/*
 * Q.4
Your task here is to implement a Java code based on the following specifications. 
Note that your code should match the specifications in a precise manner. 
Consider default visibility of class unless mentioned otherwise.
Specifications:
﻿class definitions:
class Customer:
data fields:
int id
String name
double walletBalance
String address
method definitions:
Define a parameterized constructor with public visibility

class Item:
data fields:
int id
String name
String companyName
double price
boolean isInStock
method definitions:
Define a parameterized constructor with public visibility

class ShoppingWebsite:
method definition:
purchaseItem(Item i, Customer c) throws ItemOutOfStockException,InsufficientBalanceException:
return type: String
visibility: public

class InsufficientBalanceException extends Exception:
method definition:
InsufficientBalanceException(String message):
visibility: public

class ItemOutOfStockException extends Exception:
method definition:
ItemOutOfStockException(String message):
visibility: public

Task:
-Implement class Customer according to the above specifications
-Implement class Item according to the above specifications
-Class ShoppingWebsite
String purchaseItem(Item i, Customer c) throws ItemOutOfStockException,InsufficientBalanceException:
• Throw an ItemOutOfStockException when the item is out of stock with the message "item is out of stock".

• Throw an InsufficientBalanceException when customer wallet balance is not
sufficient(Item price is greater than the wallet balance) with the message "customer wallet balance is not sufficient".
• If no exception found then return "Order Successful".

-class InsufficientBalanceException
• define custom exception class InsufficientBalanceException by extending the Exception class.
• define a parameterized constructor with a String argument to pass the message to the super class.

-class ItemOutOfStockException
• define custom exception class ItemOutOfStockException by extending the Exception class.
• define a parameterized constructor with a String argument to pass the message to the super class.

Sample Testcase:
Input:
Customer cusDet = new Customer(927392, "Steve" ,5000.0, "USA");
Item itemDet = new Item(27392, "T-Shirt", "US polo", 800, true);
ShoppingWebsite obj = new ShoppingWebsite();
String out = obj.purchaseItem(itemDet, cusDet);

output:
out = "Order Successful"
 */
package codingchallenge;
//Created by Rincy banu
class Customer
{
	int id;
	String name;
	double walletBalance;
	String address;
	public Customer(int id, String name, double walletBalance, String address) {
		super();
		this.id = id;
		this.name = name;
		this.walletBalance = walletBalance;
		this.address = address;
	}
}

class Item
{
	int id;
	String name;
	String companyName;
	double price;
	boolean isInStock;
	public Item(int id, String name, String companyName, double price, boolean isInStock) {
		super();
		this.id = id;
		this.name = name;
		this.companyName = companyName;
		this.price = price;
		this.isInStock = isInStock;
	}
	
}
public class ShoppingWebsite {
	public String purchaseItem(Item i, Customer c) throws ItemOutOfStockException,InsufficientBalanceException
	{
		if(!i.isInStock)
		{
			throw new ItemOutOfStockException("item is out of stock");
		}
		
		if(i.price>c.walletBalance)
		{
			throw new InsufficientBalanceException("customer wallet balance is not sufficient");
		}
		return "Order Successfull";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cusDet = new Customer(927392, "Steve" ,50000.0, "USA");
		Item itemDet = new Item(27392, "T-Shirt", "US polo", 8000, true);
		ShoppingWebsite obj = new ShoppingWebsite();
		String out = "";
		try {
			 out = obj.purchaseItem(itemDet, cusDet);
		} catch (ItemOutOfStockException | InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			out=e.getMessage();
		}
		
        System.out.println(out);
	}

}
