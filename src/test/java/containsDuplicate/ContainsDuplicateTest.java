/*
 * @Author: Tian Zhuo
 * @Date: 2019-01-07 20:49:39
 */
package containsDuplicate;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ContainsDuplicateTest {
    @Test
    public void testContainsDuplicate() {
        ContainsDuplicate cd = new ContainsDuplicate();
        boolean res = cd.containsDuplicate(new int[]{1, 2, 3});
        assertEquals(false, res);
        boolean res1 = cd.containsDuplicate(new int[]{1, 2, 2});
        assertEquals(true, res1);
        boolean res2 = cd.containsDuplicate(new int[]{7,3,2,1,2});
        assertEquals(true, res2);
    }
}