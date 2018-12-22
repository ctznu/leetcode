/*
 * @Source: https://leetcode-cn.com/problems/generate-parentheses/
 * @Author: Tian Zhuo
 * @Date: 2018-12-22 14:06:16
 */
package generateParenthesis;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        fn(n, n, "", res);
        return res;
    }
    private void fn(int left, int right, String str, List<String> res) {
        if(left == 0 && right == 0) {
            res.add(str);
        }
        if(left > 0) fn(left - 1, right, str + "(", res);
        if(right > left) fn(left, right - 1, str + ")", res);
    }
}