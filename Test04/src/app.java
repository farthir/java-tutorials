/*
 * Modify the above program so that it uses a for loop to display all the values in the array, all on the same line, each value formatted to two decimal places and followed by a space. 
 */
/*public class app {
	public static void main(String[] args) {
		final float[] NUMBERS = { 1.5f, 6.033f, 10.22f, 3.63f, 2.9f };

		for (float number: NUMBERS) {
			System.out.printf("%.2f ", number);
		}

	}
}*/

public class app {
	public static void main(String[] args) {
		final float[] NUMBERS = { 1.5f, 6.033f, 10.22f, 3.63f, 2.9f };

		for (int i=0; i<5; i++) {
			System.out.printf("%.2f ", NUMBERS[i]);
		}

	}
}