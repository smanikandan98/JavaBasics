package com.java.basic;

import java.util.HashSet;

public class DuplicateValue {

	private void logic1() {
		String ar[] = { "mani", "mani", "suba", "saran" };
		HashSet<String> langs = new HashSet();

		for (String l : ar) {
			System.out.println(langs.add(l));
		}

	}

	private void logic2() {

		boolean flag = false;
		String ar[] = { "mani", "mani", "suba", "saran" };
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] == ar[j]) {
					System.out.println("Found Duplicate Element " + ar[i]);
					flag = true;
				}
			}
		}
		if (flag == false) {

			System.out.println("No Found Duplicate Element");
		}
	}

	public static void main(String[] args) {
		DuplicateValue dv = new DuplicateValue();
		dv.logic1();
		dv.logic2();
	}

}
