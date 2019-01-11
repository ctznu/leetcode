/*
 * @Author: Tian Zhuo
 * @Date: 2019-01-11 22:48:28
 */
package reverseString;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseStringTest {
    @Test
    public void test(){
        ReverseString rs = new ReverseString();
        String res = rs.reverseString("abc");
        assertEquals("cba", res);
        String res1 = rs.reverseString("A man, a plan, a canal: Panama");
        assertEquals("amanaP :lanac a ,nalp a ,nam A", res1);
    }
}