package one;

public class LeapYear {

	public static void main(String[] args) {

		int year = 1900;

		// for (year = 1800; year < 2010; year++) {

		if (((year % 4) == 0) && year % 100 == 0 && year % 400 == 0) {
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " is NOT a leap year");
			// }
		}
	}

}
