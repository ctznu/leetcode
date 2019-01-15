/*
 * @Source: https://leetcode-cn.com/problems/valid-palindrome/
 * @Author: Tian Zhuo
 * @Date: 2019-01-15 21:43:26
 */
package validPalindrome;

import java.util.Arrays;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] cs = s.toCharArray();
        while (i < j) {
            while (i < s.length() && !(cs[i] >= '0' && cs[i] <= '9' || cs[i] >= 'a' && cs[i] <= 'z'
                    || cs[i] >= 'A' && cs[i] <= 'Z')) {
                i++;
            }
            while (j >= 0 && !(cs[j] >= '0' && cs[j] <= '9' || cs[j] >= 'a' && cs[j] <= 'z'
                    || cs[j] >= 'A' && cs[j] <= 'Z')) {
                j--;
            }
            if (i < j && Character.toLowerCase(cs[i]) != Character.toLowerCase(cs[j])) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public boolean isPalindrome1(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        char[] copy = s.toCharArray();
        char[] letterAndNums = new char[copy.length];
        int index = 0;
        for (int i = 0; i < copy.length; i++) {
            if ((copy[i] >= 'a' && copy[i] <= 'z') || (copy[i] >= '0' && copy[i] <= '9')) {
                letterAndNums[index++] = copy[i];
            } else if ((copy[i] >= 'A' && copy[i] <= 'Z')) {
                letterAndNums[index++] = (char) (copy[i] + 32);
            }
        }
        letterAndNums = Arrays.copyOfRange(letterAndNums, 0, index);
        int start = 0, end = letterAndNums.length - 1;
        while (start < end) {
            if (letterAndNums[start++] != letterAndNums[end--]) {
                return false;
            }
        }
        return true;
    }
}