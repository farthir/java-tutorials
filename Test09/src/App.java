import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer");

		int integer = sc.nextInt();

		switch (integer) {
		case 1:
			System.out.println("Got 1");
			break;
		case 66:
			System.out.println("Got 66");
			break;
		default:
			System.out.println("Got something else.");
		}

	}

}
