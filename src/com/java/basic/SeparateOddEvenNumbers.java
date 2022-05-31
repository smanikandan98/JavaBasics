package com.java.basic;

public class SeparateOddEvenNumbers {

	public  void logic1() {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("The Even Number are:");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {

				System.out.println(a[i]);
			}

		}
		System.out.println("The Odd Numbers are:");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				System.out.println(a[i]);
			}
		}
	}

	public void logic2() {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("The Even Number are:");
		for (int value : a) {
			if (value % 2 == 0) {
				System.out.println(value);

			}

		}
		System.out.println("The ODD Number are:");
		for (int value : a) {
			if (value % 2 != 0) {
				System.out.println(value);

			}
		}
	}
	
	public static void main(String[] args) {
		SeparateOddEvenNumbers soe = new SeparateOddEvenNumbers();
		soe.logic1();
		soe.logic2();
	}

}
