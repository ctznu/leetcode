/*
 * @Author: Tian Zhuo
 * @Date: 2018-12-15 12:37:29
 */
package longestCommonPrefix;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestCommonPrefixTest {

    @Test
    public void testLongestPrefix() {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String res = lcp.longestCommonPrefix(new String[]{"first", "fix", "fill"});
        assertEquals("fi", res);
        res = lcp.longestCommonPrefix(new String[]{"dog","racecar","car"});
        assertEquals("", res);

    }
}