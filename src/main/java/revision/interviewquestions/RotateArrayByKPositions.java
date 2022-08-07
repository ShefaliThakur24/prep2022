package revision.interviewquestions;

import java.util.Arrays;

public class RotateArrayByKPositions {
    public static int[] reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    public static int[] rotateOptimized(int arr[], int numberOfRotataions) {
        int length = arr.length;
        if (numberOfRotataions > length)
            numberOfRotataions = numberOfRotataions % length;
        arr = reverse(arr, 0, length - 1);
        arr = reverse(arr, 0, numberOfRotataions - 1);
        arr = reverse(arr, numberOfRotataions, length - 1);
        return arr;
    }


    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] result= rotateOptimized(nums, 3);
        System.out.println(Arrays.toString(result));

    }
}
