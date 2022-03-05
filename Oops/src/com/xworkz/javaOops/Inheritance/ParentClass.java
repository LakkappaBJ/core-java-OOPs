package com.xworkz.javaOops.Inheritance;

public class ParentClass implements Achieve{

	public void inheritance() {
		System.out.println("Multiple inheritance");
	}
	
	
	 public static void main(String[] args) {
		ParentClass obj=new ChildClass();
		obj.inheritance();
	}
}
