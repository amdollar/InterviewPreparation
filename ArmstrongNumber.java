package io.test.InterviewPreparation;

import java.util.Scanner;

/**
 * A number is an Armstrong number if it's digital cube's sum is equal to the
 * number.
 */
public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Integer in = scn.nextInt();
		System.out.println(isArmstrong(in));
		scn.close();
	}

	private static boolean isArmstrong(Integer in) {
		boolean flag = false;
		int temp = in;
		int cubeSum = 0;
		int order = order(in);
		int modTemp = 1;
		while (in > 0) {
			int mod = in % 10;
			for (int i = 1; i <= order; i++) {
				modTemp *= mod;
			}
			cubeSum += modTemp;
			in = in / 10;
			modTemp = 1;
		}
		if (temp == cubeSum)
			flag = true;
		return flag;
	}

	private static int order(int number) {
		int order = 0;
		while (number > 0) {
			order++;
			number = number / 10;
		}

		return order;
	}

}
