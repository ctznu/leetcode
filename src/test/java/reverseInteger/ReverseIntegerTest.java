/*
 * @Author: Tian Zhuo
 * @Date: 2018-12-12 22:52:15
 */
package reverseInteger;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseIntegerTest {
    @Test
    public void testReverse() {
        ReverseInteger ri = new ReverseInteger();
        int res = ri.reverse(123);
        assertEquals(321, res);
        res = ri.reverse(-345);
        assertEquals(-543, res);
        res = ri.reverse(1534236469);
        assertEquals(0, res);
    }
}