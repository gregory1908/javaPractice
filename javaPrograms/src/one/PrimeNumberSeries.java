package one;

public class PrimeNumberSeries {

	public static void main(String[] args) {

		for (int number = 1; number <= 100; number++) {
			System.out.println(number);

			for (int i = number; i >= 1; i--) {
				System.out.println();
				System.out.print(i);
			}
		}

	}

}
