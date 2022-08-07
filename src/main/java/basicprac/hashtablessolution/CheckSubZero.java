package basicprac.hashtablessolution;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.RecursiveTask;

public class CheckSubZero {

    public static int maxLen(int a[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxi = 0;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (sum == 0) {
                maxi = i + 1;
            } else {
                if (map.get(sum) != null) {
                    maxi = Math.max(maxi, i - map.get(sum));
                } else {
                    map.put(sum, i);
                }
            }
        }

        return maxi;
    }

    public static boolean findSubZero(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        // Traverse through the given array
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] == 0 || sum == 0 || map.get(sum) != null) {
                return true;

            } else {
                map.put(sum, i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {6, 4, -7, 3, 12, 9};
        System.out.println(findSubZero(arr));
        int length=maxLen(arr);
        System.out.println(length);

    }
}
