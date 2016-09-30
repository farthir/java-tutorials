import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int num = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Enter an integer: ");
			num = sc.nextInt();
		} while (num < 11);

		System.out.println("Integer greater than 10 detected!");
	}

}
