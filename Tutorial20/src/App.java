
public class App {
	public static void main(String[] args) {
		String info = "";
		// inefficient
		info += "My name is Bob.";
		info += " ";
		info += "I am a builder.";
		
		System.out.println(info);
		
		// More efficient. Use StringBuffer for thread safe code (less efficient)
		StringBuilder sb = new StringBuilder("");
		
		sb.append("My name is Sue.");
		sb.append(" ");
		sb.append("I am a lion tamer.");
		
		System.out.println(sb.toString());
		
		StringBuilder s = new StringBuilder();
		
		
		s.append("My name is Roger.")
		.append(" ")
		.append("I am a skydiver.");
		
		System.out.println(s.toString());
		
		//// Formatting ///////////
		
		//print does not print a new line.
		System.out.println("Here is some text.\tThat was a tab.\nThat was a new line.");
		System.out.println("More text.");
		
		System.out.printf("Total cost %-10d; quantity is %d\n", 5, 120);
		System.out.println();
		
		for (int i=0; i < 20; i++){
			System.out.printf("%2d: %s\n", i, "some text here.");
		}
		
		System.out.printf("Total value: %.2f\n", 5.687);
		System.out.printf("Total value: %6.1f\n", 336.383373);
	}
}
