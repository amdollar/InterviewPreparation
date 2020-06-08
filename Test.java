package io.test.InterviewPreparation;

public class Test {
	static String minchar;
	static String maxchar;

	public static void main(String[] args) {
		String str = new String("grass is greener on the other side ");
		printMinAndMax(str);
	}

	private static void printMinAndMax(String str) {
		int min = Integer.MAX_VALUE;
		int max = 0;
		int arr[] = new int[26];
		for (char r : str.toCharArray()) {
			if (r != 32) {
				arr[r - 'a']++;
			}
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				maxchar = String.valueOf((char) (i + 'a'));
			}
			if (min > arr[i] && count < 1) {
				min = arr[i];
				minchar = String.valueOf((char) (i + 'a'));
				count++;
			}

		}

		System.out.println("Max Occoured character : " +maxchar);
		System.out.println("Min Occoured character : " +minchar);

	}
}
