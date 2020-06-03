package io.test.InterviewPreparation;

/**
 * Write a program to find the numbers of times first string can be formed using
 * second string.
 */
public class StringTwoInOne {

	public static void main(String[] args) {
		String str = new String("geeksforgeefks");
		String pattern = new String("geefs");
		System.out.println("\nTotal number of occorances: " + countTimes(str, pattern));
	}

	private static int countTimes(String str, String pattern) {
		int occrs = Integer.MAX_VALUE;
		int[] strOccr = new int[26];
		int[] pattrnOccr = new int[26];
		for (char ch : str.toCharArray()) {
			strOccr[ch - 'a']++;
		}

		for (int a : strOccr) {
			System.out.print(a + ",");
		}

		for (char c : pattern.toCharArray()) {
			pattrnOccr[c - 'a']++;
		}

		for (char c : pattern.toCharArray()) {
			int count = strOccr[c - 'a'] / pattrnOccr[c - 'a'];
			if (count <= 0)
				return 0;
			occrs = Math.min(count, occrs);
		}

		System.out.print("\n");
		for (int a : strOccr) {
			System.out.print(a + ",");
		}

		return occrs;
	}

}
