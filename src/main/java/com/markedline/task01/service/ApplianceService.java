package com.markedline.task01.service;

import com.markedline.task01.entity.Appliance;
import com.markedline.task01.entity.criteria.Criteria;

public interface ApplianceService {	
	
	Appliance find(Criteria criteria);


	void add(Appliance appliance);
}
