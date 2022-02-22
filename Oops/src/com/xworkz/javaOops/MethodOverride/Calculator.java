package com.xworkz.javaOops.MethodOverride;

import java.util.Scanner;

public class Calculator {
//	static Scanner sc = new Scanner(System.in);
//	static int n = sc.nextInt();
//	static int num = sc.nextInt();
//	
//
//	public void add() {
//		System.out.println(n + num);
//	}

	public float add(int num, float number) {
		return num + number;
	}

	public int add(int a, int b) {
		return a + b;
	}

	public float sub(int num, float number) {
		return num - number;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public float division(int num, float number) {
		return num / number;
	}

	public int division(int a, int b) {
		return a / b;
	}

	public float multi(int num, float number) {
		return num * number;
	}

	public int multi(int a, int b) {
		return a * b;
	}

	public int average(int a, int b) {
		return (a + b) / 2;
	}

	public float average(float a, float b) { // average of given numbers
		return (a + b) / 2;
	}

	public float percentage(float obtained, int total) { // % of number

		// return obtained*100/total;
		return (obtained / total) * 100;
	}

	public double square(double a) { // square of number
		return a * a;
	}

	public double sqrtRoot(double a) { // square root of given number
		double sum = Math.sqrt(a);
		return sum;
	}

	public void addition() {
		int a = 100;
		int b = 200;
		int sum = a + b;
		System.out.println(sum);
	}

}
