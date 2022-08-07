package basicprac.arrays;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {
    //time complexity isO(n) but space complexity is also On
    public static int[] twoNumbers(int[] arr, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(target - arr[i])) {
                map.put(arr[i], i);
            } else {
                result[0] = i;
                result[1] = map.get(target - arr[i]);
                return result;
            }

        }
        throw new IllegalArgumentException("two numbers not found");

    }

    //time complexity isO(n) but if we want space complexity  also O(1)

    public static int[] twoNumbersWithGoodSpaceComplexity(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        int[] result = new int[2];
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                result[0] = arr[left];
                result[1] = arr[right];
                return result;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        throw new IllegalArgumentException("not found elements");
    }


    public static void main(String[] args) {
        int[] numbers = new int[]{2, 11, 5, 10, 7, 8};
        int[] result = twoNumbers(numbers, 9);
        //int[] result2 = twoNumbersWithGoodSpaceComplexity(numbers, 9);
        System.out.println("two indeces are" + result[0] + "and" + result[1]);
       // System.out.println("two indeces are" + result2);
    }
}
