package com.xworkz.javaOops.Encapsulation.CRUDOperation;

public class CRUDOperation {
	Bottle bot[] = new Bottle[2];
	int index = 0;

	// Adding all the values/elements
	public Bottle add(Bottle bottle) {
		if (index<bot.length) {
			if (bottle != null) {
				bot[index] = bottle;
				index++;
				// System.out.println(bot[index].getColor()+ "\t"+bot[index].getPrice()+
				// "\t"+bot[index].getSize()+"\t"+bot[index].getType()+"\t"+bot[index].getCap());
				// return "Data is added";
				return bottle;
			}
		}
		else {
			System.out.println("Please enter proper array Value/Elements");
		}
		// else return "data is not added";
		return bottle;
	}

	// Printing all elements which are added
	public String printAll() {
		System.out.println("*********************");
		for (int index = 0; index < bot.length; index++) {
			if (bot[index] != null) {
				System.out.println(bot[index].getAll());
			} else
				return "Values are null";
		}
		return "**Print array elements**";
	}

	// getting cap properties by using cap color
	public Bottle getByCapColor(String capColor) {
		Bottle bottle = null;
		for (int index = 0; index < bot.length; index++) {
			if (bot[index] != null) {
				if (capColor.equals(bot[index].getCap().getCapColor())) {
					bottle = bot[index];
					// System.out.println(bot[index].getCap().getCapAll());
				}
			} else
				return bottle;
		}
		return bottle;
	}

	// getting cap properties by using cap size
	public Bottle getByCapSize(String capSize) {
		Bottle bottle = null;
		for (int index = 0; index < bot.length; index++) {
			if (bot[index] != null) {
				if (capSize.equals(bot[index].getCap().getCapSize())) {
					bottle = bot[index];
					// System.out.println(bot[index].getCap().getCapAll());
				}
			} else
				return bottle;
		}
		return bottle;
	}

	public Bottle getByBottleType(String bottleType) {
		Bottle bottle = null;
		for (int index = 0; index < bot.length; index++) {
			if (bot[index] != null) {
				if (bottleType.equals(bot[index].getType())) {
					bottle = bot[index];
					// System.out.println(bot[index].getColor()+"\t"+bot[index].getPrice()+"\t"+bot[index].getSize()+"\t"+bot[index].getType()+"\t"+bot[index].getCap().getCapAll());
					// System.out.println(bot[index].getAll());
				}
			} else
				return bottle;
		}
		return bottle;
	}

	public Bottle getByBottleColor(String bottleColor) {
		Bottle bottle = null;
		for (int index = 0; index < bot.length; index++) {
			if (bot[index] != null) {
				if (bottleColor.equals(bot[index].getColor())) {
					bottle = bot[index];
					// System.out.println(bot[index].getAll());
				}
			} else {
				return bottle;
			}
		}
		return bottle;
	}

	public Bottle updateBottlePriceByBottleColor(short price, String bottleColor) {
		Bottle bottle = null;
		for (int index = 0; index < bot.length; index++) {
			if (bot[index] != null) {
				if (bottleColor.equals(bot[index].getColor())) {
					bot[index].setPrice(price);
					bottle = bot[index];
					// System.out.println(bot[index].getAll());
				}
			} else {
				return bottle;
			}
		}
		return bottle;
	}

	public Bottle updateBottleColorByBottleType(String bottleColor, String bottleType) {
		Bottle bottle = null;
		for (int index = 0; index < bot.length; index++) {
			if (bot[index] != null) {
				if (bottleType.equals(bot[index].getType())) {
					bot[index].setColor(bottleColor);
					bottle = bot[index];
					// System.out.println(bot[index].getAll());
				}
			} else {
				return bottle;
			}
		}
		return bottle;
	}

	public Bottle updateCapTypeByBottleType(Cap capType, String bottleType) {
		Bottle bottle = null;
		for (int index = 0; index < bot.length; index++) {
			if (bot[index] != null) {
				if (bottleType.equals(bot[index].getType())) {
					bot[index].setCap(capType);
					bottle = bot[index];
					// System.out.println(bot[index].getAll());
				}
			} else {
				return bottle;
			}
		}
		return bottle;
	}

	public Bottle updateBottleColorByCapColor(String capColor, String bottleColor) {
		Bottle bottle = null;
		for (int index = 0; index < bot.length; index++) {
			if (bot[index] != null) {
				if (capColor.equals(bot[index].getCap().getCapColor())) {
					bot[index].setColor(bottleColor);
					bottle = bot[index];
					// System.out.println(bot[index].getAll());
				}
			} else {
				return bottle;
			}
		}
		return bottle;
	}

	public Bottle deleteByCapShape(String capShape) {
		Bottle bottle = null;
		for (int index = 0; index < bot.length; index++) {
			if (bot[index] != null) {
				if (capShape.equals(bot[index].getCap().getCapShape())) {
					bottle = bot[index];
					bot[index] = null;

					// System.out.println(bot[index].getAll());
				}
			} else {
				return bottle;
			}
		}
		return bottle;
	}
}
