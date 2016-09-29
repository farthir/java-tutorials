class Machine {
	public void start() {
		System.out.println("Machine started.");
	}
}

class Camera extends Machine {
	//@Override
	public void start() {
		System.out.println("Camera started.");
	}
	
	public void snap() {
		System.out.println("Photo taken.");
	}
}

public class App {

	public static void main(String[] args) {
		Machine machine1 = new Machine();
		Camera camera1 = new Camera();
		
		machine1.start();
		camera1.start();
		camera1.snap();
		
		// Upcasting (gone up class hierarchy) - safe guaranteed by polymorphism
		Machine machine2 = camera1;
		//refers to camera methods as machine2 is just a reference to camera1 object which is a camera object
		machine2.start();
		
		//the variable machine2 of Machine type defines which methods can be called. Snap is a Camera method.
		//machine2.snap();
		
		// Downcasting
		Machine machine3 = new Camera();
		//need to add cast type to confirm as downcasting inherently unsafe
		Camera camera2 = (Camera)machine3;
		
		camera2.snap();
		camera2.start();
		
		// actual object is a machine so this is bad! Only see problem at runtime
		Machine machine4 = new Machine();
		//Camera camera3 = (Camera)machine4;
		//camera3.start();
		//camera3.snap();
		
	
	}
}
