package ClassandObject;

public class Test {

	public static void main(String[] args) {
		/*Person person1 = new Person();
		person1.display();
		
		Person person2 = new Person(102,"pooja", new MyDate(10,3,1997));
		person2.display();
		
		Employee1 employee1 = new Employee1();
		employee1.calculate();
		employee1.display();
		
		Employee1 employee2 = new Employee1(102, "pooja",  new MyDate(10,3,1997),20,2200);
		employee2.calculate();
		employee2.display();
		
		
		SalesPerson emp1 = new SalesPerson();
		emp1.calculate();
		emp1.display();
		
		SalesPerson emp2 = new SalesPerson(102, "aisha", new MyDate(12,5,1998), 20, 2200, 80);
		emp2.calculate();
		emp2.display();
		*/
		
		/*Customer customer1 = new Customer();
		customer1.calculate();
		customer1.display();
		
		System.out.println(" ");
		Customer customer2 = new Customer(101, "Rincy", new MyDate(23,5,1999), "Mobile", 2, 20000);
		customer2.calculate();
		customer2.display();
		*/
		
		Discount discount1 = new Discount();
		discount1.calculate();
		discount1.display();
		
		System.out.println(" ");
		
		Discount discount2 = new Discount(101, "Rincy", new MyDate(23,5,1999), "Earphone", 3, 2500);
		discount2.calculate();
		discount2.display();
		
	}

}
