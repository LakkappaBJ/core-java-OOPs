package com.xworkz.javaOops.Encapsulation.CRUDOperation;

public class Cap {
	private String capColor;
	private String capSize;
	private String capShape;
	
//	public Cap(String capColor, String capSize, String capShape) {
//		this.capColor = capColor;
//		this.capSize = capSize;
//		this.capShape = capShape;
//	}
	public String getCapAll() {
		String c = capColor+"\t"+capSize+"\t"+capShape;
		return c;
	}
	public void setColor(String capColor) {
		this.capColor = capColor;
	}
	public String getCapColor() {
		return capColor;
	}
	public String getCap() {
		return capColor;
	}
	public void setCapSize(String capSize) {
		this.capSize = capSize;
	}
	public String getCapSize() {
		return capSize;
	}
	public void setCapShape(String capShape) {
		this.capShape = capShape;
	}
	public String getCapShape() {
		return capShape;
	}
}
