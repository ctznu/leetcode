/*
 * @Author: Tian Zhuo
 * @Date: 2018-12-22 14:11:57
 */
package generateParentheses;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class GenerateParenthesesTest {
    @Test
    public void testGenerateParenthesis () {
        GenerateParentheses gp = new GenerateParentheses();
        List<String> res = gp.generateParentheses(3);
        List<String> result = Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()");
        assertTrue(res.equals(result));
    }
}