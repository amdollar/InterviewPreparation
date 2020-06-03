package io.test.InterviewPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterfaceTest {
	static List<String> list = Arrays.asList(new String[] { "Anurag", "Awasthi"});

	private static Predicate<List> collectionEmpty = list -> list.size() <= 0;

	private static Predicate<String> passLengt = (s) -> s.length() > 6;

//	public static void main(String[] args) {
//		FunctionalInterfaceA i = new LambdaClass();
//		System.out.println(i.add(7, 8));
//	}

	/**
	 * Code after lambda expression: now we do not need any impl class for this
	 * interface but we cannot have more that one mehtod in the interface. but we
	 * can have any number of default and static methods.
	 * 
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		Runnable r = new MyRunnable();
		Thread thread = new Thread(() -> {
			for (int i = 0; i < 11; i++) {
				System.out.println("abc");
			}
		});
		thread.start();
		thread.join();
		System.out.println("Main thread");

		System.out.println("length: " + passLengt.test("Anurag00"));

		System.out.println("Collections empty: " +collectionEmpty.test(list));

		FunctionalInterfaceA i = (a, b) -> a + b;
		System.out.println(i.add(7, 8));
	}

}
