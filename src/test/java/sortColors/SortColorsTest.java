/*
 * @Author: Tian Zhuo
 * @Date: 2019-01-21 21:18:09
 */
package sortColors;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SortColorsTest {
    @Test
    public void testSortColors() {
        SortColors sc = new SortColors();
        int[] res = new int[]{2,0,2,1,1,0};
        sc.sortColors(res);
        int[] expected = new int[]{0,0,1,1,2,2};
        assertArrayEquals(expected, res);
    }
}