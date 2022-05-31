package com.java.basic;

import java.util.Scanner;

public class ReverseNumber {

	public void logic1() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();

		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10; 
			num = num / 10;

		}
		System.out.println("The Reverse Numbers are: " + rev);

	}

	public void logic2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();
		System.out.println("The Reverse Numbers are: " + rev);

	}

	public void logic3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		StringBuilder rev = sbl.reverse();
		System.out.println("The Reverse Numbers are: " + rev);

	}

	public static void main(String[] args) {

		ReverseNumber rn = new ReverseNumber();
		rn.logic1();
		rn.logic2();
		rn.logic3();
	}

}
