/*
 * @Author: Tian Zhuo
 * @Date: 2019-01-15 22:01:27
 */
package validPalindrome;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValidPalindromeTest {
    @Test
    public void testValidPalindrome() {
        ValidPalindrome vp = new ValidPalindrome();
        assertEquals(true, vp.isPalindrome("A man, a plan, a canal: Panama"));
        assertEquals(false, vp.isPalindrome("race a car"));
        assertEquals(true, vp.isPalindrome(".,"));
    }
}