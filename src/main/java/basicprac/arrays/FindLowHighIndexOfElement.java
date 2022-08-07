package basicprac.arrays;

import java.util.Arrays;

public class FindLowHighIndexOfElement {

    public static int findLowIndex(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int index = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

            if (arr[mid] == target) {
                index = mid;
            }
        }

        return index;
    }

    public static int findHighIndex(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int index = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            if (arr[mid] == target) {
                index = mid;
            }


        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 6, 6};
        System.out.println(Arrays.toString(nums));

        int target = 2;
        int low = findLowIndex(nums, target);
        int high = findHighIndex(nums, target);
        System.out.println("Low Index of " + target + ": " + low);
        System.out.println("High Index of " + target + ": " + high);

        target = -2;
        low = findLowIndex(nums, target);
        high = findHighIndex(nums, target);
        System.out.println("Low Index of " + target + ": " + low);
        System.out.println("High Index of " + target + ": " + high);
    }
}
