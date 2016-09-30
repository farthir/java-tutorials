import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		int var = 0;
		Scanner input = new Scanner(System.in);
		
		while(var!=5) {
			System.out.println("Enter the value 5");
			if(input.hasNextInt()){
				var = input.nextInt();
			} else {
				System.out.println("Invalid input detected, please try again.");
				input.nextLine();
			}
			
			
			
		}
		System.out.println("Got it! " + var);
		
	}
}
