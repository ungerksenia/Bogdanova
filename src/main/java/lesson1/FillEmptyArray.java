package lesson1;

public class FillEmptyArray {
    public static void main(String[] args) {
        fillEmptyArray(100) ;
    }
    public static void fillEmptyArray(int a) {
        int[] arr = new int[a] ;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.println(arr[i]);
        }
    }
}
