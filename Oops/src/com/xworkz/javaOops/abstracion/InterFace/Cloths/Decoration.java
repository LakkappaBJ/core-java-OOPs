//first sub class of child class(home)
package com.xworkz.javaOops.abstracion.InterFace.Cloths;

public class Decoration extends Home implements CLoths {
	

	@Override
	public void toDecoreCloth() {
		System.out.println("To decorate our home into cloths");
		
	}

	@Override
	public void washingCloth() {
		System.out.println("After washing cloths decorate the home ");
		
	}

	@Override
	public void ironingCloth() {
	System.out.println("to ironing cloths for looks smart");
		
	}

	@Override
	public void protection() {
		System.out.println("to decorate home by cloth ");
		
	}

	@Override
	public void providePrivacy() {
		System.out.println("' the cloths to protect windows our home'");
		
	}

	@Override
	public void makeCarryBag() {
		System.out.println("decoration cloths we put into carry bags");
		
	}
}
