package io.test.InterviewPreparation;

import java.util.Scanner;

public class IntegerPalindrome {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Integer in = scn.nextInt();
		System.out.println(isPalindrome(in));
		scn.close();
	}

	private static boolean isPalindrome(Integer in) {
		boolean flag = false;
		int reverseNum = 0;
		int incopy = in;
		while (in > 0) {
			int mod = in % 10;
			reverseNum = (reverseNum * 10) + mod;
			in = in / 10;
		}
		if (reverseNum == incopy)
			flag = true;

		return flag;

	}

}
