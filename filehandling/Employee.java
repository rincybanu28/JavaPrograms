package filehandling;

import java.io.Serializable;

public class Employee implements Serializable{

	int id;
	String name, designation;
	public Employee() {
		super();
	}
	public Employee(int id, String name, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + "]";
	}
	

}
