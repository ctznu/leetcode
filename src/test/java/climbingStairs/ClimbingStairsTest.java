/*
 * @Author: Tian Zhuo
 * @Date: 2018-12-27 21:20:35
 */
package climbingStairs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ClimbingStairsTest {
    @Test
    public void testClimbingStairs() {
        ClimbingStairs cs = new ClimbingStairs();
        int res = cs.climbStairs(4);
        assertEquals(5, res);
    }
}