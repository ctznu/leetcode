/*
 * @Author: Tian Zhuo
 * @Date: 2018-12-07 12:23:49
 */
package longestSubstringWithoutRepeatingCharacters;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestSubstringWithoutRepeatingCharactersTest {
    LongestSubstringWithoutRepeatingCharacters ls = new LongestSubstringWithoutRepeatingCharacters();
    @Test
    public void testLongSubstr() {
        int res = ls.lengthOfLongestSubstring("kwwdess");
        assertEquals(4, res);
    }
    @Test
    public void testLongSubstr1() {
        int res = ls.lengthOfLongestSubstring1("kwwdess");
        assertEquals(4, res);
    }
}