import java.util.Iterator;
import java.util.LinkedList;

//using iterators and the iterable interface
public class App {

	public static void main(String[] args) {
		LinkedList<String> animals = new LinkedList<String>(); //more efficient to remove items from linkedlist which is what we're doing here
		
		animals.add("fox");
		animals.add("cat");
		animals.add("dog");
		animals.add("rabbit");
		
		Iterator<String> it = animals.iterator();
		
		while(it.hasNext()){
			String value = it.next(); //starts at first item in list. usually use this in loop
			System.out.println(value);
			
			if(value.equals("cat")) {
				it.remove();
			}
		}

		System.out.println();
		
		/// Modern iteration. Java 5+. But cannot remove items while iterating though so use iterator above.
		for(String animal: animals) {
			System.out.println(animal);
		}
		
	}

}
