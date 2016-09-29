
public class Car extends Machine {
	
	
	public void start() {
		System.out.println("Car started.");
	}
	
	
	
	@Override
	public void stop() {
		System.out.println("Car stopped");
	}



	public void wipeWindSheild() {
		System.out.println("Wiping windsheild");
	}
	
	public void showInfo(){
		System.out.println("Car name: " + name);
	}
	
	
}
