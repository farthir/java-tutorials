//Lambda

//Functional interface (function with single method)
interface Executable {
	int execute(int a, int b);
}

interface StringExecutable {
	int execute(String a);
}

class Runner {
	public void run(Executable e) {
		System.out.println("Executing code block ...");
		int value = e.execute(12, 13);

		System.out.println("Return value is: " + value);
	}

	public void run(StringExecutable e) {
		System.out.println("Executing code block ...");
		int value = e.execute("Hello");

		System.out.println("Return value is: " + value);
	}
}

// () -> System.out.println("Hello there.")

/*
 * () -> { System.out.println("This is code passed in a lambda expression.");
 * System.out.println("Hello there."); });
 */

/*
 * System.out.println("This is code passed in a lambda expression.");
 * System.out.println("Hello there."); return 8;
 * 
 */

/*
 * () -> { return 8; })
 */

// () -> 8);

// (int a) -> 8)

/*
 * (int a) -> { return 8 + a; })
 */

// (a) -> 8

/*
 * (a) -> { return 8 + a; }) Don't always need to specify type. Unless there are
 * two methods with different argument types
 */

// runner.run( a -> 8); Most minimal expression if no ambiguity in type or
// number of parameters

public class App {
	public static void main(String[] args) {

		final int c = 100; // final not required for java 8+
		// c = 8; musn't do this with final

		int d = 77;

		Runner runner = new Runner();

		// Old method
		// a lot of text just to execute the sysout "Hello there"
		runner.run(new Executable() {
			public int execute(int a, int b) {
				System.out.println("Hello there.");
				// int d = 10; can do this in methods of anonymous classes
				return a + b + c; // can use local variables here as long as
									// declared final
			}
		});

		// New Method
		System.out.println("===================");

		runner.run((int a, int b) -> {
			return a + b + c;
			// int d = 99; in lambda expression here can't do this as it's not a
			// new scope
		});

		runner.run((a, b) -> 8);

		Executable ex = (int a, int b) -> {
			return a + b + c;
			// int d = 99; in lambda expression here can't do this as it's not a
			// new scope
		};

		runner.run(ex);
		
		Object codeBlock = (Executable)(int a, int b) -> {
			return a + b + c;
			// int d = 99; in lambda expression here can't do this as it's not a
			// new scope
		};
		
		runner.run(ex);

	}
}
