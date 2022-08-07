package basicprac.arrays;

import java.util.Arrays;


public class CheckMaxMin {


    public static void maxMin(int[] arr) {
        int maxIdx = arr.length - 1;
        int minIdx = arr[0];
        int maxElement = arr[maxIdx] + 1;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] += (arr[maxIdx] % maxElement) * maxElement;
                maxIdx -= 1;
            } else {
                arr[i] += (arr[minIdx] % maxElement) * maxElement;
                minIdx += 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] / maxElement;

        }
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
       // System.out.print("Array before min/max: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        maxMin(arr);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        //System.out.print("Array after min/max: " + Arrays.toString(arr));
    }
}
