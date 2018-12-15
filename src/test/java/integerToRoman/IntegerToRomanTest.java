/*
 * @Author: Tian Zhuo
 * @Date: 2018-12-15 11:59:10
 */
package integerToRoman;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegerToRomanTest {
    @Test
    public void testIntToRoman() {
        IntegerToRoman itr = new IntegerToRoman();
        assertEquals("III", itr.intToRoman(3));
        assertEquals("IV", itr.intToRoman(4));
        assertEquals("IX", itr.intToRoman(9));
        assertEquals("LVIII", itr.intToRoman(58));
        assertEquals("MCMXCIV", itr.intToRoman(1994));
    }
}