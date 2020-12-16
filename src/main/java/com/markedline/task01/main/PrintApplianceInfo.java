package com.markedline.task01.main;

import com.markedline.task01.entity.base.Appliance;

import java.util.List;

public class PrintApplianceInfo {
	
	public static void print(List<Appliance> applianceList) {
		System.out.println("Search results:");
		if (applianceList.isEmpty()) {
			System.out.println("Nothing was found!");
			return;
		}
		for (Appliance appliance : applianceList) {
			System.out.println(appliance);
		}
	}
}
