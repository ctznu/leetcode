/*
 * @Author: Tian Zhuo
 * @Date: 2018-12-28 21:34:43
 */
package plusOne;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class PlusOneTest{
    @Test
    public void testPlusOne(){
        PlusOne po = new PlusOne();
        assertArrayEquals(new int[]{3, 2, 2}, po.plusOne(new int[]{3, 2, 1}));
        assertArrayEquals(new int[]{1, 0}, po.plusOne(new int[]{9}));
        assertArrayEquals(new int[]{1, 0, 0}, po.plusOne(new int[]{9, 9}));
    }
}
