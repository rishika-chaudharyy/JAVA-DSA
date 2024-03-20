//You are given an array prices where prices[i] is the price pf the stock on the ith day. Return the maximum profit you can achieve from the transaction , if you cannot achieve any profit return 0
public class BuySellStock {
    public static int buySellStock(int prices[]) {
        int maxProfit = 0; // this is taken as 0 instead of Integer.MIN_VALUE as we have to return 0 if
                           // profit is not found;
        int buyPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice <= prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String args[]) {
        int prices[] = { 7, 6, 4, 3, 1 };
        System.out.println(buySellStock(prices));
    }
}
