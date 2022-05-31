package com.java.basic;

public class ReverseEachWordInAString {

	private void logic1() {
		String str = "Welcome To Java";

		String[] words = str.split("\\s");
		String reverseString = "";

		for (String word : words) {
			String rev = "";

			for (int i = word.length() - 1; i >= 0; i--) {
				rev = rev + word.charAt(i);
			}
			reverseString = reverseString + rev + " ";

		}
		System.out.println("The Reverse of Each word in a String is: " + reverseString);
	}

	private void logic2() {
		String str = "Welcome To Phython";

		String[] words1 = str.split("\\s");
		String reverseString = "";

		for (String ace : words1) {
			StringBuilder sb = new StringBuilder(ace);
			sb.reverse();
			reverseString = reverseString + sb.toString() + " ";
		}
		System.out.println("The Reverse of Each word in a String is: " + reverseString);
	}

	public static void main(String[] args) {
		ReverseEachWordInAString res = new ReverseEachWordInAString();
		res.logic1();
		res.logic2();
	}

}
