package matrix;

public class SearchElementInRowAndColWiseSortedMatrix {

    public static void search(int[][] mat, int n, int x) {
        //initially the pointer will stand at first row and last column
        int i = 0, j = n - 1;//// set indexes for top right
        //since we are moving down in row it might get less that size of matrix and we are moving j to left of each coluns
        //so it might get less that zero
        while (i < n && j >= 0) {
            if (mat[i][j] == x) {
                System.out.print("Element found at " +
                        i + " " + j);
                return;}
                if (mat[i][j] > x) {
                    j--;
                } else
                    i++;
            }
            System.out.print("n Element not found");
            return;// if ( i==n || j== -1 )
        }

    public static void main(String[] args) {
        int mat[][] = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};
        search(mat, 4, 29); //n is size of matrix

    }
}
