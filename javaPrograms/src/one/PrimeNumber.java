package one;

public class PrimeNumber {

	public static void main(String[] args) {

		// 7 is prime, since its divisible by 1 or itself

		int number = 15;

		int counter = 0;

		int number1 = (number / 2) + 1;

		System.out.println(number1);

		for (int i = 1; i < number1; i++) {
			if (number % i == 0)
				counter++;
		}

		if (counter >= 1) {
			System.out.println(number + "  is NOT PRIME");
		} else {
			System.out.println(number + "  is PRIME");
		}
	}

}
