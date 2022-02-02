package com.xworkz.javaOops.Encapsulation;

public class Bag {
	private String brand;
	private int price;
	private String capacity;
	private int noOfCompartments;
	private int noOfZips;
	private String durability;
	private String color;
	private String type; // trolly system
	private String typeOfBag; // laptop bag, trecking bag

	public Bag() {

	}

	void setBrand(String brand) {
		this.brand = brand;
	}

	String getBrand() {
		return brand;
	}

	void setPrice(int price) {
		this.price = price;
	}

	int getPrice() {
		return price;
	}

	void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	String getCapacity() {
		return capacity;
	}

	void setNoOfCompartments(int noOfCompartments) {
		this.noOfCompartments = noOfCompartments;
	}

	int getNoOfCompartments() {
		return noOfCompartments;
	}

	void setNoOfZips(int noOfZips) {
		this.noOfZips = noOfZips;
	}

	int getNoOfZips() {
		return noOfZips;
	}

	void setDurability(String durability) {
		this.durability = durability;
	}

	String getDurability() {
		return durability;
	}

	void setColor(String color) {
		this.color = color;
	}

	String getColor() {
		return color;
	}

	void setType(String type) {
		this.type = type;
	}

	String getType() {
		return type;
	}

	void setTypeOfBag(String typeOfBag) {
		this.typeOfBag = typeOfBag;
	}

	String getTypeofBag() {
		return typeOfBag;
	}
}
