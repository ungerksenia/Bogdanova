package lesson1;

public class IsSumInRange {
    public static void main(String[] args) {
        System.out.println(isSumInRange(4, 6)) ;
    }
    public static boolean isSumInRange(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }
}
