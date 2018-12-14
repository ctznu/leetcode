/*
 * @Author: Tian Zhuo
 * @Date: 2018-12-13 21:04:29
 */
package stringToIntegerAtoi;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringToIntegerAtoiTest {

    @Test
    public void testAtoi() {
        StringToIntegerAtoi sta = new StringToIntegerAtoi();
        int res = sta.myAtoi("456d");
        assertEquals(456, res);
        res = sta.myAtoi("     -56d");
        assertEquals(-56, res);
        res = sta.myAtoi("4193 with words");
        assertEquals(4193, res);
        res = sta.myAtoi("words and 987");
        assertEquals(0, res);
        res = sta.myAtoi("-91283472332");
        assertEquals(-2147483648, res);
    }
}