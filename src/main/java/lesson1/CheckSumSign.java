package lesson1;

public class CheckSumSign {
    public static void main(String[] args) {
        checkSumSign(3, 9);
    }
    public static void checkSumSign(int a, int b) {
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        } 
    }
}
