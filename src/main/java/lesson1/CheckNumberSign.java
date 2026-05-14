package lesson1;

public class CheckNumberSign {
    public static void main(String[] args) {
        checkNumberSign(-5667);
    }
    public static void checkNumberSign(int a) {
        if (a>=0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }
    
}
