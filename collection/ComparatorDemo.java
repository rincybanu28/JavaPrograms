package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//multiple sorting menthod : salary, name
//comparator methods: compare(obj1, obj2)
class Employee {
	int id, salary;
	String name;
	
	public Employee(int id, int salary, String name) {
			super();
			this.id = id;
			this.salary = salary;
			this.name = name;
		}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", name=" + name + "]";
	}
	
}

	class SalaryComparator implements Comparator<Employee>
	{
		@Override
		public int compare(Employee e1, Employee e2) {
			if(e1.salary == e2.salary)
				return 0;
			else if(e1.salary>e2.salary)
				return 1;
			else
				return -1;
		}
	}
	//name is String, as string already implements comparable we can use compareTo method
	class NameComparator implements Comparator<Employee>
	{
		@Override
		public int compare(Employee e1, Employee e2) {
			return e1.name.compareTo(e2.name);
		}
	}
	
//Created by Rincy banu	
public class ComparatorDemo {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(101, 27000, "Rincy"));
		list.add(new Employee(102, 35000, "Raj"));
		list.add(new Employee(103, 20000, "Sara"));
		list.add(new Employee(104, 42000, "Anu"));
		list.add(new Employee(105, 21000, "Aman"));
		
		System.out.println("sorting on the basis of Salary: ");
		Collections.sort(list, new SalaryComparator());
		for (Employee employee : list) {
			System.out.println(employee);
		}
		
		System.out.println("\nsorting on the basis of Name: ");
		Collections.sort(list, new NameComparator());
		for (Employee employee : list) {
			System.out.println(employee);
		}

	}

}


