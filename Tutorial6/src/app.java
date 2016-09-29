
public class app {
	public static void main(String[] args) {

		int loop = 0;

		/*if (myInt < 10) {
			System.out.println("true :)");
		} else if (myInt < 20) {
			System.out.println("false :(");
		} else {
			System.out.println("Nope");
		}*/
		
		while(true){
			System.out.printf("loop no %d\n", loop);
			if(loop==19){
				break;
			}
			
			loop++;
			
			System.out.println("Running");

		}
	}
}
