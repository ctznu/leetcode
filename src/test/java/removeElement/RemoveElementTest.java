/*
 * @Author: Tian Zhuo
 * @Date: 2018-12-22 15:38:51
 */
package removeElement;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RemoveElementTest {
    @Test
    public void testRemoveElement() {
        RemoveElement re = new RemoveElement();
        int res = re.removeElement(new int[]{3,2,2,3}, 3);
        assertEquals(2, res);
        res = re.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2);
        assertEquals(5, res);
        res = re.removeElement(new int[]{}, 2);
        assertEquals(0, res);
        res = re.removeElement(new int[]{3, 3}, 3);
        assertEquals(0, res);
        res = re.removeElement(new int[]{3, 3}, 5);
        assertEquals(2, res);
    }
}