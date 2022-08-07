package basicprac.arrays;

import jdk.swing.interop.SwingInterOpUtils;

public class MaxDifference {
    //// Function to calculate the maximum difference between two elements in an
    //    // array such that a smaller element appears before a larger element


    public static int getMaxDiff(int[] arr) {
        int diff = Integer.MIN_VALUE;
        int n = arr.length;
        if (n == 0) {
            return diff;
        }
        int max_so_far = arr[n - 1];
        // traverse the array from the right and keep track of the maximum element
        for (int i = n - 2; i >= 0; i--) {
            // update `max_so_far` if the current element is greater than the
            // maximum element
            if (arr[i] >= max_so_far) {
                max_so_far = arr[i];
            }
            // if the current element is less than the maximum element,
            // then update the difference if required
            else {
                diff = Integer.max(diff, max_so_far - arr[i]);
            }
        }
        return diff;
    }

    public static void main(String[] args) {
        int[] A = {2, 7, 9, 5, 1, 3, 5};
        int diff = getMaxDiff(A);
        if (diff != Integer.MIN_VALUE) {
            System.out.println("The maximum difference is " + diff);
        }
    }
}
