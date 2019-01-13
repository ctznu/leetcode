/*
 * @Author: Tian Zhuo
 * @Date: 2019-01-13 18:49:28
 */
package firstUniqueCharacterInAString;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FirstUniqueCharacterInAStringTest {
    @Test
    public void testUniqueCharacter() {
        FirstUniqueCharacterInAString fu = new FirstUniqueCharacterInAString();
        assertEquals(0, fu.firstUniqChar("leetcode"));
        assertEquals(2, fu.firstUniqChar("loveleetcode"));
        assertEquals(-1, fu.firstUniqChar("cc"));
        assertEquals(-1, fu.firstUniqChar("aadadaad"));
    }

}