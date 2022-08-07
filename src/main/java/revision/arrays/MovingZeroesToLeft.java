package revision.arrays;

import java.util.Arrays;

public class MovingZeroesToLeft {
    public static void moveZeroes(int[] arr) {
        int size = arr.length;
        int readIndex = size - 1;
        int writeIndex = size - 1;

        while (readIndex >= 0) {
            if (arr[readIndex] != 0) {
                arr[writeIndex--] = arr[readIndex];
            }
            readIndex--;
        }

        while (writeIndex >= 0)
            arr[writeIndex--] = 0;


    }


    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 3, 4, 0, 0, 2};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
