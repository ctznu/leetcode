/*
 * @Source: https://leetcode-cn.com/problems/roman-to-integer/
 * @Author: Tian Zhuo
 * @Date: 2018-12-15 10:40:46
 */
package romanToInteger;

import java.util.HashMap;

public class RomanToInteger {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>(){{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};
        int i = s.length() - 1;
        int res = 0;
        int prev = 0;
        while(i >= 0) {
            char curr = s.charAt(i);
            int val = map.get(curr);
            if(val < prev) res -= val;
            else res += val;
            prev = val;
            --i;
        }
        return res;
    }
}