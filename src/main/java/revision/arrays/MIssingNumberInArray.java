package revision.arrays;

public class MIssingNumberInArray {

    public static int findMissingNumber(int[] arr, int num) {
        int i;
        int x1 = arr[0];
        int x2 = 1;
        for (i = 1; i < arr.length; i++) {
            x1 = x1 ^ arr[i];
        }
        for (i = 2; i <= num + 1; i++) {
            x2 = x2 ^ i;
        }
        return (x1 ^ x2);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        int num = arr.length;

        System.out.println(findMissingNumber(arr, num));
    }
}
