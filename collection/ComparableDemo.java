package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
	int rollNumber, age;
	String name;
	public Student(int rollNumber, int age, String name) {
		super();
		this.rollNumber = rollNumber;
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", age=" + age + ", name=" + name + "]";
	}
	
	@Override
	public int compareTo(Student st) {

		if(age==st.age)
			return 0;
		else if(age>st.age)
			return 1;
		else
			return -1;

	}
}

public class ComparableDemo {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(101, 23, "Rincy"));
		list.add(new Student(102, 25, "Meera"));
		list.add(new Student(103, 20, "Sara"));
		list.add(new Student(104, 22, "Riya"));
		list.add(new Student(105, 21, "Lilly"));
		
		Collections.sort(list);
		
		System.out.println("List after sorting : ");
		for (Student student : list) {
			System.out.println(student);
		}

	}

}
