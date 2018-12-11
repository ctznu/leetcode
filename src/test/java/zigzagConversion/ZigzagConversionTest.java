/*
 * @Author: Tian Zhuo
 * @Date: 2018-12-11 21:23:23
 */
package zigzagConversion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ZigzagConversionTest {
    @Test
    public void testConvert() {
        ZigzagConversion zc = new ZigzagConversion();
        String res = zc.convert("LEETCODEISHIRING", 3);
        assertEquals("LCIRETOESIIGEDHN", res);
    }
    @Test
    public void testConvert1() {
        ZigzagConversion zc = new ZigzagConversion();
        String res = zc.convert("A", 2);
        assertEquals("A", res);
    }
}