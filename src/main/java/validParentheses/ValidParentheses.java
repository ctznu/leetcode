/*
 * @Source: https://leetcode-cn.com/problems/valid-parentheses/
 * @Author: Tian Zhuo
 * @Date: 2018-12-19 20:30:27
 */
package validParentheses;

import java.util.List;
import java.util.ArrayList;

public class ValidParentheses {
    public boolean isValid(String s) {
        List<Character> arr = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if('(' == curr || '[' == curr || '{' == curr){
                arr.add(0, curr);
            }else{
                if(arr.size() == 0) return false;
                char p = arr.get(0);
                arr.remove(0);
                if(p == 0
                    || p == '(' && curr != ')'
                    || p == '[' && curr != ']'
                    || p == '{' && curr != '}'){
                        return false;
                }
            }
        }
        return arr.size() == 0;
    }
}