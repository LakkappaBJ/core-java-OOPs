package com.xworkz.javaOops;

import com.xworkz.javaOops.abstracion.InterFace.MenWear;

import com.xworkz.javaOops.abstracion.InterFace.ClothAbstract1;

public class TesterForCloth {

	public static void main(String[] args) {
		ClothAbstract1 obj = new MenWear();
		ClothAbstract1 obj1 = new WomensWear();
		obj1.brandName();
		obj.brandName();
	}
}
