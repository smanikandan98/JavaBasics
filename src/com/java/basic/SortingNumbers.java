package com.java.basic;

import java.util.Arrays;
import java.util.Collections;

public class SortingNumbers {

	public void logic1() { // Ascending order
		int a[] = { 1, 4, 9, 6, 8 };

		System.out.println("The Elements Before sorting: " + Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("The Elements After sorting: " + Arrays.toString(a));

	}

	public void logic2() { // Ascending order
		int a[] = { 1, 4, 9, 6, 8 };

		System.out.println("The Elements Before sorting: " + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("The Elements After sorting: " + Arrays.toString(a));

	}

	private void logic3() { // Decending order
		Integer a[] = { 1, 4, 9, 6, 8 };

		System.out.println("The Elements Before sorting: " + Arrays.toString(a));
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println("The Elements After sorting: " + Arrays.toString(a));

	}

	private void logic4() {
		int a[] = { 1, 4, 9, 6, 8 };
		int n = a.length;

		System.out.println("The Elements Before sorting: " + Arrays.toString(a));
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}
			}
		}
		System.out.println("The Elements After sorting: " + Arrays.toString(a));

	}

	public static void main(String[] args) {
		SortingNumbers sn = new SortingNumbers();
		sn.logic1();
		sn.logic2();
		sn.logic3();
		sn.logic4();

	}

}
