package com.xworkz.javaOops.Encapsulation;

public class BagTester {

	public static void main(String[] args) {
		Bag obj = new Bag();

		obj.setBrand("Asus");
		String ref = obj.getBrand();
		obj.setPrice(1999);
		int value = obj.getPrice();
		obj.setCapacity("40L");
		obj.setNoOfCompartments(5);
		obj.setNoOfZips(6);
		obj.setDurability("Waterproof");
		obj.setColor("Black");
		obj.setType("Trolly bag");
		obj.setTypeOfBag("Laptop");
		String value1 = obj.getCapacity();
		int num = obj.getNoOfCompartments();
		int num1 = obj.getNoOfZips();
		String name = obj.getDurability();
		String color = obj.getColor();
		String type = obj.getType();
		String typeof = obj.getTypeofBag();
		System.out.println(ref + " " + value + " " + value1 + " " + num + " " + num1 + " " + name + " " + color + " "
				+ type + " " + typeof);
	}
}
