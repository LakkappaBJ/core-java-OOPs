package com.xworkz.javaOops;

import com.xworkz.javaOops.abstracion.InterFace.Electronics.Entertainment;
import com.xworkz.javaOops.abstracion.InterFace.Electronics.HomeAppliences;
import com.xworkz.javaOops.abstracion.InterFace.Electronics.Kitchen;

public class ElectronicYTester {

	public static void main(String[] args) {
		HomeAppliences obj = new Kitchen();
		obj.backup();
		obj.charging();
		obj.connectPeople();
		obj.easyToRepair();
		obj.Entertainment();
		obj.makesEasy();
		obj.powerConsumption();
		obj.reslaeValue();
		System.out.println("_________________________________________");
		HomeAppliences obj1 = new Entertainment();
		obj1.backup();
		obj1.charging();
		obj1.connectPeople();
		obj1.easyToRepair();
		obj1.Entertainment();
		obj1.makesEasy();
		obj1.powerConsumption();
		obj1.reslaeValue();
		System.out.println("___________________________________________");
	}

}
