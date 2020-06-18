package io.test.InterviewPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstMissingPositive {

	public static void main(String[] args) {
		int[] nums = new int[] { 7, 8, 9, 11, 12 };
		System.out.println(firstMissingPositive(nums));
	}

	public static int firstMissingPositive(int[] nums) {
		int maxinarr = 0;
		for (int i : nums) {
			if (i > maxinarr)
				maxinarr = i;
		}
		List<Integer> data = new ArrayList<Integer>();
		for (int i : nums) {
			data.add(Integer.valueOf(i));
		}

		for (int i = 1; i < maxinarr; i++) {
			if (!data.contains(i)) {
				return i;
			}

		}
		return maxinarr + 1;
	}
}
