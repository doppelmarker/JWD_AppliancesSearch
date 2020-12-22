package com.markedline.task01.util;

import java.util.HashMap;

public class ApplianceParser {

    private static final String TYPE = "TYPE";
    private static final String COLON = ":";
    private static final String COMMA = ",";
    private static final String EQUAL_SIGN = "=";

    public HashMap<String, Object> parse(String line) {
        HashMap<String, Object> applianceMap = new HashMap<>();
        String[] typeAndCouples = beautify(line.split(COLON));
        applianceMap.put(TYPE, typeAndCouples[0].toUpperCase());
        String[] couples = beautify(typeAndCouples[1].split(COMMA));

        for (String couple : couples) {
            String[] finalCouple = couple.split(EQUAL_SIGN);
            applianceMap.put(finalCouple[0], finalCouple[1]);
        }
        return applianceMap;
    }

    private String[] beautify(String[] strings) {
        String[] stringArray = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            stringArray[i] = strings[i].trim();
        }
        return stringArray;
    }
}
