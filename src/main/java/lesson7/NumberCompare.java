package lesson7;

public class NumberCompare {

    public static String numberCompare(int a, int b) {

        if (a > b) {
            return a + " больше " + b;
        } else if (a < b) {
            return a + " меньше " + b;
        } else {
            return "Числа равны";
        }
    }
}
