package com.java.basic;

import java.util.Scanner;

public class CountDigits {

	public void countDigit() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		int count = 0;

		while (num != 0) {
			num = num / 10;
			count++;

		}
		System.out.println("The Number of Digits :" + count);

	}

	public static void main(String[] args) {
		CountDigits cd = new CountDigits();
		cd.countDigit();
	}

}
