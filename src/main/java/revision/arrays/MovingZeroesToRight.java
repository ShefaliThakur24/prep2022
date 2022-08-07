package revision.arrays;


import java.util.Arrays;

public class MovingZeroesToRight {

    public static void moveZeroes(int[] arr) {
        int readIndex = 0;//index value
        int writeIndex = 0;
        while(readIndex<=arr.length-1) {
            if (arr[readIndex] != 0) {
                arr[writeIndex++] = arr[readIndex];
            }
            readIndex++;
        }
        while (writeIndex < arr.length) {
            arr[writeIndex++] = 0;
        }


    }

    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 3, 4, 0, 0, 2};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));


    }
}
