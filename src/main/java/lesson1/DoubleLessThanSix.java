package lesson1;

public class DoubleLessThanSix {
    public static void main(String[] args) {
        doubleLessThanSix(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1});
    }
    public static void doubleLessThanSix(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            if (arr[i]<6) {
                arr[i] *= 2;
            }
            System.out.print(arr[i] + " ");
        }
    }
}