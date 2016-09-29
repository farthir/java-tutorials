import java.io.Serializable;

public class Person implements Serializable {

	//id for class. Read must match written class
	//can update this ID to say that the class has changed to much to be read by old versions
	private static final long serialVersionUID = 4801633306273802062L;
	private transient int id; // don't want to serialise id
	private String name;
	
	private static int count; //as count is static (on class not each object, doesn't make sense to serialise
	
	public Person() {
		System.out.println("Default constructor");
	}
	
	public Person(int id, String name)
	{
		this.id = id;
		this.name = name;
		
		System.out.println("Two argument constructor");
	}
	
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Person.count = count;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]  Count is: " + count;
	}



}
