package by.aston.aqa;

import java.io.Serializable;

public class AppData implements Serializable {
    private String[] header;
    private int[][] data;
    final String delimiter = ";";
    public String csvData; // содержимое файла

    // конструктор класса AppData
    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    // метод создания заголовков и значений
    public void generateCSV() {
        this.csvData = "";
        for (int i = 0; i < header.length; i++) {
            this.csvData = this.csvData + header[i];
            if (i < header.length - 1) {
                this.csvData = this.csvData + this.delimiter;
            }
        }
        this.csvData = this.csvData + "\n";// перенос каретки

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                this.csvData = this.csvData + data[i][j];

                if (j < data[0].length - 1) {
                    this.csvData = this.csvData + this.delimiter;
                }
            }
            this.csvData = this.csvData + "\n";
        }
        System.out.println(this.csvData);
    }
}


