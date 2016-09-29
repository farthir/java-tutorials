//recursion
//tends to be easier than a general loop
//just reuse the same method that solves the second to last step
public class App {

	public static void main(String[] args) {
		//int value = 4;
		//factorial(4);
		//System.out.println(value);
		
		//e.g. 4! = 4*3*2*1 (factorial)
		System.out.println(factorial(9));
	}
	private static int factorial(int value) {
		//value = value - 1;
		
		System.out.println(value);
		
		//calculate(value); infinite loop. 
		
		if (value == 1) {
			return 1;
		}
		return factorial(value - 1) * value;
	}
}
