package revision.arrays;

public class MaxMinArrange {

    public static int[] maxMin(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        boolean switchPointer = true;
        int pointer1 = 0;
        int pointer2 = n - 1;

        for (int i = 0; i < n; i++) {
            if (switchPointer) {
                result[i] = arr[pointer2--];
            } else {
                result[i] = arr[pointer1++];
            }
            switchPointer = !switchPointer;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] result = maxMin(arr);

    }
}
