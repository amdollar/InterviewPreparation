package io.test.InterviewPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MissingNumbersUpdated {

	public static void main(String[] args) {

		int[] arr = new int[] { 4, 3, 2, 7, 5, 8, 2, 3, 1 };
		List<Integer> res = findDisappearedNumbers(arr);
		res.forEach(System.out::print);

	}

	public static List<Integer> findDisappearedNumbers(int[] nums) {
		int lastNum = nums.length;
		List<Integer> results = new ArrayList<Integer>();
		Set<Integer> set = new HashSet<Integer>();
		for (int i : nums) {
			set.add(i);
		}

		for (int i = 1; i <= lastNum; i++) {
			if (set.contains(i)) {
				continue;
			} else {
				results.add(i);
			}

		}

		return results;
	}

}
