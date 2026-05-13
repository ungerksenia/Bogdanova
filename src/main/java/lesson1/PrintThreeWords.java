package lesson1;

public class PrintThreeWords {
    public static void main(String[] args) {
        printThreeWords() ;
    }
    public static void printThreeWords() {
        String[] fruits = {"Orange", "Banana", "Apple"};
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
