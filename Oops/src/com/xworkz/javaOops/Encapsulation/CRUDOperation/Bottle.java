package com.xworkz.javaOops.Encapsulation.CRUDOperation;

public class Bottle {
	private String color;
	private String size;
	private String type;
	private short price;
	private Cap cap;
	
public Cap getCap() {
		return cap;
	}

	public void setCap(Cap cap) {
		this.cap = cap;
	}

	//	public Bottle(String color, String size, String type, short price, Cap cap) {
//	this.color = color;
//	this.size = size;
//	this.type = type;
//	this.price = price;
//	this.cap = cap;
//}
	public String getAll() {
		String s = color+"\t"+size+"\t"+type+"\t"+price+"\t"+cap.getCapAll();
		return s;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public short getPrice() {
		return price;
	}
	public void setPrice(short price) {
		this.price = price;
	}
	
	
}
