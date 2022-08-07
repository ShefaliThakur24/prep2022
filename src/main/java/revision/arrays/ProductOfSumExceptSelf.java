package revision.arrays;

import java.util.Arrays;

public class ProductOfSumExceptSelf {

    public static int[] productArray(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * arr[i - 1];
        }
        int productRight = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = productRight * result[i];
            productRight = productRight * arr[i];
        }
        return result;
    }

    public static String arrayToString(int arr[]) {
        if (arr.length > 0) {
            String res = "";
            for (int i = 0; i < arr.length; i++) {
                res += arr[i] + "";
            }
            return res;
        } else {
            return "Empty Array!";
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        int[] result = productArray(arr);
        System.out.println(Arrays.toString(result));
    }
}
