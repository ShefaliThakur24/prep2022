package matrix;

public class SearchElementInRowWiseSortedMatrix {

    public static boolean search(int[][] mat, int n, int x) {
        if (mat.length == 0) {
            return false;
        }
        int low = 0;
        int high = (n * n) - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mat[mid / n][mid % n] == x) {
                return true;
            }
            if (mat[mid / n][mid % n] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int mat[][] = {{1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}};
        boolean result = search(mat, 3, 16); //n is size of matrix
        System.out.println(result);
    }
}
