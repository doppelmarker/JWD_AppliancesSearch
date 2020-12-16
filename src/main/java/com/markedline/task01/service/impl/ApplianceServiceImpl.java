package com.markedline.task01.service.impl;

import com.markedline.task01.dao.ApplianceDAO;
import com.markedline.task01.dao.DAOFactory;
import com.markedline.task01.entity.Appliance;
import com.markedline.task01.entity.criteria.Criteria;
import com.markedline.task01.service.ApplianceService;
import com.markedline.task01.service.validation.Validator;

public class ApplianceServiceImpl implements ApplianceService{

	@Override
	public Appliance find(Criteria criteria) {
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();
		
		Appliance appliance = applianceDAO.find(criteria);
		
		// you may add your own code here
		
		return appliance;
	}

	@Override
	public void add(Appliance appliance) {
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();

		applianceDAO.add(appliance);
	}

}

//you may add your own new classes
