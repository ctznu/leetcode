/*
 * @Source: https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/
 * @Author: Tian Zhuo
 * @Date: 2019-01-06 14:50:46
 */
package bestTimeToBuyAndSellStockII;

public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length ==0) {
            return 0;
        }
        int profit = 0;
        int buy = prices[0];
        for (int i=1; i < prices.length;i++) {
            if (buy < prices[i]) {
                profit += (prices[i] - buy);
            }
            buy = prices[i];
        }
        return profit;
    }
}