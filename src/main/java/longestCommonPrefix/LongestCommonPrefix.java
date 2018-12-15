/*
 * @Source: https://leetcode-cn.com/problems/longest-common-prefix/
 * @Author: Tian Zhuo
 * @Date: 2018-12-15 12:26:05
 */
package longestCommonPrefix;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        String p = strs[0];
        for(int i = 1; i < strs.length; i++) {
            while(strs[i].indexOf(p) != 0) {
                p = p.substring(0, p.length() - 1);
                if(p.length() == 0) return "";
            }
        }       
        return p;
    }
}