package basicprac.sorting;

public class InsertionSort {

    public static void printArray(int[] arr) {
        //  int n = arr.length - 1;
        for (int i : arr) {
            System.out.println(i + "");
        }
        System.out.println();
    }

    public void iSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n - 1; i++) {
            int j = i - 1;
            int temp = arr[i];

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args) {

        int[] arr = new int[]{5, 1, 2, 9, 10};
        InsertionSort is = new InsertionSort();
        is.printArray(arr);
        is.iSort(arr);
        is.printArray(arr);

    }
}
