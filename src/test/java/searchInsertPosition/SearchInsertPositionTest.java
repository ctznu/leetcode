/*
 * @Author: Tian Zhuo
 * @Date: 2018-12-23 22:38:20
 */
package searchInsertPosition;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SearchInsertPositionTest {
    @Test
    public void testSearchInsert() {
        SearchInsertPosition sip = new SearchInsertPosition();
        int res = sip.searchInsert(new int[]{1, 3, 5, 6}, 5);
        assertEquals(2, res);
        res = sip.searchInsert(new int[]{1, 3, 5, 6}, 2);
        assertEquals(1, res);
        res = sip.searchInsert(new int[]{1, 3, 5, 6}, 7);
        assertEquals(4, res);
        res = sip.searchInsert(new int[]{1, 3, 5, 6}, 0);
        assertEquals(0, res);
    }
}