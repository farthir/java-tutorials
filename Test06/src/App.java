
public class App {

	public static void main(String[] args) {
		
		String[][] stringArray = {
				{"F1", "F2", "F3"},
				{"B1", "B2", "B3"}
		};
		
		for (int i=0; i<2; i++) {
			for (int j=0; j<3; j++) {
				System.out.print(stringArray[i][j] + " ");
			}
			System.out.println();
		}
		
		//System.out.println(stringArray[1][2]);

	}

}
