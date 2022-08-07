package basicprac.arrays;

public class CheckSecondMax {

    public static int findSecondMaximum(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondMax && arr[i] < max)
                secondMax = arr[i];
        }


        return secondMax;
    }


    public static String arrayToString(int[] arr) {
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            result += arr[i] + "";
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 33, 10, 456};
        System.out.println("Array :" + arrayToString(arr));
        System.out.println();
        int secMax = findSecondMaximum(arr);
        System.out.println("Second maximum: " + secMax);
    }
}
