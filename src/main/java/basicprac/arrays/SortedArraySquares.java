package basicprac.arrays;

public class SortedArraySquares {

    public static int[] makeSquares(int[] arr) {
        int n = arr.length;
        int[] squares = new int[n];
        int left = 0, right = arr.length - 1;
        int highestSquareIdx = n - 1;
        while (left <= right) {
            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];
            if (leftSquare > rightSquare) {
                squares[highestSquareIdx--] = leftSquare;
                left++;
            } else {
                squares[highestSquareIdx--] = rightSquare;
                right--;
            }

        }

        return squares;
    }

    public static void main(String[] args) {
        int[] result = makeSquares(new int[]{-2, -1, 0, 2, 3});
        for (int num : result)
            System.out.println(num + "");
        System.out.println();


        result = makeSquares(new int[]{});
        for (int num : result)
            System.out.println(num + "");
        System.out.println();


    }

}

