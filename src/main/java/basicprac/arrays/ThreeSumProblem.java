package basicprac.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumProblem {

    public static List<List<Integer>> threeNumbers(int[] arr, int target) throws RuntimeException {

        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            int j = i + 1;
            int k = arr.length - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum == target) {
                    System.out.println(arr[i] + "" + arr[j] + "" + arr[k] + "");
                    j++;
                    k--;
                } else if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }


        }
       throw new RuntimeException("no sum found");
    }

    public static void main(String[] args) {


        int[] numbers = {2, 4, 3, 7, 1, 8, 9, 0};

        List<List<Integer>> list = threeNumbers(numbers, 6);
        System.out.println(list);

    }
}
