
public enum Animal {
	CAT("Fergus"), DOG("Fido"), MOUSE("Jerry"); //enum constants - not strings
	
	//can give constructors and methods
	
	//constructor cannot be public
	//expects name so must instantiate with name above
	
	private String name;
	
	Animal(String name){
		this.name = name;
		
	}

	public String getName() {
		return name;
	}
	//can override toStrings in enums as well
	public String toString() {
		return "This animal is called: " + name;
	}

}
