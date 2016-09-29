import java.util.ArrayList;

class Machine {

	@Override
	public String toString() {
		return "I am a machine";
	}
	
	public void start() {
		System.out.println("Machine starting");
	}
	
	
}

class Camera extends Machine {
	@Override
	public String toString() {
		return "I am a camera";
	}
	
	public void snap() {
		System.out.println("snap");
	}
	
}
public class App {

	public static void main(String[] args) {
	
		ArrayList<Machine> list1 = new ArrayList<Machine>();
		
		list1.add(new Machine());
		list1.add(new Machine());
		showList(list1);
		showList2(list1);
		showList3(list1);
		
		ArrayList<Camera> list2 = new ArrayList<Camera>();
		
		// cannot just pass array list of cameras as method only accepts machines. Must use wildcard ? in method and treat as parent type Object or use upper bound "extends". See below
		list2.add(new Camera());
		list2.add(new Camera());
		showList(list2);
		showList2(list2);
		showList3(list2);
	}
	
	//open wildcard ArrayList<?>
	//add upper bound to only accept machine objects and child objects
	public static void showList(ArrayList<? extends Machine> list) {
		for(Machine value: list) { //if using object, can't call camera or machine specific methods
			//however we can downcast object to Camera objects to use methods.
			System.out.println(value);
			value.start();
			//can only call Machine methods
			//value.snap();
		}
	
	}
	
	// lower bound wildcard. must be camera objects or superclass of camera
	public static void showList2(ArrayList<? super Camera> list) {
		for(Object value: list) { // must again treat as objects as camera supertype might not have methods
			System.out.println(value);
			//value.start(); as Object type, cant call methods on class. Can use downcasting. Or getclass/instance of.
		}
	
	}
	
	// standard wildcard
	public static void showList3(ArrayList<?> list) {
		for(Object value: list) { //must treat as supertype Object
			System.out.println(value);
			//value.start(); as Object type, cant call methods on class. Can use downcasting. Or getclass/instance of.
		}
	
	}

}
