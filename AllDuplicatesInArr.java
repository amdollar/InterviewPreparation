package io.test.InterviewPreparation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AllDuplicatesInArr {

	public static void main(String[] args) {
		int arr[] = new int[] { 4, 3, 2, 7, 8, 2, 3, 1 };
		List<Integer> result = findDuplicates(arr);
		result.forEach(System.out::println);

	}

	public static List<Integer> findDuplicates(int[] nums) {

		List<Integer> result = new ArrayList<Integer>();
		Set<Integer> inSet = new HashSet<Integer>();
		for (int i : nums) {
			if (inSet.contains(i)) {
				result.add(i);
			} else {
				inSet.add(i);
			}
		}
		return result;
	}
}
