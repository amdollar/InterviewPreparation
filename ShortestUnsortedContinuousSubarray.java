package io.test.InterviewPreparation;

public class ShortestUnsortedContinuousSubarray {

	public static void main(String[] args) {
		int[] arr = new int[] { 2,1 };
		System.out.println(findUnsortedSubarray(arr));
	}

	public static int findUnsortedSubarray(int[] nums) {
		int result = 0;
		int firstIndex = Integer.MAX_VALUE;
		int lastIndex = 0;

		int len = nums.length - 1;
		for (int i = 0; i <= len; i++) {
			for (int j = i + 1; j <= len; j++) {
				if (nums[i] > nums[j]) {
					firstIndex = Math.min(i, firstIndex);
					int temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;
					lastIndex = j;
				}
			}
		}
		if (firstIndex < nums.length)
			result = (lastIndex + 1) - firstIndex;
		else
			result = 0;

		return result;
	}
}
