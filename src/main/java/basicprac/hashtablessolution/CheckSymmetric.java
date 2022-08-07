package basicprac.hashtablessolution;

import java.util.HashMap;

public class CheckSymmetric {


    static void findSymmetric(int[][] arr) {
        // Creates an empty hashMap hM
        HashMap<Integer, Integer> hM = new HashMap();
        for (int i = 0; i < arr.length; i++) {
            int first = arr[i][0];
            int second = arr[i][1];
            Integer val = hM.get(second);
            if (val != null && val == first) {
                System.out.println("(" + second + ", " + first + ")");
            } else {
                hM.put(first, second);
            }
        }
    }

    public static void main(String[] args) {
        int arr[][] = new int[5][2];
        // int[][] arr = {{1, 2}, {3, 4}, {5, 9}, {4, 3}, {9, 5}};
        arr[0][0] = 11;
        arr[0][1] = 20;
        arr[1][0] = 30;
        arr[1][1] = 40;
        arr[2][0] = 5;
        arr[2][1] = 10;
        arr[3][0] = 40;
        arr[3][1] = 30;
        arr[4][0] = 10;
        arr[4][1] = 5;
        findSymmetric(arr);
    }
}
