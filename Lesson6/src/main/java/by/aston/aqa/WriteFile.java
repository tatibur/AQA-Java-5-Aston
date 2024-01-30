package by.aston.aqa;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        String[] header = {"value1", "value2", "value3"};
        int[][] data = {{200, 150, 250}, {110, 150, 360}};
        AppData ad = new AppData(header, data);
        ad.generateCSV();
        // запись в файл и обработка исключений
        try {
            FileWriter writer = new FileWriter("homework.csv");
            writer.write(ad.csvData);
            writer.close();
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл");
            e.printStackTrace();
        }
    }
}

