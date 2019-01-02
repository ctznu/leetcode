/*
 * @Author: Tian Zhuo
 * @Date: 2019-01-02 21:31:21
 */
package largestNumberAtLeastTwiceOfOthers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LargestNumberAtLeastTwiceOfOthersTest {
    @Test
    public void testDominantIndex() {
        LargestNumberAtLeastTwiceOfOthers ln = new LargestNumberAtLeastTwiceOfOthers();
        int 
        res = ln.dominantIndex(new int[]{3, 6, 1, 0});
        assertEquals(1, res);
        res = ln.dominantIndex(new int[]{3});
        assertEquals(0, res);
        res = ln.dominantIndex(new int[]{3, 5, 1, 0});
        assertEquals(-1, res);
        res = ln.dominantIndex(new int[]{3, 6, 4, 0});
        assertEquals(-1, res);
        res = ln.dominantIndex(new int[]{1, 2, 3, 4});
        assertEquals(-1, res);
    }
}