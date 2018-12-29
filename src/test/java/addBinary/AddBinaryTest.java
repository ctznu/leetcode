/*
 * @Author: Tian Zhuo
 * @Date: 2018-12-29 11:18:08
 */
package addBinary;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AddBinaryTest {
    @Test
    public void testAddBinary() {
        AddBinary ab = new AddBinary();
        String res = ab.addBinary("1", "11");
        assertEquals("100", res);

    }
}