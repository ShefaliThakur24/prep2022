package revision.arrays;

import java.util.Map;

public class FindMinMaxElementInArray {

    public static void findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);

        }
        System.out.println(min + " " + max);
    }

    public static void main(String[] args) {
        int[] arr = {1000, 11, 445, 1, 330, 3000};
        findMinMax(arr);

    }
}
