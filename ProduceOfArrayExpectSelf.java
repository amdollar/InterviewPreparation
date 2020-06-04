package io.test.InterviewPreparation;

/**
 * Given an array nums of n integers where n > 1, return an array output such
 * that output[i] is equal to the product of all the elements of nums except
 * nums[i].
 * 
 *
 */
public class ProduceOfArrayExpectSelf {

	public static void main(String[] args) {
		int[] data = new int[] { 1, 0 };
		for (int i : data) {
			System.out.print(i + " ");
		}
		System.out.println();
		data = productExceptSelf(data);
		for (int i : data) {
			System.out.print(i + " ");
		}
	}

	public static int[] productExceptSelf(int[] nums) {
		int[] result = new int[nums.length];
		for (int i = 0; i < result.length; i++)
			result[i] = 1;
		int left = 1, right = 1;
		for (int i = 0, j = nums.length - 1; i < nums.length - 1; i++, j--) {
			left *= nums[i];
			right *= nums[j];
			result[i + 1] *= left;
			result[j - 1] *= right;
		}
		return result;
//		int product = 1;
//
//		for (int i : nums) {
//			product *= i;
//		}
//		for (int i = 0; i < nums.length; i++) {
//			if (product > 1)
//				nums[i] = product / nums[i];
//		}
//
//		return nums;
	}
}
