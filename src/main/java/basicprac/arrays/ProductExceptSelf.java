package basicprac.arrays;

import java.util.Arrays;

public class ProductExceptSelf {
    public static int[] findProduct(int[] arr) {
        int n = arr.length;
        //int[] left_product = new int[n];
      //  int[] rightproduct = new int[n];
        int[] outputarray = new int[n];
        outputarray[0] = 1;
        //    rightproduct[n - 1] = 1;
        for (int i = 1; i < n; i++) {
            outputarray[i] = arr[i - 1] * outputarray[i - 1];
        }
        int R = 1;
        for (int i = n - 1; i >= 0; i--) {
            outputarray[i] = R * outputarray[i];
            R = R * arr[i];
        }
//        for(int i=0;i<n;i++)
//        {
//            result[i]=left_product[i]*rightproduct[i];
//        }
        return outputarray;
    }

    public static String arrayToString(int[] arr) {
        String result = "";
        if (arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                result += arr[i] + "";
            }
            return result;
        } else {
            return "Empty Array!";
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] prodArray = findProduct(arr);
        System.out.println(Arrays.toString(prodArray));
    }
}
