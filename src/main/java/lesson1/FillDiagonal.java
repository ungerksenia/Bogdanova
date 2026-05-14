package lesson1;

public class FillDiagonal {
    public static void main(String[] args) {
        fillDiagonal(new int[7][7]);
    }
    public static void fillDiagonal(int[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (table[i].length != table.length) {
                    System.out.println("Массив не квадратный");
                    return;
                }else if (i == j || i + j == table.length - 1) {
                    table[i][j] = 1;
                    System.out.print(table[i][j] + " ");
                } else
                    System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}
