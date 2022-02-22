package com.xworkz.javaOops.MethodOverride;

public class CalculatorTester {

	public static void main(String[] args) {
		ScientificCalc obj = new ScientificCalc();
		int value = obj.add(10, 20);
		System.out.println(value);
		float sum = obj.add(10, 2.5f);
		System.out.println(sum);

		float total = obj.sub(20, 15.5f);
		int total1 = obj.sub(10, 50);
		System.out.println(total + "\n" + total1);

		float tot = obj.division(20, 15.5f);
		int tot1 = obj.division(50, 10);
		System.out.println(tot + "\n" + tot1);

		float grand = obj.multi(20, 15.5f);
		int grand1 = obj.multi(10, 50);
		System.out.println(grand + "\n" + grand1);

		int average = obj.average(10, 20);
		float avg = obj.average(9.5f, 20.5f);
		System.out.println(average);
		System.out.println(avg);

		float per = obj.percentage(391, 625);
		System.out.println(per);
		double square = obj.square(5);
		System.out.println(square);
		double s = obj.sqrtRoot(4);
		System.out.println(s);
		obj.addition();

	}

}