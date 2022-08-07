package basicprac.arrays;

public class MaxSumSubArrayOfSizeK {
    //complexity is n*k;
    public static int findMaxSumSubArray(int[] arr, int k) {
        int maxSum = 0, windowSum;
        for (int i = 0; i < arr.length - k; i++) {
            windowSum = 0;
            for (int j = i; j < i + k; j++) {
                windowSum += arr[j];
            }
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }

    public static int OptimizedfindMaxSumSubArray(int[] arr, int k) {
        int maxSum = 0, windowSum = 0;
        int windowStart = 0;
        for (int i = 0; i < arr.length; i++) {
            windowSum += arr[i];
            if (i >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= arr[windowStart];
                windowStart++;
            }

        }
        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println("Maximum sum of a subarray of size K: " + findMaxSumSubArray(new int[]{2, 1, 5, 1, 3, 2}, 3));
        System.out.println("Maximum sum of a subarray of size K: " + findMaxSumSubArray(new int[]{2, 3, 4, 1, 5}, 2));
        System.out.println("Maximum sum of a subarray of size K:" + OptimizedfindMaxSumSubArray(new int[]{2, 1, 5, 1, 3, 2}, 3));
    }
}
