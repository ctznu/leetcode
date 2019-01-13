/*
 * @Source: https://leetcode-cn.com/problems/first-unique-character-in-a-string/
 * @Author: Tian Zhuo
 * @Date: 2019-01-13 12:14:51
 */
package firstUniqueCharacterInAString;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString {
    public int firstUniqChar1(String s) {
        if (s.length() == 0) {
            return -1;
        }
        char[] cs = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < cs.length; i++) {
            int c = map.getOrDefault(cs[i], 0);
            map.put(cs[i], c + 1);
        }
        for (int i = 0; i < cs.length; i++) {
            if (1 == map.get(cs[i])) {
                return i;
            }
        }
        return -1;
    }

    public int firstUniqChar(String s) {
        int res = -1;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int index = s.indexOf(ch);
            if (index != -1 && index == s.lastIndexOf(ch)) {
                res = (res == -1 || res > index) ? index : res;
            }
        }
        return res;
    }

}