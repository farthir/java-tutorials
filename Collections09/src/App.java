import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

//queues
public class App {

	public static void main(String[] args) {
		// (head) <- oooooooooooooooo <- (tail) FIFO (first in, first out)
		
		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3); //ArrayBlockingQueue has fixed sized

		//Throws NoSuchElement exception as no items in queue yet
		//System.out.println("Head of queue: " + q1.element());
		
		q1.add(10);
		q1.add(20);
		q1.add(30);
		
		System.out.println("Head of queue: " + q1.element());
		
		try {
			q1.add(40);
		} catch (IllegalStateException e) {
			System.out.println("Tried to add too many items to the queue");
		}
		
		for(Integer value: q1){
			System.out.println("Queue value: " + value);
		}
		

		System.out.println("Removed from queue: " + q1.remove());
		System.out.println("Removed from queue: " + q1.remove());
		System.out.println("Removed from queue: " + q1.remove());
		
		try {
			System.out.println("Removed from queue: " + q1.remove());
		} catch (NoSuchElementException e) {
			System.out.println("Tried to remove too many items from queue");
		}
		
		/////////////////////////////////
		
		Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);
		
		System.out.println("queue 2 peek: " + q2.peek());
		
		q2.offer(10);
		q2.offer(20);
		if(q2.offer(30) == false) {
			System.out.println("queue is full!");
		}
		
		System.out.println("queue 2 peek: " + q2.peek());
		
		for(Integer value: q2){
			System.out.println("Queue 2 value: " + value);
		}
		
		System.out.println("queue 2 poll: " + q2.poll());
		System.out.println("queue 2 poll: " + q2.poll());
		System.out.println("queue 2 poll: " + q2.poll());
		
		
	}

}