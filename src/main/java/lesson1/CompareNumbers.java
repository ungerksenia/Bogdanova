package lesson1;

public class CompareNumbers {
    public static void main(String[] args) {
        compareNumbers(20, 17) ;
    }
    public static void compareNumbers(int a, int b) {
        if (a>=b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
}
