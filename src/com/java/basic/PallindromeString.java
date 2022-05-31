package com.java.basic;

import java.util.Scanner;

public class PallindromeString {

	public void pallindromeString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		String orgin = str;
		String rev = "";
		int len = str.length();

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (orgin.equals(rev)) {
			System.out.println("The Given String is Pallindrome");

		} else {
			System.out.println("The Given String is not a Pallindrome");
		}

	}

	public static void main(String[] args) {
		PallindromeString ps = new PallindromeString();
		ps.pallindromeString();
	}

}
