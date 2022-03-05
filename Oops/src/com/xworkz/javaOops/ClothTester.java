package com.xworkz.javaOops;

import com.xworkz.javaOops.abstracion.InterFace.Cloths.Cleaning;
import com.xworkz.javaOops.abstracion.InterFace.Cloths.Decoration;
import com.xworkz.javaOops.abstracion.InterFace.Cloths.Home;
import com.xworkz.javaOops.abstracion.InterFace.Cloths.Men;
import com.xworkz.javaOops.abstracion.InterFace.Cloths.Wear;
import com.xworkz.javaOops.abstracion.InterFace.Cloths.Women;

public class ClothTester {

	public static void main(String[] args) {
		Home home = new Decoration();

		home.toCleanCloth();
		home.toWearCloth();
		home.ironingCloth();
		home.makeCarryBag();
		home.protection();
		home.providePrivacy();
		home.toDecoreCloth();
		home.washingCloth();
		System.out.println("\n Cleaning properties\n");
		Home home1 = new Cleaning();

		home1.toCleanCloth();
		home1.toWearCloth();
		home1.ironingCloth();
		home1.makeCarryBag();
		home1.protection();
		home1.providePrivacy();
		home1.toDecoreCloth();
		home1.washingCloth();
		System.out.println("\nMens properties");
		Wear wear = new Men();

		wear.toCleanCloth();
		wear.toWearCloth();
		wear.ironingCloth();
		wear.makeCarryBag();
		wear.protection();
		wear.providePrivacy();
		wear.toDecoreCloth();
		wear.washingCloth();
		System.out.println("*********************Womens propoerties*********************");
		Wear wear1 = new Women();

		wear1.toCleanCloth();
		wear1.toWearCloth();
		wear1.ironingCloth();
		wear1.makeCarryBag();
		wear1.protection();
		wear1.providePrivacy();
		wear1.toDecoreCloth();
		wear1.washingCloth();
	}

}
