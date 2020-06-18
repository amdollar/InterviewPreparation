package io.test.InterviewPreparation;

public class RotateImage {

	public static void main(String[] args) {
		int[][] image = new int[][] { { 1, 2, 3 }, // 7 4 1
				{ 4, 5, 6 }, // 8 5 2
				{ 7, 8, 9 } };// 9 6 3
		rotate(image);
	}

	public static void rotate(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i; j < matrix[0].length; j++) {
				int temp = 0;
				temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length / 2; j++) {
				int temp = 0;
				temp = matrix[i][j];
				matrix[i][j] = matrix[i][matrix.length - 1 - j];
				matrix[i][matrix.length - 1 - j] = temp;
			}
		}
	}

}
