package com.xworkz.Flipkart.dto;

public class MobileDTO {
	private String brandName;
	private String modelName;
	private String color;
	private float price;
	private byte ram;
	private short storage;
	private float ratings;

	public MobileDTO() {

	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getPrice() {
		return price;
	}

	public void setRam(byte ram) {
		this.ram = ram;
	}

	public byte getRam() {
		return ram;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	public float getRatings() {
		return ratings;
	}

	public void setStorage(short storage) {
		this.storage = storage;
	}

	public short getStorage() {
		return storage;
	}

}
