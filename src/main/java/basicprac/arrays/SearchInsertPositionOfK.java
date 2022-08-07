package basicprac.arrays;

public class SearchInsertPositionOfK {

    static int find_index(int[] arr, int n, int target) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (target < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        int n = arr.length;
        int k = 4;
        System.out.println(find_index(arr, n, k));
    }
}
