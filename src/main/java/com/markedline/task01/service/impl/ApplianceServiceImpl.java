package com.markedline.task01.service.impl;

import com.markedline.task01.dao.ApplianceDAO;
import com.markedline.task01.dao.DAOFactory;
import com.markedline.task01.entity.base.Appliance;
import com.markedline.task01.entity.criteria.Criteria;
import com.markedline.task01.service.ApplianceService;
import com.markedline.task01.service.validation.Validator;

import java.util.ArrayList;
import java.util.List;

public class ApplianceServiceImpl implements ApplianceService{

	@Override
	public List<Appliance> find(Criteria criteria) {
		if (!Validator.criteriaValidator(criteria)) {
			return new ArrayList<>();
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();

		return applianceDAO.find(criteria);
	}
}