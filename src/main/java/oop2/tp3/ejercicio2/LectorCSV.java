package oop2.tp3.ejercicio2;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class LectorCSV implements FuenteDeDatos {
    private String path;

    public LectorCSV(String path) {
        this.path = path;
    }

    @Override
    public List<String[]> toList() {
        try {
            List<String[]> csvData = new ArrayList<>();
            CSVReader reader = new CSVReader(new FileReader(this.path));
            String[] row;

            while ((row = reader.readNext()) != null) {
                csvData.add(row);
            }

            reader.close();
            csvData.remove(0);
            return csvData;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
