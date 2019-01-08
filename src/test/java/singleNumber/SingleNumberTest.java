/*
 * @Author: Tian Zhuo
 * @Date: 2019-01-08 22:47:03
 */
package singleNumber;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SingleNumberTest {
    @Test
    public void testSingleNum() {
        SingleNumber sn = new SingleNumber();
        int res = sn.singleNumber(new int[] { 2, 2, 1 });
        assertEquals(1, res);
        int res1 = sn.singleNumber(new int[] { 4, 1, 2, 1, 2 });
        assertEquals(1, res1);
    }
}