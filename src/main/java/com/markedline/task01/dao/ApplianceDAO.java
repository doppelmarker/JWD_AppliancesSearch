package com.markedline.task01.dao;

import com.markedline.task01.entity.Appliance;
import com.markedline.task01.entity.criteria.Criteria;

public interface ApplianceDAO {
	Appliance find(Criteria criteria);

	void add(Appliance appliance);
}
