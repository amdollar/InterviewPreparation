package io.test.InterviewPreparation;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int ar[] = new int[] { 1, 2, 3, 3, 4, 5 };
		int newarr[] = removeduplicate(ar);
		for (int i : newarr) {
			System.out.println(i);
		}
	}

	private static int[] removeduplicate(int[] ar) {
		int len = ar.length - 1;
		int j = 0;
		int newarr[] = new int[len + 1];
		for (int i = 0; i < len; i++) {
			if (ar[i] != ar[i + 1]) {
				newarr[j++] = ar[i];
			}
		}
		newarr[j++] = ar[len];
		return newarr;
	}

}
