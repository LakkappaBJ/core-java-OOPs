package com.xworkz.javaOops.abstracion.InterFace.Electronics;

public class Earphones extends Gadgets {

	@Override
	public void makesEasy() {
		System.out.println("makes easy to listen");

	}

	@Override
	public void powerConsumption() {
		System.out.println("Low power Consumption ");
	}

	@Override
	public void charging() {
		System.out.println("Fast Charging");
	}

	@Override
	public void backup() {
		System.out.println("no backup");
	}

	@Override
	public void easyToRepair() {
		System.out.println("easy to repair");
	}

	@Override
	public void reslaeValue() {
		System.out.println("");
	}

}
