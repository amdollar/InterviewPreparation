package io.test.InterviewPreparation;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they
 * add up to a specific target.
 * 
 */
public class TwoSums {

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 7, 11, 15 };
		int res[] = twoSum(arr, 9);
		for (int i : res)
			System.out.println(i + " ");
	}

	public static int[] twoSum(int[] nums, int target) {

		Map<Integer, Integer> data = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];

			if (data.containsKey(complement)) {
				return new int[] { data.get(complement), i };
			}
			data.put(nums[i], i);

		}
		
		throw new IllegalArgumentException("Not found");

	}
}
