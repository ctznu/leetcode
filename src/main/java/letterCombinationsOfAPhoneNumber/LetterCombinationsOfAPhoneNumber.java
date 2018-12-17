/*
 * @Source: https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/
 * @Author: Tian Zhuo
 * @Date: 2018-12-17 12:46:54
 */
package letterCombinationsOfAPhoneNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {
        if ("".equals(digits))
            return Collections.emptyList();
        String[] dict = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        List<String> res = new ArrayList<>();
        res.add("");
        String[] digitsArr = digits.split("");
        for (String digit : digitsArr) {
            int len = res.size();
            while (len-- > 0) {
                String e = res.get(0);
                res.remove(0);
                String digitStr = dict[Integer.parseInt(digit)];
                for (int i = 0; i < digitStr.length(); i++) {
                    res.add(e + digitStr.charAt(i));
                }
            }
        }
        return res;
    }
}