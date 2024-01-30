package by.aston.aqa;

import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) {
        // условие
        System.out.println("Реализовать сохранение данных в csv файл; Реализовать загрузку данных из csv файла. Файл читается целиком.");
        // создание файла и обработка исключений
        try {
            File file = new File("homework.csv");
            if (file.createNewFile()) {
                System.out.println("Файл создан");
            } else {
                System.out.println("Файл уже существует");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при создании файла");
            e.printStackTrace();
        }
    }

}



