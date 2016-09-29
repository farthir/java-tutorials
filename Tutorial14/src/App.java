
class Person {
	// Instance variables (data/state)
	String name;
	int age;
	
	// Subroutines/methods
	void speak () {
		for(int i=0; i<3; i++){
			System.out.println("My name is " + name + " and I am " + age + " years old.");
		}
		
	}
	
	void sayHello() {
		System.out.println("Hello there");
	}
}

public class App {
	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.name = "Joe Bloggs";
		person1.age = 37;
		person1.sayHello();
		person1.speak();
		
		Person person2 = new Person();
		person2.name = "Sarah Smith";
		person2.age = 20;
		person1.sayHello();
		person2.speak();
		
		System.out.println(person2.name + " is " + person2.age + " years old.");
		
	}
}
