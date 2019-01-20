/*
 * @Author: Tian Zhuo
 * @Date: 2019-01-20 21:21:11
 */
package removeDuplicatesFromSortedArrayII;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesFromSortedArrayIITest {
    @Test
    public void testRemoveDuplicates() {
        RemoveDuplicatesFromSortedArrayII rd = new RemoveDuplicatesFromSortedArrayII();
        int res = rd.removeDuplicates(new int[] { 1, 1, 1, 2, 2, 3 });
        assertEquals(5, res);
        int res1 = rd.removeDuplicates(new int[] { 0, 0, 1, 1, 1, 1, 2, 3, 3 });
        assertEquals(7, res1);
    }
}