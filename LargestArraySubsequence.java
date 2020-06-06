package io.test.InterviewPreparation;

public class LargestArraySubsequence {

	public static void main(String[] args) {
		int arr[] = new int[] { -2, -3, 4, -1, -2, 1, 5, -3 };
		System.out.println(largestArrSub(arr));
	}

	private static int largestArrSub(int[] arr) {
		int maxSum = 0;
		int maxCurrentSum = 0;
		for (int i : arr) {
			maxCurrentSum += i;

			if (maxCurrentSum < 0) {
				maxCurrentSum = 0;
			}
			if (maxSum < maxCurrentSum) {
				maxSum = maxCurrentSum;
			}
		}

		return maxSum;
	}
}
