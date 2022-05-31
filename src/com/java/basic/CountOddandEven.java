package com.java.basic;

public class CountOddandEven {

	public static void main(String[] args) {

		int even = 0;
		int odd = 0;
		int num = 12230865;
		while (num > 0) {

			int reminder = num % 10;

			if (reminder % 2 == 0) {
				even++;

			} else {
				odd++;

			}
			num = num / 10;

		}
		System.out.println("The Number of Even Digits is: " + even);
		System.out.println("The Number of Even Digits is: " + odd);
	}

}
