/*
 * @Author: Tian Zhuo
 * @Date: 2018-12-14 21:45:35
 */
package palindromeNumber;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PalindromeNumberTest {
    @Test
    public void testIsPalidrome() {
        PalindromeNumber pn = new PalindromeNumber();
        assertEquals(true, pn.isPalindrome(232));
        assertEquals(true, pn.isPalindrome(2442));
        assertEquals(false, pn.isPalindrome(21));
        assertEquals(false, pn.isPalindrome(-21));
        assertEquals(false, pn.isPalindrome(-121));
        assertEquals(true, pn.isPalindrome(0));
        assertEquals(true, pn.isPalindrome(5));


    }
}