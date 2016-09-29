import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//file reader - old way of reading files
public class App {

	public static void main(String[] args) {
		File file = new File("text.txt");

		BufferedReader br = null;

		try {
			FileReader fr = new FileReader(file);

			// buffer file

			br = new BufferedReader(fr);

			String line;

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found: " + file.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to read file: " + file.toString());
		}

		finally { // will always be executed even with exceptions
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Unable to close file.");
			} catch (NullPointerException ex) {
				// File was probably never opened!
			}
		}

	}

}
