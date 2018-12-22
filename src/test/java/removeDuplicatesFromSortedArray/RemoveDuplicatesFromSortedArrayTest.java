/*
 * @Author: Tian Zhuo
 * @Date: 2018-12-22 15:05:08
 */
package removeDuplicatesFromSortedArray;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RemoveDuplicatesFromSortedArrayTest {
    @Test
    public void testRemoveDuplicates() {
        RemoveDuplicatesFromSortedArray rd = new RemoveDuplicatesFromSortedArray();
        int res = rd.removeDuplicates(new int[]{1, 1, 2});
        assertEquals(2, res);
        res = rd.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4});
        assertEquals(5, res);
    }
}