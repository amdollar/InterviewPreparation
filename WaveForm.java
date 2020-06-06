package io.test.InterviewPreparation;

import java.util.Arrays;

/**
 * Programs to convert an array into weve sort array ar[0] >= ar[1] <= ar[2]
 * 
 */
public class WaveForm {

	public static void main(String[] args) {
		int[] ar = new int[] { 10, 5, 6, 3, 2, 20, 100, 80 };
		for (int i : ar)
			System.out.print(i + " ");
		System.out.println();
		waveSort(ar);
		for (int i : ar)
			System.out.print(i + " ");
	}

	private static void waveSort(int[] ar) {
		Arrays.sort(ar); // [2,3,5,6,10,20,80,100] .. [3, 2 , 6, 5]
		for (int i = 0; i < ar.length; i = i + 2) {
			int temp = ar[i];
			ar[i] = ar[i + 1];
			ar[i + 1] = temp;
		}
	}

}