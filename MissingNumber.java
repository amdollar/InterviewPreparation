package io.test.InterviewPreparation;

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr = new int[] { 9, 6, 4, 2, 3, 5, 7, 0, 1 };

		System.out.println(missingNumber(arr));

	}

	public static int missingNumber(int[] nums) {
		int actualsum = sumOfN(nums.length);

		int sum = 0;
		for (int i : nums) {
			sum += i;
		}

		return actualsum - sum;

	}

	private static int sumOfN(int n) {
		return n * (n + 1) / 2;
	}

}
