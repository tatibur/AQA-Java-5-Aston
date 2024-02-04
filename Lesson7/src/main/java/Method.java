public class Method {
    static int sum = 0;

    public static int justMethod(String[][] array) throws myArraySizeException, myArrayDataException {
        try {
            if (array.length != 4) {
                throw new myArraySizeException();
            }
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    try {
                        sum = sum + Integer.parseInt(array[i][j]);
                    } catch (NumberFormatException e) {
                        throw new myArrayDataException(i, j);
                    }
                }
            }
            return sum;
        } finally {
            System.out.println("Результат работы программы: ");
        }

    }
}