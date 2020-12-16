package com.markedline.task01.service;

import com.markedline.task01.entity.base.Appliance;
import com.markedline.task01.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceService {	
	
	List<Appliance> find(Criteria criteria);
}
