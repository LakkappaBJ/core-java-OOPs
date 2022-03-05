//second sub class of child class(wear)
package com.xworkz.javaOops.abstracion.InterFace.Cloths;

public class Women extends Wear implements CLoths {

	@Override
	public void toDecoreCloth() {
		System.out.println("womens wear");

	}

	@Override
	public void washingCloth() {
		System.out.println("washing cloths by womens");

	}

	@Override
	public void ironingCloth() {
		System.out.println("ironing the cloths After washig... ");

	}

	@Override
	public void protection() {
		System.out.println("wearing cloths for protecting sunlights, dust, etc...");

	}

	@Override
	public void providePrivacy() {
		System.out.println("to weraing cloths traditonally");

	}

	@Override
	public void makeCarryBag() {
		System.out.println("to carry all cloths into carryBag");

	}

}
