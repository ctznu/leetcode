/*
 * @Author: Tian Zhuo
 * @Date: 2019-01-06 15:17:44
 */
package bestTimeToBuyAndSellStockII;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BestTimeToBuyAndSellStockIITest {
    @Test
    public void testMaxProfit() {
        BestTimeToBuyAndSellStockII bt = new BestTimeToBuyAndSellStockII();
        int res = bt.maxProfit(new int[] { 7, 1, 5, 3, 6, 4 });
        assertEquals(7, res);
        res = bt.maxProfit(new int[] { 7, 1, 5, 4, 3, 6, 4 });
        assertEquals(7, res);
        res = bt.maxProfit(new int[] { 1, 2, 3, 5, 8 });
        assertEquals(4, res);
        res = bt.maxProfit(new int[] { 7, 6, 4, 3, 1 });
        assertEquals(0, res);
    }
}