package lesson1;

import java.util.Arrays;

public class CreateFilledArray {
    public static void main(String[] args) {
        int[] arr = createFilledArray(15, 6);
            System.out.print(Arrays.toString(arr));

    }

    private static int[] createFilledArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}
