package ClassandObject;

public class SalesPerson extends Employee1{

	float sales, commision, totalSalary;
	
	//default constructor
	public SalesPerson()
	{
		super();
		sales = 80;
	}

	//Parameterized constructor
	public SalesPerson(int id, String name, MyDate dob, float WorkingDays, float perDay, float sales )
	{
		//calling parent class(Employee1) parameters
		super(id, name, dob, WorkingDays, perDay);
		this.sales = sales;
	}
	
	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		super.calculate();
		if(sales >=90) 
		{
			commision = salary *0.2f;
		}
		else if(sales >=75)
		{
			commision = salary *0.1f;
		}
		else if(sales >=60)
		{
			commision = salary *0.05f;
		}
		else
		{
			commision = 0;
		}
		totalSalary = salary + commision;
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Commision :"+commision);
		System.out.println("Total Salary :" +totalSalary);
	}	
}
