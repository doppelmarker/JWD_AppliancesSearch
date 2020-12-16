package com.markedline.task01.dao.impl;

import com.markedline.task01.dao.ApplianceDAO;
import com.markedline.task01.entity.Appliance;
import com.markedline.task01.entity.criteria.Criteria;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ApplianceDAOImpl implements ApplianceDAO {

    List<Appliance> applianceList = new ArrayList<>();

    @Override
    public Appliance find(Criteria criteria) {
        if (!criteria.isGroupSearchNameOk()) return null;

        List<String> listFields = new ArrayList<>(criteria.getCriteria().keySet());
        List<Object> listValues = (List<Object>) criteria.getCriteria().values();


        for (Appliance appliance : applianceList) {
            Field[] fields = appliance.getClass().getFields();
            for (int i = 0; i < listFields.size(); i++) {
                int finalI = i;
                Field field = Arrays.stream(fields).filter(x -> x.getName().equals(listFields.get(finalI))).findAny().
                        orElse(null);

                if (field == null) return null;

                try {
                    if (!listValues.get(i).equals(field.get(appliance))) {
                        return null;
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }

                //return appliance;
            }
        }
        return null;
    }

    @Override
    public void add(Appliance appliance) {
        applianceList.add(appliance);
    }
}


//you may add your own new classes