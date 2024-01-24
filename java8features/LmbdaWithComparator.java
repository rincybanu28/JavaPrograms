package java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Created by Rincy banu
class Product{
	int id;
	String name;
	float price;
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
public class LmbdaWithComparator {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product(101,"Notebook", 1200));
		list.add(new Product(102,"Pencil box", 400));
		list.add(new Product(103,"Mouse", 2500));
		list.add(new Product(104,"Keyboard", 6500));
		list.add(new Product(105,"Monitor", 15200));
		
		
		Collections.sort(list ,(p1,p2) -> {
			return p1.name.compareTo(p2.name);
		});
		
//		for (Product product : list) {
//			System.out.println("Sorted list: "+product);
//		}
		
		
		//foreach method
		list.forEach( p -> System.out.println(p));

	}

}
