
public class App {
	public static void main(String[] args) {
		
		Robot robot = new Robot(7);
		robot.start();
		
		Robot.Brain2 brain = robot.new Brain2();
		brain.think();
		
		Robot.Battery battery = new Robot.Battery();
		battery.charge();
	}
}
