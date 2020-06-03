package io.test.InterviewPreparation;

public interface FunctionalInterfaceA {
	int add(int a, int b);

	default int multiply(int a, int b) {
		return a * b;
	}

	default int ret(int i) {
		return i;
	}

	static int staticmethod(int i) {
		return i;
	}
	
	static int staticmethod2(int i) {
		return i;
	}
}
