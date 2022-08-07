package revision.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Find Two Numbers that Add up to "n"  brute force approach
public class AddUpToN {

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low;
        int j = low;
        while (i <= high) {
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

    public static void sort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            sort(arr, low, partitionIndex - 1);
            sort(arr, partitionIndex + 1, high);
        }

    }


    public static int[] findSumThroughQuickSort(int arr[], int n) {
        sort(arr, 0, arr.length - 1);

        // Arrays.sort(arr);

        int pointer1 = 0;
        int pointer2 = arr.length - 1;

        int sum = 0;

        int result[] = new int[2];

        while (pointer1 < pointer2) {
            sum = arr[pointer1] + arr[pointer2];

            if (sum < n) {
                pointer1++;
            } else if (sum > n) {
                pointer2--;

            } else {
                result[0] = arr[pointer1];
                result[1] = arr[pointer2];
                break;
            }
        }

        return result;
    }

//    public static int[] findSum(int[] arr, int n) {
//        int result[] = new int[2];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] + arr[j] == n) {
//                    result[0] = arr[i];
//                    result[1] = arr[j];
//                }
//
//            }
//        }
//        return result;
//
//    }


    public static int[] findSumThroughSet(int[] arr, int n) {

        int[] result = new int[2];
        Set<Integer> set = new HashSet<>();

        for (int i : arr) {
            if (set.contains(n - i)) {
                result[0] = n - i;
                result[1] = i;
                break;
            } else {
                set.add(i);
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int n = 9;
        int arr[] = {2, 11, 5, 10, 7, 8};

        //int[] result = findSum(arr, n);
        //int[] result = findSumThroughQuickSort(arr, n);
        int[] result = findSumThroughSet(arr, n);
        int num1 = result[0];
        int num2 = result[1];
        System.out.println("Number 1 = " + num1);
        System.out.println("Number 2 = " + num2);

    }

}
