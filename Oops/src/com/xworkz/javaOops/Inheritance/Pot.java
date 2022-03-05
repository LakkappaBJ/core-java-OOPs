//Has A relation in inheritance
package com.xworkz.javaOops.Inheritance;

public class Pot {
	private String color;
	private int price;
	private Flower f;

	public Pot() {

	}

	public Flower getF() {
		return f;
	}

	public void setF(Flower f) {
		this.f = f;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}

class Tester {
	public static void main(String[] args) {
		Pot po = new Pot();
		po.setColor("red");
		po.setPrice(50);

		Flower f1 = new Flower();
		f1.setClr("green");
		f1.setType("Rose");
		po.setF(f1);
		System.out.println(f1.getClr() + " " + f1.getType() + " " + po.getColor() + " " + po.getPrice());
	}

}