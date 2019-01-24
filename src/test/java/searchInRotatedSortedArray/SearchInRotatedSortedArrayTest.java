/*
 * @Author: Tian Zhuo
 * @Date: 2019-01-24 23:27:53
 */
package searchInRotatedSortedArray;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SearchInRotatedSortedArrayTest {
    @Test
    public void testSearch() {
        SearchInRotatedSortedArray si = new SearchInRotatedSortedArray();
        assertEquals(4, si.search(new int[]{4,5,6,7,0,1,2}, 0));
        assertEquals(1, si.search(new int[] { 3, 1 }, 1));
    }
}