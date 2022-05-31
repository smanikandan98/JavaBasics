package com.java.basic;

public class Swapping2Numbers {

	public void logic1() {
		// TODO Auto-generated method stub
		int a = 153, b = 131;
		System.out.println("Before Swapping:" + a + " " + b);
		int t = a;
		a = b;
		b = t;
		System.out.println("After Swapping:" + a + " " + b);
	}

	public void logic2() {
		// TODO Auto-generated method stub
		int a = 153, b = 131;
		System.out.println("Before Swapping:" + a + " " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping:" + a + " " + b);
	}

	public void logic3() {
		// TODO Auto-generated method stub
		int a = 153, b = 131;
		System.out.println("Before Swapping:" + a + " " + b);
		a = a * b;
		b = a / b;
		a = a / b;
		System.out.println("After Swapping:" + a + " " + b);

	}

	public void logic4() {
		int a = 153, b = 131;
		System.out.println("Before Swapping:" + a + " " + b);
		b = a + b - (a = b);
		System.out.println("After Swapping:" + a + " " + b);

	}

	public void logic5() {
		int a = 153, b = 131;
		System.out.println("Before Swapping:" + a + " " + b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("After Swapping:" + a + " " + b);
	}

	public static void main(String[] args) {

		Swapping2Numbers s2 = new Swapping2Numbers();
		s2.logic1();
		s2.logic2();
		s2.logic3();
		s2.logic4();
		s2.logic5();

	}

}
