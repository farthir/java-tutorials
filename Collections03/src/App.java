import java.util.HashMap;
import java.util.Map;

//Hashmap, key value pairs
public class App {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>(); //can use any object type for keys and values but if custom for keys, must create method overrides
		//HashMap is NOT sorted, does not maintain order
		map.put(5, "Five");
		map.put(8, "Eight");
		map.put(6, "Six");
		map.put(4, "Four");
		map.put(2, "Two");
		
		map.put(6, "Hello"); //second put will overwrite if key same
		
		String text = map.get(6);
		String text2 = map.get(98); //null
		
		System.out.println(text);
		System.out.println(text2);
		
		for(Map.Entry<Integer, String> entry: map.entrySet()) { //essentially a foreach over the hash table
			int key = entry.getKey();
			
			String value = entry.getValue();
			
			System.out.println(key + ": " + value);
		}
		
		
	}

}
