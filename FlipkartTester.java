package com.xworkz.Flipkart.dto;

public class FlipkartTester {
	public static void main(String[] args) {
		
		// MobileDTO dtos[] = new MobileDTO[10]; //array
		FlipkartDAO dao = new FlipkartDAO();
		

		MobileDTO dto = new MobileDTO();
		
		dto.setBrandName("Mi");
		dto.getBrandName();
		dto.setColor("Red");
		dto.getColor();
		dto.setModelName("Note 5 pro");
		dto.getModelName();
		dto.setPrice(15000f);
		dto.getPrice();
		dto.setRam((byte)4);
		dto.getRam();
		dto.setStorage((short)64);
		dto.getStorage();
		dto.setRatings(4.5f);
		dto.getRatings();
		MobileDTO dto1 = new MobileDTO();
		dto.setBrandName("Mi");
		dto.getBrandName();
		dto.setColor("Red");
		dto.getColor();
		dto.setModelName("Note 5 pro");
		dto.getModelName();
		dto.setPrice(15000f);
		dto.getPrice();
		dto.setRam((byte)4);
		dto.getRam();
		dto.setStorage((short)64);
		dto.getStorage();
		dto.setRatings(4.5f);
		dto.getRatings();
		MobileDTO[] dtos= {dto,dto1};
		
		String store=dao.create(dtos);

		System.out.println(store);
		String s = dao.add(dto);
		System.out.println(s);
		
		String su = dao.add(dto1);
		System.out.println(su);
	}
}
