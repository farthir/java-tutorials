import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//try with resources in Java 7 to simplify error handling.

public class App2 {

	public static void main(String[] args) {
		File file = new File("test.txt");
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))) { // file closed as well as using try with resources
			String line;

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Can't find file: " + file.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Can't read file: " + file.toString());
		}
		
		
		
	}

}
