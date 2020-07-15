package io.test.InterviewPreparation;

/**
 * Write a program to test whether two numbers are having same sign or not.
 * 
 * @author appstekadmin
 *
 */

public class CheckSign {

	public static void main(String[] args) {
		int number1 = 90;
		int number2 = -23;
		System.out.println(sameOrNot(number1, number2));

	}

	private static boolean sameOrNot(int number1, int number2) {
		int leastBit = (number1 ^ number2) >> 31; // left shifting the OR of these to numbers to 31 times to get MST bit 1|0 = 1 or 0|1 = 1
		System.out.println(leastBit);
		if (leastBit < 1) // if MSB is 1 or greater than 0 then numbers are having diff signs.
			return false;
		else
			return true;

	}

}
