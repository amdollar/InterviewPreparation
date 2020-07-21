package io.test.InterviewPreparation;
/**
 * Uu
 * You are in charge of the cake for your niece's birthday and have decided the cake will have one candle for each year of her total age. When she blows out the candles, she’ll only be able to blow out the tallest ones. Your task is to find out how many candles she can successfully blow out.
 * 
 * 
 * Complete the function birthdayCakeCandles in the editor below. It must return an integer representing the number of candles she can blow out.

birthdayCakeCandles has the following parameter(s):

ar: an array of integers representing candle heights

https://www.hackerrank.com/challenges/birthday-cake-candles/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
 */

import java.util.Arrays;

public class BirthdayCandles {

	public static void main(String[] args) {
		int[] candles = new int[] { 3, 2, 1, 3 };
		int no = birthdayCakeCandles(candles);
		System.out.println(no);
	}

	static int birthdayCakeCandles(int[] ar) {
		int result = 0;
		int count = 0;
		Arrays.sort(ar);
		for (int i = ar.length - 1; i >= 0; i--) {
			result = Math.max(result, ar[i]);
			if (result == ar[i]) {
				count++;
			}

		}
		return count;
	}

}
