import java.util.Scanner;

/*
 * Create a program that asks the user to enter an integer. 
 * If the integer is less than 10, print the message "This number is too small". 
 * If the integer is greater than or equal to 10, print "This number is big enough". 
 */
public class App {
	public static void main(String[] args) {
		
		// create a new scanner object from the scanner class
		
		
		System.out.println("Input a value greater than 10.");
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		
		if(num < 10) {
			System.out.println("The number " + num + " is too small.");
		}
		else if(num >=10 ) {
			System.out.println("The number " + num + " is big enough.");
		}
		
		
		scan.close();

		
		
	}
}
