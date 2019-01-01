/*
 * @Author: Tian Zhuo
 * @Date: 2019-01-01 20:06:52
 */
package findPivotIndex;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindPivotIndexTest {
    @Test
    public void testPivotIndex() {
        FindPivotIndex fpi = new FindPivotIndex();
        int res = fpi.pivotIndex1(new int[] { 1, 7, 3, 6, 5, 6 });
        assertEquals(3, res);
        res = fpi.pivotIndex(new int[] { -1, -1, -1, 0, 1, 1 });
        assertEquals(0, res);
        res = fpi.pivotIndex(new int[] { -1, -1, 0, 1, 1, 0 });
        assertEquals(5, res);
        res = fpi.pivotIndex(new int[] { 1, 2, 3 });
        assertEquals(-1, res);
        res = fpi.pivotIndex(new int[] { 1, 2 });
        assertEquals(-1, res);
    }
}