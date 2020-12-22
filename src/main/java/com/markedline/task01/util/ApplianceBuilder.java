package com.markedline.task01.util;

import com.markedline.task01.entity.base.Appliance;
import com.markedline.task01.entity.base.ApplianceFactory;
import com.markedline.task01.entity.base.ApplianceType;

import java.util.HashMap;

public class ApplianceBuilder {

    private static final String TYPE = "TYPE";

    public Appliance build(HashMap<String, Object> paramsMap) {
        return ApplianceFactory.createAppliance(ApplianceType.valueOf((String) paramsMap.get(TYPE)), paramsMap);
    }
}
