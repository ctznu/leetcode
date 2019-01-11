/*
 * @Source: https://leetcode-cn.com/problems/reverse-string/
 * @Author: Tian Zhuo
 * @Date: 2019-01-11 22:45:08
 */
package reverseString;

public class ReverseString {
    public String reverseString(String s) {
        int l = s.length();
        if (l < 2)
            return s;
        StringBuilder sb = new StringBuilder(l);
        for (int i = l - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public String reverseString1(String s) {
        char[] c = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            char tmp = c[i];
            c[i] = c[j];
            c[j] = tmp;
            i++;
            j--;
        }
        return new String(c);
    }
}