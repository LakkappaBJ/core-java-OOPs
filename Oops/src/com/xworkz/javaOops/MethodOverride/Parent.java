//Durga Tutorials Method overriding
package com.xworkz.javaOops.MethodOverride;

public class Parent {
	public void properties() {
		System.out.println("Gold+cash+Land");
	}

	public  void marry() {
		System.out.println("ALf/Bhag"); // Overridden method
	}
}

class Child extends Parent {
	public  void marry() {
		System.out.println("L"); // overriding method
	}
}