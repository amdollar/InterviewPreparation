package io.test.InterviewPreparation;

/**
 * 
 * Given a non-empty array of integers, every element appears twice except for
 * one. Find that single one.
 *
 */
public class SingleNumber {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 1 };
		System.out.println(singleNumber(arr));

	}

	/**
	 * Xor all the elements of the array it will cancel all duplicate numbers and
	 * result will left with only unique number.
	 */

	public static int singleNumber(int[] nums) {
		int num = 0;

		for (int i : nums) {
			num ^= i;
		}
		return num;
	}

}
