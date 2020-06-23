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
		int leastBit = (number1 ^ number2) >> 31;
		System.out.println(leastBit);
		if (leastBit < 1)
			return false;
		else
			return true;

	}

}
