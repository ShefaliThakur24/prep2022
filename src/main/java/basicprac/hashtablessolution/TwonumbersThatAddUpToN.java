package basicprac.hashtablessolution;

import java.util.HashSet;
import java.util.Set;
//complexity is On
public class TwonumbersThatAddUpToN {

    public static int[] findSum(int[] arr, int n) {
        int[] result = new int[2];
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (set.contains(n - i)) {
                result[0] = i;
                result[1] = n - i;
                break;
            }
            set.add(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 7;
        int arr[] = {3, 5, 2, -4, 8, 11};
        if (arr.length > 0) {
            int[] resultarray = findSum(arr, n);
            int num1 = resultarray[0];
            int num2 = resultarray[1];
            if (num1 + num2 != n) {
                System.out.println("notfound");

            } else {
                System.out.println("Number 1 = " + num1);
                System.out.println("Number 2 = " + num2);
                System.out.println("Sum = " + (n));
            }
        } else {
            System.out.println("Input Array is Empty!");
        }
    }
}
