package com.java.basic;

public class ManAndMinNumbers {

	public static void main(String[] args) {
		int a[] = { 99, 33, 66, 77, 101 };
		int max = a[0];
		int min = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}

		}
		System.out.println("The Maximum Number in an array is: " + max);

		for (int i = 1; i < a.length; i++) {
			if (a[1] < min) {
				min = a[i];

			}
		}
		System.out.println("The Minimum Number in an array is: " + min);
	}

}
