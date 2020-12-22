package com.markedline.task01.util;

import com.markedline.task01.entity.criteria.Criteria;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ApplianceFilter {

    private static final String EQUAL_SIGN = "=";
    private final List<String> lines;

    public ApplianceFilter(List<String> lines) {
        this.lines = lines;
    }

    public List<String> filter(Criteria criteria) {
        List<String> filteredLines = new ArrayList<>();

        for (String line : lines) {
            if (checkLine(line, criteria))
                filteredLines.add(line);
        }
        return filteredLines;
    }

    private boolean checkLine(String line, Criteria criteria) {
        if (line.contains(criteria.getGroupSearchName())) {
            for (Map.Entry entry : criteria.getCriteriaMap().entrySet()) {
                String key = (String) entry.getKey();
                Object value = entry.getValue();
                if (!line.contains(key + EQUAL_SIGN + value))
                    return false;
            }
            return true;
        } else return false;
    }
}
