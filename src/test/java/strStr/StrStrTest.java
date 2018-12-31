/*
 * @Author: Tian Zhuo
 * @Date: 2018-12-30 23:05:05
 */
package strStr;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StrStrTest {
    @Test
    public void testStrStr(){
        StrStr ss = new StrStr();
        int res = ss.strStr("hello", "ll");
        assertEquals(2, res);
    }
}