package basicprac.arrays;

public class MissingNumberInArray {

    public static int findDisappearedNumbers(int[] arr, int num) {
        int total, i;
        total = (num + 1) * (num + 2) / 2;
        for (i = 0; i < num; i++)

            total -= arr[i];
        return total;


    }

    public static int findDisappearedNumbersXor(int[] arr, int num) {
        int i;
        int x1 = arr[0];
        int x2 = 1;
        for (i = 1; i < arr.length; i++)
            x1 = x1 ^ arr[i];
        for (i = 2; i <= num + 1; i++)
            x2 = x2 ^ i;
        return (x1 ^ x2);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        int num = arr.length;
     //   System.out.println(findDisappearedNumbers(arr, num));

        System.out.println(findDisappearedNumbersXor(arr, num));
    }
}
