/*
 * @Author: Tian Zhuo
 * @Date: 2018-12-24 12:16:47
 */
package countAndSay;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountAndSayTest {
    @Test
    public void testCountAndSay () {
        CountAndSay cas = new CountAndSay();
        String res = cas.countAndSay(4);
        assertEquals("1211", res);
    }
}