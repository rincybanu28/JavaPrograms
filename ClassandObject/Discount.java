package ClassandObject;

public class Discount extends Customer
{
	float discount, finalBill;

	public Discount() {
		super();
		
	}
	
	public Discount(int id, String name, MyDate dob, String prodName, float  Quantity, float Price) {
		super(id,name,dob,prodName,Quantity,Price);
		
	}
	
	public void calculate()
	{
		super.calculate();
		if(billAmount >= 20000) 
		{
			discount = billAmount *0.15f;
		}
		else if(billAmount >= 15000)
		{
			discount = billAmount  *0.1f;
		}
		else if(billAmount >= 10000)
		{
			discount = billAmount  *0.07f;
		}
		else
		{
			discount = 0;
		}
		finalBill = billAmount - discount;
	}
	
	public void display() {
		super.display();
		System.out.println("Discount :"+discount);
		System.out.println("Final Bill :"+finalBill);
	}
	
}
