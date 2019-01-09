/*
 * @Author: Tian Zhuo
 * @Date: 2019-01-09 21:07:28
 */
package intersectionOfTwoArraysII;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class IntersectionOfTwoArraysIITest {
    @Test
    public void testIntersect() {
        IntersectionOfTwoArraysII it = new IntersectionOfTwoArraysII();
        int[] res = it.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2});
        assertArrayEquals(new int[]{2, 2}, res);

    }
}