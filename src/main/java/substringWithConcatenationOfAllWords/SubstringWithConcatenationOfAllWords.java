/*
 * @Source: https://leetcode-cn.com/problems/substring-with-concatenation-of-all-words/
 * @Author: Tian Zhuo
 * @Date: 2018-12-29 12:26:28
 */
package substringWithConcatenationOfAllWords;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubstringWithConcatenationOfAllWords {
    public List<Integer> findSubstring(String s, String[] words) {
        if (words.length == 0 || words == null)
            return Collections.emptyList();
        int m = words.length;
        int n = words[0].length();
        int len = m * n;
        List<Integer> res = new ArrayList<>();

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (int i = 0; i < s.length() - len + 1; i++) {
            Map<String, Integer> temp = new HashMap<>(map);
            for (int j = i; j < i + len; j += n) {
                String str = s.substring(j, j + n);
                if (!temp.containsKey(str))
                    break;
                if (temp.get(str) > 0)
                    temp.put(str, temp.get(str) - 1);
                if (temp.get(str) == 0)
                    temp.remove(str);
            }
            if (temp.keySet().size() == 0)
                res.add(i);
        }
        return res;
    }

    public List<Integer> findSubstring1(String s, String[] words) {
        if (s.length() == 0 || words.length == 0)
            return new ArrayList<>();
        Map<String, Integer> wordsMap = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        int len = words[0].length(), cnt = words.length, wordlength = len * cnt;
        for (int i = 0; i < words.length; i++) {
            wordsMap.put(words[i], wordsMap.getOrDefault(words[i], 0) + 1);
        }
        for (int i = 0; i < len; i++) {
            for (int j = i; j + wordlength <= s.length(); j += len) {
                String curStr = s.substring(j, j + wordlength);
                Map<String, Integer> map = new HashMap<>();
                for (int k = cnt - 1; k >= 0; k--) {
                    String subCurStr = curStr.substring(k * len, (k + 1) * len);
                    int count = map.getOrDefault(subCurStr, 0) + 1;
                    if (count > wordsMap.getOrDefault(subCurStr, 0)) {
                        j = j + k * len;
                        break;
                    } else if (k == 0 && !ans.contains(j)) {
                        ans.add(j);
                    } else
                        map.put(subCurStr, count);
                }
            }
        }
        return ans;
    }
}