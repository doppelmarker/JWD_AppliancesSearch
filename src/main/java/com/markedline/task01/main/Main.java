package com.markedline.task01.main;

import static com.markedline.task01.entity.criteria.SearchCriteria.*;

import com.markedline.task01.entity.Appliance;
import com.markedline.task01.entity.Oven;
import com.markedline.task01.entity.criteria.Criteria;
import com.markedline.task01.entity.criteria.SearchCriteria;
import com.markedline.task01.service.ApplianceService;
import com.markedline.task01.service.ServiceFactory;

public class Main {

	public static void main(String[] args) {
		Appliance appliance;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		service.add(new Oven(1000., 1000, 10., 32., 60., 45.5, 59.5));
		service.add(new Oven(2000., 1500, 12., 33., 60., 45., 68.));
		service.add(new Oven(3000., 2000, 11., 33., 60., 40., 70.));

		Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());//"Oven"
		criteriaOven.add(SearchCriteria.Oven.CAPACITY.toString(), 32.);

		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria(Oven.class.getSimpleName());
		criteriaOven.add(SearchCriteria.Oven.HEIGHT.toString(), 200);
		criteriaOven.add(SearchCriteria.Oven.DEPTH.toString(), 300);

		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////
		
		Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
		criteriaTabletPC.add(SearchCriteria.TabletPC.COLOR.toString(), "BLUE");
		criteriaTabletPC.add(SearchCriteria.TabletPC.DISPLAY_INCHES.toString(), 14);
		criteriaTabletPC.add(SearchCriteria.TabletPC.MEMORY_ROM.toString(), 4);

		appliance = service.find(criteriaOven);// find(Object...obj)

		PrintApplianceInfo.print(appliance);

	}

}
