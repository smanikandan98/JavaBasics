package com.java.basic;

public class RemoveSpace {
	public static void main(String[] args) {
		String str = "Run using Java Selenium";

		System.out.println("Before Remove space: " + str);

		String str1 = str.replaceAll("\s", "");
		System.out.println("After Remove space: " + str1);
	}

}
