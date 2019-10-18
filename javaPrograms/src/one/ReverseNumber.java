package one;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number1 = 123;
		int number =number1;
		int temp = 0;
		int revNum = 0;

		while (number != 0) {
			 revNum = number % 10;
			System.out.println("pre:  " + revNum);
			revNum = revNum + temp * 10;
			temp = revNum;
			System.out.println("temp : " + temp);
			int remainder = number / 10;
			number = remainder;
			System.out.println("number : " + number);
			
		}
		System.out.println("Reverse of "+number1+" is "+revNum);

	}

}
