package ClassandObject;

public class Employee1 extends Person{

	float WorkingDays, perDay, salary;
	
	public Employee1() 
	{
		super(); //super constructor is used to call parent class constructor, it should write in first line of constructor
		WorkingDays = 20;
		perDay = 2200;
	}
	
	public Employee1(int id, String name, MyDate dob, float WorkingDays, float perDay)
	{
		super(id,name,dob);
		this.WorkingDays = WorkingDays;
		this.perDay =  perDay;
		
	}
	
	public void calculate()
	{
		salary = WorkingDays * perDay;
	}
	
	@Override //overriding display() from parent class
	public void display()
	{
		super.display();  //calling display from parent class
		System.out.println("salary : "+salary);
	}
	
}
