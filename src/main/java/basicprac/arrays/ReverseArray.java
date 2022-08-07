package basicprac.arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void reverseArray(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(arr));
        reverseArray(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
