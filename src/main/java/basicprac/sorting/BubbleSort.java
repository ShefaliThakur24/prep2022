package basicprac.sorting;

public class BubbleSort {

    public static void printArray(int[] arr) {
        //  int n = arr.length - 1;
        for (int i : arr) {
            System.out.println(i + "");
        }
        System.out.println();
    }

    public void bSort(int[] arr) {
        int n = arr.length;
        boolean isSwapped;
        for (int i = 0; i < n - 1; i++) {
            isSwapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) break;
        }
    }



    public static void main(String[] args) {
        int[] arr = new int[]{5, 1, 2, 9, 10};
        BubbleSort bs = new BubbleSort();
        bs.printArray(arr);
        bs.bSort(arr);
        bs.printArray(arr);
    }
}
