package collection;
import java.util.ArrayDeque;
import java.util.Deque;
//Created by Rincy banu	
public class ArrayDequeEx {

	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<>();
		//deque.add(null);
		deque.add("Burger");
		deque.offer("Pizza");
		deque.offerFirst("Cupcake");
		deque.offer("Pasta");
		deque.offerLast("Icecream");
		
		System.out.println("Deque: "+deque);
		System.out.println("Removing 1st element: "+deque.pollFirst());
		System.out.println("Deque after removing 1st element: "+deque);
		System.out.println("Removing last element: "+deque.pollLast());
		System.out.println("Deque after removing last element: "+deque);
		System.out.println("Retrieve using peek : "+deque.peek());
	}

}
