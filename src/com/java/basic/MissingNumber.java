package com.java.basic;

import java.util.Iterator;

public class MissingNumber {
	public static void main(String[] args) {
		int a[] = { 1, 2, 4, 5};

		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i < a.length; i++) {
			sum1 = sum1 + a[i];

		}
		System.out.println("The Value of Number is: " + sum1);
		for (int i = 1; i <= 5; i++) {
			sum2 = sum2 + i;

		}
		System.out.println("The Value of Number in an array is: " + sum2);

		System.out.println("The Missing Number is: " + (sum2 - sum1));

	}

}
