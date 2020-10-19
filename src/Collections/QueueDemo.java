package Collections;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Manish");
		queue.add("Zope");
		queue.add("Manish");
		System.out.println(queue);
		queue.remove();
		
		System.out.println(queue);
		
		for (String iValue : queue) {
			System.out.println(iValue);
		}
	}

}
