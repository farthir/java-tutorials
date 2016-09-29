import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObject {
	public static void main(String[] args) {
		System.out.println("Writing objects...");


		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("people.bin"))) { //auto closes ObjectOutputStream

			Person person = new Person(7, "Bob");
			Person.setCount(88); //Person not person as we're accessing class not a specific object
			os.writeObject(person);


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
