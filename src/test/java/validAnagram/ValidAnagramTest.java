/*
 * @Author: Tian Zhuo
 * @Date: 2019-01-14 22:29:23
 */
package validAnagram;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValidAnagramTest {
    @Test
    public void testIsAnagram() {
        ValidAnagram va = new ValidAnagram();
        assertEquals(true, va.isAnagram("anagram", "nagaram"));
        assertEquals(false, va.isAnagram("rat", "car"));
    }
}