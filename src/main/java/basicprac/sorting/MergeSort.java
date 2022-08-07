package basicprac.sorting;

public class  MergeSort {

    public void merge(int[] arr, int[] temp, int low, int mid, int high) {
        for (int i = low; i <= high; i++) {
            temp[i] = arr[i];
        }
        int i = low;//traverse left sorted subarray
        int j = mid + 1;//traverse right sorted subarray
        int k = low;//will merge both arrays in to original array(arr)
        //any of the two arrays can get exhausted so this condition will break
        while (i <= mid && j <= high) {
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            arr[k] = temp[i];
            k++;
            i++;
        }

    }

    public void mSort(int[] arr, int[] temp, int low, int high) {
        //base case
        if (low < high) {
            int mid = low + (high - low) / 2; //overflow condition(low+high)/2 it can give some garbage value (low+high)/2
            mSort(arr, temp, low, mid);
            mSort(arr, temp, mid + 1, high);
            merge(arr, temp, low, mid, high);
        }

    }

    public static void main(String[] args) {
        int[] arr = new int[]{9, 5, 2, 4, 3,-1};
        MergeSort ms = new MergeSort();
        ms.printArray(arr);
        ms.mSort(arr, new int[arr.length], 0, arr.length - 1);
        ms.printArray(arr);
    }

    public static void printArray(int[] arr) {
        //  int n = arr.length - 1;
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
