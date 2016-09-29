import java.util.ArrayList;
import java.util.HashMap;

class Animal{
	
}

public class App {

	public static void main(String[] args) {
		
		/////// before java 5
		ArrayList list = new ArrayList();
		
		list.add("apple");
		list.add("banana");
		list.add("orange");
		
		// have to downcast
		String fruit = (String)list.get(1);
		System.out.println(fruit);
		
		/////// java 5 and up. Specify type in generic class
		ArrayList<String> strings = new ArrayList<String>();
		
		strings.add("cat");
		strings.add("dog");
		strings.add("cow");
		
		String animal = strings.get(1);
		System.out.println(animal);
		
		/////// there can be more than one type argument
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		////// Java 7 style. Type inferred for new object
		
		ArrayList<Animal> someList = new ArrayList<>(); 
	}
}
