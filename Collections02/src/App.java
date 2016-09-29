import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// comparing linked lists with array lists
public class App {

	public static void main(String[] args) {
		// only need to think about list type when creating the list
		/* ArrayLists manage arrays internally.
		 * [0][1][2][3][4] ...
		 * Takes time to add or remove items anywhere other than near end of list
		 */
		List<Integer> arrayList = new ArrayList<Integer>(); //if only want to add or remove items to end of list, use ArrayList otherwise use LinkedList
		
		/*
		 * LinkedLists consist of elements where each element 
		 * has a reference to the previous and next element
		 * [0] -> [1] -> [2] ...
		 * 	   <-	  <-
		 * Just need to amend pointers rather than shift arrays as above
		 */
		
		List<Integer> linkedList = new LinkedList<Integer>();

		doTimings("ArrayLists", arrayList);
		doTimings("LinkedList", linkedList);
	}
	
	private static void doTimings(String type, List<Integer> list) { //List is an interface against which you can pass either Array or Linked List objects
		for(int i=0; i<1E5; i++) {
			list.add(i);
			
		}
		long start = System.currentTimeMillis();
		
		/*
		//add items at end of list
		for(int i=0; i<1E5; i++) {
			list.add(i);
		}
		*/
		
		//add items elsewhere of list
		for(int i=0; i<1E5; i++) {
			list.add(list.size() - 100, i); //add items to beginning of list
		}
		//takes much longer to do this for ArrayList!
		
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken: " + (end - start) + "ms for " + type);
	}

}
