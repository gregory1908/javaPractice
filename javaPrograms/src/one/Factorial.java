package one;

public class Factorial {

	public static void main(String[] args) {
		// 5! = 5 * 4 * 3 * 2 * 1

		int number = 6;

		for (int i = (number - 1); i >= 1; i--) {
			int number1 = number * i;
			number = number1;
		}
		System.out.println(number);

	}

}
