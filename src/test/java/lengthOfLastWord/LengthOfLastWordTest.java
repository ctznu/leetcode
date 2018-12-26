/*
 * @Author: Tian Zhuo
 * @Date: 2018-12-26 22:25:54
 */
package lengthOfLastWord;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LengthOfLastWordTest {
    @Test
    public void test(){
        LengthOfLastWord lt = new LengthOfLastWord();
        int res = lt.lengthOfLastWord("Hello World");
        assertEquals(5, res);
    }
}