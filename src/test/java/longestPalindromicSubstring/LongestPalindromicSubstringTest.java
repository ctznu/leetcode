/*
 * @Author: Tian Zhuo
 * @Date: 2018-12-10 21:35:30
 */

package longestPalindromicSubstring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestPalindromicSubstringTest {
    @Test
    public void testLongestPalindromic() {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        
        // assertEquals("bab", lps.longestPalindrome1("babad"));
        assertEquals("abccba", lps.longestPalindrome1("ababccbad"));
    }
}