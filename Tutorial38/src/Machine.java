
public abstract class Machine { // abstract prevents creation of Machine objects from class directly
	private int id;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	//abstract methods
	//don't confuse with interfaces
	//interfaces can be used for multiple classes. e.g. car implements showInfo, person implements showInfo
	//but abstract methods are saying the child classes extend the machine - e.g. car is a machine, but person is not a machine
	//extends is stronger than implements
	//child can implement many interfaces but can only extend one abstract class
	//in an interface, we leave implementation completely to the child class but with abstract parent, we can define methods
	//interface defines form of methods, not the implementation
	public abstract void start();
	public abstract void doStuff();
	public abstract void shutdown();
	
	public void run() {
		start();
		doStuff();
		shutdown();
	}
}
