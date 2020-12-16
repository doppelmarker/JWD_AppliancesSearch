package com.markedline.task01.main;

import com.markedline.task01.entity.Oven;
import com.markedline.task01.entity.base.Appliance;
import com.markedline.task01.entity.criteria.Criteria;
import com.markedline.task01.entity.criteria.CriteriaList;
import com.markedline.task01.service.ApplianceService;
import com.markedline.task01.service.ServiceFactory;

import java.util.List;

import static com.markedline.task01.entity.criteria.CriteriaList.TabletPC;

public class Main {

    public static void main(String[] args) {
        List<Appliance> applianceList;
        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        //////////////////////////////////////////////////////////////////

        Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());
        criteriaOven.add(CriteriaList.Oven.CAPACITY.toString(), 32);

        applianceList = service.find(criteriaOven);

        PrintApplianceInfo.print(applianceList);

        //////////////////////////////////////////////////////////////////

        //criteriaOven = new Criteria(Oven.class.getSimpleName());
        criteriaOven.add(CriteriaList.Oven.HEIGHT.toString(), 40);
        criteriaOven.add(CriteriaList.Oven.DEPTH.toString(), 60);

        applianceList = service.find(criteriaOven);

        PrintApplianceInfo.print(applianceList);

        //////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria(Oven.class.getSimpleName());
		criteriaOven.add(CriteriaList.Oven.HEIGHT.toString(), 40);
		criteriaOven.add(CriteriaList.Oven.DEPTH.toString(), 60);

		applianceList = service.find(criteriaOven);

		PrintApplianceInfo.print(applianceList);

		//////////////////////////////////////////////////////////////////

        Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
        criteriaTabletPC.add(CriteriaList.TabletPC.COLOR.toString(), "blue");
        criteriaTabletPC.add(CriteriaList.TabletPC.DISPLAY_INCHES.toString(), 14);
        criteriaTabletPC.add(CriteriaList.TabletPC.MEMORY_ROM.toString(), 8000);

        applianceList = service.find(criteriaTabletPC);

        PrintApplianceInfo.print(applianceList);
    }

}
