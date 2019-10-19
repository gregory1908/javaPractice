package one;

public class Fibonacci1 {

	public static void main(String args[]) {
		//int number = new Scanner(System.in).nextInt();
		for (int i = 0; i <=5 ; i++) {
			System.out.println(fibonacci(i) + " ");
		}
	}

	public static int fibonacci(int number) {
		if (number == 1 || number == 2)
		{
			return 1;
		}
		else

		return fibonacci(number - 1) + fibonacci(number - 2);
	}

}
