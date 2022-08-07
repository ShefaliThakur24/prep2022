package revision.arrays;

public class FindDuplicatesInSortedArray {

    public static int findDup(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5};
        int length = findDup(arr);
        System.out.println(length);
    }

}
