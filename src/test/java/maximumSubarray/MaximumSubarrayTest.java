/*
 * @Author: Tian Zhuo
 * @Date: 2018-12-26 20:45:45
 */
package maximumSubarray;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaximumSubarrayTest {
    @Test
    public void testMaxSubArray() {
        MaximumSubarray ms = new MaximumSubarray();
        int res = ms.maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 });
        assertEquals(6, res);
    }
}