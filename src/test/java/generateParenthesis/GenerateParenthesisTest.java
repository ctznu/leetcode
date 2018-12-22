/*
 * @Author: Tian Zhuo
 * @Date: 2018-12-22 14:11:57
 */
package generateParenthesis;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class GenerateParenthesisTest {
    @Test
    public void testGenerateParenthesis () {
        GenerateParenthesis gp = new GenerateParenthesis();
        List<String> res = gp.generateParenthesis(3);
        List<String> result = Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()");
        assertTrue(res.equals(result));
    }
}