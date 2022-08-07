package basicprac.arrays;

import java.util.Arrays;

public class MoveZeroes {
    //zeroes to end
    public static void moveZeroes(int[] arr) {

        if (arr.length < 1) {
            return;
        }

        int size = arr.length;
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        while (count < size) {
            arr[count++] = 0;
        }}

    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 3, 4, 0, 0, 2};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
