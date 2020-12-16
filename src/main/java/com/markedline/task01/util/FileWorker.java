package com.markedline.task01.util;

import com.markedline.task01.entity.criteria.Criteria;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileWorker {
    private static final String FILE_NAME = "appliances_db.txt";
    private static final String COLON = ":";
    private static final String COMMA = ",";
    private static final String EQUAL_SIGN = "=";
    private BufferedReader reader;

    public FileWorker() {
        try {
            reader = new BufferedReader(new FileReader(new File(FILE_NAME)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public HashMap<String, Object> splitLine(String line) {

        HashMap<String, Object> coupleMap = new HashMap<>();
        String[] typeAndCouples = beautify(line.split(COLON));
        coupleMap.put("TYPE", typeAndCouples[0].toUpperCase());
        String[] couples = beautify(typeAndCouples[1].split(COMMA));

        for (String couple : couples) {
            String[] finalCouple = couple.split(EQUAL_SIGN);
            coupleMap.put(finalCouple[0], finalCouple[1]);
        }
        return coupleMap;
    }

    private String[] beautify(String[] strings) {
        String[] stringArray = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            stringArray[i] = strings[i].trim();
        }
        return stringArray;
    }

    public boolean checkLine(Criteria criteria, String line) {
        if (line.contains(criteria.getGroupSearchName())) {
            Map<String, Object> coupleMap = splitLine(line);
            for (String key : criteria.getKeys()) {
                if (!coupleMap.get(key).equals(criteria.getCriteriaMap().get(key).toString()))
                    return false;
            }
        } else return false;
        return true;
    }

    public List<HashMap<String, Object>> extractInfo(Criteria criteria) {
        List<HashMap<String, Object>> categoryMapList = new ArrayList<>();
        try {
            String line = reader.readLine();
            while (line != null) {
                if (checkLine(criteria, line))
                    categoryMapList.add(splitLine(line));
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return categoryMapList;
    }
}
