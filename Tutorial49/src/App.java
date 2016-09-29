
public class App {

	public static void main(String[] args) {
		App app = new App(); //create object so we can use non-static methods of the App class
		
		//===================================
		
		int value = 7;
		System.out.println("1. Value is: " + value);
		app.show(value); //passing by value, we're just making a copy of the value (int)
		System.out.println("4. Value is: " + value);
		
		//===================================
		
		System.out.println();
		Person person = new Person("Bob");
		System.out.println("1. Person is: " + person);
		
		app.show(person); //passing by value but this time it's the reference to the person object
		
		System.out.println("4. Person is: " + person);
	}
	
	public void show(int value) {
		System.out.println("2. Value is: " + value);
		
		value = 8;
		
		System.out.println("3. Value is: " + value);
	}
	
	public void show(Person person) {
		System.out.println("2. Person is: " + person);
		
		person.setName("Sue"); // actually overriding the original object as the current "address" of person is the original
		
		person = new Person("Mike");
		
		//person.setName("Sue"); only changes the object mapped currently to "Mike"
		
		System.out.println("3. Person is: " + person);
	}
	//in c++ it's possible to pass by reference with ampersand &
	//in this instance the second method above would actually change the original person object
	//can't do this in Java
}
