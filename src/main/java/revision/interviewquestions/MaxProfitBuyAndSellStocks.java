package revision.interviewquestions;

public class MaxProfitBuyAndSellStocks {

    public static int maxProfit(int[] arr) {
        int min = arr[0];
        int profit = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] - min > profit) {
                profit = arr[i] - min;
            }
            i++;
        }
        return profit;

    }
//       { int left = 0;
//        int right = 1;
//        int maxProfit = 0;
//
//        while (right < arr.length) {
//            if (arr[left] < arr[right]) {
//                int profit = arr[right] - arr[left];
//                maxProfit = Math.max(maxProfit, profit);
//            } else {
//                left = right;
//            }
//            right++;
//        }
//        return maxProfit;
//    }


    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        int maxProfits = maxProfit(prices);
        System.out.println(maxProfits);

    }
}
