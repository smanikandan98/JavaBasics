package com.java.basic;

public class LargestNumber {

	public void logic1() {
		int a = 70, b = 69, c = 68;

		if (a > b && a > c) {
			System.out.println(a + " is the largest number");
		} else if (b > a && b > c) {
			System.out.println(b + " is the largest number");
		} else {
			System.out.println(c + " is the largest");

		}
	}

	public void logic2() {
		int a = 99, b = 101, c = 100;
		int large = c > (a > b ? a : b) ? c : (a > b ? a : b);
		System.out.println(large + " is the largest number");

	}

	public static void main(String[] args) {
		LargestNumber ln = new LargestNumber();
		ln.logic1();
		ln.logic2();
	}

}
