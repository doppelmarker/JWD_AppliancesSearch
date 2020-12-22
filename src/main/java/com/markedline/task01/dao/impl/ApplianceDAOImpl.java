package com.markedline.task01.dao.impl;

import com.markedline.task01.dao.ApplianceDAO;
import com.markedline.task01.entity.base.Appliance;
import com.markedline.task01.entity.criteria.Criteria;
import com.markedline.task01.util.ApplianceBuilder;
import com.markedline.task01.util.ApplianceFilter;
import com.markedline.task01.util.ApplianceParser;
import com.markedline.task01.util.ApplianceReader;

import java.util.ArrayList;
import java.util.List;

public class ApplianceDAOImpl implements ApplianceDAO {

    @Override
    public List<Appliance> find(Criteria criteria) {

        ApplianceReader applianceReader = new ApplianceReader();
        List<String> applianceData = applianceReader.readAll();

        ApplianceFilter applianceFilter = new ApplianceFilter(applianceData);
        List<String> filteredApplianceData = applianceFilter.filter(criteria);

        ApplianceBuilder applianceBuilder = new ApplianceBuilder();
        List<Appliance> applianceList = new ArrayList<>();
        for (String line : filteredApplianceData) {
            applianceList.add(applianceBuilder.build(new ApplianceParser().parse(line)));
        }

        return applianceList;
    }
}