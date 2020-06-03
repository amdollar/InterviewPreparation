package io.test.InterviewPreparation;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		int i = 10;
		while (i > 0) {
			System.out.println("This is MyRunnable");
			i--;
		}
	}

}
