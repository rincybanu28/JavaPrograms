package collection;

import java.util.Stack;
//Created by Rincy banu
public class StackEx {
	//Created by Rincy banu
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("Apple");
		stack.push("Mango");
		stack.push("Guava");
		stack.push("Banana");
		stack.push("Kiwi");
		stack.push(null);
		
		System.out.println("Stack: "+stack);
		System.out.println("Removing last element: "+stack.pop());
		System.out.println("Stack after poping last element: "+stack);
		System.out.println("Search element in stack: "+stack.search("Mango"));
		System.out.println("Removing specific element from Stack: "+stack.remove("Guava"));
		System.out.println("Stack after removing Guava: "+stack);
		System.out.println("Search watermelon: "+stack.search("watermelon"));

	}

}
