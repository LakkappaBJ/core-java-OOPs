package com.xworkz.javaOops.MethodOverride;

public class OverrideTest {

	public static void main(String[] args) {
		Parent p = new Parent(); //parent object
		p.marry(); // parent method

		Child c = new Child();
		c.marry(); // child method

		Parent p1 = new Child(); // casting (upcasting and downCasting)
		// in overriding method resolution always take cares by jvm based on run time
		// object
		// not based on reference type.
		p1.marry();

	}
}
