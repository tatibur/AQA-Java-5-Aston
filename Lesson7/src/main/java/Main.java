/* Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException и вывести результат расчета.*/
public class Main {
    public static void main(String[] args) {
        String[][] arrayMain = new String[][]{{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        try {
            try {
                int totalSum = Method.justMethod(arrayMain);
                System.out.println(totalSum);
            } catch (myArraySizeException e) {
                System.out.println("Неверный размер массива");
            }
        } catch (myArrayDataException e) {
            System.out.println("Ошибка в ячейке: " + e.i + e.j);
        }
    }
}

