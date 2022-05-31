package com.java.basic;

public class OccurancesInChar {

	public static void main(String[] args) {
		String str = "automation";

		int total = str.length();

		int all = str.replace("a", "").length();

		int count = total - all;
		System.out.println("The Total count of a is: " + count);

	}

}
