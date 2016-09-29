import java.util.Scanner;

public class app {
public static void main(String[] args) {
	
	// Create scanner object
	Scanner input = new Scanner(System.in);
	
	// Output the prompt
	System.out.println("Enter an integer: ");
	
	// Wait for the user to enter a line of text
	//String line = input.nextLine();
	
	if (input.hasNextInt()) {
		int value = input.nextInt();
		// Tell them what they entered
		System.out.println("You entered: " + value);
	}
	else {
		System.out.println("No integer specified");
	}

}
}
