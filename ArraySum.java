package io.test.InterviewPreparation;

public class ArraySum {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 1, 2, 4, 5, 12, 7, 6 };
		int sum = 12;
		printCombination(arr, sum);
	}

	private static void printCombination(int[] nums, int sum) {
		int[] arr = new int[sum];
		findCombinationsUtil(arr, 0, sum, sum);

	}

	private static void findCombinationsUtil(int[] arr, int index, int num, int reducedNum) {
		if (reducedNum < 0) {
			return;
		}
		if (reducedNum == 0) {
			for (int i = 0; i < index; i++) {
				System.out.print(arr[i] + ",");
			}
			System.out.println("");
			return;
		}

		int previous = (index == 0) ? 1 : arr[index - 1];

		for (int j = previous; j <= num; j++) {
			arr[index] = j;
			findCombinationsUtil(arr, index + 1, num, reducedNum - j);
		}

	}

	private static void printArr(int[] res) {
		for (int i : res) {
			System.out.print(i);
		}
	}

}
