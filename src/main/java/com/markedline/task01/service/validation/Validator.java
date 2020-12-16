package com.markedline.task01.service.validation;

import com.markedline.task01.entity.criteria.Criteria;

public class Validator {

    public static boolean criteriaValidator(Criteria criteria) {
        if (!criteria.isGroupSearchNameOk())
            return false;

        for (Object value : criteria.getCriteriaMap().values()) {
			if (value == null)
			    return false;
        }
        return true;
    }
}