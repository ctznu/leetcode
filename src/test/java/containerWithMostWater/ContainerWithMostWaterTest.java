/*
 * @Source: https://leetcode-cn.com/problems/container-with-most-water/
 * @Author: Tian Zhuo
 * @Date: 2018-12-14 22:01:52
 */
package containerWithMostWater;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ContainerWithMostWaterTest {
    @Test
    public void testMaxArea() {
        ContainerWithMostWater cwmw = new ContainerWithMostWater();
        int res = cwmw.maxArea(new int[]{1,8,6,2,5,4,8,3,7});
        assertEquals(49, res);
    }

}