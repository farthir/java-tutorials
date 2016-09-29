import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//sorted maps
public class App {

	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>(); //link connecting entries
		Map<Integer, String> treeMap = new TreeMap<Integer, String>(); //link connecting entries
		
		testMap(hashMap); //no guaranteed order to HashMap type
		
		testMap(linkedHashMap); //maintains order that they are inserted in
		
		testMap(treeMap); //sorts keys in natural order (guaranteed)
		
	}
	
	public static void testMap(Map<Integer, String> map) { //Map interface
		map.put(9, "fox");
		map.put(4, "cat");
		map.put(8, "dog");
		map.put(1, "giraffe");
		map.put(0, "swan");
		map.put(15, "bear");
		map.put(6, "snake");
		
		/*for(Map.Entry<Integer, String> entry: map.EntrySet()) {
			
		}*/
		
		for(Integer key: map.keySet()) {
			String value = map.get(key);
			
			System.out.println(key + ": " + value);
		}
	}

}
