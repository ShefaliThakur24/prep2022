package basicprac.arrays;

import java.util.Arrays;

public class MergeTwoSortedArray {

    public static int[] merge(int[] array1, int[] array2, int n, int m) {
        int[] result = new int[n + m];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n && j < m) {
            if (array1[i] < array2[j]) {
                result[k] = array1[i];
                i++;
            } else {
                result[k] = array2[j];
                j++;
            }
            k++;
        }
        while (i < n) {
            result[k] = array1[i];
            i++;
            k++;
        }
        while (j < m) {
            result[k] = array2[j];
            j++;
            k++;
        }
        return result;

    }

    public static void main(String[] args) {
        int[] arr1 = {0, 1, 8, 10};
        int arr2[] = {2, 4, 11, 15, 20};
        int[] result = merge(arr1, arr2, arr1.length, arr2.length);
        System.out.println(Arrays.toString(result));
    }
}
