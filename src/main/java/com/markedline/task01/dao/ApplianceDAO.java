package com.markedline.task01.dao;

import com.markedline.task01.entity.base.Appliance;
import com.markedline.task01.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceDAO {
	List<Appliance> find(Criteria criteria);
}
