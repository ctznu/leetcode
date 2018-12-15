/*
 * @Author: Tian Zhuo
 * @Date: 2018-12-15 11:15:11
 */
package romanToInteger;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanToIntegerTest {
    @Test
    public void testRomanToInt() {
        RomanToInteger rti = new RomanToInteger();
        assertEquals(6, rti.romanToInt("VI"));
        assertEquals(4, rti.romanToInt("IV"));
        assertEquals(9, rti.romanToInt("IX"));
        assertEquals(3, rti.romanToInt("III"));

    }
}