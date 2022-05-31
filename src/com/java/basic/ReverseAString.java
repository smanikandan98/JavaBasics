package com.java.basic;

public class ReverseAString {

	public void logic1() {

		String str = "ABCD";
		String rev = "";
		int len = str.length(); //4 3 2 1 

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("Reverse String is: " + rev);
	}

	public void logic2() {
		String str = "EFGH";
		String rev = "";
		char a[] = str.toCharArray();
		int len = a.length;
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + a[i];
		}
		System.out.println("Reverse String is: " + rev);

	}

	public void logic3() {
		String str = "IJKLMN";
		StringBuffer sb = new StringBuffer(str);
		StringBuffer rev = sb.reverse();
		System.out.println("Reverse String is: " + rev);
	}

	public void logic4() {
		String str = "OPQRSTUV";
		StringBuilder sbl = new StringBuilder(str);
		sbl.append(str);
		StringBuilder rev = sbl.reverse();
		System.out.println("Reverse String is: " + rev);
	}

	public static void main(String[] args) {
		ReverseAString ras = new ReverseAString();
		ras.logic1();
		ras.logic2();
		ras.logic3();
		ras.logic4();
	}

}
