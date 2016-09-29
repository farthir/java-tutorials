import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		File file = new File("test.txt");
		
		try(BufferedWriter br = new BufferedWriter(new FileWriter(file))) { // file closed as well as using try with resources
			br.write("this is line one");
			br.newLine();
			br.write("This is line two");
			br.newLine();
			br.write("Last line.");
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Can't read file: " + file.toString());
		}

	}

}
