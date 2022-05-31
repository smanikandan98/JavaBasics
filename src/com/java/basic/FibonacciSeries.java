package com.java.basic;

public class FibonacciSeries {

	public void fibonacciSeries() {

		int a = 0;
		int b = 1;
		int sum = 0;
		System.out.print(a + " " + b);
		for (int i = 2; i <= 20; i++) {
			sum = a + b;
			System.out.print(" " + sum);
			a = b;
			b = sum;
		}
	}

	public static void main(String[] args) {
		FibonacciSeries fb = new FibonacciSeries();
		fb.fibonacciSeries();
	}

}
