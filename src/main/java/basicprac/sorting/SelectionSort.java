package basicprac.sorting;

public class SelectionSort {
    public static void printArray(int[] arr) {
        //  int n = arr.length - 1;
        for (int i : arr) {
            System.out.println(i + "");
        }
        System.out.println();
    }

    public void sSort(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }


    public static void main(String[] args) {

        int[] arr = new int[]{5, 1, 2, 9, 10};
        SelectionSort ss = new SelectionSort();
        ss.printArray(arr);
        ss.sSort(arr);
        ss.printArray(arr);
    }

}
