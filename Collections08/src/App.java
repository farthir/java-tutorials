import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Person implements Comparable<Person> {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
	@Override
	public int compareTo(Person person) {
		int len1 = name.length();
		int len2 = person.name.length();
		
		if(len1 > len2) {
			return 1;
		}
		else if(len1 < len2) {
			return -1;
		}
		else {
			return name.compareTo(person.name); // only returns zero if the actual name is equal (dedup). Otherwise puts them in alphabetical order
		}
	}
	
	//must not have a conflict between the equal and compareTo methods above otherwise strange behaviour results
}

//natural ordering
public class App {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		
		Set<Person> set = new TreeSet<Person>(); //TreeSet is a SortedSet

		addElements(list);
		addElements(set);
		
		Collections.sort(list); // strings have a natural order defined so we don't need to define ordering as in previous tutorial
		
		showElements(list);
		System.out.println();
		showElements(set);

	}
	
	private static void addElements(Collection<Person> col){ //Collection is a superset of set and list
		col.add(new Person("Joe"));
		col.add(new Person("Sue"));
		col.add(new Person("Juliet"));
		col.add(new Person("Clare"));
		col.add(new Person("Mike"));
	}
	
	private static void showElements(Collection<Person> col){ //Collection is a superset of set and list
		for(Person element: col) {
			System.out.println(element);
		}
	}

}