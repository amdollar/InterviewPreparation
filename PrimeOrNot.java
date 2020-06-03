package io.test.InterviewPreparation;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		System.out.println(primeOrNot(num));
		s.close();

	}

	private static boolean primeOrNot(int num) {
		if (num % 2 == 0)
			return true;
		for (int i = 1; i < num / 2; i++) {
			if (num / i == 0)
				return true;
			else
				return false;
		}
		return false;

	}

}
