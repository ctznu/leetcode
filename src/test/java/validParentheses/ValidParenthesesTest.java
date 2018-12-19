/*
 * @Author: Tian Zhuo
 * @Date: 2018-12-19 20:57:36
 */
package validParentheses;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValidParenthesesTest {
    @Test
    public void testIsValid() {
        ValidParentheses vp = new ValidParentheses();
        assertEquals(true, vp.isValid(""));
        assertEquals(true, vp.isValid("({})"));
        assertEquals(true, vp.isValid("({}())"));
        assertEquals(true, vp.isValid("([]{}())"));
        assertEquals(false, vp.isValid("{]"));
        assertEquals(false, vp.isValid("]"));
    }
}