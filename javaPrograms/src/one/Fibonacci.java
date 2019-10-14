package one;

public class Fibonacci {
	static int counter = 0;
	static int count = 5;

	public static void main(String[] args) {

		// Fibonacci series - 0 1 1 2 3 5

		int a = 0, b = 1, c;

		System.out.print(a + " " + b + " ");

		for (int i = 0; i < 6; i++) {

			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;

		}

		System.err.println(" ");

		addTwo(0, 1);
	}

	public static void addTwo(int num1, int num2) {
		if (counter == 0) {
			System.out.println(num1 + "\n" + num2);
		}
		int result = num1 + num2;
		System.out.println(result);
		counter++;
		if (counter < count) {
			addTwo(num2, result);
		}

	}
}
