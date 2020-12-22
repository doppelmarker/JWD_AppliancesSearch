package com.markedline.task01.util;

import com.markedline.task01.entity.base.Appliance;

import java.util.List;

public class AppliancePrinter {

    public void print(List<Appliance> applianceList) {
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
