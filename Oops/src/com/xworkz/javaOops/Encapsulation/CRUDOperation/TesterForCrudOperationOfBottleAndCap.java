package com.xworkz.javaOops.Encapsulation.CRUDOperation;

public class TesterForCrudOperationOfBottleAndCap {
	public static void main(String[] args) {

		CRUDOperation cp = new CRUDOperation();

		Bottle bottle1 = new Bottle();
		Bottle bottle2 = new Bottle();

		Cap cap1 = new Cap();
		Cap cap2 = new Cap();
		Cap cap3 = new Cap();

		cap3.setCapShape("Octagonal");
		cap3.setCapSize("21cm");
		cap3.setColor("Blue");

		cap1.setCapShape("Hexagonal");
		cap1.setCapSize("2cm");
		cap1.setColor("Blue");

		cap2.setCapShape("Round");
		cap2.setCapSize("20cm");
		cap2.setColor("Light-Blue");

		bottle1.setColor("Pink");
		bottle1.setPrice((short) 5);
		bottle1.setSize("Round");
		bottle1.setType("Plastic");
		bottle1.setCap(cap1);

		bottle2.setColor("Black");
		bottle2.setPrice((short) 15);
		bottle2.setSize("Square");
		bottle2.setType("Metal");
		bottle2.setCap(cap2);

//			String bColor = bottle1.getColor();
//			System.out.println(bColor);
//			short bPrice = bottle1.getPrice();
//			System.out.println(bPrice);
//			String bSize = bottle1.getSize();
//			System.out.println(bSize);
//			String bType = bottle1.getType();
//			System.out.println(bType);
//			Cap bCap = bottle1.getCap();
//			System.out.println(bCap.getCapColor());

		Bottle a = cp.add(bottle1);
		System.out.println(a.getAll());
		Bottle b = cp.add(bottle2);
		System.out.println(b.getAll());
		System.out.println("*****************");
		String ac = cp.printAll();
		System.out.println("*****************");
		Bottle c = cp.getByCapColor("Light-Blue");
		System.out.println(c.getAll());
		System.out.println("*****************");
		Bottle d = cp.getByCapSize("20cm");
		System.out.println(d.getAll());
		System.out.println("*****************");
		Bottle e = cp.getByBottleType("Plastic");
		System.out.println(e.getAll());
		System.out.println("*****************");
		Bottle f = cp.getByBottleColor("Pink");
		System.out.println(f.getAll());
		System.out.println("*****************");
		Bottle g = cp.updateBottlePriceByBottleColor((short) 1000, "Black");
		System.out.println(g.getAll());
		System.out.println("*****************");
		Bottle h = cp.updateBottleColorByBottleType("Yellow", "Metal");
		System.out.println(h.getAll());
		System.out.println("*****************");
		Bottle i = cp.updateCapTypeByBottleType(cap3, "Plastic");
		System.out.println(i.getAll());
		System.out.println("*****************");
		Bottle j = cp.updateBottleColorByCapColor("Blue", "Dark-Blue");
		System.out.println(j.getAll());
		System.out.println("*****************");
		Bottle k = cp.deleteByCapShape("Round");
		System.out.println(k.getAll());
		String ab = cp.printAll();

		System.out.println("*****************");

//		Cap c1 = new Cap("pink", "1cm", "square");
//		Cap c2 = new Cap("blue", "5cm", "round");
//		Cap c3= new Cap("purple", "6cm", "cylindrical");
//		Cap c4 = new Cap("yellow", "10cm", "simple");
//		Cap c5 = new Cap("green", "12.5cm", "regular");
//		//Cap c6 = new Cap("green", "12.5cm", "regular");
//		
//		
//		Bottle dto1 = new Bottle("Black", "4cm", "waterBottle",(short)5, c1);
//		Bottle dto2 = new Bottle("pink", "25cm", "juiceBottle",(short)15, c2);
//		Bottle dto3 = new Bottle("red", "1cm", "WineBottle",(short)55, c3);
//		Bottle dto4 = new Bottle("light green", "7cm", "plasticBottle",(short)225, c4);
//		Bottle dto5 = new Bottle("brown", "5cm", "MetalBottle",(short)99, c5);
//		//Bottle dto6 = new Bottle("Black", "4cm", "waterBottle",(short)5, c6);
//
//		cp.add(dto1 );
//		cp.add(dto2);
//		cp.add(dto3);
//		cp.add(dto4);
//		cp.add(dto5);
//		//cp.add(dto6);

//		cp.printAll();
//		System.out.println("****Printing Cap Properties by using Cap Color****");
//		cp.getByCapColor("green");
//		System.out.println("****Printing Cap Properties by using Cap Size****");
//		cp.getByCapSize("1cm");
//		System.out.println("****Printing Bottle Properties by using Bottle Type****");
//		cp.getByBottleType("waterBottle");
//		System.out.println("****Printing Bottle Properties by using Bottle Color****");
//		cp.getByBottleColor("brown");
//		System.out.println("****Updating Bottle price by using Bottle color****");
//		cp.updateBottlePriceByBottleColor((short)100,"red");
//		System.out.println("****Updating Bottle color by using Bottle Type****");
//		cp.updateBottleColorByBottleType("Meroon", "MetalBottle");
//		System.out.println("****Updating Cap by bottle type****");
//		Cap c6 = new Cap("white", "12.26cm", "hexa");
//		cp.updateCapTypeByBottleType(c6, "waterBottle");
//		System.out.println("****Update bottle color by cap color****");
//		cp.updateBottleColorByCapColor("yellow", "orange");
//		System.out.println("****Update bottle color by cap color****");
//		cp.printAll();
//		cp.deleteByCapShape("hexa");
//		System.out.println("*********************");
//		cp.printAll();
	}
}
