
public class App {

	//checked vs runtime exceptions
	
	public static void main(String[] args) {
		
		int value = 7;
		String text = null;
		
		String[] texts = {"one", "two", "three"};
		
		//Runtime exceptions
		
		//value = value/0;
		//System.out.println(text.length());
		//System.out.println(texts[3]);
		
		//can catch runtime exceptions but generally don't as they should probably be fixed
		try {
		System.out.println(texts[3]);
		}
		catch(RuntimeException e) {
			System.out.println(e.toString());
		}
	}

}
