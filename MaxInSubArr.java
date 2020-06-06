package io.test.InterviewPreparation;

import java.util.Arrays;

/**
 * return the values of maximum element in the sub-array of given size k
 *
 */
public class MaxInSubArr {

	public static void main(String[] args) {
		int[] ar = new int[] { 12, 32, 12, 1, 22, 8 };// []
		int k = 3;
		for (int i : ar) {
			System.out.print(i + " ");
		}
		System.out.println();
		int[] res = maxEleInArr(ar, k);
		for (int i : res) {
			System.out.print(i + " ");
		}
	}

	private static int[] maxEleInArr(int[] ar, int size) {// 32,32,22,22
//		Arrays.sort(ar);
		int left = 0;
		int length = ar.length - 1;
		int limit = size - 1;
		int[] res = new int[length - 1];
		while (left < length && limit <= length) {
			int tempmax = Math.max(ar[left], ar[left + 1]);
			int finalMax = Math.max(tempmax, ar[left + 2]);

			res[left] = finalMax;
			left++;
			limit++;
		}
		return res;
	}

}
