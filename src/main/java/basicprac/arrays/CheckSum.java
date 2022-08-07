package basicprac.arrays;
//Find Two Numbers that Add up to "n"
//brute force solution

import java.util.HashMap;
import java.util.Map;

public class CheckSum {


//quicksort

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start;
        int j = start;
        while (i <= end) {
            if (arr[i] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;

            }
            i++;

        }
        return j - 1;
    }


    public static void sort(int[] arr, int start, int end) {
        if (start < end) {
            int pi = partition(arr, start, end);
            sort(arr, start, pi - 1);
            sort(arr, pi + 1, end);
        }
    }


    public static int[] findsum2(int[] arr, int n) {
        sort(arr, 0, arr.length - 1);
        int pointer1 = 0;
        int pointer2 = arr.length - 1;
        int[] result = new int[2];
        int sum = 0;
        while (pointer1 != pointer2) {
            sum = arr[pointer1] + arr[pointer2];
            if (sum < n)

                pointer1++;
            else if (sum > n)
                pointer2--;
            else {
                result[0] = arr[pointer1];
                result[1] = arr[pointer2];
                return result;
            }

        }
        return arr;
    }
//hashtable approach

    public static int[] findsum3(int[] arr, int n) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(n - arr[i])) {
                result[1] = i;
                result[0] = map.get(n - arr[i]);
                return result;

            }
            map.put(arr[i], i);
        }
        return result;
    }

    //brute force

    public static int[] findSum(int[] arr1, int n) {
        int[] result = new int[2];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] + arr1[j] == n) {
                    result[0] = arr1[i];
                    result[1] = arr1[j];
                    return result;
                }
            }
        }
        return arr1;
    }

    public static void main(String[] args) {
        int n = 9;
        int arr1[] = {2, 4, 5, 7, 8};
        if (arr1.length > 0) {
            //  int[] arr2 = findSum(arr1, n);
            // int[] arr2 = findsum2(arr1, n);
            int[] arr2 = findsum2(arr1, n);
            int num1 = arr2[0];
            int num2 = arr2[1];

            if (num1 + num2 != n)
                System.out.println("Not Found");
            else {
                System.out.println("Number 1 = " + num1);
                System.out.println("Number 2 = " + num2);
                System.out.println("sum" + n);
            }
        } else {
            System.out.println("Input Array is Empty!");
        }
    }
}
