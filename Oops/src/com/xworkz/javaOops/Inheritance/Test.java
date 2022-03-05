package com.xworkz.javaOops.Inheritance;
// inheritance Is A relation
class Parent {
	public void method() {
		System.out.println("Parent");
	}
}

class Child extends Parent {
	public void mth() {
		System.out.println("Child");
	}
}

public class Test {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.method(); // till its run               //case 1
		
		//p.mth(); its error // on the parent reference child specific method we cannot call beacause
					// child members are by default not available to the parent
		
		Child c = new Child();
		c.method(); 				//case 2
		c.mth();
		
		Parent p1=new Child();
		p1.method(); //successfully run //case 3
		// p1.mth(); // error
		
		 // Child c1=new Parent();
		//  c1.method();
		//  c1.mth();
	}
}
