//first sub class of child class(wear)
package com.xworkz.javaOops.abstracion.InterFace.Cloths;

public class Men extends Wear implements CLoths {

	public void toDecoreCloth() {
		System.out.println("by mens wear");
	}

	public void washingCloth() {
		System.out.println("self washing");

	}

	public void ironingCloth() {
		System.out.println("ironing mens cloths");

	}

	public void protection() {
		System.out.println("protect body into sunlights");

	}

	public void providePrivacy() {
		System.out.println("to privacy purpose");

	}

	public void makeCarryBag() {
		System.out.println("tocarry");

	}

}
