package basicprac.arrays;

import java.sql.SQLOutput;
import java.util.HashMap;

public class MaximumTimeFromFourDigit {

    public static HashMap<Integer, Integer> getFrequencyMap(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i])) {
                hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
            } else {
                hashMap.put(arr[i], 1);
            }
        }
        return hashMap;
    }

    public static boolean hasDigit(HashMap<Integer, Integer> hashamp, int digit) {
        if (hashamp.containsKey(digit) && hashamp.get(digit) > 0) {
            hashamp.put(digit, hashamp.get(digit) - 1);
            return true;
        }
        return false;
    }

    public static String getMaxTime(int[] arr) {
        HashMap<Integer, Integer> map = getFrequencyMap(arr);
        int i;
        boolean flag;
        String time = "";
        flag = false;

        //first digit of hours::

        for (i = 2; i >= 0; i--) {
            if (hasDigit(map, i)) {
                flag = true;
                time = time + i;
                break;
            }
        }
        if (!flag) {
            return "-1";
        }
        flag = false;

        if (time.charAt(0) == 2) {
            for (i = 3; i >= 0; i--) {
                if (hasDigit(map, i)) {
                    flag = true;
                    time = time + i;
                    break;
                }
            }
        } else {
            for (i = 9; i >= 0; i--) {
                if (hasDigit(map, i)) {
                    flag = true;
                    time = time + i;
                    break;

                }

            }
        }
        if (!flag) {
            return "-1";
        }

        time = time + ":";
        flag = false;
        for (i = 5; i >= 0; i--) {
            if (hasDigit(map, i)) {
                flag = true;
                time = time + i;
                break;
            }
        }
        if (!flag) {
            return "-1";
        }
        flag = false;

        for (i = 9; i >= 0; i--) {
            if (hasDigit(map, i)) {
                flag = true;
                time = time + i;
                break;
            }
        }
        if (!flag) {
            return "-1";
        }
        return time;

    }

    public static void main(String[] args) {
        int arr[] = {0, 0, 0, 9};
        System.out.println(getMaxTime(arr));
    }
}
