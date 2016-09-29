import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

// Sets. collection that stores unique elements
public class App {

	public static void main(String[] args) {
		
		//Hashset does not retain order
		//Set<String> set1 = new HashSet<String>();
		
		//LinkedHashSet remembers order
		//Set<String> set1 = new LinkedHashSet<String>();
		
		//TreeSet sorts in natural order
		Set<String> set1 = new TreeSet<String>();
		
		if(set1.isEmpty()) {
			System.out.println("Set is empty");
		}
		
		set1.add("dog");
		set1.add("cat");
		set1.add("mouse");
		set1.add("snake");
		set1.add("bear");
		
		//Adding duplicate items does nothing unlike lists
		set1.add("mouse");
		
		System.out.println(set1);
		
		
		//// Iteration
		
		/*for(int i=0; i < set1.size(); i++) {
			System.out.println(set1);
		}*/
		
		for(String element: set1) {
			System.out.println(element);
		}
		
		///Does set contain a given item (they are optimised for this)
		
		if(set1.contains("aardvark")) {
			System.out.println("Contains aarvark");
		}
		
		if(set1.contains("cat")) {
			System.out.println("Contains cat");
		}
		
		if(set1.isEmpty()) {
			System.out.println("Set is empty");
		}
		
		// set2 contains some common elements with set1 and some new
		
		Set<String> set2 = new TreeSet<String>();

		set2.add("dog");
		set2.add("cat");
		set2.add("giraffe");
		set2.add("monkey");
		set2.add("ant");

		
		/// Intersection
		Set<String> intersection = new HashSet<String>(set1);

		intersection.retainAll(set2);
		
		System.out.println(intersection);
		
		/// Difference
		
		Set<String> difference = new HashSet<String>(set1);
		
		difference.removeAll(set2);
		
		System.out.println(difference);
		
	}

}
