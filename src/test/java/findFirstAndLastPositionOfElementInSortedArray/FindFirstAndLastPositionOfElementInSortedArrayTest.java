/*
 * @Author: Tian Zhuo
 * @Date: 2019-01-23 21:56:54
 */
package findFirstAndLastPositionOfElementInSortedArray;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class FindFirstAndLastPositionOfElementInSortedArrayTest {
    @Test
    public void testSearchRange() {
        FindFirstAndLastPositionOfElementInSortedArray fa = new FindFirstAndLastPositionOfElementInSortedArray();
        int[] res = fa.searchRange(new int[]{5,7,7,8,8,10}, 8);
        int[] expected = new int[]{3, 4};
        assertArrayEquals(expected, res);
    }
}