package com.java.basic;

import java.util.Scanner;

public class PallindromeNumber {

	public void pallindromeNumber() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");  //12621
		int num = sc.nextInt();
		int rev = 0;
		int orgin = num;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;

		}
		if (orgin == num ) {
			System.out.println(orgin + " The Number is pallindrome");

		} else {
			System.out.println(orgin + " The Number is not a pallindrome");
		}

	}

	public static void main(String[] args) {
		PallindromeNumber pn = new PallindromeNumber();
		pn.pallindromeNumber();
	}

}
