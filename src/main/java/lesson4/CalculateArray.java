package lesson4;

public class CalculateArray {
    public static void main(String[] args) {

        String[][] table = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            newArray(table);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void newArray(String[][] table) throws MyArraySizeException, MyArrayDataException {

        if (table.length != 4) {
            throw new MyArraySizeException("Массив должен быть 4x4");
        }

        for (String[] strings : table) {
            if (strings.length != 4) {
                throw new MyArraySizeException("Массив должен быть 4x4");
            }
        }
        System.out.println("Массив корректный");


        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    int number = Integer.parseInt(table[i][j]);
                    sum += number;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверные данные в ячейке [" + i + "][" + j + "]");
                }
            }
        }
        System.out.println(sum);
    }
}


