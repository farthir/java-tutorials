import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		//String fileName = "/Users/rfarthing/Documents/workspace/Tutorial33/src/Example.txt";
		String fileName = "Example.txt";

		File textFile = new File(fileName);
		
		Scanner in = new Scanner(textFile);
		
		int count = 2;
		int value = in.nextInt(); //don't forget end of line character which isn't read here!
		System.out.println("Read value: " + value);
		
		in.nextLine(); // read new line on integer
		
		while(in.hasNextLine()) {
			String line = in.nextLine();
			
			System.out.println(count + ": " + line);
			count++;
		}
		
		in.close();
		
		/*try {
			Scanner in = new Scanner(textFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}*/
		
	}

}
