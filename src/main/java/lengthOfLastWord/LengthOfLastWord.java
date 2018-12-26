/*
 * @Source: https://leetcode-cn.com/problems/
 * @Author: Tian Zhuo
 * @Date: 2018-12-26 22:17:07
 */
package lengthOfLastWord;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int count = 0;
        char[] cs = s.toCharArray();
        for (int i = cs.length - 1; i >= 0; i--) {
            if (cs[i] != ' ') {
                while (i > -1 && cs[i] != ' ') {
                    count++;
                    i--;
                }
                break;
            }
        }
        return count;

    }
}