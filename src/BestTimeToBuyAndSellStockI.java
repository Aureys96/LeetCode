public class BestTimeToBuyAndSellStockI {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int ans = 0;
        for (int i = 0; i < prices.length; i++) {
            if (ans < (prices[i] - min))
                ans = prices[i] - min;
            if (min > prices[i])
                min = prices[i];
        }

        return Math.max(ans, 0);
    }
}
