package lesson1;

public class IsLeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(6444));
    }
    public static boolean isLeapYear(int a) {
        if (a % 400 == 0) {
            return true; 
        } else if (a % 100 == 0) {
            return false;
        } else if (a % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
    
}
