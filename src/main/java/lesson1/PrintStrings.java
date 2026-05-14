package lesson1;

public class PrintStrings {
    public static void main(String[] args) {
        printStrings("капибара гуляет на лугу", 3) ;
    }
    public static void printStrings(String animal, int a) {
        for (int i = 0; i < a ; i++) {
            System.out.println(animal);
        }
    }
}
