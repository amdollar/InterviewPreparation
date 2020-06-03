package io.test.InterviewPreparation;

public class RearrangeToPalindrome {

	public static void main(String[] args) {
		String strToCheck = new String("abbcaa");
		System.out.println(canBeArranged(strToCheck));
	}

	private static boolean canBeArranged(String strToCheck) {
		if (strToCheck.length() == 1)
			return true;
		int count = 0;
		boolean flag = true;
		int[] occr = new int[26];
		for (char ch : strToCheck.toCharArray()) {
			occr[ch - 'a']++;
		}
		for (int fre : occr) {
			if (fre % 2 == 1) {
				count++;
			}
		}
		if (count > 1) {
			flag = false;
		}
		return flag;
	}

}
