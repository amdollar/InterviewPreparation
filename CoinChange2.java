package io.test.InterviewPreparation;

import java.util.Arrays;
import java.util.List;

public class CoinChange2 {

	public static void main(String[] args) {
		Long amount = 4l;
		List<Long> coins = Arrays.asList(Long.valueOf(1), Long.valueOf(2), Long.valueOf(3));
		System.out.println(getWays(amount, coins));
	}

	public static long getWays(Long amount, List<Long> c) {
//		int totalCoins = c.size();

		long ways = 0;

		for (Long coinval : c) {
			Long dupamount = amount;
			for (Long i = 0l; i <= dupamount; i = i + coinval) {
				dupamount = dupamount - i;
				ways++;
			}
		}
		return ways;
	}
}
