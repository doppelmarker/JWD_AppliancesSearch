package com.markedline.task01.dao.impl;

import com.markedline.task01.dao.ApplianceDAO;
import com.markedline.task01.entity.base.Appliance;
import com.markedline.task01.entity.base.ApplianceFactory;
import com.markedline.task01.entity.base.ApplianceType;
import com.markedline.task01.entity.criteria.Criteria;
import com.markedline.task01.util.FileWorker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ApplianceDAOImpl implements ApplianceDAO {

    @Override
    public List<Appliance> find(Criteria criteria) {
        List<Appliance> applianceList = new ArrayList<>();
        FileWorker fileWorker = new FileWorker();
        List<HashMap<String, Object>> categoryMapList = fileWorker.extractInfo(criteria);
        for (HashMap<String, Object> categoryMap : categoryMapList) {
            applianceList.add(ApplianceFactory.createAppliance(ApplianceType.valueOf((String) categoryMap.get(FileWorker.TYPE)), categoryMap));
        }
        return applianceList;
    }
}