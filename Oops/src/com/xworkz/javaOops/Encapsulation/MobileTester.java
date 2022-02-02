package com.xworkz.javaOops.Encapsulation;

public class MobileTester {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Mobile ref = new Mobile();
		ref.setCamera("43pixel");
		String camera=ref.getCamera();
		ref.setChargingType("C type");
		String charging=ref.getChargingType();
		ref.setColor("blue");
		String color=ref.getColor();
		ref.setDualSim(true);
		boolean dual=ref.getDualSim();
		ref.setEMemory("128GB");
		String memory=ref.getEMemory();
		ref.setIpAddress("172.16.0.9");
		String ip=ref.getIpAddress();
		ref.setModel("Redmi Note 5 Pro");
		String model=ref.getModel();
		ref.setOs("Android");
		String os=ref.getOs();
		ref.setPrice(15500);
		int price=ref.getPrice();
		ref.setProcessor("Snapdragon");
		String processor=ref.getProcessor();
		ref.setRAM("6GB");
		String ram=ref.getRAM();
		
		System.out.println(model+"\t"+color+"\t"+price+"\t"+dual+"\t"+os+"\t"+camera+"\t"+charging+"\t"+ram+"\t"+processor+"\t"+ip+"\t"+memory);
		
	}

}
