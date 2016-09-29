import java.io.Serializable;

public class Person implements Serializable {

	//id for class. Read must match written class
	//can update this ID to say that the class has changed to much to be read by old versions
	private static final long serialVersionUID = 4801633306273802062L;
	private int id;
	private String name;
	
	public Person(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
}
