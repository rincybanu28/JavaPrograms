package ClassandObject;

public class Customer extends Person{
	
	String prodName;
	float  Quantity, Price, billAmount;
	
	public Customer() 
	{
		super();
		prodName = "Smart phone";
		Quantity = 2;
		Price = 20000;
	
	}
	public Customer(int id, String name, MyDate dob, String prodName, float  Quantity, float Price) 
	{
		super(id,name,dob);
		this.prodName = prodName;
		this.Quantity = Quantity;
		this.Price = Price;
		
	}
	public void calculate() {
		billAmount = Quantity * Price;
	}
	
	
	public void display() {
		super.display();
		System.out.println("Product Name :"+prodName);
		System.out.println("Quantity :"+Quantity);
		System.out.println("Price :"+Price);
		System.out.println("Bill Amount :"+billAmount);
	}
}
