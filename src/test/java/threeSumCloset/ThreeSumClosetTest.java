/*
 * @Author: Tian Zhuo
 * @Date: 2018-12-17 12:33:13
 */
package threeSumCloset;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ThreeSumClosetTest {

    @Test
    public void test3SumCloset() {
        ThreeSumCloset tsc = new ThreeSumCloset();
        int res = tsc.threeSumClosest(new int[]{0, 1, 2}, 3);
        assertEquals(res, 3);
    }
}