package world;


// only visible within this file
class Something {
	
}

// visible outside this file
public class Plant {
	// Bad practice
	public String name;
	
	// Acceptable practice
	public final static int ID = 8;
	
	private String type;
	
	protected String size;
	
	int height;
	
	public Plant() {
		name = "Freddy";
		
		type = "plant";
		this.size = "medium";
		
		this.height = 8;
	}
}
