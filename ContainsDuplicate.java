package io.test.InterviewPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Given an array of integers, find if the array contains any duplicates.
 * 
 * Your function should return true if any value appears at least twice in the
 * array, and it should return false if every element is distinct.
 *
 */
public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 1 };
		System.out.println(containsDuplicate(arr));
	}

	public static boolean containsDuplicate(int[] nums) {
//		boolean flag = false;
//		List<Integer> data = Arrays.stream(nums).boxed().collect(Collectors.toList());
//		int lSize = data.size();
//
//		Set<Integer> set = data.stream().collect(Collectors.toSet());
//		int setSize = set.size();
//		if (lSize != setSize) {
//			flag = true;
//		}
//
//		return flag;
		Set<Integer> dataset = new HashSet<>(nums.length);

		for (int i : nums) {
			boolean flag = dataset.add(i);
			if (flag == false)
				return true;
		}
		return false;

	}

}
