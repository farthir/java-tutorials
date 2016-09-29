import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

//can have as many main methods as you want in java as long as you pick which one is run
public class ReadObject {

	public static void main(String[] args) {
		System.out.println("Reading objects...");
		
		try(ObjectInputStream os = new ObjectInputStream(new FileInputStream("people.bin")))
		{
			Person person = (Person)os.readObject();
			System.out.println(person);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) { // errors if object is not Person
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
