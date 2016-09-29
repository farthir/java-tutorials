//enums

//enums immediatly inheret from the Java class Enum
public class App {


	public static void main(String[] args) {
		
		Animal animal = Animal.CAT;
		
		//If using a switch, directly refer to enums
		//enums give type safety as they can only be those defined
		switch(animal) {
		case CAT:
			System.out.println("Cat");
			break;
		case DOG:
			System.out.println("Dog");
			break;
		case MOUSE:
			break;
		default:
			break;

		}
		
		System.out.println(Animal.DOG);
		System.out.println("Enum name as a string: " + Animal.DOG.name());
		
		System.out.println(Animal.DOG.getClass());
		
		System.out.println(Animal.DOG instanceof Enum);
		
		System.out.println(Animal.MOUSE.getName());
		
		Animal animal2 = Animal.valueOf("CAT");
		
		System.out.println(animal2);
	}

}
