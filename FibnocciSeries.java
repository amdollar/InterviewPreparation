package io.test.InterviewPreparation;

public class FibnocciSeries {

	public static void main(String[] args) {
		int length = 10;
		printFebnocci(length);
	}

	private static void printFebnocci(int length) {
		long start = System.currentTimeMillis();
		int init = 0;
		int temp = 1;
		int count = 1;
		while (length > 1) {
			int next = init + temp;
			init = temp;
			if (length == count)
				System.out.print(next);
			else
				System.out.print(next + ",");
			temp = next;
			length--;
			count++;
		}
		System.out.println("\n Total time:" + (System.currentTimeMillis()-start));
	}

}
