package com.xworkz.Flipkart.dto;

import java.util.Iterator;

public class FlipkartDAO {
	MobileDTO[] dtos = new MobileDTO[10];
	int index = 0;

	public String add(MobileDTO dto) {
		try {
			dtos[index] = dto;
			index++;
			return "Data Saved";
		} catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
			return "You have exception " + e.getMessage();
		}
	}
	
	public String create(MobileDTO[] dtoArr)
	{
		try {
			for (int i = 0; i < dtoArr.length; i++) {
				dtos[index]=dtoArr[i];
				index++;
			}
			return "Data is saved/creat()";
		} catch (NullPointerException | ArrayIndexOutOfBoundsException ex) {
			return "You have exceptions "+ex.getClass().getName()+"\tReason "+ex.getMessage();
		}
	}
}
