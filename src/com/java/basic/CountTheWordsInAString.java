package com.java.basic;

public class CountTheWordsInAString {
	public static void main(String[] args) {
		String str = "My Name is Mani";
		int count = 1;

		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
				count++;

			}
		}
		System.out.println("The Number of words in a String is: " + count);
	}

}
