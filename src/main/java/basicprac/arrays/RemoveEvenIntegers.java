package basicprac.arrays;

public class RemoveEvenIntegers {

    public static int[] removeEven(int arr[]) {
        int oddcount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddcount++;
            }
        }

        int[] result = new int[oddcount];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[idx++] = arr[i];
            }
        }
        return result;
    }

    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + "");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 7, 10, 6, 5};

       int [] result=  removeEven(arr);
        printArray(result);


    }
}
