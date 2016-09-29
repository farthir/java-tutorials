import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class App {

	// usually use classes for data-structure
	public static String[] vehicles = { "ambulance", "helicopter", "lifeboat" };

	public static String[][] drivers = { { "Fred", "Sue", "Pete" }, { "Sue", "Richard", "Bob", "Fred" },
			{ "Pete", "Mary", "Bob" }, };

	public static void main(String[] args) {

		Map<String, Set<String>> personnel = new HashMap<>(); // can omit type
																// in HashMap in
																// Java 7

		for (int i = 0; i < vehicles.length; i++) {
			String vehicle = vehicles[i];
			String[] driversList = drivers[i];

			Set<String> driverSet = new LinkedHashSet<String>();

			for (String driver : driversList) {
				driverSet.add(driver);
			}

			personnel.put(vehicle, driverSet);

		}
		{ //Brackets just to scope driversList variable so can use again later
		//Example usage
		Set<String> driversList = personnel.get("helicopter");

		try {
			for (String driver : driversList) {
				System.out.println(driver);
			}
		} catch (NullPointerException e) {
			System.out.println("Searched value does not exist in driversList!");
		}
		
		}
		//Iterate through whole thing
		System.out.println();
		for(String vehicle: personnel.keySet()) {
			Set<String> driversList = personnel.get(vehicle);
			
			System.out.println(vehicle);
			
			for (String driver: driversList) {
				
				System.out.println(driver);
			}
			System.out.println();
		}

	}

}
