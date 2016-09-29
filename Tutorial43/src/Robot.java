
public class Robot {
	private int id;
	
	//can declare classes within a class. non-static inner classes/nested classes
	//has access to instance data of Robot class
	private class Brain {
		public void think() {
			System.out.println("Robot " + id + " is thinking.");
		}
	}
	//can be used outside class
	public class Brain2 {
		public void think() {
			System.out.println("Robot " + id + " is thinking2.");
		}
	}
	
	//static inner class usually used to group classes together. Want a normal class that isn't associated with instances or outer class but you want to group it with outer class.
	public static class Battery {
		public void charge() {
			System.out.println("Battery charging.");
		}
	}
	
	public Robot(int id) {
		this.id = id;
	}
	
	public void start() {
		System.out.println("Starting robot: " + id);
		
		//usually you have a method that returns an instance of the inner class within the class, also possible to access outside, see above,
		Brain brain = new Brain();
		brain.think();
		
		final String name = "Rob"; // must be final
		
		//can even declare classes within methods
		//Could use anonymous class
		//scope is only in this method so public/private is irrelevant
		class Temp {
			public void doSomething() { //can only refer to local data in method if it's final but can refer to instance data
				System.out.println("Id is: " + id);
				System.out.println("My name is " + name);
			}
		}
		
		Temp temp = new Temp();
		temp.doSomething();
	}
}
