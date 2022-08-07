package basicprac.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class SlidingWindowMax {

    public static List<Integer> maxSliding(int[] arr, int k) {
        int[] greaterElementIndex = nextGreaterElement(arr);
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i <= arr.length - k; i++) {
            int j = i;
            while (greaterElementIndex[j] < i + k) {//i+k-1//0+3-1//window 0-2
                j = greaterElementIndex[j];

            }
            result.add(arr[j]);
        }
        return result;
    }

    public static int[] nextGreaterElement(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (!stack.isEmpty()) {
                while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                    stack.pop();
                }
            }

            if (stack.isEmpty()) {
                result[i] = arr.length;
            } else {
                result[i] = stack.peek();
            }
            stack.push(i);
        }
        return result;

    }

    public static void main(String[] args) {
        int[] nums = {44, 77, 33, 44, 88, 11};
        int k = 3;
        System.out.println(Arrays.toString(nums));
        int array[] = nextGreaterElement(nums);
        System.out.println(Arrays.toString(array));
        List<Integer> list = maxSliding(nums, k);
        System.out.println(list);

    }
}

