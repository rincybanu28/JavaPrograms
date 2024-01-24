package collection;
import java.util.PriorityQueue;
import java.util.Queue;
//Created by Rincy banu	
public class PriorityQueueEx {
	public static void main(String[] args) {
		
		Queue<String> queue = new PriorityQueue<String>();
		queue.add("Jasmin");
		queue.offer("Lotus");
		queue.offer("Rose");
		queue.offer("Mogra");
		queue.offer("lilly");
		//queue.add(null); can't store null

		System.out.println("Queue: "+queue);
		System.out.println("Head of queue: "+queue.element());
		System.out.println("Removing element: "+queue.remove());
		System.out.println("After removing Queue: "+queue);
		System.out.println("Removing element: "+queue.poll());
		System.out.println("After removing Queue: "+queue);

	}

}
