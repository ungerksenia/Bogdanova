package lesson4;

public class ArrayBoundsTest {
    public static void main(String[] args) {
        int arr[] = new int[3];

        try {
            arr[10] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }
}
