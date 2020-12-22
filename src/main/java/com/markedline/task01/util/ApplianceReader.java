package com.markedline.task01.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ApplianceReader implements ApplianceCommonReader {

    private static final String FILE_NAME = "appliances_db.txt";
    private BufferedReader reader;

    public ApplianceReader() {
        try {
            reader = new BufferedReader(new FileReader(new File(FILE_NAME)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<String> readAll() {
        List<String> lines = new ArrayList<>();

        try {
            String line = reader.readLine();
            while (line != null) {
                if (!line.isEmpty())
                    lines.add(line);
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
        return lines;
    }
}
